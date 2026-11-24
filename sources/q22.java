// default package

import android.content.Context;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q22 extends zya {
    public final /* synthetic */ byte L = 1;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(qvb qvbVar, Context context, pi4 pi4Var) {
        super(context, pi4Var, 0, null);
        this.M = qvbVar;
    }

    @Override // zya
    public final void e(boolean z, boolean z2) {
        switch (this.L) {
            case 2:
                super.e(z, z2);
                qvb qvbVar = (qvb) this.M;
                ttb ttbVar = qvbVar.n;
                if (!z2) {
                    ((TextView) ttbVar.d).animate().cancel();
                    ((TextView) qvbVar.n.d).setAlpha(z ? 0.0f : 1.0f);
                    break;
                } else {
                    ((TextView) ttbVar.d).animate().alpha(z ? 0.0f : 1.0f).start();
                    break;
                }
            default:
                super.e(z, z2);
                break;
        }
    }

    @Override // android.view.View
    public final float getTranslationY() {
        switch (this.L) {
            case 0:
                return super.getTranslationY() - ((d32) this.M).N;
            default:
                return super.getTranslationY();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.L) {
            case 1:
                g0a g0aVar = ((c0a) this.M).d;
                super.onMeasure(i, ug8.f(g0aVar.e, g0aVar.n - g0aVar.r.getPaddingTop(), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.L) {
            case 0:
                super.setTranslationY(f + ((d32) this.M).N);
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(int i, f53 f53Var, c0a c0aVar, Context context) {
        super(context, null, i, f53Var);
        this.M = c0aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q22(d32 d32Var, Context context, pi4 pi4Var, wjb wjbVar) {
        super(context, pi4Var, 1, wjbVar);
        this.M = d32Var;
    }
}
