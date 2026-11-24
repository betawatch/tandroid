// default package

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pe1 extends ContentObserver {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                fp.C(fp.g());
                break;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    gm.r(runnable);
                }
                bo6 bo6Var = new bo6((byte) 0);
                MediaController.Z1 = bo6Var;
                gm.d3(bo6Var, 2000L);
                break;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    gm.r(runnable2);
                }
                pg6 pg6Var = new pg6(this, (byte) 8);
                MediaController.Z1 = pg6Var;
                gm.d3(pg6Var, 2000L);
                break;
            default:
                rjf.e.set(true);
                break;
        }
    }
}
