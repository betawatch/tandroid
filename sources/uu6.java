// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uu6 implements SeekBar.OnSeekBarChangeListener {
    public final o04 a = new o04(this, 27);
    public final /* synthetic */ wu6 b;

    public uu6(wu6 wu6Var) {
        this.b = wu6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            ew6 ew6Var = (ew6) seekBar.getTag();
            short s = wu6.G0;
            ew6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        wu6 wu6Var = this.b;
        if (wu6Var.d0 != null) {
            wu6Var.b0.removeCallbacks(this.a);
        }
        wu6Var.d0 = (ew6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
