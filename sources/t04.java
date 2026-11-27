// default package

import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class t04 extends xy3 {
    public final /* synthetic */ o24 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t04(o24 o24Var, Context context, vnb vnbVar, boolean z, gz3 gz3Var, boolean z2) {
        super(context, vnbVar, true, false, true, z, 0, gz3Var, aob.v0(aob.v6, vnbVar), z2);
        this.g0 = o24Var;
    }

    @Override // xy3
    public final boolean d() {
        return this.g0.V0;
    }

    @Override // xy3
    public final void e() {
        o24 o24Var = this.g0;
        ArrayList arrayList = o24Var.o1;
        if (arrayList.size() <= 0 || ((TLRPC.StickerSetCovered) arrayList.get(0)).set == null || uc7.s1(o24Var.d1).Y3.getLong("emoji_featured_hidden", 0L) == ((TLRPC.StickerSetCovered) arrayList.get(0)).set.id) {
            return;
        }
        yac.h(yac.t0);
    }

    @Override // xy3
    public final boolean g(c14 c14Var) {
        return c14Var.f || this.g0.q1.contains(Long.valueOf(c14Var.b.id));
    }

    @Override // xy3
    public final ColorFilter getEmojiColorFilter() {
        return this.g0.f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    @Override // xy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i) {
        Integer num;
        int i2;
        b24 b24Var;
        o24 o24Var = this.g0;
        ArrayList arrayList = o24Var.r1;
        y04 y04Var = o24Var.S;
        if (o24Var.g0) {
            return false;
        }
        o14 o14Var = o24Var.T;
        if (o14Var != null) {
            o14Var.E(null, true);
        }
        oz3 oz3Var = o24Var.W;
        if (oz3Var != null && (b24Var = oz3Var.r) != null) {
            b24Var.J1(null);
        }
        if (i == 0) {
            num = Integer.valueOf(o24Var.e0 ? 1 : 0);
        } else {
            i--;
            num = null;
        }
        if (num == null) {
            char[] cArr = jx3.a;
            if (i < 8 && y04Var.s.indexOfKey(i) >= 0) {
                num = Integer.valueOf(y04Var.s.get(i));
            }
        }
        if (num == null) {
            ArrayList<c14> emojipacks = o24Var.getEmojipacks();
            char[] cArr2 = jx3.a;
            int i3 = i - 8;
            if (emojipacks != null && i3 >= 0 && i3 < emojipacks.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    }
                    if (((c14) arrayList.get(i4)).b.id == emojipacks.get(i3).b.id) {
                        break;
                    }
                    i4++;
                }
                SparseIntArray sparseIntArray = y04Var.s;
                char[] cArr3 = jx3.a;
                num = Integer.valueOf(sparseIntArray.get(i4 + 8));
                i2 = hl.L(-9.0f);
                if (num != null) {
                    o24Var.Q.E0();
                    o24Var.U(num.intValue());
                    o24Var.E(num.intValue(), i2);
                    o24Var.j(0, null);
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
            o24 o24Var = this.g0;
            View view = o24Var.P;
            if (view != null) {
                view.setTranslationY(f);
            }
            o24Var.K.invalidate();
        }
    }
}
