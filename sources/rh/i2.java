package rh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ul0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i2 extends ClickableSpan {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String h;

    public i2(boolean[] zArr, int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, String str2) {
        this.a = zArr;
        this.b = i10;
        this.c = context;
        this.d = p6Var;
        this.e = j10;
        this.f = str;
        this.h = str2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        boolean[] zArr = this.a;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        int i10 = this.b;
        org.telegram.ui.f0 f0Var = new org.telegram.ui.f0(zArr, i10, this.c, this.d, 7);
        long j10 = this.e;
        String str = this.f;
        if (j10 != 0) {
            f0Var.a(Long.valueOf(j10), str);
            return;
        }
        TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
        getuniquestargift.slug = this.h.concat("-1");
        ConnectionsManager.getInstance(i10).sendRequest(getuniquestargift, new ul0(28, f0Var, str));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
