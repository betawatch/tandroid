// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qd9 implements qkb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ sd9 d;

    public qd9(sd9 sd9Var, Layout layout, int i, int i2) {
        this.d = sd9Var;
        this.a = layout;
        this.b = i;
        this.c = i2;
    }

    @Override // qkb, mi7
    public final Layout a() {
        return this.a;
    }

    @Override // qkb
    public final Rect c() {
        return null;
    }

    @Override // qkb
    public final CharSequence getPrefix() {
        return null;
    }

    @Override // qkb
    public final int getRow() {
        return 0;
    }

    @Override // qkb
    public final CharSequence getText() {
        TL_iv.PageBlock pageBlock;
        TL_iv.PageCaption pageCaption;
        TL_iv.RichText richText;
        ll0 d1 = this.d.c.d1();
        return (d1 == null || (pageBlock = d1.b) == null || (pageCaption = pageBlock.caption) == null || (richText = pageCaption.text) == null) ? "" : zk9.r(richText, null, true);
    }

    @Override // qkb
    public final int getX() {
        return this.b;
    }

    @Override // qkb
    public final int getY() {
        return this.c;
    }
}
