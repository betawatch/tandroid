// default package

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class zd9 implements qkb {
    public final /* synthetic */ Layout a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ be9 d;

    public zd9(be9 be9Var, Layout layout, int i, int i2) {
        this.d = be9Var;
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
        ll0 ll0Var = this.d.f;
        if (ll0Var == null) {
            return "";
        }
        TL_iv.PageBlock pageBlock = ll0Var.b;
        return pageBlock instanceof TL_iv.pageBlockDetails ? zk9.r(((TL_iv.pageBlockDetails) pageBlock).title, null, true) : "";
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
