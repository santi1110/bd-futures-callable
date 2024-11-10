package utilities;

import java.util.concurrent.Callable;

public class ImportAccountTask implements Callable<AmazonMusicAccount> {
    private final MusicAccountService accountService;
    private final String accountID;

    public ImportAccountTask(MusicAccountService accountService, String accountID) {
        this.accountService = accountService;
        this.accountID = accountID;
    }

    @Override
    public AmazonMusicAccount call() {
        return accountService.getAccount(accountID);
    }
}

