package org.telegram.ui;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qm extends TextView implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Cells.y a;
    public int b;
    public boolean c;
    public final /* synthetic */ bn d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(bn bnVar, Activity activity) {
        super(activity);
        this.d = bnVar;
        setSingleLine(true);
        setLines(1);
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.t6.U(this, org.telegram.ui.ActionBar.m6.Ji, bnVar.getResourceProvider());
        int themedColor = bnVar.getThemedColor(org.telegram.ui.ActionBar.m6.Fi);
        this.b = themedColor;
        org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.a6.e(themedColor, 16.0f);
        this.a = e10;
        setBackground(e10);
        setTextSize(1, 14.0f);
        setTypeface(org.telegram.messenger.g0.o());
        setGravity(17);
        setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), (int) (org.telegram.messenger.g0.q.x * 0.45f)), TLObject.FLAG_31), i10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int themedColor = this.d.getThemedColor(org.telegram.ui.ActionBar.m6.Fi);
            if (themedColor == this.b && this.c == org.telegram.ui.ActionBar.m6.I.q()) {
                return;
            }
            Drawable background = getBackground();
            org.telegram.ui.Cells.y yVar = this.a;
            if (background == yVar) {
                this.c = org.telegram.ui.ActionBar.m6.I.q();
                org.telegram.ui.ActionBar.m6.H1(yVar, themedColor, false);
                org.telegram.ui.ActionBar.m6.H1(yVar, org.telegram.ui.ActionBar.a6.b(themedColor), true);
                this.b = themedColor;
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
