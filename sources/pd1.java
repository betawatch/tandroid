// default package

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class pd1 extends ContentObserver {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pd1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                go.C(go.g());
                break;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    hl.r(runnable);
                }
                pg6 pg6Var = new pg6((byte) 2);
                MediaController.Z1 = pg6Var;
                hl.d3(pg6Var, 2000L);
                break;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    hl.r(runnable2);
                }
                z96 z96Var = new z96(this, (byte) 14);
                MediaController.Z1 = z96Var;
                hl.d3(z96Var, 2000L);
                break;
            default:
                gmf.e.set(true);
                break;
        }
    }
}
