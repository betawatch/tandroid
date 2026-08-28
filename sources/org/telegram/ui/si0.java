package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class si0 extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final TextView[] a;
    public final TextView[] b;
    public final /* synthetic */ ti0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si0(ti0 ti0Var, Context context) {
        super(context);
        this.c = ti0Var;
        this.a = new TextView[4];
        this.b = new TextView[4];
        setOrientation(1);
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        int i9 = 0;
        while (i9 < 2) {
            LinearLayout f10 = org.telegram.messenger.ll.f(context, 0);
            for (int i10 = 0; i10 < 2; i10++) {
                LinearLayout f11 = org.telegram.messenger.ll.f(context, 1);
                LinearLayout f12 = org.telegram.messenger.ll.f(context, 0);
                int i11 = (i9 * 2) + i10;
                this.a[i11] = new TextView(context);
                this.b[i11] = new TextView(context);
                this.a[i11].setTypeface(AndroidUtilities.bold());
                this.a[i11].setTextSize(1, 17.0f);
                this.b[i11].setTextSize(1, 13.0f);
                this.b[i11].setGravity(3);
                f12.addView(this.a[i11]);
                f11.addView(f12);
                f11.addView(this.b[i11]);
                f10.addView(f11, g7.e6.l(1.0f, -1, -2));
            }
            addView(f10, g7.e6.d(-1, -2.0f, 0, 0.0f, 0.0f, 0.0f, i9 == 0 ? 16.0f : 0.0f));
            i9++;
        }
    }

    public final void a() {
        for (int i9 = 0; i9 < 4; i9++) {
            TextView textView = this.a[i9];
            int i10 = org.telegram.ui.ActionBar.f6.G6;
            ti0 ti0Var = this.c;
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, ti0Var.getResourceProvider()));
            this.b[i9].setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.z6, ti0Var.getResourceProvider()));
        }
    }
}
