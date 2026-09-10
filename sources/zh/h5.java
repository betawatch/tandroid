package zh;

import android.content.Intent;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.webkit.MimeTypeMap;
import bi.pb;
import bi.r9;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.recorder.StoryUploadingService;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h5 implements NotificationCenter.NotificationCenterDelegate {
    public MessageObject E;
    public VideoEditedInfo F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final long J;
    public MessageObject K;
    public TL_bots.botPreviewMedia L;
    public final /* synthetic */ i5 M;
    public final boolean b;
    public final r9 c;
    public boolean d;
    public String e;
    public final String f;
    public float h;
    public float n;
    public float r;
    public boolean s;
    public boolean v;
    public int w;
    public long y;
    public long x = -1;
    public final long a = Utilities.random.nextLong();

    public h5(i5 i5Var, r9 r9Var) {
        this.M = i5Var;
        this.c = r9Var;
        this.b = r9Var.g;
        File file = r9Var.N0;
        if (file != null) {
            this.f = file.getAbsolutePath();
        }
        boolean z10 = r9Var.w;
        this.H = z10;
        this.I = z10;
        long j3 = r9Var.J0;
        if (j3 != 0) {
            this.J = j3;
            return;
        }
        if (r9Var.g) {
            this.J = r9Var.e;
            return;
        }
        TLRPC.InputPeer inputPeer = r9Var.v0;
        if (inputPeer == null || (inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
            this.J = UserConfig.getInstance(i5Var.a).clientUserId;
        } else {
            this.J = DialogObject.getPeerDialogId(inputPeer);
        }
    }

    public final void a() {
        boolean z10 = this.I;
        r9 r9Var = this.c;
        i5 i5Var = this.M;
        if (z10) {
            i5Var.w.b(r9Var);
            ((ArrayList) i5Var.b.f(this.J)).remove(this);
        }
        this.v = true;
        if (r9Var.E()) {
            MediaController.getInstance().cancelVideoConvert(this.E);
        }
        FileLoader.getInstance(i5Var.a).cancelFileUpload(this.e, false);
        if (this.w >= 0) {
            ConnectionsManager.getInstance(i5Var.a).cancelRequest(this.w, true);
        }
        b();
    }

    public final void b() {
        LongSparseArray longSparseArray;
        ai.g0 g0Var;
        LongSparseArray longSparseArray2;
        LongSparseArray longSparseArray3;
        ai.g0 g0Var2;
        LongSparseArray longSparseArray4;
        HashMap hashMap;
        ArrayList arrayList;
        i5 i5Var = this.M;
        int i10 = i5Var.a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean z10 = this.I;
        long j3 = this.J;
        if (!z10 && (arrayList = (ArrayList) i5Var.b.f(j3)) != null) {
            arrayList.remove(this);
        }
        ArrayList arrayList2 = (ArrayList) i5Var.c.f(j3);
        if (arrayList2 != null) {
            arrayList2.remove(this);
            if (arrayList2.isEmpty()) {
                i5Var.d = 0;
            } else {
                i5Var.d++;
            }
        }
        boolean z11 = this.b;
        r9 r9Var = this.c;
        if (z11 && (hashMap = (HashMap) i5Var.e.f(j3)) != null) {
            hashMap.remove(Integer.valueOf(r9Var.f));
        }
        if (this.L != null) {
            a5 A = i5Var.A(this.J, 4, -1, false);
            if (r9Var == null || !r9Var.g) {
                if (A instanceof s4) {
                    ((s4) A).I(this.L);
                }
                String str = r9Var.K0;
                TL_bots.botPreviewMedia botpreviewmedia = this.L;
                LongSparseArray longSparseArray5 = ai.g0.F;
                if (longSparseArray5 != null && (longSparseArray2 = (LongSparseArray) longSparseArray5.get(i10)) != null) {
                    s4 s4Var = (s4) longSparseArray2.get(j3);
                    int i11 = s4Var.c;
                    ArrayList arrayList3 = s4Var.G;
                    if (i11 == i10) {
                        if (TextUtils.equals(s4Var.E, str)) {
                            s4Var.I(botpreviewmedia);
                        } else if (!TextUtils.isEmpty(str) && !arrayList3.contains(str)) {
                            arrayList3.add(str);
                            x4 x4Var = s4Var.q;
                            AndroidUtilities.cancelRunOnUIThread(x4Var);
                            AndroidUtilities.runOnUIThread(x4Var);
                        }
                    }
                }
                LongSparseArray longSparseArray6 = ai.g0.E;
                if (longSparseArray6 != null && (longSparseArray = (LongSparseArray) longSparseArray6.get(i10)) != null && (g0Var = (ai.g0) longSparseArray.get(j3)) != null) {
                    ArrayList arrayList4 = g0Var.f;
                    for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                        s4 s4Var2 = (s4) arrayList4.get(i12);
                        if (s4Var2.c == i10 && TextUtils.equals(s4Var2.E, str)) {
                            s4Var2.I(botpreviewmedia);
                        }
                    }
                }
            } else {
                if (A instanceof s4) {
                    ((s4) A).G(r9Var.L0, this.L);
                }
                String str2 = r9Var.K0;
                TLRPC.InputMedia inputMedia = r9Var.L0;
                TL_bots.botPreviewMedia botpreviewmedia2 = this.L;
                LongSparseArray longSparseArray7 = ai.g0.F;
                if (longSparseArray7 != null && (longSparseArray4 = (LongSparseArray) longSparseArray7.get(i10)) != null) {
                    s4 s4Var3 = (s4) longSparseArray4.get(j3);
                    int i13 = s4Var3.c;
                    ArrayList arrayList5 = s4Var3.G;
                    if (i13 == i10) {
                        if (TextUtils.equals(s4Var3.E, str2)) {
                            s4Var3.G(inputMedia, botpreviewmedia2);
                        } else if (!TextUtils.isEmpty(str2) && !arrayList5.contains(str2)) {
                            arrayList5.add(str2);
                            x4 x4Var2 = s4Var3.q;
                            AndroidUtilities.cancelRunOnUIThread(x4Var2);
                            AndroidUtilities.runOnUIThread(x4Var2);
                        }
                    }
                }
                LongSparseArray longSparseArray8 = ai.g0.E;
                if (longSparseArray8 != null && (longSparseArray3 = (LongSparseArray) longSparseArray8.get(i10)) != null && (g0Var2 = (ai.g0) longSparseArray3.get(j3)) != null) {
                    ArrayList arrayList6 = g0Var2.f;
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        s4 s4Var4 = (s4) arrayList6.get(i14);
                        if (s4Var4.c == i10 && TextUtils.equals(s4Var4.E, str2)) {
                            s4Var4.G(inputMedia, botpreviewmedia2);
                        }
                    }
                }
            }
            this.L = null;
        }
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        if (r9Var != null && !r9Var.h && !this.d) {
            r9Var.i(false);
            this.d = true;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryEnd, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0165, code lost:
    
        if (r1.isEmpty() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(TLRPC.InputFile inputFile) {
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto;
        boolean z10;
        boolean z11;
        int i10;
        TL_stories.TL_stories_sendStory tL_stories_sendStory;
        d5 d5Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto2;
        int i11 = this.M.a;
        if (this.v) {
            return;
        }
        r9 r9Var = this.c;
        r9Var.getClass();
        ArrayList arrayList2 = r9Var.F0;
        if (r9Var.n && !r9Var.j && (messageMedia = r9Var.t) != null) {
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                TLRPC.MessageMedia messageMedia2 = r9Var.t;
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
                TLRPC.Photo photo = r9Var.t.photo;
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
                if (r9Var.E()) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    MimeTypeMap singleton = MimeTypeMap.getSingleton();
                    int lastIndexOf = this.e.lastIndexOf(46);
                    tL_inputMediaUploadedPhoto.mime_type = singleton.getMimeTypeFromExtension(lastIndexOf != -1 ? this.e.substring(lastIndexOf + 1).toLowerCase() : "txt");
                    List list = r9Var.U0;
                    inputMedia = tL_inputMediaUploadedPhoto;
                    if (list != null) {
                        if (list.isEmpty()) {
                            ArrayList arrayList3 = r9Var.V0;
                            inputMedia = tL_inputMediaUploadedPhoto;
                            if (arrayList3 != null) {
                                inputMedia = tL_inputMediaUploadedPhoto;
                            }
                        }
                        tL_inputMediaUploadedPhoto.flags |= 1;
                        ArrayList arrayList4 = r9Var.V0;
                        if (arrayList4 != null) {
                            tL_inputMediaUploadedPhoto.stickers.addAll(arrayList4);
                        }
                        tL_inputMediaUploadedPhoto.stickers = new ArrayList<>(r9Var.U0);
                        inputMedia = tL_inputMediaUploadedPhoto;
                    }
                } else {
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_inputMediaUploadedDocument.file = inputFile;
                    TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                    if (r9Var.c0 != null) {
                        int i12 = 0;
                        while (true) {
                            if (i12 >= r9Var.c0.attributes.size()) {
                                break;
                            }
                            if (r9Var.c0.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) r9Var.c0.attributes.get(i12);
                                break;
                            }
                            i12++;
                        }
                    } else {
                        SendMessagesHelper.fillVideoAttribute(this.e, tL_documentAttributeVideo, null);
                    }
                    tL_inputMediaUploadedDocument.attributes.add(tL_documentAttributeVideo);
                    tL_documentAttributeVideo.supports_streaming = true;
                    int i13 = tL_documentAttributeVideo.flags;
                    tL_documentAttributeVideo.flags = i13 | 4;
                    tL_documentAttributeVideo.preload_prefix_size = (int) this.x;
                    if (r9Var.e0 >= 0) {
                        tL_documentAttributeVideo.flags = i13 | 20;
                        tL_documentAttributeVideo.video_start_ts = (r13 - (r9Var.Z * r9Var.h0)) / 1000.0d;
                    }
                    List list2 = r9Var.U0;
                    if (list2 != null && (!list2.isEmpty() || ((arrayList = r9Var.V0) != null && !arrayList.isEmpty()))) {
                        tL_inputMediaUploadedDocument.flags |= 1;
                        ArrayList<TLRPC.InputDocument> arrayList5 = new ArrayList<>(r9Var.U0);
                        tL_inputMediaUploadedDocument.stickers = arrayList5;
                        ArrayList arrayList6 = r9Var.V0;
                        if (arrayList6 != null) {
                            arrayList5.addAll(arrayList6);
                        }
                        tL_inputMediaUploadedDocument.attributes.add(new TLRPC.TL_documentAttributeHasStickers());
                    }
                    tL_inputMediaUploadedDocument.nosound_video = r9Var.y == null && (r9Var.Y || !r9Var.K);
                    tL_inputMediaUploadedDocument.mime_type = "video/mp4";
                    inputMedia = tL_inputMediaUploadedDocument;
                }
            }
            int i14 = !UserConfig.getInstance(i11).isPremium() ? MessagesController.getInstance(i11).storyCaptionLengthLimitPremium : MessagesController.getInstance(i11).storyCaptionLengthLimitDefault;
            long j3 = this.J;
            z11 = this.b;
            if (z11) {
                if (r9Var.J0 != 0) {
                    TL_bots.addPreviewMedia addpreviewmedia = new TL_bots.addPreviewMedia();
                    addpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(r9Var.J0);
                    addpreviewmedia.media = inputMedia;
                    addpreviewmedia.lang_code = r9Var.K0;
                    tL_stories_sendStory = addpreviewmedia;
                } else {
                    TL_stories.TL_stories_sendStory tL_stories_sendStory2 = new TL_stories.TL_stories_sendStory();
                    boolean z12 = z10;
                    tL_stories_sendStory2.random_id = this.a;
                    tL_stories_sendStory2.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                    tL_stories_sendStory2.media = inputMedia;
                    tL_stories_sendStory2.privacy_rules.addAll(arrayList2);
                    tL_stories_sendStory2.pinned = r9Var.G0;
                    tL_stories_sendStory2.noforwards = !r9Var.H0;
                    tL_stories_sendStory2.albums = r9Var.w0 != null ? new ArrayList<>(r9Var.w0) : null;
                    TLRPC.InputDocument inputDocument = r9Var.z;
                    if (inputDocument != null) {
                        tL_stories_sendStory2.flags |= 512;
                        tL_stories_sendStory2.music = inputDocument;
                    }
                    CharSequence charSequence3 = r9Var.C0;
                    if (charSequence3 != null) {
                        tL_stories_sendStory2.flags |= 3;
                        CharSequence[] charSequenceArr = {charSequence3};
                        if (charSequence3.length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                            tL_stories_sendStory2.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr, true);
                        } else {
                            tL_stories_sendStory2.entities.clear();
                        }
                        i10 = 0;
                        if (charSequenceArr[0].length() > i14) {
                            charSequenceArr[0] = charSequenceArr[0].subSequence(0, i14);
                        }
                        tL_stories_sendStory2.caption = charSequenceArr[0].toString();
                    } else {
                        i10 = 0;
                    }
                    if (r9Var.n) {
                        tL_stories_sendStory2.flags |= 64;
                        tL_stories_sendStory2.fwd_from_id = MessagesController.getInstance(i11).getInputPeer(r9Var.q);
                        tL_stories_sendStory2.fwd_from_story = r9Var.r;
                        tL_stories_sendStory2.fwd_modified = !z12;
                    }
                    int i15 = r9Var.I0;
                    if (i15 == Integer.MAX_VALUE) {
                        tL_stories_sendStory2.pinned = true;
                    } else {
                        tL_stories_sendStory2.flags |= 8;
                        tL_stories_sendStory2.period = i15;
                    }
                    if (r9Var.T0 != null) {
                        while (i10 < r9Var.T0.size()) {
                            TL_stories.MediaArea mediaArea = ((VideoEditedInfo.MediaEntity) r9Var.T0.get(i10)).mediaArea;
                            if (mediaArea != null) {
                                tL_stories_sendStory2.media_areas.add(mediaArea);
                            }
                            i10++;
                        }
                        if (!tL_stories_sendStory2.media_areas.isEmpty()) {
                            tL_stories_sendStory2.flags |= 32;
                        }
                    }
                    tL_stories_sendStory = tL_stories_sendStory2;
                }
            } else if (r9Var.J0 != 0) {
                TL_bots.editPreviewMedia editpreviewmedia = new TL_bots.editPreviewMedia();
                editpreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(r9Var.J0);
                editpreviewmedia.media = r9Var.L0;
                editpreviewmedia.new_media = inputMedia;
                editpreviewmedia.lang_code = r9Var.K0;
                tL_stories_sendStory = editpreviewmedia;
            } else {
                TL_stories.TL_stories_editStory tL_stories_editStory = new TL_stories.TL_stories_editStory();
                tL_stories_editStory.id = r9Var.f;
                tL_stories_editStory.peer = MessagesController.getInstance(i11).getInputPeer(j3);
                tL_stories_editStory.flags |= 16;
                TLRPC.InputDocument inputDocument2 = r9Var.z;
                if (inputDocument2 != null) {
                    tL_stories_editStory.music = inputDocument2;
                } else {
                    tL_stories_editStory.music = new TLRPC.TL_inputDocumentEmpty();
                }
                if (inputMedia != null && r9Var.j) {
                    tL_stories_editStory.flags |= 1;
                    tL_stories_editStory.media = inputMedia;
                }
                if (r9Var.k && (charSequence2 = r9Var.C0) != null) {
                    tL_stories_editStory.flags |= 2;
                    CharSequence[] charSequenceArr2 = {charSequence2};
                    if (charSequence2.length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    if (MessagesController.getInstance(i11).storyEntitiesAllowed()) {
                        tL_stories_editStory.entities = MediaDataController.getInstance(i11).getEntities(charSequenceArr2, true);
                    } else {
                        tL_stories_editStory.entities.clear();
                    }
                    if (charSequenceArr2[0].length() > i14) {
                        charSequenceArr2[0] = charSequenceArr2[0].subSequence(0, i14);
                    }
                    tL_stories_editStory.caption = charSequenceArr2[0].toString();
                }
                if (r9Var.l) {
                    tL_stories_editStory.flags |= 4;
                    tL_stories_editStory.privacy_rules.addAll(arrayList2);
                }
                ArrayList arrayList7 = r9Var.m;
                if (arrayList7 != null) {
                    tL_stories_editStory.media_areas.addAll(arrayList7);
                }
                if (r9Var.T0 != null) {
                    for (int i16 = 0; i16 < r9Var.T0.size(); i16++) {
                        TL_stories.MediaArea mediaArea2 = ((VideoEditedInfo.MediaEntity) r9Var.T0.get(i16)).mediaArea;
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
            d5Var = new d5(this, 0);
            if (BuildVars.DEBUG_PRIVATE_VERSION || z11 || (charSequence = r9Var.C0) == null || !charSequence.toString().contains("#failtest") || this.H) {
                this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, d5Var, 64);
            }
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "FORCED_TO_FAIL";
            d5Var.run(null, tL_error);
            return;
        }
        tL_inputMediaPhoto = null;
        z10 = false;
        TLRPC.InputMedia inputMedia2 = tL_inputMediaPhoto;
        inputMedia2 = tL_inputMediaPhoto;
        if (tL_inputMediaPhoto == null) {
            if (r9Var.E()) {
            }
        }
        if (!UserConfig.getInstance(i11).isPremium()) {
        }
        long j32 = this.J;
        z11 = this.b;
        if (z11) {
        }
        d5Var = new d5(this, 0);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        this.w = ConnectionsManager.getInstance(i11).sendRequest(tL_stories_sendStory, d5Var, 64);
    }

    public final void d() {
        r9 r9Var = this.c;
        if (r9Var.b0) {
            TLRPC.TL_inputFileStoryDocument tL_inputFileStoryDocument = new TLRPC.TL_inputFileStoryDocument();
            tL_inputFileStoryDocument.doc = MessagesController.toInputDocument(this.c.c0);
            c(tL_inputFileStoryDocument);
        } else if ((r9Var.g || (r9Var.n && r9Var.t != null)) && !r9Var.j && r9Var.o0 == null) {
            c(null);
            return;
        }
        pb pbVar = this.c.E0;
        this.G = pbVar != null && pbVar.a == 1;
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.M.a).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        boolean E = this.c.E();
        this.s = E;
        if (E) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 1;
            String absolutePath = r9.x(this.M.a, true).getAbsolutePath();
            tL_message.attachPath = absolutePath;
            this.e = absolutePath;
            this.E = new MessageObject(this.M.a, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
            this.c.s(new g5(this, 1));
        } else {
            File w10 = r9.w(this.M.a, "jpg");
            this.e = w10.getAbsolutePath();
            Utilities.themeQueue.postRunnable(new yg.q(20, this, w10));
        }
        Intent intent = new Intent(ApplicationLoader.applicationContext, (Class<?>) StoryUploadingService.class);
        intent.putExtra("path", this.e);
        intent.putExtra("currentAccount", this.M.a);
        try {
            ApplicationLoader.applicationContext.startService(intent);
        } catch (Throwable th2) {
            FileLog.e(th2);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.filePreparingStarted) {
            if (objArr[0] == this.E) {
                this.e = (String) objArr[1];
                e();
                return;
            }
            return;
        }
        int i12 = NotificationCenter.fileNewChunkAvailable;
        i5 i5Var = this.M;
        if (i10 == i12) {
            if (objArr[0] == this.E) {
                String str = (String) objArr[1];
                long longValue = ((Long) objArr[2]).longValue();
                long longValue2 = ((Long) objArr[3]).longValue();
                float floatValue = ((Float) objArr[4]).floatValue();
                this.n = floatValue;
                this.h = (this.r * 0.7f) + (floatValue * 0.3f);
                NotificationCenter.getInstance(i5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
                if (this.x < 0 && this.n * this.y >= 1000.0f) {
                    this.x = longValue;
                }
                FileLoader.getInstance(i5Var.a).checkUploadNewDataAvailable(str, false, Math.max(1L, longValue), longValue2, Float.valueOf(this.n));
                if (longValue2 <= 0 || this.x >= 0) {
                    return;
                }
                this.x = longValue2;
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.filePreparingFailed) {
            if (objArr[0] == this.E) {
                if (!this.b) {
                    r9 r9Var = this.c;
                    r9Var.w = true;
                    r9Var.x = new TLRPC.TL_error();
                    TLRPC.TL_error tL_error = r9Var.x;
                    tL_error.code = 400;
                    tL_error.text = "FILE_PREPARE_FAILED";
                    this.d = true;
                    this.I = true;
                    this.H = true;
                    i5Var.w.d(r9Var);
                }
                b();
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.fileUploaded) {
            String str2 = (String) objArr[0];
            String str3 = this.e;
            if (str3 == null || !str2.equals(str3)) {
                return;
            }
            c((TLRPC.InputFile) objArr[1]);
            return;
        }
        if (i10 == NotificationCenter.fileUploadFailed) {
            String str4 = (String) objArr[0];
            String str5 = this.e;
            if (str5 == null || !str4.equals(str5)) {
                return;
            }
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.showBulletin, 1, LocaleController.getString(R.string.StoryUploadError));
            b();
            return;
        }
        if (i10 == NotificationCenter.fileUploadProgressChanged && ((String) objArr[0]).equals(this.e)) {
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            this.r = min;
            this.h = (min * 0.7f) + (this.n * 0.3f);
            NotificationCenter.getInstance(i5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.uploadStoryProgress, this.e, Float.valueOf(this.h));
        }
    }

    public final void e() {
        r9 r9Var = this.c;
        r9Var.getClass();
        FileLoader fileLoader = FileLoader.getInstance(this.M.a);
        String str = this.e;
        boolean z10 = !r9Var.K;
        if (this.s) {
            VideoEditedInfo videoEditedInfo = this.F;
            r6 = Math.max(1, (int) (videoEditedInfo != null ? videoEditedInfo.estimatedSize : 0L));
        }
        fileLoader.uploadFile(str, false, z10, r6, r9Var.K ? 33554432 : 16777216, true);
    }
}
