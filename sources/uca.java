// default package

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uca extends i98 {
    public final /* synthetic */ nfa a;

    public uca(nfa nfaVar) {
        this.a = nfaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116 A[SYNTHETIC] */
    @Override // i98, o98
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        int i2;
        int i3;
        lba lbaVar;
        k27 message;
        ImageReceiver linkImageView;
        ImageReceiver photoImage;
        View pinnedHeader;
        nfa nfaVar = this.a;
        cea ceaVar = nfaVar.G1;
        gda gdaVar = nfaVar.U0;
        iea[] ieaVarArr = nfaVar.n0;
        if (k27Var != null) {
            int i4 = 0;
            iea ieaVar = ieaVarArr[0];
            int i5 = ieaVar.F;
            if (i5 == 0 || i5 == 1 || i5 == 3 || i5 == 5) {
                sca scaVar = ieaVar.h;
                int childCount = scaVar.getChildCount();
                int i6 = -1;
                int i7 = 0;
                int i8 = -1;
                int i9 = -1;
                while (i7 < childCount) {
                    View childAt = scaVar.getChildAt(i7);
                    int measuredHeight = ieaVarArr[i4].h.getMeasuredHeight();
                    View view = (View) nfaVar.getParent();
                    if (view != null) {
                        imageReceiver = null;
                        if (nfaVar.getY() + nfaVar.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= nfaVar.getBottom() - view.getMeasuredHeight();
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
                        if (childAt instanceof qfa) {
                            qfa qfaVar = (qfa) childAt;
                            linkImageView = qfaVar.c;
                            k27 messageObject = qfaVar.getMessageObject();
                            if (messageObject != null) {
                                i3 = i4;
                                if (messageObject.e1() == k27Var.e1()) {
                                    qfaVar.getLocationInWindow(iArr);
                                    iArr[i3] = Math.round(linkImageView.L0) + iArr[i3];
                                    iArr[1] = Math.round(linkImageView.M0) + iArr[1];
                                    if (linkImageView != null) {
                                        p98 p98Var = new p98();
                                        p98Var.b = iArr[i3];
                                        p98Var.c = iArr[1];
                                        p98Var.d = scaVar;
                                        iea ieaVar2 = ieaVarArr[i3];
                                        p98Var.m = ieaVar2.y;
                                        ieaVar2.h.getLocationInWindow(iArr);
                                        p98Var.n = -iArr[1];
                                        p98Var.a = linkImageView;
                                        p98Var.o = true;
                                        p98Var.h = linkImageView.z();
                                        p98Var.e = p98Var.a.p();
                                        p98Var.d.getLocationInWindow(iArr);
                                        int i10 = i3;
                                        p98Var.j = i10;
                                        p98Var.q = nfaVar.w1[i10].m;
                                        if (gdaVar != null && gdaVar.getVisibility() == 0) {
                                            p98Var.j = gl.L(36.0f) + p98Var.j;
                                        }
                                        if (PhotoViewer.O0(k27Var) && (pinnedHeader = scaVar.getPinnedHeader()) != null) {
                                            int height = (gdaVar == null || gdaVar.getVisibility() != 0) ? 0 : gdaVar.getHeight() - gl.L(2.5f);
                                            boolean z3 = childAt instanceof iba;
                                            if (z3) {
                                                height += gl.L(8.0f);
                                            }
                                            int i11 = height - p98Var.c;
                                            if (i11 > childAt.getHeight()) {
                                                scaVar.scrollBy(0, -(pinnedHeader.getHeight() + i11));
                                                return p98Var;
                                            }
                                            int height2 = p98Var.c - scaVar.getHeight();
                                            if (z3) {
                                                height2 -= gl.L(8.0f);
                                            }
                                            if (height2 >= 0) {
                                                scaVar.scrollBy(0, childAt.getHeight() + height2);
                                            }
                                        }
                                        return p98Var;
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
                            if (childAt instanceof iba) {
                                iba ibaVar = (iba) childAt;
                                if (ibaVar.getMessage().e1() == k27Var.e1()) {
                                    be0 imageView = ibaVar.getImageView();
                                    photoImage = imageView.getImageReceiver();
                                    imageView.getLocationInWindow(iArr);
                                    linkImageView = photoImage;
                                }
                                linkImageView = imageReceiver;
                            } else {
                                if (childAt instanceof bw2) {
                                    bw2 bw2Var = (bw2) childAt;
                                    k27 k27Var2 = (k27) bw2Var.getParentObject();
                                    if (k27Var2 != null && k27Var2.e1() == k27Var.e1()) {
                                        photoImage = bw2Var.getPhotoImage();
                                        bw2Var.getLocationInWindow(iArr);
                                        linkImageView = photoImage;
                                    }
                                } else if ((childAt instanceof lba) && (message = (lbaVar = (lba) childAt).getMessage()) != null && message.e1() == k27Var.e1()) {
                                    linkImageView = lbaVar.getLinkImageView();
                                    lbaVar.getLocationInWindow(iArr);
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
                if (ieaVarArr[i12].F != 0 || i8 < 0 || i9 < 0) {
                    return null;
                }
                int L = nfaVar.K.L(i);
                if (L <= i8) {
                    ieaVarArr[i12].x.g1(L, i12);
                    ceaVar.I();
                    return null;
                }
                if (L < i9 || i9 < 0) {
                    return null;
                }
                ieaVarArr[i12].x.h1(L, i12, true);
                ceaVar.I();
                return null;
            }
        }
        return null;
    }
}
