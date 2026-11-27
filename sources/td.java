// default package

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class td implements fd, Continuation, gc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ td(Runnable runnable, byte b) {
        this.a = b;
        this.b = runnable;
    }

    @Override // gc7
    public final boolean b(TLRPC.TL_error tL_error) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 9:
                runnable.run();
                break;
            case 10:
                runnable.run();
                break;
            case 11:
                runnable.run();
                break;
            case 12:
                runnable.run();
                break;
            case 13:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        this.b.run();
        return Tasks.forResult(null);
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Runnable runnable = this.b;
        switch (b) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                idVar.dismiss();
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 4:
                runnable.run();
                break;
            case 5:
                runnable.run();
                break;
            case 6:
            default:
                runnable.run();
                break;
            case 7:
                runnable.run();
                break;
            case 8:
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
