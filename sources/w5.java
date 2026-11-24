// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w5 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ KeyEvent.Callback e;

    public w5(a aVar, ArrayList arrayList, boolean z, boolean z2) {
        this.e = aVar;
        this.d = arrayList;
        this.b = z;
        this.c = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ex1 ex1Var;
        gb2 gb2Var;
        ViewGroup viewGroup;
        a47 a47Var;
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        KeyEvent.Callback callback = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                a aVar = (a) callback;
                jia[] jiaVarArr = aVar.n;
                for (int i = 0; i < arrayList.size(); i++) {
                    View view = (View) arrayList.get(i);
                    if (z2) {
                        view.setVisibility(4);
                        view.setAlpha(0.0f);
                    } else {
                        view.setAlpha(1.0f);
                    }
                }
                if (z2 && !z) {
                    jia jiaVar = jiaVarArr[0];
                    if (jiaVar != null) {
                        jiaVar.setVisibility(8);
                    }
                    jia jiaVar2 = jiaVarArr[1];
                    if (jiaVar2 != null) {
                        jiaVar2.setVisibility(8);
                    }
                }
                be0 be0Var = aVar.f;
                if (be0Var != null && !z2) {
                    be0Var.setVisibility(8);
                    break;
                }
                break;
            default:
                Runnable runnable = (Runnable) obj;
                j47 j47Var = (j47) callback;
                f47 f47Var = j47Var.K;
                float f = z2 ? 1.0f : 0.0f;
                j47Var.E = f;
                j47Var.x = false;
                j47Var.y = false;
                j47Var.H.setAlpha(f);
                if (z2) {
                    j47Var.w = false;
                    j47Var.s = false;
                }
                ex1 ex1Var2 = j47Var.S;
                if (ex1Var2 != null) {
                    ex1Var2.setAlpha(1.0f);
                }
                xf4 xf4Var = j47Var.m0;
                if (xf4Var != null && !z2) {
                    xf4Var.I(false);
                }
                gb2 gb2Var2 = j47Var.v0;
                if (gb2Var2 != null) {
                    gb2Var2.setVisibility(0);
                }
                if (!j47Var.r) {
                    j47Var.o(false, 1.0f);
                }
                if (!z2 && (a47Var = j47Var.X) != null) {
                    a47Var.setAlpha(0.0f);
                }
                if (!z && (viewGroup = j47Var.Z) != null) {
                    viewGroup.setAlpha(j47Var.E);
                }
                f47Var.invalidate();
                f47Var.setAlpha(j47Var.E);
                j47Var.F.invalidate();
                j47Var.G.invalidate();
                if (runnable != null) {
                    if (!z2 && (gb2Var = j47Var.v0) != null && gb2Var.isAttachedToWindow()) {
                        j47Var.v0.post(runnable);
                        break;
                    } else if (!z2 && (ex1Var = j47Var.S) != null && ex1Var.isAttachedToWindow()) {
                        j47Var.S.post(runnable);
                        break;
                    } else {
                        gl.c3(runnable);
                        break;
                    }
                }
                break;
        }
    }

    public w5(j47 j47Var, boolean z, boolean z2, Runnable runnable) {
        this.e = j47Var;
        this.b = z;
        this.c = z2;
        this.d = runnable;
    }
}
