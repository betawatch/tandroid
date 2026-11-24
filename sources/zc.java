// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
