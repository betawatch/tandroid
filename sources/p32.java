// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.nio.charset.StandardCharsets;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class p32 extends EditTextBoldCursor {
    public final /* synthetic */ byte M1 = 2;
    public final kl N1;
    public int O1;
    public final gn P1;
    public final /* synthetic */ Object Q1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(qpc qpcVar, Activity activity) {
        super(activity);
        this.Q1 = qpcVar;
        this.O1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        byte b = this.M1;
        Object obj = this.Q1;
        kl klVar = this.N1;
        gn gnVar = this.P1;
        switch (b) {
            case 0:
                super.dispatchDraw(canvas);
                gnVar.u(klVar.a(bkb.v0(this.O1 <= 0 ? bkb.o7 : bkb.O5, ((r32) obj).a), false));
                int L = gl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height = getHeight() + getScrollY();
                gnVar.setBounds(L - gl.L(48.0f), height - Math.min(gl.L(44.0f), getHeight()), L, height);
                gnVar.draw(canvas);
                break;
            case 1:
                super.dispatchDraw(canvas);
                gnVar.u(klVar.a(bkb.v0(this.O1 < 0 ? bkb.o7 : bkb.O5, ((pa6) obj).getResourceProvider()), false));
                gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                gnVar.draw(canvas);
                break;
            case 2:
                super.dispatchDraw(canvas);
                gnVar.u(klVar.a(bkb.v0(this.O1 < 0 ? bkb.o7 : bkb.O5, (wjb) obj), false));
                gnVar.setBounds(getScrollX(), 0, getWidth() + getScrollX(), getHeight());
                gnVar.draw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                gnVar.u(klVar.a(bkb.v0(this.O1 <= 0 ? bkb.o7 : bkb.O5, ((qpc) obj).getResourceProvider()), false));
                int L2 = gl.L(48.0f) + ((getWidth() + getScrollX()) - getPaddingRight());
                int height2 = getHeight() + getScrollY();
                gnVar.setBounds(L2 - gl.L(48.0f), height2 - Math.min(gl.L(44.0f), getHeight()), L2, height2);
                gnVar.draw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.M1) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(36.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, lt3, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.M1;
        gn gnVar = this.P1;
        switch (b) {
            case 0:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    gnVar.a();
                    int i4 = this.O1;
                    gnVar.t(i4 <= 100 ? Integer.toString(i4) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
            case 1:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 96 - charSequence.length();
                    gnVar.a();
                    gnVar.t(this.O1 <= 12 ? String.valueOf(this.O1) : "", true, true);
                    break;
                }
                break;
            case 2:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 32 - charSequence.length();
                    gnVar.a();
                    gnVar.t(this.O1 <= 4 ? String.valueOf(this.O1) : "", true, true);
                    break;
                }
                break;
            default:
                super.onTextChanged(charSequence, i, i2, i3);
                if (gnVar != null) {
                    this.O1 = 960 - charSequence.toString().getBytes(StandardCharsets.UTF_8).length;
                    gnVar.a();
                    int i5 = this.O1;
                    gnVar.t(i5 <= 100 ? Integer.toString(i5) : "", isAttachedToWindow(), true);
                    invalidate();
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.M1) {
            case 0:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 1:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            case 2:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
            default:
                if (drawable == this.P1 || super.verifyDrawable(drawable)) {
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(Activity activity, wjb wjbVar) {
        super(activity);
        this.Q1 = wjbVar;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(r32 r32Var, Context context) {
        super(context);
        this.Q1 = r32Var;
        this.O1 = 960;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        gnVar.setCallback(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p32(pa6 pa6Var, Activity activity) {
        super(activity);
        this.Q1 = pa6Var;
        this.N1 = new kl(this);
        gn gnVar = new gn(false, true, true);
        this.P1 = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.setCallback(this);
        gnVar.b = 5;
    }
}
