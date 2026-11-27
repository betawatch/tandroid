// default package

import android.graphics.Typeface;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ou1 {
    public r47 a;
    public int b;
    public int c;
    public byte[] e;
    public boolean f;
    public boolean h;
    public String i;
    public ArrayList j;
    public TLRPC.TodoItem k;
    public TLRPC.PollAnswer l;
    public boolean m;
    public ArrayList n;
    public int o;
    public boolean g = false;
    public int d = -1;

    public ou1(int i, int i2, r47 r47Var) {
        TLRPC.Message message;
        this.a = r47Var;
        this.b = i;
        this.c = i2;
        boolean z = false;
        if (r47Var != null && (message = r47Var.k) != null && message.rich_message != null) {
            z = true;
        }
        this.m = z;
        f();
    }

    public static ou1 b(int i, int i2, r47 r47Var) {
        if (r47Var == null) {
            return null;
        }
        r47.B0(r47Var.k);
        return new ou1(i, i2, r47Var);
    }

    public static ou1 c(r47 r47Var) {
        TLRPC.Message message = r47Var.k;
        if (message == null) {
            return null;
        }
        if (message.message == null && (message == null || message.rich_message == null)) {
            return null;
        }
        return b(0, Math.min(uc7.s1(r47Var.K1).k4.V1.f(), d(r47Var)), r47Var);
    }

    public static int d(r47 r47Var) {
        CharSequence charSequence;
        TLRPC.Message message = r47Var.k;
        if (message == null) {
            return 0;
        }
        if (message == null || message.rich_message == null) {
            String str = message.message;
            if (str == null) {
                return 0;
            }
            return str.length();
        }
        hl9 hl9Var = r47Var.y2;
        if (hl9Var == null || (charSequence = hl9Var.q) == null) {
            return 0;
        }
        return charSequence.length();
    }

    public final void a(r47 r47Var) {
        String str;
        int i;
        int i2;
        TL_iv.RichMessage richMessage;
        boolean z = this.m;
        TLRPC.Message message = r47Var.k;
        if (z) {
            if (message == null || (richMessage = message.rich_message) == null) {
                cc4.d("ReplyQuote.checkEdit: rich message is null");
                this.f = false;
                return;
            }
            this.a = r47Var;
            String str2 = this.i;
            if (str2 != null && !TextUtils.isEmpty(str2)) {
                ArrayList e = ll9.e(richMessage);
                StringBuilder sb = new StringBuilder();
                int i3 = 0;
                while (true) {
                    if (i3 >= e.size()) {
                        break;
                    }
                    if (i3 > 0) {
                        sb.append('\n');
                    }
                    ll9.b((TL_iv.RichText) e.get(i3), sb, null);
                    i3++;
                }
                if (sb.indexOf(str2) >= 0) {
                    int[] f = ll9.c(r47Var) ? ll9.f(r47Var, this.i, this.o) : null;
                    ll9 k = f != null ? ll9.k(f[0], f[1], r47Var) : null;
                    if (k != null) {
                        this.b = f[0];
                        this.c = f[1];
                        e(k.b, k.a);
                    } else {
                        this.b = -1;
                        this.c = -1;
                    }
                    this.f = false;
                    return;
                }
            }
            this.b = 0;
            this.c = Math.min(uc7.s1(r47Var.K1).k4.V1.f(), d(r47Var));
            this.f = true;
            return;
        }
        if (message == null || (str = message.message) == null) {
            cc4.d("ReplyQuote.checkEdit: message is null");
            this.f = false;
            return;
        }
        int i4 = this.c;
        if (i4 < this.b || i4 > str.length() || this.b > r47Var.k.message.length() || (i = this.b) < 0 || (i2 = this.c) < 0) {
            cc4.d("ReplyQuote.checkEdit: start/end are invalid (" + this.b + ", " + this.c + ", len=" + r47Var.k.message.length() + ")");
            this.f = false;
            return;
        }
        if (TextUtils.equals(this.i, r47Var.k.message.substring(i, i2))) {
            this.a = r47Var;
            f();
            this.f = false;
            return;
        }
        int indexOf = r47Var.k.message.indexOf(this.i);
        if (indexOf >= 0) {
            this.a = r47Var;
            this.c = (this.c - this.b) + indexOf;
            this.b = indexOf;
            f();
            this.f = false;
            return;
        }
        this.a = r47Var;
        this.b = 0;
        this.c = r47Var.k.message.length();
        f();
        this.f = true;
    }

    public final void e(int i, ArrayList arrayList) {
        this.n = arrayList;
        this.o = i;
        if (arrayList == null || arrayList.isEmpty()) {
            this.n = null;
            this.i = null;
            this.j = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            this.j = arrayList2;
            this.i = ll9.h(arrayList, arrayList2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [org.telegram.tgnet.TLRPC$TL_messageEntitySpoiler] */
    /* JADX WARN: Type inference failed for: r5v13, types: [org.telegram.tgnet.TLRPC$TL_messageEntityStrike] */
    /* JADX WARN: Type inference failed for: r5v14, types: [org.telegram.tgnet.TLRPC$TL_messageEntityUnderline] */
    /* JADX WARN: Type inference failed for: r5v15, types: [org.telegram.tgnet.TLRPC$TL_messageEntityItalic] */
    /* JADX WARN: Type inference failed for: r5v17, types: [org.telegram.tgnet.TLRPC$TL_messageEntityBold] */
    public final void f() {
        TLRPC.Message message;
        String str;
        int i;
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji;
        int i2;
        if (this.m) {
            int i3 = this.b;
            if (i3 < 0 || (i2 = this.c) < 0) {
                return;
            }
            ll9 k = ll9.k(i3, i2, this.a);
            if (k != null) {
                e(k.b, k.a);
                return;
            }
            cc4.d("ReplyQuote: failed to build a rich quote (" + this.b + ", " + this.c + ")");
            e(0, null);
            return;
        }
        r47 r47Var = this.a;
        if (r47Var == null || (message = r47Var.k) == null || (str = message.message) == null) {
            cc4.d("ReplyQuote: message is null");
            return;
        }
        if (this.g) {
            TLRPC.TodoItem Z = r47.Z(this.d, r47Var);
            if (Z == null) {
                cc4.d("ReplyQuote: todo task is not found");
                return;
            } else {
                this.k = Z;
                return;
            }
        }
        if (this.h) {
            TLRPC.PollAnswer X = r47.X(r47Var, this.e);
            if (X == null) {
                cc4.d("ReplyQuote: poll item is not found");
                return;
            } else {
                this.l = X;
                return;
            }
        }
        int i4 = this.c;
        if (i4 < this.b || i4 > str.length() || this.b > this.a.k.message.length() || (i = this.b) < 0 || this.c < 0) {
            cc4.d("ReplyQuote: start/end are invalid (" + this.b + ", " + this.c + ", len=" + this.a.k.message.length() + ")");
            return;
        }
        String str2 = this.a.k.message;
        int max = Math.max(0, i);
        while (max < this.c && Character.isWhitespace(str2.charAt(max))) {
            max++;
        }
        int min = Math.min(this.c, str2.length());
        while (min > max && Character.isWhitespace(str2.charAt(min - 1))) {
            min--;
        }
        if (max == min) {
            cc4.d("ReplyQuote: message is full of whitespace");
            return;
        }
        this.i = this.a.k.message.substring(max, min);
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<TLRPC.MessageEntity> arrayList2 = this.a.k.entities;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        for (int i5 = 0; i5 < this.a.k.entities.size(); i5++) {
            TLRPC.MessageEntity messageEntity = this.a.k.entities.get(i5);
            int i6 = messageEntity.offset;
            int i7 = messageEntity.length + i6;
            Typeface typeface = hl.a;
            if (Math.max(max, min) >= Math.min(i6, i7) && Math.max(i6, i7) >= Math.min(max, min)) {
                if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityBold();
                } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityItalic();
                } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityUnderline();
                } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityStrike();
                } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                    tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntitySpoiler();
                } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = new TLRPC.TL_messageEntityCustomEmoji();
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji3 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    tL_messageEntityCustomEmoji2.document_id = tL_messageEntityCustomEmoji3.document_id;
                    tL_messageEntityCustomEmoji2.document = tL_messageEntityCustomEmoji3.document;
                    tL_messageEntityCustomEmoji = tL_messageEntityCustomEmoji2;
                }
                int i8 = messageEntity.offset;
                int i9 = i8 - max;
                int i10 = (i8 + messageEntity.length) - max;
                if ((i9 >= 0 || i10 >= 0) && (i9 <= min || i10 <= min)) {
                    tL_messageEntityCustomEmoji.offset = Math.max(0, i9);
                    tL_messageEntityCustomEmoji.length = Math.min(i10, min - max) - tL_messageEntityCustomEmoji.offset;
                    ArrayList arrayList3 = this.j;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        this.j = arrayList3;
                    }
                    arrayList3.add(tL_messageEntityCustomEmoji);
                }
            }
        }
    }
}
