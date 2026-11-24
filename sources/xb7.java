// default package

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class xb7 {
    public final long a;
    public boolean e;
    public final /* synthetic */ oc7 h;
    public final ArrayList b = new ArrayList();
    public boolean c = true;
    public boolean d = false;
    public int f = -1;
    public int g = -1;

    public xb7(oc7 oc7Var, long j) {
        this.h = oc7Var;
        this.a = j;
    }

    public final void a(final int i, final int i2) {
        if (this.e || i2 <= 0 || i < 0) {
            return;
        }
        if (i2 == this.g && i == this.f) {
            return;
        }
        final byte b = 1;
        this.e = true;
        this.f = i;
        this.g = i2;
        long j = this.a;
        final byte b2 = 0;
        oc7 oc7Var = this.h;
        if (j < 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterChatPhotos();
            tL_messages_search.add_offset = i;
            tL_messages_search.limit = i2;
            tL_messages_search.offset_id = 0;
            tL_messages_search.q = "";
            tL_messages_search.peer = oc7Var.i1(j);
            oc7Var.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate(this) { // from class: wb7
                public final /* synthetic */ xb7 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (b) {
                        case 0:
                            if (tL_error == null) {
                                TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                                xb7 xb7Var = this.b;
                                xb7Var.h.getMessagesStorage().j1(photos_photos.users, null, true, true);
                                gm.c3(new zq1(xb7Var, photos_photos, i, i2, (byte) 8));
                                break;
                            }
                            break;
                        default:
                            if (tL_error == null) {
                                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                                xb7 xb7Var2 = this.b;
                                xb7Var2.h.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                                gm.c3(new zq1(xb7Var2, messages_messages, i, i2, (byte) 9));
                                break;
                            }
                            break;
                    }
                }
            });
            return;
        }
        TLRPC.User W1 = oc7Var.W1(Long.valueOf(j));
        if (W1 == null) {
            this.e = false;
            return;
        }
        TLRPC.TL_photos_getUserPhotos tL_photos_getUserPhotos = new TLRPC.TL_photos_getUserPhotos();
        tL_photos_getUserPhotos.offset = i;
        tL_photos_getUserPhotos.limit = i2;
        tL_photos_getUserPhotos.max_id = 0L;
        tL_photos_getUserPhotos.user_id = oc7Var.p1(W1);
        oc7Var.getConnectionsManager().sendRequest(tL_photos_getUserPhotos, new RequestDelegate(this) { // from class: wb7
            public final /* synthetic */ xb7 b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (b2) {
                    case 0:
                        if (tL_error == null) {
                            TLRPC.photos_Photos photos_photos = (TLRPC.photos_Photos) tLObject;
                            xb7 xb7Var = this.b;
                            xb7Var.h.getMessagesStorage().j1(photos_photos.users, null, true, true);
                            gm.c3(new zq1(xb7Var, photos_photos, i, i2, (byte) 8));
                            break;
                        }
                        break;
                    default:
                        if (tL_error == null) {
                            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                            xb7 xb7Var2 = this.b;
                            xb7Var2.h.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                            gm.c3(new zq1(xb7Var2, messages_messages, i, i2, (byte) 9));
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void b(int i, boolean z) {
        ArrayList arrayList = this.b;
        int i2 = 0;
        if (arrayList.isEmpty()) {
            a(0, 80);
            return;
        }
        if (i < 0) {
            i += arrayList.size();
        }
        if (i >= arrayList.size()) {
            i -= arrayList.size();
        }
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) == null) {
                if (z) {
                    while (arrayList.get(i) != null) {
                        i++;
                        if (i >= arrayList.size()) {
                            i = 0;
                        }
                    }
                    while (i2 <= 80) {
                        int i4 = i + i2;
                        if (i4 >= arrayList.size() || arrayList.get(i4) != null) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 > 0) {
                        a(i, i2);
                        return;
                    }
                    return;
                }
                while (arrayList.get(i) != null) {
                    i--;
                    if (i < 0) {
                        i = arrayList.size() - 1;
                    }
                }
                while (i2 <= 80) {
                    int i5 = i - i2;
                    if (i5 < 0 || arrayList.get(i5) != null) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 > 0) {
                    a(i - i2, i2);
                    return;
                }
                return;
            }
        }
    }

    public final void c(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                arrayList.add(0, (TLRPC.Photo) arrayList.remove(i));
                g();
                this.h.getNotificationCenter().k(nm7.g3, this);
            }
        }
    }

    public final void d(int i, int i2, TLRPC.photos_Photos photos_photos) {
        boolean z = this.d;
        this.e = false;
        this.d = true;
        this.c = false;
        int max = Math.max(photos_photos.count, photos_photos.photos.size());
        photos_photos.count = max;
        ArrayList arrayList = this.b;
        boolean z2 = max != arrayList.size() || i + i2 > arrayList.size();
        if (!z2) {
            int i3 = 0;
            while (true) {
                if (i3 >= photos_photos.photos.size()) {
                    break;
                }
                int i4 = i + i3;
                if (arrayList.get(i4) != null && ((TLRPC.Photo) arrayList.get(i4)).id != photos_photos.photos.get(i3).id) {
                    z2 = true;
                    break;
                }
                i3++;
            }
        }
        if (z2) {
            arrayList.clear();
            for (int i5 = 0; i5 < photos_photos.count; i5++) {
                int i6 = i5 - i;
                arrayList.add((i6 < 0 || i6 >= photos_photos.photos.size()) ? null : photos_photos.photos.get(i6));
            }
        } else {
            for (int i7 = 0; i7 < photos_photos.photos.size(); i7++) {
                arrayList.set(i + i7, photos_photos.photos.get(i7));
            }
        }
        g();
        this.h.getNotificationCenter().k(nm7.g3, this);
        if (z || i != 0 || i2 >= arrayList.size() || arrayList.size() - i2 <= 80) {
            return;
        }
        a(arrayList.size() - 80, 80);
    }

    public final void e(long j) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                break;
            }
            TLRPC.Photo photo = (TLRPC.Photo) arrayList.get(i);
            if (photo != null && photo.id == j) {
                arrayList.remove(i);
                i--;
                z = true;
            }
            i++;
        }
        if (z) {
            g();
            this.h.getNotificationCenter().k(nm7.g3, this);
        }
    }

    public final void f() {
        this.b.clear();
        this.f = -1;
        this.g = -1;
        this.c = true;
        g();
    }

    public final void g() {
        this.h.getMessagesStorage().a.c(new vb7(this, (byte) 1));
    }
}
