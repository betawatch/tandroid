// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uea extends jb8 {
    public final /* synthetic */ nha a;

    public uea(nha nhaVar) {
        this.a = nhaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116 A[SYNTHETIC] */
    @Override // jb8, pb8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        int i2;
        int i3;
        lda ldaVar;
        k47 message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        nha nhaVar = this.a;
        cga cgaVar = nhaVar.G1;
        gfa gfaVar = nhaVar.U0;
        iga[] igaVarArr = nhaVar.n0;
        if (k47Var != null) {
            int i4 = 0;
            iga igaVar = igaVarArr[0];
            int i5 = igaVar.F;
            if (i5 == 0 || i5 == 1 || i5 == 3 || i5 == 5) {
                sea seaVar = igaVar.h;
                int childCount = seaVar.getChildCount();
                int i6 = -1;
                int i7 = 0;
                int i8 = -1;
                int i9 = -1;
                while (i7 < childCount) {
                    View childAt = seaVar.getChildAt(i7);
                    int measuredHeight = igaVarArr[i4].h.getMeasuredHeight();
                    View view = (View) nhaVar.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (nhaVar.getY() + nhaVar.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= nhaVar.getBottom() - view.getMeasuredHeight();
                        }
                    } else {
                        imageReceiver = null;
                    }
                    if (childAt.getTop() < measuredHeight) {
                        int R = RecyclerView.R(childAt);
                        if (R < i8 || i8 == i6) {
                            i8 = R;
                        }
                        if (R > i9 || i9 == i6) {
                            i9 = R;
                        }
                        int[] iArr = new int[2];
                        if (childAt instanceof sha) {
                            sha shaVar = (sha) childAt;
                            linkImageView = shaVar.c;
                            k47 messageObject = shaVar.getMessageObject();
                            if (messageObject != null) {
                                i3 = i4;
                                if (messageObject.e1() == k47Var.e1()) {
                                    shaVar.getLocationInWindow(iArr);
                                    iArr[i3] = Math.round(linkImageView.L0) + iArr[i3];
                                    iArr[1] = Math.round(linkImageView.M0) + iArr[1];
                                    if (linkImageView != null) {
                                        qb8 qb8Var = new qb8();
                                        qb8Var.b = iArr[i3];
                                        qb8Var.c = iArr[1];
                                        qb8Var.d = seaVar;
                                        iga igaVar2 = igaVarArr[i3];
                                        qb8Var.m = igaVar2.y;
                                        igaVar2.h.getLocationInWindow(iArr);
                                        qb8Var.n = -iArr[1];
                                        qb8Var.a = linkImageView;
                                        qb8Var.o = true;
                                        qb8Var.h = linkImageView.z();
                                        qb8Var.e = qb8Var.a.p();
                                        qb8Var.d.getLocationInWindow(iArr);
                                        int i10 = i3;
                                        qb8Var.j = i10;
                                        qb8Var.q = nhaVar.w1[i10].m;
                                        if (gfaVar != null && gfaVar.getVisibility() == 0) {
                                            qb8Var.j = gm.L(36.0f) + qb8Var.j;
                                        }
                                        if (PhotoViewer.P0(k47Var) && (pinnedHeader = seaVar.getPinnedHeader()) != null) {
                                            int height = (gfaVar == null || gfaVar.getVisibility() != 0) ? 0 : gfaVar.getHeight() - gm.L(2.5f);
                                            boolean z3 = childAt instanceof ida;
                                            if (z3) {
                                                height += gm.L(8.0f);
                                            }
                                            int i11 = height - qb8Var.c;
                                            if (i11 > childAt.getHeight()) {
                                                seaVar.scrollBy(0, -(pinnedHeader.getHeight() + i11));
                                                return qb8Var;
                                            }
                                            int height2 = qb8Var.c - seaVar.getHeight();
                                            if (z3) {
                                                height2 -= gm.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                seaVar.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return qb8Var;
                                    }
                                    i2 = i3;
                                    i7++;
                                    i4 = i2;
                                    i6 = -1;
                                }
                                linkImageView = imageReceiver;
                                if (linkImageView != null) {
                                }
                            }
                        } else {
                            i3 = i4;
                            if (childAt instanceof ida) {
                                ida idaVar = (ida) childAt;
                                if (idaVar.getMessage().e1() == k47Var.e1()) {
                                    bf0 imageView = idaVar.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof lx2) {
                                    lx2 lx2Var = (lx2) childAt;
                                    k47 k47Var2 = (k47) lx2Var.getParentObject();
                                    if (k47Var2 != null && k47Var2.e1() == k47Var.e1()) {
                                        photoImage = lx2Var.getPhotoImage();
                                        lx2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof lda) && (message = (ldaVar = (lda) childAt).getMessage()) != null && message.e1() == k47Var.e1()) {
                                    linkImageView = ldaVar.getLinkImageView();
                                    ldaVar.getLocationInWindow(iArr);
                                }
                                linkImageView = imageReceiver;
                            }
                            if (linkImageView != null) {
                            }
                        }
                    }
                    i2 = i4;
                    i7++;
                    i4 = i2;
                    i6 = -1;
                }
                int i12 = i4;
                if (igaVarArr[i12].F != 0 || i8 < 0 || i9 < 0) {
                    return null;
                }
                int L = nhaVar.K.L(i);
                if (L <= i8) {
                    igaVarArr[i12].x.g1(L, i12);
                    cgaVar.I();
                    return null;
                }
                if (L < i9 || i9 < 0) {
                    return null;
                }
                igaVarArr[i12].x.h1(L, i12, true);
                cgaVar.I();
                return null;
            }
        }
        return null;
    }
}
