// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class vr4 extends sr4 {
    public final /* synthetic */ byte l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr4(int i, Context context, f53 f53Var, float f, String str) {
        super(i, context, f53Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override // sr4
    public final void a() {
        switch (this.l0) {
            case 1:
                t7b t7bVar = (t7b) this.m0;
                t7bVar.N0.setTranslationY(t7bVar.n.getMeasuredHeight() - t7bVar.N0.g());
                l6b l6bVar = t7bVar.r2;
                if (l6bVar != null) {
                    l6bVar.run();
                    t7bVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // sr4
    public final void c(boolean z) {
        switch (this.l0) {
            case 1:
                if (((t7b) this.m0).g0 == 0 && z) {
                    gl.c3(new kya((Object) this, (byte) 17));
                    break;
                }
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.l0) {
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= g()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                t7b t7bVar = (t7b) this.m0;
                t7bVar.M0 = true;
                t7bVar.c(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // sr4
    public final String getTitle() {
        switch (this.l0) {
            case 0:
                return (String) this.m0;
            default:
                return super.getTitle();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.l0) {
            case 1:
                super.setTranslationY(f);
                t7b t7bVar = (t7b) this.m0;
                if (t7bVar.l2) {
                    float i = Utilities.i(1.0f - (f / (t7bVar.n.getMeasuredHeight() - t7bVar.N0.g())), 1.0f, 0.0f);
                    t7bVar.r.b(gl.L(-32.0f) * i);
                    t7bVar.r.setAlpha(1.0f - (0.6f * i));
                    t7bVar.j0.setAlpha(1.0f - i);
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr4(t7b t7bVar, int i, Context context, f53 f53Var, xl6 xl6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, f53Var, xl6Var, z, 1.39f, z2, z3);
        this.m0 = t7bVar;
    }
}
