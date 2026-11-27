// default package

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.SyncResult;
import android.os.Bundle;
import org.telegram.messenger.ContactsSyncAdapterService;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class pv2 extends AbstractThreadedSyncAdapter {
    @Override // android.content.AbstractThreadedSyncAdapter
    public final void onPerformSync(Account account, Bundle bundle, String str, ContentProviderClient contentProviderClient, SyncResult syncResult) {
        try {
            pv2 pv2Var = ContactsSyncAdapterService.a;
            if (f11.a) {
                cc4.b("performSync: " + account.toString());
            }
        } catch (OperationCanceledException e) {
            cc4.g(e, true);
        }
    }
}
