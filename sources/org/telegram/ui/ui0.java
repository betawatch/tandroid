package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
            LinearLayout g10 = org.telegram.messenger.y1.g(context, 0);
            for (int i11 = 0; i11 < 2; i11++) {
                LinearLayout g11 = org.telegram.messenger.y1.g(context, 1);
                LinearLayout g12 = org.telegram.messenger.y1.g(context, 0);
                int i12 = (i10 * 2) + i11;
                this.a[i12] = new TextView(context);
                this.b[i12] = new TextView(context);
                this.a[i12].setTypeface(AndroidUtilities.bold());
                this.a[i12].setTextSize(1, 17.0f);
                this.b[i12].setTextSize(1, 13.0f);
                this.b[i12].setGravity(3);
                g12.addView(this.a[i12]);
                g11.addView(g12);
                g11.addView(this.b[i12]);
                g10.addView(g11, h7.z5.l(1.0f, -1, -2));
            }
            addView(g10, h7.z5.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i10 == 0 ? 16.0f : 0.0f));
            i10++;
        }
    }

    public final void a() {
        for (int i10 = 0; i10 < 4; i10++) {
            TextView textView = this.a[i10];
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            vi0 vi0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, vi0Var.getResourceProvider()));
            this.b[i10].setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, vi0Var.getResourceProvider()));
        }
    }
}
