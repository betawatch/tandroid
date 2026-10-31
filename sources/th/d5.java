package th;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.qz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.v20;
import org.telegram.messenger.vp;
import org.telegram.messenger.x20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d5 implements us {
    public long D;
    public jj E;
    public x20 F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public jj K;
    public TL_bots.botPreviewMedia L;
    public final /* synthetic */ e5 M;
    public final boolean b;
    public final vh.n5 c;
    public boolean d;
    public String e;
    public final String f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public boolean w;
    public int x;
    public long y = -1;
    public final long a = Utilities.b.nextLong();

    public d5(e5 e5Var, vh.n5 n5Var) {
        this.M = e5Var;
        this.c = n5Var;
        this.b = n5Var.g;
        File file = n5Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = n5Var.w;
        this.H = z10;
        this.I = z10;
        long j10 = n5Var.J0;
        if (j10 != 0) {
            this.J = j10;
            return;
        }
        if (n5Var.g) {
            this.J = n5Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = n5Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.J = d20.i(e5Var.a).n;
        } else {
            this.J = org.telegram.messenger.o5.n(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.I;
        vh.n5 n5Var = this.c;
        e5 e5Var = this.M;
        if (z10) {
            e5Var.w.c(n5Var);
            ((ArrayList) e5Var.b.f(this.J)).remove(this);
        }
        this.w = true;
        if (n5Var.E()) {
            MediaController.B().i(this.E);
        }
        b8.G(e5Var.a).b(this.e, false);
        if (this.x >= 0) {
            ConnectionsManager.getInstance(e5Var.a).cancelRequest(this.x, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        uh.m mVar;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        uh.m mVar2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        e5 e5Var = this.M;
        int i10 = e5Var.a;
        zs.f(i10).n(this, zs.U1);
        zs.f(i10).n(this, zs.V1);
        zs.f(i10).n(this, zs.W1);
        zs.f(i10).n(this, zs.c2);
        zs.f(i10).n(this, zs.a2);
        zs.f(i10).n(this, zs.b2);
        boolean z10 = this.I;
        long j10 = this.J;
        if (!z10 && (arrayList = (ArrayList) e5Var.b.f(j10)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) e5Var.c.f(j10);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                e5Var.d = 0;
            } else {
                e5Var.d++;
            }
        }
        boolean z11 = this.b;
        vh.n5 n5Var = this.c;
        if (z11 && (hashMap = (HashMap) e5Var.e.f(j10)) != null) {
            hashMap.remove(Integer.valueOf(n5Var.f));
        }
        if (this.L != null) {
            x4 A = e5Var.A(4, -1, this.J, false);
            if (n5Var == null || !n5Var.g) {
                if (A instanceof q4) {
                    ((q4) A).I(this.L);
                }
                String str = n5Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = uh.m.F;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    q4 q4Var = (q4) longSparseArray2.get(j10);
                    int i11 = q4Var.c;
                    ArrayList arrayList3 = q4Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(q4Var.E, str)) {
                            q4Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            u4 u4Var = q4Var.q;
                            org.telegram.messenger.i0.r(u4Var);
                            org.telegram.messenger.i0.g3(u4Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = uh.m.E;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (mVar = (uh.m) longSparseArray.get(j10)) != null) {
                    ArrayList arrayList4 = mVar.f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        q4 q4Var2 = (q4) arrayList4.get(i12);
                        if (q4Var2.c == i10 && TextUtils.equals(q4Var2.E, str)) {
                            q4Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof q4) {
                    ((q4) A).G(n5Var.L0, this.L);
                }
                String str2 = n5Var.K0;
                TLRPC.InputMedia inputMedia = n5Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = uh.m.F;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    q4 q4Var3 = (q4) longSparseArray4.get(j10);
                    int i13 = q4Var3.c;
                    ArrayList arrayList5 = q4Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(q4Var3.E, str2)) {
                            q4Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            u4 u4Var2 = q4Var3.q;
                            org.telegram.messenger.i0.r(u4Var2);
                            org.telegram.messenger.i0.g3(u4Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = uh.m.E;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (mVar2 = (uh.m) longSparseArray3.get(j10)) != null) {
                    ArrayList arrayList6 = mVar2.f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        q4 q4Var4 = (q4) arrayList6.get(i14);
                        if (q4Var4.c == i10 && TextUtils.equals(q4Var4.E, str2)) {
                            q4Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        zs.f(i10).k(zs.v5, new Object[0]);
        if (n5Var != null && !n5Var.h && !this.d) {
            n5Var.i(false);
            this.d = true;
        }
        zs.e().k(zs.B5, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        boolean z10;
        boolean z11;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        CharSequence charSequence;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i10 = this.M.a;
        if (this.w) {
            return;
        }
        vh.n5 n5Var = this.c;
        n5Var.getClass();
        ArrayList arrayList2 = n5Var.F0;
        int i11 = 0;
        if (n5Var.n && !n5Var.j && (messageMedia = n5Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = n5Var.t;
                TLRPC.Document document = messageMedia2.document;
                tL_inputDocument.id = document.id;
                tL_inputDocument.access_hash = document.access_hash;
                tL_inputDocument.file_reference = document.file_reference;
                tL_inputMediaDocument.id = tL_inputDocument;
                tL_inputMediaDocument.spoiler = messageMedia2.spoiler;
                tL_inputMediaPhoto2 = tL_inputMediaDocument;
            } else if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
                TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto3 = new TLRPC.TL_inputMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                TLRPC.Photo photo = n5Var.t.photo;
                tL_inputPhoto.id = photo.id;
                tL_inputPhoto.access_hash = photo.access_hash;
                tL_inputPhoto.file_reference = photo.file_reference;
                tL_inputMediaPhoto3.id = tL_inputPhoto;
                tL_inputMediaPhoto2 = tL_inputMediaPhoto3;
            }
            z10 = true;
            tL_inputMediaPhoto = tL_inputMediaPhoto2;
            TLRPC.InputMedia inputMedia = tL_inputMediaPhoto;
            inputMedia = tL_inputMediaPhoto;
            if (tL_inputMediaPhoto == null && inputFile != null) {
                if (n5Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = n5Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = n5Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = n5Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(n5Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (n5Var.c0 != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= n5Var.c0.attributes.size()) {
                                break;
                            }
                            if (n5Var.c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) n5Var.c0.attributes.get(i12);
                                break;
                            }
                            i12++;
                        }
                    } else {
                        qz.x(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i13 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i13 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.y;
                    if (n5Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i13 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (n5Var.Z * n5Var.h0)) / 1000.0d;
                    }
                    List list2 = n5Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = n5Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(n5Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = n5Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = n5Var.y == null && (n5Var.Y || !n5Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i14 = !d20.i(i10).q() ? vp.r1(i10).X4 : vp.r1(i10).W4;
            z11 = this.b;
            long j10 = this.J;
            if (z11) {
                if (n5Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = vp.r1(i10).n1(n5Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = n5Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = vp.r1(i10).i1(j10);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = n5Var.G0;
                    tL_stories_sendStory2.noforwards = !n5Var.H0;
                    tL_stories_sendStory2.albums = n5Var.w0 != null ? new ArrayList<>(n5Var.w0) : null;
                    TLRPC.InputDocument inputDocument = n5Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence2 = n5Var.C0;
                    if (charSequence2 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence2};
                        if (charSequence2.length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        if (vp.r1(i10).U4()) {
                            tL_stories_sendStory2.entities = ui.b0(i10).W(charSequenceArr, true, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        if (charSequenceArr[0].length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    }
                    if (n5Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = vp.r1(i10).l1(n5Var.q);
                        tL_stories_sendStory2.fwd_from_story = n5Var.r;
                        tL_stories_sendStory2.fwd_modified = !z10;
                    }
                    int i15 = n5Var.I0;
                    if (i15 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i15;
                    }
                    if (n5Var.T0 != null) {
                        for (int i16 = 0; i16 < n5Var.T0.size(); i16++) {
                            TL_stories.MediaArea mediaArea = ((v20) n5Var.T0.get(i16)).M;
                            if (mediaArea != null) {
                                tL_stories_sendStory2.media_areas.add(mediaArea);
                            }
                        }
                        if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                            tL_stories_sendStory2.flags |= 32;
                        }
                    }
                    tL_stories_sendStory = tL_stories_sendStory2;
                }
            } else if (n5Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = vp.r1(i10).n1(n5Var.J0);
                editpreviewmedia.media = n5Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = n5Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = n5Var.f;
                tL_stories_editStory.peer = vp.r1(i10).i1(j10);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = n5Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && n5Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (n5Var.k && (charSequence = n5Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence};
                    if (charSequence.length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    if (vp.r1(i10).U4()) {
                        tL_stories_editStory.entities = ui.b0(i10).W(charSequenceArr2, true, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (n5Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = n5Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (n5Var.T0 != null) {
                    for (int i17 = 0; i17 < n5Var.T0.size(); i17++) {
                        TL_stories.MediaArea mediaArea2 = ((v20) n5Var.T0.get(i17)).M;
                        if (mediaArea2 != null) {
                            tL_stories_editStory.media_areas.add(mediaArea2);
                        }
                    }
                }
                if (!tL_stories_editStory.media_areas.isEmpty()) {
                    tL_stories_editStory.flags |= 8;
                }
                tL_stories_sendStory = tL_stories_editStory;
            }
            a5 a5Var = new a5(this, i11);
            boolean z12 = org.telegram.messenger.v2.a;
            this.x = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendStory, a5Var, 64);
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (n5Var.E()) {
            }
        }
        if (!d20.i(i10).q()) {
        }
        z11 = this.b;
        long j102 = this.J;
        if (z11) {
        }
        a5 a5Var2 = new a5(this, i11);
        boolean z122 = org.telegram.messenger.v2.a;
        this.x = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_sendStory, a5Var2, 64);
    }

    public final void d() {
        vh.n5 n5Var = this.c;
        if (n5Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            TLRPC.Document document = this.c.c0;
            int i10 = vp.D8;
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            tL_inputDocument.file_reference = document.file_reference;
            tL_inputFileStoryDocument.doc = tL_inputDocument;
            c(tL_inputFileStoryDocument);
        } else if ((n5Var.g || (n5Var.n && n5Var.t != null)) && !n5Var.j && n5Var.o0 == null) {
            c(null);
            return;
        }
        vh.u6 u6Var = this.c.E0;
        int i11 = 1;
        this.G = u6Var != null && u6Var.a == 1;
        zs.f(this.M.a).b(this, zs.U1);
        zs.f(this.M.a).b(this, zs.V1);
        zs.f(this.M.a).b(this, zs.W1);
        zs.f(this.M.a).b(this, zs.c2);
        zs.f(this.M.a).b(this, zs.a2);
        zs.f(this.M.a).b(this, zs.b2);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = vh.n5.x(this.M.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new jj(this.M.a, tL_message, null, false, false);
            this.c.s(new c5(this, i11));
        } else {
            File w9 = vh.n5.w(this.M.a, "jpg");
            this.e = w9.getAbsolutePath();
            Utilities.i.c(new o0(12, this, w9));
        }
        Intent intent = new Intent(org.telegram.messenger.w0.b, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.a);
        try {
            org.telegram.messenger.w0.b.startService(intent);
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e5 e5Var = this.M;
        int i12 = e5Var.a;
        if (i10 == zs.a2) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i13 = zs.b2;
        int i14 = zs.A5;
        if (i10 == i13) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                zs.f(i12).k(i14, this.e, Float.valueOf(this.h));
                if (this.y < 0 && this.n * this.D >= 1000.0f) {
                    this.y = longValue;
                }
                b8.G(i12).n(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.y >= 0) {
                    return;
                }
                this.y = longValue2;
                return;
            }
            return;
        }
        if (i10 == zs.c2) {
            if (objArr[0] == this.E) {
                if (!this.b) {
                    vh.n5 n5Var = this.c;
                    n5Var.w = true;
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    n5Var.x = tL_error;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    e5Var.w.d(n5Var);
                }
                b();
                return;
            }
            return;
        }
        if (i10 == zs.U1) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i10 == zs.V1) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            zs.e().k(zs.P4, 1, cd.L0(2131744478, null));
            b();
            return;
        }
        if (i10 == zs.W1 && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            zs.f(i12).k(i14, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        vh.n5 n5Var = this.c;
        n5Var.getClass();
        b8 G = b8.G(this.M.a);
        String str = this.e;
        boolean z10 = !n5Var.K;
        if (this.s) {
            x20 x20Var = this.F;
            r6 = Math.max(1, (int) (x20Var != null ? x20Var.q : 0L));
        }
        G.h0(str, false, z10, r6, n5Var.K ? 33554432 : 16777216, true);
    }
}
