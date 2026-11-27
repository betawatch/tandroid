// default package

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class zt4 extends wt4 {
    public final /* synthetic */ byte l0 = 0;
    public final /* synthetic */ Object m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(int i, Context context, x53 x53Var, float f, String str) {
        super(i, context, x53Var, null, true, f, false, false);
        this.m0 = str;
    }

    @Override // wt4
    public final void a() {
        switch (this.l0) {
            case 1:
                rbb rbbVar = (rbb) this.m0;
                rbbVar.N0.setTranslationY(rbbVar.n.getMeasuredHeight() - rbbVar.N0.g());
                kab kabVar = rbbVar.r2;
                if (kabVar != null) {
                    kabVar.run();
                    rbbVar.r2 = null;
                    break;
                }
                break;
        }
    }

    @Override // wt4
    public final void c(boolean z) {
        switch (this.l0) {
            case 1:
                if (((rbb) this.m0).g0 == 0 && z) {
                    hl.c3(new s8b(this, (byte) 4));
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
                rbb rbbVar = (rbb) this.m0;
                rbbVar.M0 = true;
                rbbVar.c(false);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // wt4
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
                rbb rbbVar = (rbb) this.m0;
                if (rbbVar.l2) {
                    float i = Utilities.i(1.0f - (f / (rbbVar.n.getMeasuredHeight() - rbbVar.N0.g())), 1.0f, 0.0f);
                    rbbVar.r.b(hl.L(-32.0f) * i);
                    rbbVar.r.setAlpha(1.0f - (0.6f * i));
                    rbbVar.j0.setAlpha(1.0f - i);
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt4(rbb rbbVar, int i, Context context, x53 x53Var, do6 do6Var, boolean z, boolean z2, boolean z3) {
        super(i, context, x53Var, do6Var, z, 1.39f, z2, z3);
        this.m0 = rbbVar;
    }
}
