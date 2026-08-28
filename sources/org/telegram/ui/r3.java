package org.telegram.ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r3 implements vt0 {
    public final TLRPC.WebPage a;
    public final List b;
    public final /* synthetic */ l4 c;

    public r3(l4 l4Var, TLRPC.WebPage webPage, List list) {
        this.c = l4Var;
        this.a = webPage;
        this.b = list;
    }

    @Override // org.telegram.ui.vt0
    public final boolean a(int i9) {
        return i9 < this.b.size() && i9 >= 0 && i4.g(this.a, get(i9));
    }

    @Override // org.telegram.ui.vt0
    public final File b(int i9) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i9 < this.b.size() && i9 >= 0) {
            TL_iv.PageBlock pageBlock = get(i9);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                TLRPC.Photo e10 = i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return i4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return i4.c(a2);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vt0
    public final String c(int i9) {
        TLObject d = d(i9);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override // org.telegram.ui.vt0
    public final TLObject d(int i9) {
        if (i9 < this.b.size() && i9 >= 0) {
            TL_iv.PageBlock pageBlock = get(i9);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.a;
            if (z10) {
                return i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override // org.telegram.ui.vt0
    public final boolean e(int i9) {
        if (i9 < this.b.size() && i9 >= 0 && !i4.g(this.a, get(i9))) {
            j4 j4Var = this.c.q0[0].c;
            TL_iv.PageBlock pageBlock = get(i9);
            j4Var.getClass();
            if (j4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.vt0
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
                return null;
            }
            int i9 = closestPhotoSizeWithSize.size;
            iArr[0] = i9;
            if (i9 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize2 == null) {
            iArr[0] = -1;
            return null;
        }
        int i10 = closestPhotoSizeWithSize2.size;
        iArr[0] = i10;
        if (i10 == 0) {
            iArr[0] = -1;
        }
        return closestPhotoSizeWithSize2;
    }

    @Override // org.telegram.ui.vt0
    public final Object g() {
        return this.a;
    }

    @Override // org.telegram.ui.vt0
    public final TL_iv.PageBlock get(int i9) {
        return (TL_iv.PageBlock) this.b.get(i9);
    }

    @Override // org.telegram.ui.vt0
    public final List getAll() {
        return this.b;
    }

    @Override // org.telegram.ui.vt0
    public final void h(TL_iv.PageBlock pageBlock) {
        l4 l4Var = this.c;
        int childCount = l4Var.q0[0].b.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = l4Var.q0[0].b.getChildAt(i9);
            if (childAt instanceof t2) {
                t2 t2Var = (t2) childAt;
                int indexOf = t2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    t2Var.a.x(indexOf, false);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    @Override // org.telegram.ui.vt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence i(int i9) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i9);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (!TextUtils.isEmpty(str)) {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new q3(this, str, 0), 0, str.length(), 34);
                if (spannableStringBuilder == null) {
                    return spannableStringBuilder;
                }
                l4 l4Var = this.c;
                l4Var.getClass();
                TL_iv.RichText w8 = l4.w(2, pageBlock);
                CharSequence C = l4.C(l4Var, this.a, null, w8, w8, pageBlock, -AndroidUtilities.dp(100.0f));
                if (!(C instanceof Spannable)) {
                    return C;
                }
                Spannable spannable = (Spannable) C;
                org.telegram.ui.Components.rz0[] rz0VarArr = (org.telegram.ui.Components.rz0[]) spannable.getSpans(0, C.length(), org.telegram.ui.Components.rz0.class);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C.toString());
                if (rz0VarArr != null && rz0VarArr.length > 0) {
                    for (int i10 = 0; i10 < rz0VarArr.length; i10++) {
                        spannableStringBuilder2.setSpan(new q3(this, rz0VarArr[i10].b, 1), spannable.getSpanStart(rz0VarArr[i10]), spannable.getSpanEnd(rz0VarArr[i10]), 33);
                    }
                }
                return spannableStringBuilder2;
            }
        }
        spannableStringBuilder = null;
        if (spannableStringBuilder == null) {
        }
    }

    @Override // org.telegram.ui.vt0
    public final int j() {
        return this.b.size();
    }
}
