// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class zu6 implements SeekBar.OnSeekBarChangeListener {
    public final zz3 a = new zz3(this, 27);
    public final /* synthetic */ bv6 b;

    public zu6(bv6 bv6Var) {
        this.b = bv6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            jw6 jw6Var = (jw6) seekBar.getTag();
            short s = bv6.G0;
            jw6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        bv6 bv6Var = this.b;
        if (bv6Var.d0 != null) {
            bv6Var.b0.removeCallbacks(this.a);
        }
        bv6Var.d0 = (jw6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
