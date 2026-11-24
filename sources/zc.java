// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zc extends bjb {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zc(Context context, byte b) {
        super(context);
        this.d = b;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        switch (this.d) {
            case 0:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            case 1:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            case 2:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
            default:
                super.setEnabled(z);
                setAlpha(z ? 1.0f : 0.5f);
                break;
        }
    }

    @Override // bjb, android.widget.TextView
    public final void setTextColor(int i) {
        switch (this.d) {
            case 0:
                super.setTextColor(i);
                setBackground(bkb.H0(gl.L(20.0f), i));
                break;
            case 1:
                super.setTextColor(i);
                setBackground(bkb.H0(gl.L(20.0f), i));
                break;
            case 2:
                super.setTextColor(i);
                setBackground(bkb.H0(gl.L(20.0f), i));
                break;
            default:
                super.setTextColor(i);
                setBackgroundDrawable(bkb.H0(gl.L(20.0f), i));
                break;
        }
    }
}
