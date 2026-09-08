package org.telegram.ui;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s01 extends URLSpan {
    public final /* synthetic */ String a;
    public final /* synthetic */ a11 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s01(a11 a11Var, String str, String str2) {
        super(str);
        this.b = a11Var;
        this.a = str2;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        of.f.s(this.b.e.getParentActivity(), this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(true);
    }
}
