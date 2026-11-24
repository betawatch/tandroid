// default package

import android.graphics.Rect;
import android.text.Layout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zj9 implements qkb {
    public final /* synthetic */ byte a;
    public final Object b;
    public final int c;
    public final int d;

    public /* synthetic */ zj9(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = i;
        this.d = i2;
    }

    @Override // qkb, mi7
    public final Layout a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (Layout) obj;
            case 1:
                return (Layout) obj;
            case 2:
                return (Layout) obj;
            default:
                return ((qkb) obj).a();
        }
    }

    @Override // qkb
    public final Rect c() {
        byte b = this.a;
        return null;
    }

    @Override // qkb
    public final CharSequence getPrefix() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                return null;
            default:
                return ((qkb) this.b).getPrefix();
        }
    }

    @Override // qkb
    public final int getRow() {
        switch (this.a) {
            case 0:
            case 1:
                return 0;
            case 2:
                return 1;
            default:
                return ((qkb) this.b).getRow();
        }
    }

    @Override // qkb
    public final CharSequence getText() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((Layout) obj).getText();
            case 1:
                return ((Layout) obj).getText();
            case 2:
                return ((Layout) obj).getText();
            default:
                return ((qkb) obj).getText();
        }
    }

    @Override // qkb
    public final int getX() {
        switch (this.a) {
            case 0:
                return this.c;
            case 1:
                return this.c;
            case 2:
                return this.c;
            default:
                return ((qkb) this.b).getX() + this.c;
        }
    }

    @Override // qkb
    public final int getY() {
        switch (this.a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            case 2:
                return this.d;
            default:
                return ((qkb) this.b).getY() + this.d;
        }
    }
}
