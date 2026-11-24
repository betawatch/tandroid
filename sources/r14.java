// default package

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r14 extends n39 {
    public final boolean c;
    public final /* synthetic */ t14 d;

    public r14(t14 t14Var, boolean z) {
        this.d = t14Var;
        this.c = z;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override // w39
    public final int b() {
        boolean z = this.c;
        t14 t14Var = this.d;
        return (z ? t14Var.o1 : t14Var.n1).size();
    }

    @Override // w39
    public final int d(int i) {
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        ArrayList<TLRPC.Document> arrayList;
        gl5 k;
        be0 be0Var = (be0) s49Var.a;
        boolean z = this.c;
        t14 t14Var = this.d;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) (z ? t14Var.o1 : t14Var.n1).get(i);
        be0Var.setTag(stickerSetCovered);
        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
            arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
        } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
            TLRPC.TL_messages_stickerSet n0 = hq6.d0(t14Var.d1).n0(hq6.b0(stickerSetCovered.set), false);
            arrayList = n0 == null ? null : n0.documents;
        } else {
            arrayList = stickerSetCovered.covers;
        }
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null) {
            if (arrayList == null || arrayList.isEmpty()) {
                document = null;
            } else {
                if (stickerSetCovered.set != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (arrayList.get(i2).id == stickerSetCovered.set.thumb_document_id) {
                            document = arrayList.get(i2);
                            break;
                        }
                    }
                }
                document = null;
                if (document == null) {
                    document = arrayList.get(0);
                }
            }
        }
        if (document != null) {
            if (z) {
                be0Var.setColorFilter(k27.B4(document) ? bkb.n0(t14Var.a2) : null);
            }
            TLObject w = ba4.w(stickerSetCovered.set.thumbs, 90, false, null, false);
            kcb d = uo3.d(stickerSetCovered.set.thumbs, bkb.b7, 0.2f, false);
            if (d != null) {
                d.e = 512;
                d.f = 512;
            }
            if (w == null || k27.M4(document)) {
                w = document;
            }
            boolean z2 = w instanceof TLRPC.Document;
            if (z2) {
                k = gl5.c(ba4.w(document.thumbs, 90, false, null, false), document);
            } else if (!(w instanceof TLRPC.PhotoSize)) {
                return;
            } else {
                k = gl5.k((TLRPC.PhotoSize) w, document, stickerSetCovered.set.thumb_version);
            }
            gl5 gl5Var = k;
            if (gl5Var != null) {
                String str = !e66.e(z ? 16388 : 1) ? "30_30_firstframe" : "30_30";
                if (z2 && (k27.K2(document, true) || k27.M4(document))) {
                    if (d != null) {
                        be0Var.p(gl5.b(document), str, d, stickerSetCovered);
                        return;
                    } else {
                        be0Var.h(gl5.b(document), str, gl5Var, null, 0, stickerSetCovered);
                        return;
                    }
                }
                if (gl5Var.p == 1) {
                    be0Var.n(gl5Var, str, "tgs", d, stickerSetCovered);
                } else {
                    be0Var.n(gl5Var, null, "webp", d, stickerSetCovered);
                }
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        q14 q14Var = new q14(this, this.d.getContext());
        q14Var.t(gl.L(24.0f), gl.L(24.0f));
        q14Var.setLayerNum(1);
        q14Var.setAspectFit(true);
        q14Var.setLayoutParams(new e49(gl.L(34.0f), gl.L(34.0f)));
        return new y29(q14Var);
    }
}
