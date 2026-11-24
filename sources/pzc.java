// default package

import android.view.DisplayCutout;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class pzc extends ozc {
    public pzc(wzc wzcVar, WindowInsets windowInsets) {
        super(wzcVar, windowInsets);
    }

    @Override // tzc
    public wzc a() {
        return wzc.h(null, this.c.consumeDisplayCutout());
    }

    @Override // tzc
    public vp3 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new vp3(displayCutout);
    }

    @Override // nzc, tzc
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzc)) {
            return false;
        }
        pzc pzcVar = (pzc) obj;
        return Objects.equals(this.c, pzcVar.c) && Objects.equals(this.g, pzcVar.g) && nzc.B(this.h, pzcVar.h);
    }

    @Override // tzc
    public int hashCode() {
        return this.c.hashCode();
    }
}
