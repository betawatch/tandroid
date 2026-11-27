// default package

import android.location.Location;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class q05 implements OnCompleteListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt2 b;

    public /* synthetic */ q05(pt2 pt2Var, byte b) {
        this.a = b;
        this.b = pt2Var;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        byte b = this.a;
        pt2 pt2Var = this.b;
        switch (b) {
            case 0:
                if (task.getException() == null) {
                    pt2Var.accept((Location) task.getResult());
                    break;
                }
                break;
            default:
                try {
                    task.getResult(ao.class);
                    pt2Var.accept(0);
                    break;
                } catch (ao e) {
                    int statusCode = e.getStatusCode();
                    if (statusCode == 6) {
                        pt2Var.accept(1);
                        return;
                    } else {
                        if (statusCode == 8502) {
                            pt2Var.accept(2);
                            return;
                        }
                        return;
                    }
                }
        }
    }
}
