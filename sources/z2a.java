// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class z2a extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ a3a c;

    public /* synthetic */ z2a(a3a a3aVar, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = a3aVar;
        this.b = arrayList;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        a3a a3aVar = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < arrayList.size(); i++) {
                    a3aVar.removeView((View) arrayList.get(i));
                }
                a3aVar.getClass();
                a3aVar.h.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                ((b3a) a3aVar.n).b.setAllowDrawCursor(true);
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    a3aVar.removeView((View) arrayList.get(i2));
                }
                a3aVar.h.clear();
                a3aVar.b = null;
                a3aVar.c = false;
                ((b3a) a3aVar.n).b.setAllowDrawCursor(true);
                break;
        }
    }
}
