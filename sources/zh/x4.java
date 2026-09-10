package zh;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class x4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ x4(a5 a5Var, int i10) {
        this.a = i10;
        this.b = a5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        a5 a5Var = this.b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a5Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a5Var);
                break;
            case 1:
                a5Var.u = false;
                a5Var.w = true;
                NotificationCenter.getInstance(a5Var.c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a5Var, Boolean.FALSE);
                break;
            case 2:
                a5Var.z = false;
                break;
            default:
                a5Var.k.clear();
                a5Var.d(true);
                break;
        }
    }
}
