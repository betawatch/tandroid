// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zd extends clb {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd(Context context, byte b) {
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

    @Override // clb, android.widget.TextView
    public final void setTextColor(int i) {
        switch (this.d) {
            case 0:
                super.setTextColor(i);
                setBackground(cmb.H0(gm.L(20.0f), i));
                break;
            case 1:
                super.setTextColor(i);
                setBackground(cmb.H0(gm.L(20.0f), i));
                break;
            case 2:
                super.setTextColor(i);
                setBackground(cmb.H0(gm.L(20.0f), i));
                break;
            default:
                super.setTextColor(i);
                setBackgroundDrawable(cmb.H0(gm.L(20.0f), i));
                break;
        }
    }
}
