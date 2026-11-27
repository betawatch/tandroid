// default package

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class y67 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ z67 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y67(z67 z67Var, Context context) {
        super(context);
        this.c = z67Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(16.0f));
        int i = 0;
        while (i < 2) {
            LinearLayout j = uh9.j(context, 0);
            for (int i2 = 0; i2 < 2; i2++) {
                LinearLayout j2 = uh9.j(context, 1);
                LinearLayout j3 = uh9.j(context, 0);
                int i3 = (i << 1) + i2;
                this.a[i3] = new TextView(context);
                this.b[i3] = new TextView(context);
                this.a[i3].setTypeface(hl.o());
                this.a[i3].setTextSize(1, 17.0f);
                this.b[i3].setTextSize(1, 13.0f);
                this.b[i3].setGravity(3);
                j3.addView(this.a[i3]);
                j2.addView(j3);
                j2.addView(this.b[i3]);
                j.addView(j2, tre.l(1.0f, -1, -2));
            }
            addView(j, tre.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i == 0 ? 16.0f : 0.0f));
            i++;
        }
    }

    public final void a() {
        for (int i = 0; i < 4; i++) {
            TextView textView = this.a[i];
            int i2 = aob.G6;
            z67 z67Var = this.c;
            textView.setTextColor(aob.v0(i2, z67Var.getResourceProvider()));
            this.b[i].setTextColor(aob.v0(aob.z6, z67Var.getResourceProvider()));
        }
    }
}
