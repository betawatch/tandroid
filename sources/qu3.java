// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class qu3 extends FrameLayout {
    public xd0 a;
    public xd0 b;
    public Drawable c;
    public Drawable d;
    public final Drawable e;
    public Paint f;
    public RectF h;
    public final ViewGroup[] n;
    public final /* synthetic */ ru3 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qu3(ru3 ru3Var, Context context) {
        super(context);
        this.r = ru3Var;
        this.f = new Paint(1);
        this.h = new RectF();
        this.n = new ViewGroup[2];
        int i = 0;
        setWillNotDraw(false);
        setPadding(0, hl.L(24.0f), 0, hl.L(24.0f));
        LinearLayout j = uh9.j(context, 1);
        addView(j, tre.e(-2, -2, 17));
        dl1 dl1Var = new dl1(context);
        dl1Var.setCustomText(ob6.M0(2131742500, null));
        j.addView(dl1Var, tre.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        j.addView(linearLayout, tre.t(-2, -2, 17, 10, 0, 10, 0));
        ru3Var.d = new ImageView(context);
        int i2 = ru3Var.x;
        if (i2 == 0) {
            while (i < 2) {
                this.n[i] = (ViewGroup) ru3Var.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i], tre.o(-1, -2));
                i++;
            }
            linearLayout.addView(ru3Var.d, tre.r(jn7.u3, jn7.p2, 17));
            ru3Var.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i2 == 1) {
            while (i < 2) {
                this.n[i] = (ViewGroup) ru3Var.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.n[i], tre.o(jn7.p2, -2));
                i++;
            }
            linearLayout.addView(ru3Var.d, tre.r(jn7.p2, jn7.p2, 17));
            ru3Var.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = aob.W0(context, R.drawable.greydivider_bottom, aob.b7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:118|(1:120)(2:129|(1:131)(9:132|(1:134)(1:136)|135|122|123|124|125|99|100))|121|122|123|124|125|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x03ba, code lost:
    
        cc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0263, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x018e A[Catch: all -> 0x01f0, TryCatch #0 {all -> 0x01f0, blocks: (B:212:0x013c, B:38:0x0151, B:41:0x0167, B:43:0x0172, B:44:0x0187, B:45:0x01dd, B:200:0x0178, B:202:0x017e, B:203:0x0182, B:204:0x018e, B:206:0x0199, B:207:0x01a7), top: B:211:0x013c }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05b8  */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v31, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v23, types: [org.telegram.tgnet.TLRPC$FileLocation] */
    /* JADX WARN: Type inference failed for: r7v49, types: [rb0] */
    /* JADX WARN: Type inference failed for: r7v56, types: [org.telegram.tgnet.TLRPC$FileLocation] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        ViewGroup[] viewGroupArr;
        TLRPC.Dialog dialog;
        int i;
        TLRPC.Chat M0;
        String str;
        TLRPC.FileLocation fileLocation;
        TLRPC.User user;
        Bitmap decodeFile;
        int i2;
        String format;
        rb0 rb0Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation2;
        ViewGroup[] viewGroupArr2;
        TLRPC.Dialog dialog2;
        TLRPC.Chat chat;
        TLRPC.User user2;
        TLRPC.Chat chat2;
        String str2;
        ?? r7;
        Bitmap decodeFile2;
        r47 r47Var;
        TLRPC.Chat M02;
        TLRPC.User user3;
        String str3;
        SpannableStringBuilder valueOf;
        String j;
        char c;
        ?? r13;
        String str4;
        String str5;
        rb0 rb0Var2;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        ?? r72;
        ru3 ru3Var = this.r;
        ArrayList arrayList = ru3Var.e;
        int i3 = ru3Var.x;
        int i4 = 2131745993;
        int i5 = 2131745629;
        int i6 = 8;
        int i7 = 2;
        ?? r15 = 1;
        ViewGroup[] viewGroupArr3 = this.n;
        int i8 = 0;
        ?? r12 = 0;
        if (i3 == 0) {
            int i9 = 0;
            while (i9 < i7) {
                if (arrayList.isEmpty()) {
                    dialog2 = i9 < ru3Var.getMessagesController().F.size() ? (TLRPC.Dialog) ru3Var.getMessagesController().F.get(i9) : r12;
                    viewGroupArr2 = viewGroupArr3;
                } else if (i9 < arrayList.size()) {
                    viewGroupArr2 = viewGroupArr3;
                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) ru3Var.getMessagesController().R.f(((Long) arrayList.get(i9)).longValue());
                    if (dialog3 == null) {
                        dialog3 = new TLRPC.TL_dialog();
                        dialog3.id = ((Long) arrayList.get(i9)).longValue();
                    }
                    dialog2 = dialog3;
                } else {
                    viewGroupArr2 = viewGroupArr3;
                    dialog2 = r12;
                }
                if (dialog2 == null) {
                    viewGroupArr2[i9].setVisibility(i6);
                } else {
                    viewGroupArr2[i9].setVisibility(i8);
                    if (wf3.D(dialog2.id)) {
                        user2 = ru3Var.getMessagesController().X1(Long.valueOf(dialog2.id));
                        if (user2 != null) {
                            String M03 = lbc.D(user2) ? ob6.M0(i5, r12) : lbc.B(user2) ? ob6.M0(i4, r12) : lbc.z(user2) ? ob6.M0(2131749082, r12) : lv2.m(i8, user2.first_name, user2.last_name);
                            if (lbc.B(user2) || lbc.D(user2) || (userProfilePhoto2 = user2.photo) == null || (r72 = userProfilePhoto2.photo_small) == 0 || r72.volume_id == 0 || r72.local_id == 0) {
                                str2 = M03;
                                chat = r12;
                                chat2 = chat;
                            } else {
                                chat2 = r72;
                                str2 = M03;
                                chat = r12;
                            }
                            ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                                try {
                                    ru3Var.getFileLoader().getClass();
                                    decodeFile2 = BitmapFactory.decodeFile(xb4.J(chat2, r12, r15, r15).toString());
                                } catch (Throwable th) {
                                    cc4.g(th, r15);
                                }
                            } else {
                                decodeFile2 = r12;
                            }
                            int L = hl.L(48.0f);
                            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(i8);
                            Canvas canvas = new Canvas(createBitmap);
                            if (decodeFile2 != null) {
                                if (user2 != null) {
                                    ?? rb0Var3 = new rb0(i8, user2);
                                    if (lbc.B(user2)) {
                                        rb0Var3.f(12);
                                        rb0Var2 = rb0Var3;
                                    } else {
                                        rb0Var2 = rb0Var3;
                                        if (lbc.D(user2)) {
                                            rb0Var3.f(r15);
                                            rb0Var2 = rb0Var3;
                                        }
                                    }
                                } else {
                                    rb0Var2 = new rb0(chat);
                                }
                                rb0Var2.setBounds(i8, i8, L, L);
                                rb0Var2.draw(canvas);
                            } else {
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader = new BitmapShader(decodeFile2, tileMode, tileMode);
                                if (this.f == null) {
                                    this.f = new Paint((int) r15);
                                    this.h = new RectF();
                                }
                                float width = L / decodeFile2.getWidth();
                                canvas.save();
                                canvas.scale(width, width);
                                this.f.setShader(bitmapShader);
                                this.h.set(0.0f, 0.0f, decodeFile2.getWidth(), decodeFile2.getHeight());
                                canvas.drawRoundRect(this.h, decodeFile2.getWidth(), decodeFile2.getHeight(), this.f);
                                canvas.restore();
                            }
                            canvas.setBitmap(null);
                            ((ImageView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap);
                            ArrayList arrayList2 = (ArrayList) ru3Var.getMessagesController().S.f(dialog2.id);
                            r47Var = (arrayList2 != null || arrayList2.size() <= 0) ? null : (r47) arrayList2.get(0);
                            if (r47Var == null) {
                                long Z0 = r47Var.Z0();
                                if (Z0 > 0) {
                                    user3 = ru3Var.getMessagesController().X1(Long.valueOf(Z0));
                                    M02 = null;
                                } else {
                                    M02 = ru3Var.getMessagesController().M0(Long.valueOf(-Z0));
                                    user3 = null;
                                }
                                int color = getContext().getResources().getColor(R.color.widget_text);
                                if (r47Var.k instanceof TLRPC.TL_messageService) {
                                    if (xc2.T(chat)) {
                                        TLRPC.MessageAction messageAction = r47Var.k.action;
                                        str5 = "";
                                        if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                                            str5 = "";
                                        }
                                        color = getContext().getResources().getColor(R.color.widget_action_text);
                                        str4 = str5;
                                    }
                                    str5 = r47Var.v;
                                    color = getContext().getResources().getColor(R.color.widget_action_text);
                                    str4 = str5;
                                } else if (chat == null || chat.id <= 0 || M02 != null || (xc2.T(chat) && !xc2.n0(chat))) {
                                    TLRPC.Message message = r47Var.k;
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                                        str4 = ob6.M0(2131753940, null);
                                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                                        str4 = ob6.M0(2131753925, null);
                                    } else if (r47Var.z != null) {
                                        str4 = (r47.K4(message) ? "📹 " : r47.Q4(r47Var.k) ? "🎤 " : r47Var.I3() ? "🎧 " : r47.R3(r47Var.k) ? "🖼 " : "📎 ") + ((Object) r47Var.z);
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            str3 = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                                            str3 = "🎮 " + r47Var.k.media.game.title;
                                        } else if (r47Var.D == 14) {
                                            str3 = qd4.q("🎧 ", r47Var.w1(true), " - ", r47Var.y1(true));
                                        } else {
                                            ?? r0 = r47Var.v;
                                            hl.v1(r0, r47Var.a2, null);
                                            str3 = r0;
                                        }
                                        String str6 = str3;
                                        str4 = str6;
                                        if (r47Var.k.media != null) {
                                            str4 = str6;
                                            if (!r47Var.F3()) {
                                                color = getContext().getResources().getColor(R.color.widget_action_text);
                                                str4 = str6;
                                            }
                                        }
                                    }
                                } else {
                                    String M04 = r47Var.O3() ? ob6.M0(2131750464, null) : user3 != null ? lbc.k(user3, r15).replace("\n", "") : "DELETED";
                                    CharSequence charSequence = r47Var.z;
                                    boolean z = r15;
                                    try {
                                        if (charSequence != null) {
                                            String charSequence2 = charSequence.toString();
                                            if (charSequence2.length() > 150) {
                                                charSequence2 = charSequence2.substring(0, jn7.f2);
                                            }
                                            Object[] objArr = new Object[2];
                                            objArr[0] = (r47.K4(r47Var.k) ? "📹 " : r47.Q4(r47Var.k) ? "🎤 " : r47Var.I3() ? "🎧 " : r47.R3(r47Var.k) ? "🖼 " : "📎 ") + charSequence2.replace('\n', ' ');
                                            objArr[z ? 1 : 0] = M04;
                                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                                        } else if (r47Var.k.media == null || r47Var.F3()) {
                                            String str7 = r47Var.k.message;
                                            if (str7 != null) {
                                                if (str7.length() > 150) {
                                                    str7 = str7.substring(0, jn7.f2);
                                                }
                                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str7.replace('\n', ' ').trim(), M04));
                                            } else {
                                                valueOf = SpannableStringBuilder.valueOf("");
                                            }
                                        } else {
                                            color = getContext().getResources().getColor(R.color.widget_action_text);
                                            TLRPC.MessageMedia messageMedia2 = r47Var.k.media;
                                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                j = qd4.y("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                                j = qd4.y("🎮 \u2068", messageMedia2.game.title, "\u2069");
                                            } else {
                                                j = r47Var.D == 14 ? c00.j("🎧 \u2068", r47Var.w1(z), " - ", r47Var.y1(z), "\u2069") : r47Var.v.toString();
                                                c = ' ';
                                                Object[] objArr2 = new Object[2];
                                                objArr2[0] = j.replace('\n', c);
                                                objArr2[z ? 1 : 0] = M04;
                                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                                valueOf2.setSpan(new ho4(aob.o9, null), M04.length() + 2, valueOf2.length(), 33);
                                                r13 = valueOf2;
                                                r13.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                                                str4 = r13;
                                            }
                                            c = ' ';
                                            Object[] objArr22 = new Object[2];
                                            objArr22[0] = j.replace('\n', c);
                                            objArr22[z ? 1 : 0] = M04;
                                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                                            valueOf22.setSpan(new ho4(aob.o9, null), M04.length() + 2, valueOf22.length(), 33);
                                            r13 = valueOf22;
                                            r13.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                                            str4 = r13;
                                        }
                                        r13.setSpan(new ho4(aob.k9, null), 0, M04.length() + 1, 33);
                                        str4 = r13;
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                        str4 = r13;
                                    }
                                    r13 = valueOf;
                                }
                                ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_time)).setText(ob6.e1(r47Var.k.date));
                                ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_message)).setText(str4.toString());
                                ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_message)).setTextColor(color);
                            } else {
                                if (dialog2.last_message_date != 0) {
                                    ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_time)).setText(ob6.e1(dialog2.last_message_date));
                                } else {
                                    ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_time)).setText("");
                                }
                                ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_message)).setText("");
                            }
                            if (dialog2.unread_count <= 0) {
                                ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_badge)).setText(String.format("%d", Integer.valueOf(dialog2.unread_count)));
                                viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_badge).setVisibility(0);
                                if (ru3Var.getMessagesController().p2(dialog2.id, 0L, null)) {
                                    viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter_muted);
                                } else {
                                    viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_badge).setBackgroundResource(R.drawable.widget_counter);
                                }
                            } else {
                                viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_badge).setVisibility(8);
                            }
                        } else {
                            chat = r12;
                            chat2 = chat;
                            str2 = "";
                            ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L2 = hl.L(48.0f);
                            Bitmap createBitmap2 = Bitmap.createBitmap(L2, L2, Bitmap.Config.ARGB_8888);
                            createBitmap2.eraseColor(i8);
                            Canvas canvas2 = new Canvas(createBitmap2);
                            if (decodeFile2 != null) {
                            }
                            canvas2.setBitmap(null);
                            ((ImageView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap2);
                            ArrayList arrayList22 = (ArrayList) ru3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList22 != null) {
                            }
                            if (r47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        }
                    } else {
                        TLRPC.Chat M05 = ru3Var.getMessagesController().M0(Long.valueOf(-dialog2.id));
                        if (M05 != null) {
                            String str8 = M05.title;
                            TLRPC.ChatPhoto chatPhoto = M05.photo;
                            if (chatPhoto == null || (r7 = chatPhoto.photo_small) == 0 || r7.volume_id == 0 || r7.local_id == 0) {
                                str2 = str8;
                                chat2 = r12;
                                chat = M05;
                                user2 = chat2;
                            } else {
                                chat2 = r7;
                                str2 = str8;
                                chat = M05;
                                user2 = r12;
                            }
                            ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L22 = hl.L(48.0f);
                            Bitmap createBitmap22 = Bitmap.createBitmap(L22, L22, Bitmap.Config.ARGB_8888);
                            createBitmap22.eraseColor(i8);
                            Canvas canvas22 = new Canvas(createBitmap22);
                            if (decodeFile2 != null) {
                            }
                            canvas22.setBitmap(null);
                            ((ImageView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap22);
                            ArrayList arrayList222 = (ArrayList) ru3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList222 != null) {
                            }
                            if (r47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        } else {
                            chat = M05;
                            user2 = r12;
                            chat2 = user2;
                            str2 = "";
                            ((TextView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_text)).setText(str2);
                            if (chat2 == null) {
                            }
                            int L222 = hl.L(48.0f);
                            Bitmap createBitmap222 = Bitmap.createBitmap(L222, L222, Bitmap.Config.ARGB_8888);
                            createBitmap222.eraseColor(i8);
                            Canvas canvas222 = new Canvas(createBitmap222);
                            if (decodeFile2 != null) {
                            }
                            canvas222.setBitmap(null);
                            ((ImageView) viewGroupArr2[i9].findViewById(R.id.shortcut_widget_item_avatar)).setImageBitmap(createBitmap222);
                            ArrayList arrayList2222 = (ArrayList) ru3Var.getMessagesController().S.f(dialog2.id);
                            if (arrayList2222 != null) {
                            }
                            if (r47Var == null) {
                            }
                            if (dialog2.unread_count <= 0) {
                            }
                        }
                    }
                }
                i9++;
                viewGroupArr3 = viewGroupArr2;
                i4 = 2131745993;
                i5 = 2131745629;
                i8 = 0;
                r12 = 0;
                i6 = 8;
                i7 = 2;
                r15 = 1;
            }
            viewGroupArr = viewGroupArr3;
            viewGroupArr[i8].findViewById(R.id.shortcut_widget_item_divider).setVisibility(viewGroupArr[1].getVisibility());
            viewGroupArr[1].findViewById(R.id.shortcut_widget_item_divider).setVisibility(8);
        } else {
            viewGroupArr = viewGroupArr3;
            if (i3 == 1) {
                int i10 = 0;
                while (true) {
                    if (i10 >= 2) {
                        break;
                    }
                    int i11 = 0;
                    for (int i12 = 2; i11 < i12; i12 = 2) {
                        int i13 = (i10 << 1) + i11;
                        if (arrayList.isEmpty()) {
                            if (i13 < ru3Var.getMediaDataController().j1.size()) {
                                long j2 = ((TLRPC.TL_topPeer) ru3Var.getMediaDataController().j1.get(i13)).peer.user_id;
                                TLRPC.Dialog dialog4 = (TLRPC.Dialog) ru3Var.getMessagesController().R.f(j2);
                                if (dialog4 == null) {
                                    dialog4 = new TLRPC.TL_dialog();
                                    dialog4.id = j2;
                                }
                                dialog = dialog4;
                            }
                            dialog = null;
                        } else {
                            if (i13 < arrayList.size()) {
                                dialog = (TLRPC.Dialog) ru3Var.getMessagesController().R.f(((Long) arrayList.get(i13)).longValue());
                                if (dialog == null) {
                                    dialog = new TLRPC.TL_dialog();
                                    dialog.id = ((Long) arrayList.get(i13)).longValue();
                                }
                            }
                            dialog = null;
                        }
                        int i14 = R.id.contacts_widget_item2;
                        if (dialog == null) {
                            ViewGroup viewGroup = viewGroupArr[i10];
                            if (i11 == 0) {
                                i14 = R.id.contacts_widget_item1;
                            }
                            viewGroup.findViewById(i14).setVisibility(4);
                            if (i13 == 0 || i13 == 2) {
                                viewGroupArr[i10].setVisibility(8);
                            }
                            i = i10;
                        } else {
                            ViewGroup viewGroup2 = viewGroupArr[i10];
                            if (i11 == 0) {
                                i14 = R.id.contacts_widget_item1;
                            }
                            viewGroup2.findViewById(i14).setVisibility(0);
                            if (i13 == 0 || i13 == 2) {
                                viewGroupArr[i10].setVisibility(0);
                            }
                            if (wf3.D(dialog.id)) {
                                TLRPC.User X1 = ru3Var.getMessagesController().X1(Long.valueOf(dialog.id));
                                str = lbc.D(X1) ? ob6.M0(2131745629, null) : lbc.B(X1) ? ob6.M0(2131745993, null) : lbc.z(X1) ? ob6.M0(2131749082, null) : lbc.k(X1, true);
                                if (lbc.B(X1) || lbc.D(X1) || X1 == null || (userProfilePhoto = X1.photo) == null || (fileLocation2 = userProfilePhoto.photo_small) == null) {
                                    i = i10;
                                } else {
                                    i = i10;
                                    if (fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                        user = X1;
                                        fileLocation = fileLocation2;
                                        M0 = null;
                                    }
                                }
                                user = X1;
                                M0 = null;
                                fileLocation = null;
                            } else {
                                i = i10;
                                M0 = ru3Var.getMessagesController().M0(Long.valueOf(-dialog.id));
                                str = M0.title;
                                TLRPC.ChatPhoto chatPhoto2 = M0.photo;
                                if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                                    fileLocation = null;
                                }
                                user = null;
                            }
                            ((TextView) viewGroupArr[i].findViewById(i11 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2)).setText(str);
                            if (fileLocation != null) {
                                try {
                                    ru3Var.getFileLoader().getClass();
                                    decodeFile = BitmapFactory.decodeFile(xb4.J(fileLocation, null, true, true).toString());
                                } catch (Throwable th2) {
                                    i2 = 1;
                                    cc4.g(th2, true);
                                }
                            } else {
                                decodeFile = null;
                            }
                            int L3 = hl.L(48.0f);
                            Bitmap createBitmap3 = Bitmap.createBitmap(L3, L3, Bitmap.Config.ARGB_8888);
                            createBitmap3.eraseColor(0);
                            Canvas canvas3 = new Canvas(createBitmap3);
                            if (decodeFile == null) {
                                if (user != null) {
                                    rb0Var = new rb0(0, user);
                                    if (lbc.B(user)) {
                                        rb0Var.f(12);
                                    } else if (lbc.D(user)) {
                                        rb0Var.f(1);
                                    }
                                } else {
                                    rb0Var = new rb0(M0);
                                }
                                rb0Var.setBounds(0, 0, L3, L3);
                                rb0Var.draw(canvas3);
                            } else {
                                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                                BitmapShader bitmapShader2 = new BitmapShader(decodeFile, tileMode2, tileMode2);
                                float width2 = L3 / decodeFile.getWidth();
                                canvas3.save();
                                canvas3.scale(width2, width2);
                                this.f.setShader(bitmapShader2);
                                this.h.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                                canvas3.drawRoundRect(this.h, decodeFile.getWidth(), decodeFile.getHeight(), this.f);
                                canvas3.restore();
                            }
                            canvas3.setBitmap(null);
                            ((ImageView) viewGroupArr[i].findViewById(i11 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2)).setImageBitmap(createBitmap3);
                            i2 = 1;
                            int i15 = dialog.unread_count;
                            int i16 = R.id.contacts_widget_item_badge_bg2;
                            if (i15 > 0) {
                                if (i15 > 99) {
                                    Object[] objArr3 = new Object[i2];
                                    objArr3[0] = 99;
                                    format = String.format("%d+", objArr3);
                                } else {
                                    Object[] objArr4 = new Object[i2];
                                    objArr4[0] = Integer.valueOf(i15);
                                    format = String.format("%d", objArr4);
                                }
                                ((TextView) viewGroupArr[i].findViewById(i11 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2)).setText(format);
                                ViewGroup viewGroup3 = viewGroupArr[i];
                                if (i11 == 0) {
                                    i16 = R.id.contacts_widget_item_badge_bg1;
                                }
                                viewGroup3.findViewById(i16).setVisibility(0);
                            } else {
                                ViewGroup viewGroup4 = viewGroupArr[i];
                                if (i11 == 0) {
                                    i16 = R.id.contacts_widget_item_badge_bg1;
                                }
                                viewGroup4.findViewById(i16).setVisibility(8);
                            }
                        }
                        i11++;
                        i10 = i;
                    }
                    i10++;
                }
            }
        }
        int visibility = viewGroupArr[0].getVisibility();
        ImageView imageView = ru3Var.d;
        if (visibility == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xd0 xd0Var = this.a;
        if (xd0Var != null) {
            xd0Var.dispose();
            this.a = null;
        }
        xd0 xd0Var2 = this.b;
        if (xd0Var2 != null) {
            xd0Var2.dispose();
            this.b = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        wk5 wk5Var;
        xd0 xd0Var;
        wk5 wk5Var2;
        Drawable s0 = aob.s0();
        if (s0 != this.c && s0 != null) {
            if (aob.f1()) {
                this.d = this.c;
                this.b = this.a;
            } else {
                xd0 xd0Var2 = this.a;
                if (xd0Var2 != null) {
                    xd0Var2.dispose();
                    this.a = null;
                }
            }
            this.c = s0;
        }
        ru3 ru3Var = this.r;
        wk5Var = ((e) ru3Var).parentLayout;
        float themeAnimationValue = wk5Var.getThemeAnimationValue();
        int i = 0;
        while (i < 2) {
            Drawable drawable = i == 0 ? this.d : this.c;
            if (drawable != null) {
                if (i == 1 && this.d != null) {
                    wk5Var2 = ((e) ru3Var).parentLayout;
                    if (wk5Var2 != null) {
                        drawable.setAlpha((int) (255.0f * themeAnimationValue));
                        if (!(drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof hh7)) {
                            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                            if (drawable instanceof yd0) {
                                drawable.draw(canvas);
                            } else {
                                this.a = ((yd0) drawable).b(canvas, this);
                            }
                        } else if (drawable instanceof BitmapDrawable) {
                            if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                                canvas.save();
                                float f = 2.0f / hl.p;
                                canvas.scale(f, f);
                                drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                            } else {
                                int measuredHeight = getMeasuredHeight();
                                float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                                int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                                int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                                int i2 = (measuredHeight - ceil2) / 2;
                                canvas.save();
                                canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                                drawable.setBounds(measuredWidth, i2, ceil + measuredWidth, ceil2 + i2);
                            }
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                        if (i == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                            xd0Var = this.b;
                            if (xd0Var != null) {
                                xd0Var.dispose();
                                this.b = null;
                            }
                            this.d = null;
                            invalidate();
                        }
                    }
                }
                drawable.setAlpha(jn7.d4);
                if (drawable instanceof ColorDrawable) {
                }
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                if (drawable instanceof yd0) {
                }
                if (i == 0) {
                    xd0Var = this.b;
                    if (xd0Var != null) {
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable2 = this.e;
        drawable2.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable2.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(264.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z) {
    }
}
