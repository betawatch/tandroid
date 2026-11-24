// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r47 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ s47 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r47(s47 s47Var, Context context) {
        super(context);
        this.c = s47Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(16.0f));
        int i = 0;
        while (i < 2) {
            LinearLayout j = de9.j(context, 0);
            for (int i2 = 0; i2 < 2; i2++) {
                LinearLayout j2 = de9.j(context, 1);
                LinearLayout j3 = de9.j(context, 0);
                int i3 = (i << 1) + i2;
                this.a[i3] = new TextView(context);
                this.b[i3] = new TextView(context);
                this.a[i3].setTypeface(gl.o());
                this.a[i3].setTextSize(1, 17.0f);
                this.b[i3].setTextSize(1, 13.0f);
                this.b[i3].setGravity(3);
                j3.addView(this.a[i3]);
                j2.addView(j3);
                j2.addView(this.b[i3]);
                j.addView(j2, nme.l(1.0f, -1, -2));
            }
            addView(j, nme.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i == 0 ? 16.0f : 0.0f));
            i++;
        }
    }

    public final void a() {
        for (int i = 0; i < 4; i++) {
            TextView textView = this.a[i];
            int i2 = bkb.F6;
            s47 s47Var = this.c;
            textView.setTextColor(bkb.v0(i2, s47Var.getResourceProvider()));
            this.b[i].setTextColor(bkb.v0(bkb.y6, s47Var.getResourceProvider()));
        }
    }
}
