// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qv6 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ rv6 a;

    public qv6(rv6 rv6Var) {
        this.a = rv6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ew6 ew6Var = (ew6) seekBar.getTag();
            jv6 jv6Var = (jv6) this.a.M.get(ew6Var.c);
            if (jv6Var != null) {
                jv6Var.u(i == 0);
            }
            ew6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        rv6 rv6Var = this.a;
        if (rv6Var.N != null) {
            rv6Var.I.removeMessages(2);
        }
        rv6Var.N = (ew6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
