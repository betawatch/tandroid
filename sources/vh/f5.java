package vh;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.qp;
import org.telegram.messenger.r20;
import org.telegram.messenger.tc;
import org.telegram.messenger.uz;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.h10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class f5 extends ha implements vs, org.telegram.messenger.z5, fe.e {
    public int A2;
    public final c5 B2;
    public boolean C2;
    public final fe.b P1;
    public final int Q1;
    public boolean R1;
    public final f5 S1;
    public final ArrayList T1;
    public final ArrayList U1;
    public final ArrayList V1;
    public final qp W1;
    public final r20 X1;
    public kj Y1;
    public boolean Z1;
    public boolean a2;
    public final FrameLayout b2;
    public final ih.e c2;
    public final tg.f d2;
    public final hi.c e2;
    public final tg.b f2;
    public final e5 g2;
    public q51 h2;
    public kj i2;
    public String j2;
    public int k2;
    public boolean l2;
    public boolean m2;
    public boolean n2;
    public String o2;
    public int p2;
    public final c5 q2;
    public String r2;
    public boolean s2;
    public boolean t2;
    public boolean u2;
    public TLRPC.User v2;
    public boolean w2;
    public boolean x2;
    public int y2;
    public String z2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [vh.c5] */
    /* JADX WARN: Type inference failed for: r1v3, types: [vh.c5] */
    /* JADX WARN: Type inference failed for: r4v10, types: [vh.e5] */
    public f5(Context context, boolean z10, f5 f5Var, r20 r20Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(2, context, p6Var, true);
        final int i10 = 2;
        final int i11 = 1;
        gr grVar = gr.h;
        this.P1 = new fe.b(0, this, grVar, 380L, false);
        this.T1 = new ArrayList();
        this.U1 = new ArrayList();
        this.V1 = new ArrayList();
        this.p2 = -1;
        this.q2 = new Runnable(this) { // from class: vh.c5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursor;
                switch (i11) {
                    case 0:
                        f5 f5Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            int i12 = -2000000000;
                            Cursor cursor2 = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            while (cursor2.moveToNext()) {
                                try {
                                    cursor2.getInt(0);
                                    String string = cursor2.getString(r42);
                                    String string2 = cursor2.getString(2);
                                    String string3 = cursor2.getString(3);
                                    int i13 = (int) (cursor2.getLong(4) / 1000);
                                    cursor2.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.id = i12;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = cursor2;
                                    try {
                                        long e = e20.i(f5Var2.a).e();
                                        tL_peerUser.user_id = e;
                                        peer.user_id = e;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.b8.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i13;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new kj(f5Var2.a, tL_message, false, true));
                                        i12--;
                                        cursor2 = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor == null) {
                                            throw th3;
                                        }
                                        try {
                                            cursor.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursor2;
                                }
                            }
                            cursor2.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new r0(12, f5Var2, arrayList));
                        return;
                    case 1:
                        this.b.h1();
                        return;
                    default:
                        this.b.g1();
                        return;
                }
            }
        };
        this.y2 = -1;
        this.A2 = -2000000000;
        this.B2 = new Runnable(this) { // from class: vh.c5
            public final /* synthetic */ f5 b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v1 */
            /* JADX WARN: Type inference failed for: r4v24 */
            /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
            @Override // java.lang.Runnable
            public final void run() {
                Cursor cursor;
                switch (i10) {
                    case 0:
                        f5 f5Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        ?? r42 = 1;
                        try {
                            int i12 = -2000000000;
                            Cursor cursor2 = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            while (cursor2.moveToNext()) {
                                try {
                                    cursor2.getInt(0);
                                    String string = cursor2.getString(r42);
                                    String string2 = cursor2.getString(2);
                                    String string3 = cursor2.getString(3);
                                    int i13 = (int) (cursor2.getLong(4) / 1000);
                                    cursor2.getString(5);
                                    File file = new File(string3);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = r42;
                                    tL_message.id = i12;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    cursor = cursor2;
                                    try {
                                        long e = e20.i(f5Var2.a).e();
                                        tL_peerUser.user_id = e;
                                        peer.user_id = e;
                                        tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                        tL_message.message = "";
                                        tL_message.attachPath = string3;
                                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                        tL_message.media = tL_messageMediaDocument;
                                        tL_messageMediaDocument.flags |= 3;
                                        tL_messageMediaDocument.document = new TLRPC.TL_document();
                                        tL_message.flags |= 768;
                                        String D = org.telegram.messenger.b8.D(file);
                                        TLRPC.Document document = tL_message.media.document;
                                        document.id = 0L;
                                        document.access_hash = 0L;
                                        document.file_reference = new byte[0];
                                        document.date = tL_message.date;
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("audio/");
                                        if (D.length() <= 0) {
                                            D = "mp3";
                                        }
                                        sb2.append(D);
                                        document.mime_type = sb2.toString();
                                        tL_message.media.document.size = (int) file.length();
                                        tL_message.media.document.dc_id = 0;
                                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                        tL_documentAttributeAudio.duration = i13;
                                        tL_documentAttributeAudio.title = string2;
                                        tL_documentAttributeAudio.performer = string;
                                        tL_documentAttributeAudio.flags |= 3;
                                        tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                        TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                        tL_documentAttributeFilename.file_name = file.getName();
                                        tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                        arrayList.add(new kj(f5Var2.a, tL_message, false, true));
                                        i12--;
                                        cursor2 = cursor;
                                        r42 = 1;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Throwable th3 = th;
                                        if (cursor == null) {
                                            throw th3;
                                        }
                                        try {
                                            cursor.close();
                                            throw th3;
                                        } catch (Throwable th4) {
                                            th3.addSuppressed(th4);
                                            throw th3;
                                        }
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor = cursor2;
                                }
                            }
                            cursor2.close();
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                        }
                        org.telegram.messenger.i0.g3(new r0(12, f5Var2, arrayList));
                        return;
                    case 1:
                        this.b.h1();
                        return;
                    default:
                        this.b.g1();
                        return;
                }
            }
        };
        this.r1 = 0.35f;
        O();
        Y0();
        this.z1 = org.telegram.messenger.i0.L(4.0f);
        this.A1 = org.telegram.messenger.i0.L(-20.0f);
        this.R1 = z10;
        this.Q1 = org.telegram.messenger.b6.q(this.a).k();
        this.S1 = f5Var;
        this.X1 = r20Var;
        hi.c d = this.X0.d(new d5(this));
        this.e2 = d;
        final int i12 = 0;
        if (Build.VERSION.SDK_INT < 31 || !uz.f()) {
            this.d2 = null;
            this.f2 = new tg.b(d, d, d);
        } else {
            tg.f fVar = new tg.f(false);
            this.d2 = fVar;
            this.X0.a(fVar);
            hi.f fVar2 = new hi.f(d);
            fVar2.f = d;
            fVar2.d = fVar;
            fVar2.e = -2;
            tg.b bVar = new tg.b(fVar2, fVar2, fVar2);
            this.f2 = bVar;
            bVar.k = true;
            int L = tc.e(262144) ? org.telegram.messenger.i0.L(8.0f) : org.telegram.messenger.i0.L(48.0f);
            bVar.d = L;
            bVar.e = L;
            bVar.j = this.X0;
        }
        this.g2 = new ug.a() { // from class: vh.e5
            @Override // ug.a
            public final void d(Canvas canvas, RectF rectF) {
                f5 f5Var2 = f5.this;
                uk0 uk0Var = f5Var2.k1;
                yg.d.b(uk0Var, canvas, rectF, uk0Var, f5Var2.b, at.e4);
            }

            @Override // ug.a
            public final void g(g.y yVar, RectF rectF) {
                yVar.b = true;
            }
        };
        int i13 = org.telegram.ui.ActionBar.t6.a7;
        ih.e eVar = new ih.e(i13, context, p6Var);
        this.c2 = eVar;
        eVar.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b2 = frameLayout;
        h10 h10Var = new h10(context, p6Var);
        h10Var.r.setOnFocusChangeListener(new m.r2(this, 3));
        h10Var.x = true;
        h10Var.setPadding(org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f));
        h10Var.updateColors();
        h10Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
        h10Var.r.addTextChangedListener(new rh.h0(this, i10));
        h10Var.r.setHint(dd.L0(2131745853, null));
        frameLayout.addView(eVar, w7.b6.g());
        frameLayout.addView(h10Var, w7.b6.d(-1, 48.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f));
        h10Var.setupBlurredBackground(this.f2.c(h10Var, w7.b9.o(p6Var), false));
        frameLayout.setPadding(org.telegram.messenger.i0.L(8.0f) + this.t0, 0, org.telegram.messenger.i0.L(8.0f) + this.t0, 0);
        this.b.addView(frameLayout, w7.b6.e(-1, -2, 55));
        w0(i13);
        uk0 uk0Var = this.k1;
        int i14 = this.t0;
        uk0Var.setPadding(i14, 0, i14, 0);
        this.k1.r1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(grVar);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        if (z10) {
            this.W1 = null;
            if (this.R1 && !this.C2) {
                this.C2 = true;
                Utilities.e.c(new Runnable(this) { // from class: vh.c5
                    public final /* synthetic */ f5 b;

                    {
                        this.b = this;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v24 */
                    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        Cursor cursor;
                        switch (i12) {
                            case 0:
                                f5 f5Var2 = this.b;
                                String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                                ArrayList arrayList = new ArrayList();
                                ?? r42 = 1;
                                try {
                                    int i122 = -2000000000;
                                    Cursor cursor2 = org.telegram.messenger.w0.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                                    while (cursor2.moveToNext()) {
                                        try {
                                            cursor2.getInt(0);
                                            String string = cursor2.getString(r42);
                                            String string2 = cursor2.getString(2);
                                            String string3 = cursor2.getString(3);
                                            int i132 = (int) (cursor2.getLong(4) / 1000);
                                            cursor2.getString(5);
                                            File file = new File(string3);
                                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                            tL_message.out = r42;
                                            tL_message.id = i122;
                                            tL_message.peer_id = new TLRPC.TL_peerUser();
                                            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                            tL_message.from_id = tL_peerUser;
                                            TLRPC.Peer peer = tL_message.peer_id;
                                            cursor = cursor2;
                                            try {
                                                long e = e20.i(f5Var2.a).e();
                                                tL_peerUser.user_id = e;
                                                peer.user_id = e;
                                                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                                tL_message.message = "";
                                                tL_message.attachPath = string3;
                                                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                                tL_message.media = tL_messageMediaDocument;
                                                tL_messageMediaDocument.flags |= 3;
                                                tL_messageMediaDocument.document = new TLRPC.TL_document();
                                                tL_message.flags |= 768;
                                                String D = org.telegram.messenger.b8.D(file);
                                                TLRPC.Document document = tL_message.media.document;
                                                document.id = 0L;
                                                document.access_hash = 0L;
                                                document.file_reference = new byte[0];
                                                document.date = tL_message.date;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("audio/");
                                                if (D.length() <= 0) {
                                                    D = "mp3";
                                                }
                                                sb2.append(D);
                                                document.mime_type = sb2.toString();
                                                tL_message.media.document.size = (int) file.length();
                                                tL_message.media.document.dc_id = 0;
                                                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                                tL_documentAttributeAudio.duration = i132;
                                                tL_documentAttributeAudio.title = string2;
                                                tL_documentAttributeAudio.performer = string;
                                                tL_documentAttributeAudio.flags |= 3;
                                                tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                                tL_documentAttributeFilename.file_name = file.getName();
                                                tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                                arrayList.add(new kj(f5Var2.a, tL_message, false, true));
                                                i122--;
                                                cursor2 = cursor;
                                                r42 = 1;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                Throwable th3 = th;
                                                if (cursor == null) {
                                                    throw th3;
                                                }
                                                try {
                                                    cursor.close();
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                    throw th3;
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor = cursor2;
                                        }
                                    }
                                    cursor2.close();
                                } catch (Exception e7) {
                                    org.telegram.messenger.f8.g(e7, true);
                                }
                                org.telegram.messenger.i0.g3(new r0(12, f5Var2, arrayList));
                                return;
                            case 1:
                                this.b.h1();
                                return;
                            default:
                                this.b.g1();
                                return;
                        }
                    }
                });
            }
        } else {
            int i15 = this.a;
            qp qpVar = new qp(i15, e20.i(i15).e());
            this.W1 = qpVar;
            qpVar.b();
            h1();
            g1();
        }
        this.k1.setOnScrollListener(new cu0(this, 26));
        this.k1.setOnItemClickListener(new org.telegram.ui.Cells.o(this, r20Var, p6Var, i10));
        this.X0.b(this.k1);
        this.X0.i(this.b);
        ei.r rVar = this.X0;
        rVar.a = new d5(this);
        rVar.d = new gi.b(org.telegram.messenger.i0.L(48.0f));
    }

    public static boolean i1(String str, String str2, String str3) {
        if (str3 == null) {
            return false;
        }
        String lowerCase = str3.toLowerCase();
        if (lowerCase.startsWith(str) || sc.e.y(" ", str, lowerCase)) {
            return true;
        }
        String N3 = org.telegram.messenger.i0.N3(lowerCase);
        return N3.startsWith(str2) || N3.contains(" ".concat(str2));
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(uk0Var, getContext(), this.a, 0, false, new b5(this, 0), this.I0);
        this.h2 = q51Var;
        q51Var.r = false;
        return q51Var;
    }

    @Override // org.telegram.messenger.z5
    public final void N(String str) {
        kj kjVar = this.Y1;
        if (kjVar == null || !TextUtils.equals(kjVar.S0(), str)) {
            return;
        }
        this.X1.a(this.Y1);
        f5 f5Var = this.S1;
        if (f5Var != null) {
            f5Var.dismiss();
        }
        dismiss();
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        return dd.L0(2131744627, null);
    }

    @Override // org.telegram.ui.Components.ha
    public final void W0(Canvas canvas, View view) {
        j1();
        super.W0(canvas, view);
    }

    public final int d1(boolean z10, ArrayList arrayList, String str, ArrayList arrayList2, boolean z11, boolean z12, int i10) {
        int i11;
        int i12 = 0;
        if (arrayList2 != null && (!arrayList2.isEmpty() || z11)) {
            ArrayList arrayList3 = new ArrayList();
            String str2 = this.j2;
            String lowerCase = str2 == null ? null : str2.toLowerCase();
            String N3 = org.telegram.messenger.i0.N3(lowerCase);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList2.get(i13);
                i13++;
                kj kjVar = (kj) obj;
                if (!z10) {
                    kjVar.J5(this.j2, true);
                    arrayList3.add(kjVar);
                } else if (TextUtils.isEmpty(lowerCase) || arrayList2 == this.U1) {
                    kjVar.J5(null, true);
                    arrayList3.add(kjVar);
                } else {
                    String z13 = kjVar.z1(true);
                    String x12 = kjVar.x1(true);
                    if (i1(lowerCase, N3, z13) || i1(lowerCase, N3, x12)) {
                        kjVar.J5(this.j2, true);
                        arrayList3.add(kjVar);
                    }
                }
            }
            if (!arrayList3.isEmpty() || z11) {
                if (arrayList.isEmpty() || arrayList.size() <= 1) {
                    i11 = 0;
                } else {
                    arrayList.add(b51.C(null));
                    i11 = org.telegram.messenger.i0.L(12.0f);
                }
                this.h2.V();
                arrayList.add(b51.u(str));
                int size2 = arrayList3.size();
                while (true) {
                    int i14 = 4;
                    if (i12 >= size2) {
                        break;
                    }
                    Object obj2 = arrayList3.get(i12);
                    i12++;
                    jg.v vVar = new jg.v(this, i14);
                    int i15 = org.telegram.ui.Cells.j7.b;
                    b51 K = b51.K(org.telegram.ui.Cells.j7.class);
                    K.G = (kj) obj2;
                    K.H = vVar;
                    arrayList.add(K);
                    i11 += org.telegram.messenger.i0.L(56.0f);
                }
                if (z11) {
                    arrayList.add(b51.p(4));
                    arrayList.add(b51.p(4));
                    arrayList.add(b51.p(4));
                    i11 += org.telegram.messenger.i0.L(56.0f) * 3;
                }
                if (z12 && !z11) {
                    b51 c10 = b51.c(i10, R.drawable.arrow_more, dd.L0(2131745357, null));
                    c10.q = true;
                    arrayList.add(c10);
                    i11 += org.telegram.messenger.i0.L(50.0f);
                }
                this.h2.U();
                return i11;
            }
        }
        return 0;
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.T3) {
            this.h2.O(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        if (this.i2 != null && MediaController.B().I(this.i2)) {
            MediaController.B().q(true, true, false, false);
        }
        this.i2 = null;
    }

    public final void e1() {
        if (this.y2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.y2, true);
        }
        this.y2 = -1;
        this.r2 = "";
        this.s2 = false;
        this.V1.clear();
        this.t2 = false;
        this.u2 = false;
    }

    public final void f1() {
        if (this.p2 >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.p2, true);
        }
        this.p2 = -1;
        this.k2 = 0;
        this.U1.clear();
        this.m2 = false;
        this.n2 = false;
    }

    public final void g1() {
        String str;
        String str2 = ((org.telegram.messenger.q0) wp.r1(this.a).y7.F.b).c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = this.z2;
        String str4 = this.j2;
        if (str4 == null) {
            str4 = "";
        }
        if (!TextUtils.equals(str3, str4)) {
            e1();
        }
        if (this.t2 || TextUtils.isEmpty(this.j2) || this.j2.length() < 3) {
            return;
        }
        ArrayList arrayList = this.V1;
        if (arrayList.isEmpty() || this.s2) {
            if (this.v2 == null) {
                TLObject e22 = wp.r1(this.a).e2(str2);
                this.v2 = e22 instanceof TLRPC.User ? (TLRPC.User) e22 : null;
            }
            if (this.v2 == null) {
                if (this.w2 || this.x2) {
                    return;
                }
                this.w2 = true;
                wp.r1(this.a).c2().a(str2, null, new ph.h1(this, 28));
                return;
            }
            this.t2 = true;
            TLRPC.User f7 = e20.i(this.a).f();
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            tL_messages_getInlineBotResults.bot = wp.r1(this.a).p1(this.v2);
            tL_messages_getInlineBotResults.peer = wp.m1(f7);
            if (arrayList.isEmpty() || (str = this.r2) == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.offset = str;
            String str5 = this.j2;
            String str6 = str5 != null ? str5 : "";
            this.z2 = str6;
            tL_messages_getInlineBotResults.query = str6;
            this.y2 = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_getInlineBotResults, new a3.b(1), new b5(this, 1));
            this.h2.O(true);
        }
    }

    @Override // org.telegram.messenger.z5
    public final int getObserverTag() {
        return this.Q1;
    }

    public final void h1() {
        if (this.R1) {
            return;
        }
        String str = this.o2;
        String str2 = this.j2;
        if (str2 == null) {
            str2 = "";
        }
        if (!TextUtils.equals(str, str2)) {
            f1();
        }
        if (this.m2) {
            return;
        }
        ArrayList arrayList = this.U1;
        if (arrayList.isEmpty() || this.l2) {
            this.m2 = true;
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
            String str3 = this.j2;
            String str4 = str3 != null ? str3 : "";
            this.o2 = str4;
            tL_messages_searchGlobal.q = str4;
            tL_messages_searchGlobal.limit = 20;
            if (arrayList.size() > 0) {
                kj kjVar = (kj) i0.a.g(1, arrayList);
                tL_messages_searchGlobal.offset_id = kjVar.f1();
                tL_messages_searchGlobal.offset_rate = this.k2;
                tL_messages_searchGlobal.offset_peer = wp.r1(this.a).i1(kj.C1(kjVar.k.peer_id));
            } else {
                tL_messages_searchGlobal.offset_rate = 0;
                tL_messages_searchGlobal.offset_id = 0;
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
            }
            this.p2 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_searchGlobal, new ag.c(this, 23));
            this.h2.O(true);
        }
    }

    public final void j1() {
        float f7 = org.telegram.messenger.i0.q.y;
        int i10 = 0;
        while (true) {
            uk0 uk0Var = this.k1;
            if (i10 >= uk0Var.getChildCount()) {
                break;
            }
            View childAt = uk0Var.getChildAt(i10);
            if (RecyclerView.R(childAt) >= 1 && childAt.getY() < f7) {
                f7 = childAt.getY();
            }
            i10++;
        }
        this.b2.setTranslationY(Math.max(org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m, f7));
        this.P1.a(f7 <= ((float) (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.m)), true);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        at.f(this.a).c(this, at.T3);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        at.f(this.a).n(this, at.T3);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        try {
            super.s0();
            hi.c cVar = this.e2;
            if (cVar != null) {
                cVar.a(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, this.I0));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        if (i10 == 0) {
            ih.e eVar = this.c2;
            eVar.setAlpha(f7);
            eVar.setVisibility(f7 > 0.0f ? 0 : 4);
        }
    }

    @Override // org.telegram.messenger.z5
    public final void D(boolean z10) {
    }

    @Override // fe.e
    public final /* synthetic */ void E(float f7, int i10) {
    }

    @Override // org.telegram.messenger.z5
    public final void i(long j10, long j11) {
    }

    @Override // org.telegram.messenger.z5
    public final void o(long j10, long j11) {
    }
}
