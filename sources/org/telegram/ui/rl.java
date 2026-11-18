package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rl implements rq0 {
    public final TL_iv.RichMessage a;
    public final ArrayList b;
    public final org.telegram.messenger.fj c;

    public rl(TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.messenger.fj fjVar) {
        this.a = richMessage;
        this.b = arrayList;
        this.c = fjVar;
    }

    @Override // org.telegram.ui.rq0
    public final boolean a(int i7) {
        if (i7 < 0) {
            return false;
        }
        ArrayList arrayList = this.b;
        if (i7 >= arrayList.size()) {
            return false;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
        if (!(pageBlock instanceof TL_iv.pageBlockVideo)) {
            return false;
        }
        TLRPC.Document b10 = d4.b(this.a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        if (b10 != null) {
            return org.telegram.messenger.fj.K4(b10);
        }
        return false;
    }

    @Override // org.telegram.ui.rq0
    public final File b(int i7) {
        TLRPC.Document b10;
        TLRPC.PhotoSize w10;
        if (i7 >= 0) {
            ArrayList arrayList = this.b;
            if (i7 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.a;
                if (z10) {
                    TLRPC.Photo f10 = d4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (w10 = org.telegram.messenger.w7.w(f10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                        return d4.c(w10);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = d4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return d4.c(b10);
                }
            }
        }
        return null;
    }

    @Override // org.telegram.ui.rq0
    public final String c(int i7) {
        TLObject d = d(i7);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override // org.telegram.ui.rq0
    public final TLObject d(int i7) {
        if (i7 < 0) {
            return null;
        }
        ArrayList arrayList = this.b;
        if (i7 >= arrayList.size()) {
            return null;
        }
        TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
        boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
        TL_iv.RichMessage richMessage = this.a;
        if (z10) {
            return d4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            return d4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
        }
        return null;
    }

    @Override // org.telegram.ui.rq0
    public final boolean e(int i7) {
        return false;
    }

    @Override // org.telegram.ui.rq0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 == null) {
                iArr[0] = -1;
                return null;
            }
            int i7 = w10.size;
            iArr[0] = i7;
            if (i7 == 0) {
                iArr[0] = -1;
            }
            return w10;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, org.telegram.messenger.ks.r5, false, null, true);
            if (w11 == null) {
                w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            }
            if (w11 != null) {
                int i10 = w11.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w11;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override // org.telegram.ui.rq0
    public final Object g() {
        org.telegram.messenger.fj fjVar = this.c;
        return fjVar != null ? fjVar : this.a;
    }

    @Override // org.telegram.ui.rq0
    public final TL_iv.PageBlock get(int i7) {
        return (TL_iv.PageBlock) this.b.get(i7);
    }

    @Override // org.telegram.ui.rq0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.rq0
    public final void h(TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.ev evVar;
        org.telegram.messenger.fj fjVar = this.c;
        if (fjVar == null || (evVar = fjVar.y2) == null) {
            return;
        }
        ArrayList arrayList = evVar.g;
        if (pageBlock == null) {
            return;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            org.telegram.messenger.zt ztVar = (org.telegram.messenger.zt) arrayList.get(i7);
            if (ztVar instanceof org.telegram.messenger.qu) {
                org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) ztVar;
                ArrayList arrayList2 = quVar.Y;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (((org.telegram.messenger.st) arrayList2.get(i10)).b == pageBlock) {
                        int max = Math.max(0, Math.min(i10, arrayList2.size() - 1));
                        ValueAnimator valueAnimator = quVar.l0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            quVar.l0 = null;
                        }
                        if (quVar.b0 == max && quVar.c0 == 0.0f) {
                            return;
                        }
                        quVar.b0 = max;
                        quVar.c0 = 0.0f;
                        quVar.d0 = false;
                        quVar.e0 = false;
                        View view = quVar.W;
                        if (view != null) {
                            view.invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // org.telegram.ui.rq0
    public final CharSequence i(int i7) {
        return null;
    }

    @Override // org.telegram.ui.rq0
    public final int j() {
        return this.b.size();
    }
}
