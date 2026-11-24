// default package

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yz3 extends cy3 {
    public final /* synthetic */ t14 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz3(t14 t14Var, Context context, wjb wjbVar, boolean z, ly3 ly3Var, boolean z2) {
        super(context, wjbVar, true, false, true, z, 0, ly3Var, bkb.v0(bkb.u6, wjbVar), z2);
        this.g0 = t14Var;
    }

    @Override // cy3
    public final boolean d() {
        return this.g0.V0;
    }

    @Override // cy3
    public final void e() {
        t14 t14Var = this.g0;
        ArrayList arrayList = t14Var.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || na7.q1(t14Var.d1).Y3.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        y6c.h(y6c.t0);
    }

    @Override // cy3
    public final boolean g(h04 h04Var) {
        return h04Var.f || this.g0.q1.contains(Long.valueOf(h04Var.b.id));
    }

    @Override // cy3
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // cy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        Integer num;
        int i2;
        g14 g14Var;
        t14 t14Var = this.g0;
        ArrayList arrayList = t14Var.r1;
        d04 d04Var = t14Var.S;
        if (t14Var.g0) {
            return false;
        }
        t04 t04Var = t14Var.T;
        if (t04Var != null) {
            t04Var.E(null, true);
        }
        ty3 ty3Var = t14Var.W;
        if (ty3Var != null && (g14Var = ty3Var.r) != null) {
            g14Var.I1(null);
        }
        if (i == 0) {
            num = Integer.valueOf(t14Var.e0 ? 1 : 0);
        } else {
            i--;
            num = null;
        }
        if (num == null) {
            char[] cArr = ow3.a;
            if (i < 8 && d04Var.s.indexOfKey(i) >= 0) {
                num = Integer.valueOf(d04Var.s.get(i));
            }
        }
        if (num == null) {
            ArrayList<h04> emojipacks = t14Var.getEmojipacks();
            char[] cArr2 = ow3.a;
            int i3 = i - 8;
            if (emojipacks != null && i3 >= 0 && i3 < emojipacks.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    if (((h04) arrayList.get(i4)).b.id == emojipacks.get(i3).b.id) {
                        break;
                    }
                    i4++;
                }
                SparseIntArray sparseIntArray = d04Var.s;
                char[] cArr3 = ow3.a;
                num = Integer.valueOf(sparseIntArray.get(i4 + 8));
                i2 = gl.L(-9.0f);
                if (num != null) {
                    t14Var.Q.D0();
                    t14Var.V(num.intValue());
                    t14Var.E(num.intValue(), i2);
                    t14Var.j(0, null);
                }
                return true;
            }
        }
        i2 = 0;
        if (num != null) {
        }
        return true;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            t14 t14Var = this.g0;
            View view = t14Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            t14Var.K.invalidate();
        }
    }
}
