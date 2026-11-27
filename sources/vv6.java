// default package

import android.widget.SeekBar;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vv6 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ wv6 a;

    public vv6(wv6 wv6Var) {
        this.a = wv6Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            jw6 jw6Var = (jw6) seekBar.getTag();
            ov6 ov6Var = (ov6) this.a.M.get(jw6Var.c);
            if (ov6Var != null) {
                ov6Var.u(i == 0);
            }
            jw6Var.j(i);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        wv6 wv6Var = this.a;
        if (wv6Var.N != null) {
            wv6Var.I.removeMessages(2);
        }
        wv6Var.N = (jw6) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
