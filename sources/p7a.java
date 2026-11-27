// default package

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class p7a {
    public int A;
    public int B;
    public int C;
    public Object D;
    public n47 E;
    public boolean F;
    public boolean G;
    public TL_stories.StoryItem H;
    public TL_stories.StoryItem I;
    public ou1 J;
    public c5a K;
    public boolean L;
    public String M;
    public int N;
    public long O;
    public long P;
    public long Q;
    public long R;
    public boolean S;
    public b77 T;
    public boolean U;
    public long V;
    public long W;
    public long X;
    public TL_iv.RichMessage Y;
    public ArrayList Z;
    public String a;
    public String b;
    public TLRPC.MessageMedia c;
    public TLRPC.TL_photo d;
    public oec e;
    public TLRPC.User f;
    public TLRPC.TL_document g;
    public TLRPC.TL_game h;
    public TLRPC.TL_messageMediaPoll i;
    public ki8 j;
    public int k;
    public TLRPC.TL_messageMediaToDo l;
    public TLRPC.TL_messageMediaInvoice m;
    public TLRPC.TL_messageMediaWebPage n;
    public TLRPC.PhotoSize o;
    public long p;
    public String q;
    public r47 r;
    public r47 s;
    public TLRPC.WebPage t;
    public boolean u;
    public r47 v;
    public ArrayList w;
    public TLRPC.ReplyMarkup x;
    public HashMap y;
    public boolean z;

    public static p7a a(long j, String str) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, null, null, null, true, null, null, null, null, false, 0, 0, 0, null, null, false, false);
    }

    public static p7a b(String str, long j, r47 r47Var, r47 r47Var2, TLRPC.WebPage webPage, boolean z, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, n47 n47Var, boolean z3) {
        return c(str, null, null, null, null, null, null, null, null, null, j, null, r47Var, r47Var2, webPage, z, null, arrayList, replyMarkup, hashMap, z2, i, i2, 0, null, n47Var, z3, false);
    }

    public static p7a c(String str, String str2, TLRPC.MessageMedia messageMedia, TLRPC.TL_photo tL_photo, oec oecVar, TLRPC.User user, TLRPC.TL_document tL_document, TLRPC.TL_game tL_game, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice, long j, String str3, r47 r47Var, r47 r47Var2, TLRPC.WebPage webPage, boolean z, r47 r47Var3, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z2, int i, int i2, int i3, Object obj, n47 n47Var, boolean z3, boolean z4) {
        p7a p7aVar = new p7a();
        p7aVar.a = str;
        p7aVar.b = str2;
        p7aVar.c = messageMedia;
        p7aVar.d = tL_photo;
        p7aVar.e = oecVar;
        p7aVar.f = user;
        p7aVar.g = tL_document;
        p7aVar.h = tL_game;
        p7aVar.i = tL_messageMediaPoll;
        p7aVar.m = tL_messageMediaInvoice;
        p7aVar.p = j;
        p7aVar.q = str3;
        p7aVar.r = r47Var;
        p7aVar.s = r47Var2;
        p7aVar.t = webPage;
        p7aVar.u = z;
        p7aVar.v = r47Var3;
        p7aVar.w = arrayList;
        p7aVar.x = replyMarkup;
        p7aVar.y = hashMap;
        p7aVar.z = z2;
        p7aVar.A = i;
        p7aVar.B = i2;
        p7aVar.C = i3;
        p7aVar.D = obj;
        p7aVar.E = n47Var;
        p7aVar.F = z3;
        p7aVar.G = z4;
        return p7aVar;
    }

    public static p7a d(TLRPC.MessageMedia messageMedia, long j, r47 r47Var, r47 r47Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i) {
        return c(null, null, messageMedia, null, null, null, null, null, null, null, j, null, r47Var, r47Var2, null, true, null, null, replyMarkup, hashMap, z, i, 0, 0, null, null, false, false);
    }

    public static p7a e(TLRPC.TL_document tL_document, oec oecVar, String str, long j, r47 r47Var, r47 r47Var2, String str2, ArrayList arrayList, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, boolean z2) {
        return c(null, str2, null, null, oecVar, null, tL_document, null, null, null, j, str, r47Var, r47Var2, null, true, null, arrayList, null, hashMap, z, i, i2, i3, obj, null, false, z2);
    }

    public static p7a f(TLRPC.TL_document tL_document, oec oecVar, String str, long j, r47 r47Var, r47 r47Var2, String str2, ArrayList arrayList, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2, int i3, Object obj, n47 n47Var, boolean z2) {
        return c(null, str2, null, null, oecVar, null, tL_document, null, null, null, j, str, r47Var, r47Var2, null, true, null, arrayList, replyMarkup, hashMap, z, i, i2, i3, obj, n47Var, z2, false);
    }

    public static p7a g(TLRPC.User user, long j, r47 r47Var, r47 r47Var2, TLRPC.ReplyMarkup replyMarkup, HashMap hashMap, boolean z, int i, int i2) {
        return c(null, null, null, null, null, user, null, null, null, null, j, null, r47Var, r47Var2, null, true, null, null, replyMarkup, hashMap, z, i, i2, 0, null, null, false, false);
    }
}
