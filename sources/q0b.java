// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class q0b extends n39 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ u0b r;

    public q0b(u0b u0bVar, Context context) {
        this.r = u0bVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        return this.h;
    }

    @Override // w39
    public final int d(int i) {
        u0b u0bVar = this.r;
        if (u0bVar.Q1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i) ? 0 : 3;
        }
        Object obj = this.e.get(i);
        if (obj != null) {
            return !(obj instanceof TLRPC.Document) ? 2 : 0;
        }
        return 1;
    }

    @Override // w39
    public final void f() {
        int i;
        int i2;
        int i3;
        u0b u0bVar = this.r;
        if (u0bVar.Q1 != null) {
            int measuredWidth = u0bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gl.q.x;
            }
            int L = measuredWidth / gl.L(72.0f);
            this.d = L;
            u0bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i4 = 0; i4 < u0bVar.Q1.size(); i4++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) u0bVar.Q1.get(i4);
                List list = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
                if (list != null) {
                    list = list.subList(0, Math.min(list.size(), this.d));
                }
                if (list != null && (!list.isEmpty() || stickerSetCovered.cover != null)) {
                    this.n++;
                    sparseArray2.put(this.h, stickerSetCovered);
                    int i5 = this.h;
                    this.h = i5 + 1;
                    sparseArray.put(i5, Integer.valueOf(i4));
                    int i6 = this.h / this.d;
                    if (list.isEmpty()) {
                        sparseArray.put(this.h, stickerSetCovered.cover);
                        i = 1;
                    } else {
                        i = (int) Math.ceil(list.size() / this.d);
                        for (int i7 = 0; i7 < list.size(); i7++) {
                            sparseArray.put(this.h + i7, list.get(i7));
                        }
                    }
                    int i8 = 0;
                    while (true) {
                        i2 = this.d * i;
                        i3 = this.h;
                        if (i8 >= i2) {
                            break;
                        }
                        sparseArray2.put(i3 + i8, stickerSetCovered);
                        i8++;
                    }
                    this.h = i2 + i3;
                }
            }
        } else {
            ArrayList arrayList = u0bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u0bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = u0bVar.M1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // w39
    public final void r(int i) {
        ArrayList arrayList = this.r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.r(i);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        View view = s49Var.a;
        u0b u0bVar = this.r;
        ArrayList arrayList = u0bVar.Q1;
        if (arrayList == null) {
            if (u0bVar.R1 != null) {
                ((xya) view).setSticker((s3a) u0bVar.S1.get(i));
                return;
            }
            if (s49Var.f != 3) {
                xya xyaVar = (xya) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = u0bVar.M1;
                if (tL_messages_stickerSet != null) {
                    xyaVar.d(tL_messages_stickerSet.documents.get(i), null, u0bVar.M1, null, u0bVar.b2, u0bVar.L1);
                    xyaVar.K.setOnClickListener(new b99(this, xyaVar, (byte) 21));
                    return;
                }
                return;
            }
            return;
        }
        int i2 = s49Var.f;
        SparseArray sparseArray = this.e;
        if (i2 == 0) {
            ((xya) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (i2 == 1) {
            ((y14) view).setHeight(gl.L(82.0f));
        } else if (i2 == 2) {
            ((m84) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        u0b u0bVar = this.r;
        Context context = this.c;
        if (i == 0) {
            p0b p0bVar = new p0b(this, context, u0bVar.J0);
            p0bVar.getImageView().m0(7);
            frameLayout = p0bVar;
        } else if (i == 1) {
            frameLayout = new y14(context);
        } else if (i == 2) {
            frameLayout = new m84(8, u0bVar.J0, this.c, true, false);
        } else if (i != 3) {
            frameLayout = null;
        } else {
            wjb wjbVar = u0bVar.J0;
            o0b o0bVar = new o0b(context);
            o0bVar.a = wjbVar;
            View view = new View(context);
            o0bVar.c = view;
            int L = gl.L(28.0f);
            int i2 = bkb.Df;
            ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.12f, bkb.v0(i2, wjbVar)));
            o0bVar.b = b0;
            Drawable d = b00.d(context, R.drawable.filled_add_sticker);
            zkb.x(o0bVar, d, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
            fm2 fm2Var = new fm2(b0, d);
            int L2 = gl.L(56.0f);
            int L3 = gl.L(56.0f);
            fm2Var.h = L2;
            fm2Var.n = L3;
            int L4 = gl.L(24.0f);
            int L5 = gl.L(24.0f);
            fm2Var.e = L4;
            fm2Var.f = L5;
            view.setBackground(fm2Var);
            ote.a(view);
            o0bVar.addView(view, nme.e(56, 56, 17));
            frameLayout = o0bVar;
        }
        return new y29(frameLayout);
    }
}
