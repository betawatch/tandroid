// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class qt6 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ rt6 a;

    public qt6(rt6 rt6Var) {
        this.a = rt6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            eu6 eu6Var = (eu6) seekBar.getTag();
            jt6 jt6Var = (jt6) this.a.M.get(eu6Var.c);
            if (jt6Var != null) {
                jt6Var.u(i == 0);
            }
            eu6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        rt6 rt6Var = this.a;
        if (rt6Var.N != null) {
            rt6Var.I.removeMessages(2);
        }
        rt6Var.N = (eu6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
