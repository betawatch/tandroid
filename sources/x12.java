// default package

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class x12 extends f12 implements fn7, s84 {
    public String E;
    public int F;
    public boolean G;
    public boolean H;
    public ArrayList I;
    public final HashSet J;
    public final pc7 K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public u12 O;
    public r47 P;
    public final boolean Q;
    public final byte R;
    public final byte S;
    public final o12 T;
    public int U;
    public int V;
    public String W;
    public boolean a0;
    public final o12 b0;
    public int c0;
    public boolean d0;
    public int e0;
    public String f0;
    public final o12 g0;
    public boolean h0;
    public TLRPC.User i0;
    public boolean j0;
    public boolean k0;
    public String l0;
    public int m0;
    public final fm0 n;
    public boolean n0;
    public final FrameLayout r;
    public final j12 s;
    public final wa w;
    public final m12 x;
    public final xj3 y;

    /* JADX WARN: Type inference failed for: r3v1, types: [o12] */
    /* JADX WARN: Type inference failed for: r3v2, types: [o12] */
    /* JADX WARN: Type inference failed for: r3v3, types: [o12] */
    public x12(n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        ViewGroup viewGroup;
        this.n = new fm0(0, this, k43.h, 380L, false);
        this.F = -1;
        this.I = new ArrayList();
        this.J = new HashSet();
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        final byte b = 1;
        this.Q = true;
        final byte b2 = 2;
        this.R = (byte) 2;
        final byte b3 = 3;
        this.S = (byte) 3;
        final byte b4 = 0;
        this.T = new Runnable(this) { // from class: o12
            public final /* synthetic */ x12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b4) {
                    case 0:
                        wa waVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = waVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < waVar.getChildCount()) {
                                View childAt = waVar.getChildAt(i3);
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= 0) {
                                    i2 = top;
                                    i = S;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = S;
                                }
                            }
                        }
                        waVar.g3.O(true);
                        if (!canScrollVertically) {
                            waVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                waVar.f3.g1(i, i2 - waVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        x12 x12Var = this.b;
                        x12Var.O();
                        x12Var.b.I1(x12Var, 0);
                        return;
                    default:
                        x12 x12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    eo6 eo6Var = new eo6();
                                    query.getInt(0);
                                    eo6Var.a = query.getString(1);
                                    eo6Var.b = query.getString(2);
                                    eo6Var.d = query.getString(3);
                                    eo6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(eo6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = yac.h(x12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = eo6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = xb4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = eo6Var.c;
                                    tL_documentAttributeAudio.title = eo6Var.b;
                                    tL_documentAttributeAudio.performer = eo6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    eo6Var.e = new r47(x12Var2.b.G3, tL_message, false, true);
                                    h00 a = h00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = hl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            eo6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            eo6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(eo6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new dy1(x12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.V = -1;
        this.b0 = new Runnable(this) { // from class: o12
            public final /* synthetic */ x12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b) {
                    case 0:
                        wa waVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = waVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < waVar.getChildCount()) {
                                View childAt = waVar.getChildAt(i3);
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= 0) {
                                    i2 = top;
                                    i = S;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = S;
                                }
                            }
                        }
                        waVar.g3.O(true);
                        if (!canScrollVertically) {
                            waVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                waVar.f3.g1(i, i2 - waVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        x12 x12Var = this.b;
                        x12Var.O();
                        x12Var.b.I1(x12Var, 0);
                        return;
                    default:
                        x12 x12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    eo6 eo6Var = new eo6();
                                    query.getInt(0);
                                    eo6Var.a = query.getString(1);
                                    eo6Var.b = query.getString(2);
                                    eo6Var.d = query.getString(3);
                                    eo6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(eo6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = yac.h(x12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = eo6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = xb4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = eo6Var.c;
                                    tL_documentAttributeAudio.title = eo6Var.b;
                                    tL_documentAttributeAudio.performer = eo6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    eo6Var.e = new r47(x12Var2.b.G3, tL_message, false, true);
                                    h00 a = h00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = hl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            eo6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            eo6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(eo6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new dy1(x12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.e0 = -1;
        this.g0 = new Runnable(this) { // from class: o12
            public final /* synthetic */ x12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b2) {
                    case 0:
                        wa waVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = waVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < waVar.getChildCount()) {
                                View childAt = waVar.getChildAt(i3);
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= 0) {
                                    i2 = top;
                                    i = S;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = S;
                                }
                            }
                        }
                        waVar.g3.O(true);
                        if (!canScrollVertically) {
                            waVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                waVar.f3.g1(i, i2 - waVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        x12 x12Var = this.b;
                        x12Var.O();
                        x12Var.b.I1(x12Var, 0);
                        return;
                    default:
                        x12 x12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    eo6 eo6Var = new eo6();
                                    query.getInt(0);
                                    eo6Var.a = query.getString(1);
                                    eo6Var.b = query.getString(2);
                                    eo6Var.d = query.getString(3);
                                    eo6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(eo6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = yac.h(x12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = eo6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = xb4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = eo6Var.c;
                                    tL_documentAttributeAudio.title = eo6Var.b;
                                    tL_documentAttributeAudio.performer = eo6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    eo6Var.e = new r47(x12Var2.b.G3, tL_message, false, true);
                                    h00 a = h00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = hl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            eo6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            eo6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(eo6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new dy1(x12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        };
        this.m0 = -1000000000;
        jn7.f(this.b.G3).b(this, jn7.f2);
        jn7.f(this.b.G3).b(this, jn7.h2);
        jn7.f(this.b.G3).b(this, jn7.g2);
        jn7.f(this.b.G3).b(this, jn7.W3);
        this.H = true;
        final byte b5 = 4;
        Utilities.e.c(new Runnable(this) { // from class: o12
            public final /* synthetic */ x12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b5) {
                    case 0:
                        wa waVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = waVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < waVar.getChildCount()) {
                                View childAt = waVar.getChildAt(i3);
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= 0) {
                                    i2 = top;
                                    i = S;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = S;
                                }
                            }
                        }
                        waVar.g3.O(true);
                        if (!canScrollVertically) {
                            waVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                waVar.f3.g1(i, i2 - waVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        x12 x12Var = this.b;
                        x12Var.O();
                        x12Var.b.I1(x12Var, 0);
                        return;
                    default:
                        x12 x12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    eo6 eo6Var = new eo6();
                                    query.getInt(0);
                                    eo6Var.a = query.getString(1);
                                    eo6Var.b = query.getString(2);
                                    eo6Var.d = query.getString(3);
                                    eo6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(eo6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = yac.h(x12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = eo6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = xb4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = eo6Var.c;
                                    tL_documentAttributeAudio.title = eo6Var.b;
                                    tL_documentAttributeAudio.performer = eo6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    eo6Var.e = new r47(x12Var2.b.G3, tL_message, false, true);
                                    h00 a = h00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = hl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            eo6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            eo6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(eo6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new dy1(x12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        });
        m12 m12Var = new m12(aob.d6, vnbVar, context);
        this.x = m12Var;
        m12Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        j12 j12Var = new j12(this.b, vnbVar, context);
        this.s = j12Var;
        j12Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        j12Var.r.addTextChangedListener(new c7(this, (byte) 7));
        j12Var.r.setHint(ob6.M0(2131745468, null));
        frameLayout.addView(m12Var, tre.g());
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += hl.m;
        frameLayout.addView(j12Var, d);
        xj3 xj3Var = new xj3(context);
        this.y = xj3Var;
        xj3Var.setPadding(hl.L(11.0f), hl.L(21.0f), hl.L(11.0f), hl.L(21.0f));
        xj3Var.setOnAnimatedHeightChangedListener(new Runnable(this) { // from class: o12
            public final /* synthetic */ x12 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b3) {
                    case 0:
                        wa waVar = this.b.w;
                        int i = -1;
                        boolean canScrollVertically = waVar.canScrollVertically(-1);
                        int i2 = -1;
                        int i3 = 0;
                        while (true) {
                            if (i3 < waVar.getChildCount()) {
                                View childAt = waVar.getChildAt(i3);
                                int S = RecyclerView.S(childAt);
                                int top = childAt.getTop();
                                if (S >= 0) {
                                    i2 = top;
                                    i = S;
                                } else {
                                    i3++;
                                    i2 = top;
                                    i = S;
                                }
                            }
                        }
                        waVar.g3.O(true);
                        if (!canScrollVertically) {
                            waVar.f3.g1(0, 0);
                            return;
                        } else {
                            if (i >= 0) {
                                waVar.f3.g1(i, i2 - waVar.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.b.Q();
                        return;
                    case 2:
                        this.b.R();
                        return;
                    case 3:
                        x12 x12Var = this.b;
                        x12Var.O();
                        x12Var.b.I1(x12Var, 0);
                        return;
                    default:
                        x12 x12Var2 = this.b;
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor query = a.b.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i4 = -2000000000;
                            while (query.moveToNext()) {
                                try {
                                    eo6 eo6Var = new eo6();
                                    query.getInt(0);
                                    eo6Var.a = query.getString(1);
                                    eo6Var.b = query.getString(2);
                                    eo6Var.d = query.getString(3);
                                    eo6Var.c = (int) (query.getLong(4) / 1000);
                                    query.getString(5);
                                    File file = new File(eo6Var.d);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i4;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long e = yac.h(x12Var2.b.G3).e();
                                    tL_peerUser.user_id = e;
                                    peer.user_id = e;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = eo6Var.d;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String D = xb4.D(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (D.length() <= 0) {
                                        D = "mp3";
                                    }
                                    sb.append(D);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = eo6Var.c;
                                    tL_documentAttributeAudio.title = eo6Var.b;
                                    tL_documentAttributeAudio.performer = eo6Var.a;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    eo6Var.e = new r47(x12Var2.b.G3, tL_message, false, true);
                                    h00 a = h00.a(file);
                                    if (a != null && a.o != null) {
                                        int L = hl.L(44.0f);
                                        Bitmap bitmap = a.o;
                                        if (bitmap.getWidth() > L || bitmap.getHeight() > L) {
                                            float f = L;
                                            float min = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            eo6Var.e.J1 = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), true);
                                        } else {
                                            eo6Var.e.J1 = bitmap;
                                        }
                                    }
                                    arrayList.add(eo6Var);
                                    i4--;
                                } finally {
                                }
                            }
                            query.close();
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        hl.c3(new dy1(x12Var2, arrayList, (byte) 9));
                        return;
                }
            }
        });
        if (n12Var.Z1 != null) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            xj3Var.addView(frameLayout2);
            xj3Var.j(frameLayout2, true, false);
            FragmentContextView t12Var = new t12(this, context, n12Var.Z1, frameLayout, vnbVar, frameLayout2);
            viewGroup = frameLayout;
            frameLayout2.addView(t12Var);
            xj3Var.setCallFragmentContextView(t12Var);
        } else {
            viewGroup = frameLayout;
        }
        FrameLayout.LayoutParams d2 = tre.d(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d2).topMargin = uh9.w(27.0f, hl.m, ((ViewGroup.MarginLayoutParams) d2).topMargin);
        viewGroup.addView(xj3Var, d2);
        wa waVar = new wa(this, context, n12Var.G3, new c(this, (byte) 27), new r12(this), new r12(this), vnbVar);
        this.w = waVar;
        waVar.g3.r = false;
        waVar.s1();
        setBlur3Capture(waVar);
        this.d = waVar;
        this.h = true;
        this.f = true;
        waVar.setClipToPadding(false);
        waVar.setHorizontalScrollBarEnabled(false);
        waVar.setVerticalScrollBarEnabled(false);
        addView(waVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        yob.l(waVar, 21, aob.A5, vnbVar);
        waVar.setOnScrollListener(new y(this, (byte) 16));
        addView(viewGroup, tre.e(-1, jn7.d3, 51));
        waVar.g3.O(false);
        O();
        int i = this.b.G3;
        this.K = new pc7(i, yac.h(i).e());
    }

    @Override // f12
    public final void C(int i, int i2) {
        this.U = i2;
        O();
    }

    @Override // f12
    public final void H(f12 f12Var) {
        Q();
        this.K.b();
        wa waVar = this.w;
        waVar.f3.g1(0, 0);
        waVar.g3.O(false);
    }

    @Override // f12
    public final void J() {
        this.w.A0(0);
    }

    @Override // f12
    public final boolean K(final boolean z, final int i, final int i2, final long j, final boolean z2) {
        HashSet hashSet = this.J;
        if (hashSet.size() == 0 || this.O == null || this.G) {
            return false;
        }
        this.G = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((eo6) it.next()).e);
        }
        n12 n12Var = this.b;
        return jj.Y(n12Var.G3, n12Var.W0(), n12Var.S0() + arrayList.size(), new pcc() { // from class: s12
            @Override // pcc
            public final void a(Object obj) {
                x12 x12Var = x12.this;
                u12 u12Var = x12Var.O;
                n12 n12Var2 = x12Var.b;
                u12Var.d(arrayList, n12Var2.V0().getText(), z, i, i2, j, z2, ((Long) obj).longValue());
                n12Var2.a(true);
            }
        }, 0L);
    }

    public final void O() {
        int i;
        n12 n12Var = this.b;
        if (n12Var.o3.Q() > hl.L(20.0f)) {
            i = hl.L(8.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i = (int) (this.U / 3.5f);
                    n12Var.r0 = true;
                }
            }
            i = (this.U / 5) << 1;
            n12Var.r0 = true;
        }
        this.w.setPadding(0, (int) (this.y.c(0.0f) + hl.L(56.0f) + i + hl.m), 0, this.e);
    }

    public final void P(b8c b8cVar, View view) {
        if (b8cVar != null) {
            int i = b8cVar.d;
            if (i == this.S) {
                this.K.b();
                return;
            } else if (i == this.Q) {
                Q();
                return;
            } else if (i == this.R) {
                R();
                return;
            }
        }
        if (view instanceof vea) {
            vea veaVar = (vea) view;
            eo6 eo6Var = (eo6) veaVar.getTag();
            n12 n12Var = this.b;
            n12Var.getClass();
            int i2 = 1;
            if (n12Var.B1) {
                this.G = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(eo6Var.e);
                this.O.d(arrayList, n12Var.V0().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.J;
                if (hashSet.contains(eo6Var)) {
                    hashSet.remove(eo6Var);
                    b8cVar.e = false;
                    veaVar.e(false, true);
                    i2 = 2;
                } else {
                    if (this.F >= 0) {
                        int size = hashSet.size();
                        int i3 = this.F;
                        if (size >= i3) {
                            String a0 = ob6.a0(null, null, 2131747178, ob6.G(i3, "Files", new Object[0]));
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
                            String M0 = ob6.M0(R.string.AppName, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = a0;
                            c00.u(null, 2131747558, alertDialog$Builder, null);
                            return;
                        }
                    }
                    b8cVar.e = true;
                    hashSet.add(eo6Var);
                    veaVar.e(true, true);
                }
            }
            n12Var.G1(i2);
        }
    }

    public final void Q() {
        hl.r(this.b0);
        String str = this.E;
        byte b = 0;
        if (str != null && str.length() > 0 && this.E.length() < 3) {
            if (this.a0) {
                this.a0 = false;
                S();
                return;
            }
            return;
        }
        boolean equals = TextUtils.equals(this.W, this.E);
        ArrayList arrayList = this.M;
        if (!equals) {
            arrayList.clear();
            this.c0 = 0;
            this.d0 = false;
        }
        if (!arrayList.isEmpty() && !this.d0) {
            if (this.a0) {
                this.a0 = false;
                S();
                return;
            }
            return;
        }
        int i = this.b.G3;
        uc7 s1 = uc7.s1(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        int i2 = this.V;
        byte b2 = 1;
        if (i2 >= 0) {
            connectionsManager.cancelRequest(i2, true);
            this.V = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.E;
        this.W = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            r47 r47Var = ((eo6) c00.g(1, arrayList)).e;
            tL_messages_searchGlobal.offset_id = r47Var.e1();
            tL_messages_searchGlobal.offset_rate = this.c0;
            tL_messages_searchGlobal.offset_peer = s1.j1(r47.B1(r47Var.k.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.V = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new ic(b), new q12(this, s1, i, b2));
        S();
    }

    public final void R() {
        String str;
        hl.r(this.g0);
        byte b = 0;
        if (TextUtils.isEmpty(this.E) || this.E.length() < 3) {
            if (this.n0) {
                this.n0 = false;
                S();
                return;
            }
            return;
        }
        if (!TextUtils.equals(this.f0, this.E)) {
            this.N.clear();
            this.h0 = false;
        }
        int i = this.b.G3;
        uc7 s1 = uc7.s1(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        int i2 = this.e0;
        if (i2 >= 0) {
            connectionsManager.cancelRequest(i2, true);
            this.e0 = -1;
        }
        String str2 = s1.k4.Q.f;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        TLRPC.User user = this.i0;
        if (user == null) {
            TLObject c2 = s1.c2(str2);
            user = c2 instanceof TLRPC.User ? (TLRPC.User) c2 : null;
            this.i0 = user;
        }
        if (user == null) {
            if (this.j0 || this.k0) {
                return;
            }
            this.j0 = true;
            s1.a2().a(str2, null, new rx1((Object) this, (Object) s1, (byte) 4));
            return;
        }
        TLRPC.User f = yac.h(i).f();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = s1.q1(this.i0);
        tL_messages_getInlineBotResults.peer = uc7.n1(f);
        if (this.N.isEmpty() || (str = this.l0) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.E;
        String str4 = str3 != null ? str3 : "";
        this.f0 = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.e0 = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new ic(b), new q12(this, s1, i, b));
        S();
    }

    public final void S() {
        o12 o12Var = this.T;
        hl.r(o12Var);
        hl.c3(o12Var);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.g2;
        int i4 = jn7.h2;
        wa waVar = this.w;
        int i5 = jn7.f2;
        if (i != i5 && i != i4 && i != i3) {
            if (i == jn7.W3 && objArr[0] == this.K && waVar != null) {
                waVar.g3.O(true);
                return;
            }
            return;
        }
        if (i == i5 || i == i3) {
            int childCount = waVar.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = waVar.getChildAt(i6);
                if (childAt instanceof vea) {
                    vea veaVar = (vea) childAt;
                    if (veaVar.getMessage() != null) {
                        veaVar.g(false, true);
                    }
                }
            }
            return;
        }
        if (i == i4 && ((r47) objArr[0]).T == 0) {
            int childCount2 = waVar.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = waVar.getChildAt(i7);
                if (childAt2 instanceof vea) {
                    vea veaVar2 = (vea) childAt2;
                    if (veaVar2.getMessage() != null) {
                        veaVar2.g(false, true);
                    }
                }
            }
        }
    }

    @Override // f12
    public int getCurrentItemTop() {
        wa waVar = this.w;
        if (waVar.getChildCount() > 0) {
            boolean z = false;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < waVar.getChildCount(); i2++) {
                View childAt = waVar.getChildAt(i2);
                int S = RecyclerView.S(childAt);
                if (S == 0) {
                    z = true;
                }
                if (S >= 0 && childAt.getTop() < i) {
                    i = childAt.getTop();
                }
            }
            if (i != Integer.MAX_VALUE) {
                int L = (((i - hl.L(56.0f)) - ((int) this.y.c(0.0f))) - hl.m) - hl.L(8.0f);
                int i3 = (L <= 0 || !z) ? 0 : L;
                fm0 fm0Var = this.n;
                if (L < 0 || !z) {
                    fm0Var.a(true, true);
                    L = i3;
                } else {
                    fm0Var.a(false, true);
                }
                this.r.setTranslationY(L);
                return hl.L(12.0f) + L;
            }
        }
        return ConnectionsManager.DEFAULT_DATACENTER_ID;
    }

    @Override // f12
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
    }

    @Override // f12
    public int getListTopPadding() {
        return (this.w.getPaddingTop() - hl.L(56.0f)) - ((int) this.y.c(0.0f));
    }

    public ArrayList<r47> getSelected() {
        ArrayList<r47> arrayList = new ArrayList<>();
        Iterator it = this.J.iterator();
        while (it.hasNext()) {
            arrayList.add(((eo6) it.next()).e);
        }
        return arrayList;
    }

    @Override // f12
    public int getSelectedItemsCount() {
        return this.J.size();
    }

    @Override // f12
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        int i = aob.A5;
        wa waVar = this.w;
        arrayList.add(new apb(waVar, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(waVar, TLObject.FLAG_12, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.i6));
        arrayList.add(new apb(waVar, 0, new Class[]{View.class}, aob.j0, (Drawable[]) null, (zob) null, aob.d7));
        arrayList.add(new apb(waVar, TLObject.FLAG_13, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.i7));
        arrayList.add(new apb(waVar, TLObject.FLAG_14, new Class[]{vea.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        arrayList.add(new apb(waVar, 4, new Class[]{vea.class}, aob.f3, (Drawable[]) null, (zob) null, aob.G6));
        arrayList.add(new apb(waVar, 4, new Class[]{vea.class}, aob.g3, (Drawable[]) null, (zob) null, aob.z6));
        return arrayList;
    }

    @Override // f12
    public final void p() {
        v();
        n12 n12Var = this.b;
        jn7.f(n12Var.G3).n(this, jn7.f2);
        int i = n12Var.G3;
        jn7.f(i).n(this, jn7.h2);
        jn7.f(i).n(this, jn7.g2);
        jn7.f(i).n(this, jn7.W3);
    }

    @Override // f12
    public final boolean q() {
        if (this.P == null || !MediaController.z().H(this.P)) {
            return false;
        }
        MediaController.z().l(true, true);
        return false;
    }

    public void setDelegate(u12 u12Var) {
        this.O = u12Var;
    }

    public void setMaxSelectedFiles(int i) {
        this.F = i;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(ll0 ll0Var) {
        vnb vnbVar = this.a;
        j12 j12Var = this.s;
        if (j12Var != null) {
            j12Var.setupBlurredBackground(ll0Var.c(j12Var, dtd.n(vnbVar), false));
        }
        xj3 xj3Var = this.y;
        if (xj3Var != null) {
            jl0 c = ll0Var.c(xj3Var, dtd.n(vnbVar), false);
            c.r(hl.L(24.0f));
            c.q(hl.L(7.0f));
            xj3Var.setBlurredBackground(c);
        }
    }

    @Override // s84
    public final void t(int i, float f, float f2, t84 t84Var) {
        if (i == 0) {
            m12 m12Var = this.x;
            m12Var.setAlpha(f);
            m12Var.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override // f12
    public final void u() {
        this.J.clear();
    }

    @Override // f12
    public final void v() {
        if (this.P != null && MediaController.z().H(this.P)) {
            MediaController.z().l(true, true);
        }
        this.P = null;
    }

    @Override // f12
    public final void m(float f) {
    }

    @Override // s84
    public final void v0(float f, int i) {
    }
}
