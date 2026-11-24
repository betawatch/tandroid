// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Point;
import android.graphics.Shader;
import android.net.Uri;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class x4c implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x4c(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TLObject a2;
        TLObject a22;
        v5b v5bVar;
        in3 in3Var;
        int i;
        ArrayList arrayList = null;
        int i2 = 0;
        switch (this.a) {
            case 0:
                ((TwoStepVerificationActivity) this.b).j0((TL_account.updatePasswordSettings) this.c);
                break;
            case 1:
                ((TwoStepVerificationActivity) this.b).q0((TLRPC.TL_error) this.c);
                break;
            case 2:
                ((p5c) this.b).t0((String) this.c);
                break;
            case 3:
                p5c p5cVar = (p5c) this.b;
                Runnable runnable = (Runnable) this.c;
                gl2[] gl2VarArr = p5cVar.x.f;
                int length = gl2VarArr.length;
                while (i2 < length) {
                    gl2VarArr[i2].D(0.0f);
                    i2++;
                }
                runnable.run();
                break;
            case 4:
                UndoView undoView = (UndoView) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i3 = UndoView.j0;
                if (tLObject instanceof TLRPC.PaymentReceipt) {
                    undoView.s.presentFragment(new p((TLRPC.PaymentReceipt) tLObject));
                    break;
                }
                break;
            case 5:
                ((c6c) this.b).E.onClick((ajb) this.c);
                break;
            case 6:
                z8c z8cVar = (z8c) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                z8cVar.getClass();
                if (tLObject2 != null) {
                    z8cVar.q0 = ((TLRPC.TL_defaultHistoryTTL) tLObject2).period / 60;
                    z8cVar.getNotificationCenter().k(nm7.w5, new Object[0]);
                    z8cVar.r0 = false;
                    z8cVar.s0 = System.currentTimeMillis();
                    break;
                }
                break;
            case 7:
                d9c d9cVar = (d9c) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                ArrayList arrayList2 = d9cVar.e;
                ArrayList arrayList3 = d9cVar.d;
                if (tLObject3 instanceof TLRPC.messages_Chats) {
                    arrayList3.clear();
                    arrayList3.addAll(((TLRPC.messages_Chats) tLObject3).chats);
                }
                oc7.r1(d9cVar.a).X3(arrayList3, false);
                d9cVar.c = false;
                d9cVar.b = true;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    ((Runnable) obj).run();
                }
                arrayList2.clear();
                break;
            case 8:
                t9c t9cVar = (t9c) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList4 = t9cVar.e2;
                arrayList4.clear();
                t9cVar.q2 = -1;
                if (tLObject4 instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject4;
                    oc7 r1 = oc7.r1(t9cVar.a);
                    r1.d4(tL_contacts_found.users, false);
                    r1.X3(tL_contacts_found.chats, false);
                    HashSet hashSet = new HashSet();
                    ArrayList<TLRPC.Peer> arrayList5 = tL_contacts_found.my_results;
                    int size2 = arrayList5.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        TLRPC.Peer peer = arrayList5.get(i4);
                        i4++;
                        long n = pg3.n(peer);
                        if (!hashSet.contains(Long.valueOf(n)) && (a22 = r1.a2(n)) != null) {
                            arrayList4.add(a22);
                            hashSet.add(Long.valueOf(n));
                        }
                    }
                    ArrayList<TLRPC.Peer> arrayList6 = tL_contacts_found.results;
                    int size3 = arrayList6.size();
                    while (i2 < size3) {
                        TLRPC.Peer peer2 = arrayList6.get(i2);
                        i2++;
                        long n2 = pg3.n(peer2);
                        if (!hashSet.contains(Long.valueOf(n2)) && (a2 = r1.a2(n2)) != null) {
                            arrayList4.add(a2);
                            hashSet.add(Long.valueOf(n2));
                        }
                    }
                }
                t9cVar.g1(true, true);
                break;
            case 9:
                q9a q9aVar = (q9a) this.b;
                t76 t76Var = (t76) this.c;
                if (q9aVar.a instanceof h2) {
                    t76Var.cancel(false);
                    break;
                }
                break;
            case 10:
                ((VideoAds) this.b).lambda$showPremium$19((kj8) this.c);
                break;
            case 11:
                ((VideoAds) this.b).lambda$load$0((TLObject) this.c);
                break;
            case 12:
                ((VideoAds) this.b).lambda$show$16((qac) this.c);
                break;
            case 13:
                cd9.Y0((Context) this.b, null, false, (q63) this.c, null);
                break;
            case 14:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) this.b, (Point) this.c);
                break;
            case 15:
                ((VideoCapturerDevice) this.b).lambda$init$4((String) this.c);
                break;
            case 16:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                break;
            case 17:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                break;
            case 18:
                ndc ndcVar = (ndc) this.b;
                u64 u64Var = (u64) this.c;
                Throwable cause = u64Var.getCause();
                if (!(cause instanceof km6) || (!cause.toString().contains("av1") && !cause.toString().contains("av01"))) {
                    TextureView textureView = ndcVar.n;
                    if (textureView != null && ((!ndcVar.F && (cause instanceof mm6)) || (cause instanceof ceb))) {
                        ndcVar.F = true;
                        if (ndcVar.d != null) {
                            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                            if (viewGroup != null) {
                                int indexOfChild = viewGroup.indexOfChild(ndcVar.n);
                                viewGroup.removeView(ndcVar.n);
                                viewGroup.addView(ndcVar.n, indexOfChild);
                            }
                            np3 np3Var = ndcVar.b;
                            if (np3Var == null) {
                                h74 h74Var = ndcVar.d;
                                TextureView textureView2 = ndcVar.n;
                                h74Var.y1();
                                if (textureView2 != null && textureView2 == h74Var.X) {
                                    h74Var.y1();
                                    h74Var.i1();
                                    h74Var.q1(null);
                                    h74Var.f1(0, 0);
                                }
                                ndcVar.d.s1(ndcVar.n);
                                ArrayList arrayList7 = ndcVar.O;
                                if (arrayList7 != null) {
                                    ndcVar.j0(arrayList7, ndcVar.P);
                                } else {
                                    boolean z = ndcVar.V;
                                    Uri uri = ndcVar.R;
                                    String str = ndcVar.T;
                                    if (z) {
                                        ndcVar.k0(uri, str, ndcVar.S, ndcVar.U);
                                    } else {
                                        ndcVar.i0(uri, str);
                                    }
                                }
                                ndcVar.g0();
                                break;
                            } else {
                                np3Var.postRunnable(new f8c(ndcVar, (byte) 7));
                                break;
                            }
                        }
                    } else {
                        ndcVar.K.onError(ndcVar, u64Var);
                        break;
                    }
                } else {
                    fc4.g(u64Var, true);
                    fc4.d("av1 codec failed, we think this codec is not supported");
                    oc7.d1().edit().putBoolean("unsupport_video/av01", true).commit();
                    HashMap hashMap = ndc.m0;
                    if (hashMap != null) {
                        hashMap.clear();
                    }
                    ArrayList arrayList8 = ndcVar.O;
                    if (arrayList8 != null) {
                        int i5 = 0;
                        while (i5 < arrayList8.size()) {
                            kdc kdcVar = (kdc) arrayList8.get(i5);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList9 = kdcVar.d;
                                if (i6 < arrayList9.size()) {
                                    mdc mdcVar = (mdc) arrayList9.get(i6);
                                    if (!TextUtils.isEmpty(mdcVar.m) && !ndc.C0(mdcVar.m)) {
                                        arrayList9.remove(i6);
                                        i6--;
                                    }
                                    i6++;
                                } else {
                                    if (arrayList9.isEmpty()) {
                                        arrayList8.remove(i5);
                                        i5--;
                                    }
                                    i5++;
                                }
                            }
                        }
                        arrayList = arrayList8;
                    }
                    ndcVar.O = arrayList;
                    if (arrayList != null) {
                        ndcVar.j0(arrayList, ndcVar.P);
                        break;
                    }
                }
                break;
            case 19:
                ((ndc) ((yk9) this.b).f).L.s(true, (float[]) this.c);
                break;
            case 20:
                odc odcVar = (odc) this.b;
                if (odcVar.b == ((v5b[]) this.c)[0]) {
                    if (oc7.d1().getBoolean("asr_video_captions", false) && (in3Var = (v5bVar = odcVar.b).f) != null && (DictationAsr.A((gn3) in3Var.b) || DictationAsr.y((gn3) v5bVar.f.b))) {
                        odcVar.b();
                    }
                    odcVar.a.a();
                    break;
                }
                break;
            case 21:
                odc odcVar2 = (odc) this.b;
                if (odcVar2.b == ((v5b) this.c) && odcVar2.d) {
                    odcVar2.d();
                    break;
                }
                break;
            case 22:
                xab xabVar = (xab) this.b;
                hl2 hl2Var = (hl2) this.c;
                ydc ydcVar = (ydc) xabVar.c;
                String str2 = hac.a;
                ((c74) ydcVar).a.G.H(hl2Var);
                break;
            case 23:
                xab xabVar2 = (xab) this.b;
                jec jecVar = (jec) this.c;
                ydc ydcVar2 = (ydc) xabVar2.c;
                String str3 = hac.a;
                h74 h74Var2 = ((c74) ydcVar2).a;
                h74Var2.k0 = jecVar;
                h74Var2.m.e(25, new va3(jecVar));
                break;
            case 24:
                xab xabVar3 = (xab) this.b;
                Exception exc = (Exception) this.c;
                ydc ydcVar3 = (ydc) xabVar3.c;
                String str4 = hac.a;
                xa3 xa3Var = ((c74) ydcVar3).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1030, new u03(U, (Object) exc, (byte) 11));
                break;
            case 25:
                xab xabVar4 = (xab) this.b;
                String str5 = (String) this.c;
                ydc ydcVar4 = (ydc) xabVar4.c;
                String str6 = hac.a;
                xa3 xa3Var2 = ((c74) ydcVar4).a.s;
                tk U2 = xa3Var2.U();
                xa3Var2.V(U2, 1019, new u03(U2, (Object) str5, (byte) 18));
                break;
            case 26:
                bec becVar = (bec) this.b;
                TLRPC.Document document = (TLRPC.Document) this.c;
                bc4.G(becVar.s);
                gm.c3(new x4c(becVar, bc4.I(document), (byte) 27));
                break;
            case 27:
                bec becVar2 = (bec) this.b;
                becVar2.e = (File) this.c;
                becVar2.a();
                break;
            case 28:
                fec fecVar = (fec) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (bitmap != null) {
                    if (fecVar.x != null) {
                        Bitmap bitmap2 = fecVar.w;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        fecVar.w = fecVar.x;
                    }
                    fecVar.x = bitmap;
                    Bitmap bitmap3 = fecVar.x;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                    fecVar.H = bitmapShader;
                    bitmapShader.setLocalMatrix(fecVar.M);
                    fecVar.K.setShader(fecVar.H);
                    fecVar.invalidate();
                    int L = gm.L(150.0f);
                    float width = bitmap.getWidth() / bitmap.getHeight();
                    if (width > 1.0f) {
                        i = (int) (L / width);
                    } else {
                        L = (int) (L * width);
                        i = L;
                    }
                    ViewGroup.LayoutParams layoutParams = fecVar.getLayoutParams();
                    if (fecVar.getVisibility() != 0 || layoutParams.width != L || layoutParams.height != i) {
                        layoutParams.width = L;
                        layoutParams.height = i;
                        fecVar.setVisibility(0);
                        fecVar.requestLayout();
                    }
                }
                fecVar.f = null;
                break;
            default:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                break;
        }
    }
}
