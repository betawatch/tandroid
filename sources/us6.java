// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class us6 implements SeekBar.OnSeekBarChangeListener {
    public final ez3 a = new ez3(this, 27);
    public final /* synthetic */ ws6 b;

    public us6(ws6 ws6Var) {
        this.b = ws6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            eu6 eu6Var = (eu6) seekBar.getTag();
            short s = ws6.G0;
            eu6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        ws6 ws6Var = this.b;
        if (ws6Var.d0 != null) {
            ws6Var.b0.removeCallbacks(this.a);
        }
        ws6Var.d0 = (eu6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
