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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t2b extends q59 {
    public final Context c;
    public int d;
    public final SparseArray e = new SparseArray();
    public final SparseArray f = new SparseArray();
    public int h;
    public int n;
    public final /* synthetic */ x2b r;

    public t2b(x2b x2bVar, Context context) {
        this.r = x2bVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        return this.h;
    }

    @Override // y59
    public final int d(int i) {
        x2b x2bVar = this.r;
        if (x2bVar.Q1 == null) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
            return (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() != i) ? 0 : 3;
        }
        Object obj = this.e.get(i);
        if (obj != null) {
            return !(obj instanceof TLRPC.Document) ? 2 : 0;
        }
        return 1;
    }

    @Override // y59
    public final void f() {
        int i;
        int i2;
        int i3;
        x2b x2bVar = this.r;
        if (x2bVar.Q1 != null) {
            int measuredWidth = x2bVar.m1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = gm.q.x;
            }
            int L = measuredWidth / gm.L(72.0f);
            this.d = L;
            x2bVar.G1.x1(L);
            SparseArray sparseArray = this.e;
            sparseArray.clear();
            SparseArray sparseArray2 = this.f;
            sparseArray2.clear();
            this.h = 0;
            this.n = 0;
            for (int i4 = 0; i4 < x2bVar.Q1.size(); i4++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) x2bVar.Q1.get(i4);
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
            ArrayList arrayList = x2bVar.S1;
            if (arrayList != null) {
                this.h = arrayList.size();
            } else {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
                this.h = tL_messages_stickerSet != null ? tL_messages_stickerSet.documents.size() : 0;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = x2bVar.M1;
                if (tL_messages_stickerSet2 != null && tL_messages_stickerSet2.set.creator && tL_messages_stickerSet2.documents.size() < 120) {
                    TLRPC.StickerSet stickerSet = x2bVar.M1.set;
                    if (!stickerSet.masks && !stickerSet.emojis) {
                        this.h++;
                    }
                }
            }
        }
        super.f();
    }

    @Override // y59
    public final void s(int i) {
        ArrayList arrayList = this.r.S1;
        if (arrayList != null) {
            this.h = arrayList.size();
        }
        super.s(i);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        View view = u69Var.a;
        x2b x2bVar = this.r;
        ArrayList arrayList = x2bVar.Q1;
        if (arrayList == null) {
            if (x2bVar.R1 != null) {
                ((y0b) view).setSticker((t5a) x2bVar.S1.get(i));
                return;
            }
            if (u69Var.f != 3) {
                y0b y0bVar = (y0b) view;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = x2bVar.M1;
                if (tL_messages_stickerSet != null) {
                    y0bVar.d(tL_messages_stickerSet.documents.get(i), null, x2bVar.M1, null, x2bVar.b2, x2bVar.L1);
                    y0bVar.K.setOnClickListener(new r39(this, y0bVar, (byte) 22));
                    return;
                }
                return;
            }
            return;
        }
        int i2 = u69Var.f;
        SparseArray sparseArray = this.e;
        if (i2 == 0) {
            ((y0b) view).d((TLRPC.Document) sparseArray.get(i), null, this.f.get(i), null, false, false);
        } else if (i2 == 1) {
            ((j34) view).setHeight(gm.L(82.0f));
        } else if (i2 == 2) {
            ((v94) view).c((TLRPC.StickerSetCovered) arrayList.get(((Integer) sparseArray.get(i)).intValue()), false, false, 0, 0, false);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        x2b x2bVar = this.r;
        Context context = this.c;
        if (i == 0) {
            s2b s2bVar = new s2b(this, context, x2bVar.J0);
            s2bVar.getImageView().m0(7);
            frameLayout = s2bVar;
        } else if (i == 1) {
            frameLayout = new j34(context);
        } else if (i == 2) {
            frameLayout = new v94(8, x2bVar.J0, this.c, true, false);
        } else if (i != 3) {
            frameLayout = null;
        } else {
            ylb ylbVar = x2bVar.J0;
            r2b r2bVar = new r2b(context);
            r2bVar.a = ylbVar;
            View view = new View(context);
            r2bVar.c = view;
            int L = gm.L(28.0f);
            int i2 = cmb.Df;
            ShapeDrawable b0 = cmb.b0(L, cmb.p1(0.12f, cmb.v0(i2, ylbVar)));
            r2bVar.b = b0;
            Drawable d = b10.d(context, R.drawable.filled_add_sticker);
            anb.x(r2bVar, d, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
            sn2 sn2Var = new sn2(b0, d);
            int L2 = gm.L(56.0f);
            int L3 = gm.L(56.0f);
            sn2Var.h = L2;
            sn2Var.n = L3;
            int L4 = gm.L(24.0f);
            int L5 = gm.L(24.0f);
            sn2Var.e = L4;
            sn2Var.f = L5;
            view.setBackground(sn2Var);
            rve.a(view);
            r2bVar.addView(view, qoe.e(56, 56, 17));
            frameLayout = r2bVar;
        }
        return new b59(frameLayout);
    }
}
