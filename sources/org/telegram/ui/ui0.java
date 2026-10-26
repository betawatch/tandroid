package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ui0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ vi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui0(vi0 vi0Var, Context context) {
        super(context);
        this.c = vi0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i10 = 0;
        while (i10 < 2) {
            LinearLayout d10 = org.telegram.messenger.vh.d(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout d11 = org.telegram.messenger.vh.d(context, 1);
                LinearLayout d12 = org.telegram.messenger.vh.d(context, 0);
                int i12 = (i10 * 2) + i11;
                this.a[i12] = new TextView(context);
                this.b[i12] = new TextView(context);
                this.a[i12].setTypeface(AndroidUtilities.bold());
                this.a[i12].setTextSize(1, 17.0f);
                this.b[i12].setTextSize(1, 13.0f);
                this.b[i12].setGravity(3);
                d12.addView(this.a[i12]);
                d11.addView(d12);
                d11.addView(this.b[i12]);
                d10.addView(d11, org.telegram.ui.Components.gb1.p(1.0f, -1, -2));
            }
            addView(d10, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i10 == 0 ? 16.0f : 0.0f));
            i10++;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.a[i10];
            int i11 = org.telegram.ui.ActionBar.y6.G6;
            vi0 vi0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.y6.w0(i11, vi0Var.getResourceProvider()));
            this.b[i10].setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.z6, vi0Var.getResourceProvider()));
        }
    }
}
