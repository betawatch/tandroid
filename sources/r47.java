// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.URLSpan;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.utils.twidget.x;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class r47 {
    public static Pattern m3;
    public static Pattern n3;
    public static Pattern o3;
    public static final String[] p3 = {" vs. ", " vs ", " versus ", " ft. ", " ft ", " featuring ", " feat. ", " feat ", " presents ", " pres. ", " pres ", " and ", " & ", " . "};
    public static Pattern q3;
    public static CharSequence[] r3;
    public static SpannableStringBuilder s3;
    public static SpannableStringBuilder t3;
    public CharSequence A;
    public no6 A0;
    public boolean A1;
    public boolean A2;
    public SpannableString B;
    public boolean B0;
    public ArrayList B1;
    public ArrayList B2;
    public r47 C;
    public boolean C0;
    public String C1;
    public boolean C2;
    public int D;
    public String D0;
    public TLRPC.MessageMedia D1;
    public boolean D2;
    public long E;
    public boolean E0;
    public TLRPC.TL_document E1;
    public boolean E2;
    public long F;
    public StringBuilder F0;
    public ArrayList F1;
    public boolean F2;
    public String G;
    public boolean G0;
    public String G1;
    public boolean G2;
    public boolean H;
    public long H0;
    public final ggb H1;
    public boolean H2;
    public boolean I;
    public boolean I0;
    public BitmapDrawable I1;
    public boolean I2;
    public boolean J;
    public long J0;
    public Bitmap J1;
    public boolean J2;
    public boolean K;
    public HashSet K0;
    public final int K1;
    public boolean K2;
    public boolean L;
    public boolean L0;
    public final TLRPC.TL_channelAdminLogEvent L1;
    public boolean L2;
    public boolean M;
    public boolean M0;
    public boolean M1;
    public boolean M2;
    public boolean N;
    public boolean N0;
    public n47 N1;
    public boolean N2;
    public boolean O;
    public boolean O0;
    public boolean O1;
    public boolean O2;
    public boolean P;
    public boolean P0;
    public int P1;
    public boolean P2;
    public boolean Q;
    public boolean Q0;
    public int Q1;
    public boolean Q2;
    public boolean R;
    public byte[] R0;
    public int R1;
    public boolean R2;
    public byte S;
    public String S0;
    public boolean S1;
    public boolean S2;
    public long T;
    public String T0;
    public int T1;
    public Boolean T2;
    public int U;
    public boolean U0;
    public float U1;
    public boolean U2;
    public final int V;
    public TLRPC.Photo V0;
    public boolean V1;
    public Integer V2;
    public final String W;
    public String W0;
    public float W1;
    public Boolean W2;
    public final int X;
    public String X0;
    public boolean X1;
    public byte X2;
    public final String Y;
    public String Y0;
    public boolean Y1;
    public SpannableString Y2;
    public boolean Z;
    public TLRPC.PeerColor Z0;
    public StringBuilder Z1;
    public SpannableString Z2;
    public byte a;
    public boolean a0;
    public TLRPC.MessageMedia a1;
    public ArrayList a2;
    public Integer a3;
    public final String b;
    public float b0;
    public boolean b1;
    public boolean b2;
    public TLRPC.TL_webPage b3;
    public String c;
    public float c0;
    public boolean c1;
    public CharSequence c2;
    public boolean c3;
    public long d;
    public int d0;
    public boolean d1;
    public int d2;
    public Boolean d3;
    public long e;
    public long e0;
    public int e1;
    public jn5 e2;
    public ArrayList e3;
    public final boolean f;
    public long f0;
    public long f1;
    public jn5 f2;
    public TLRPC.Document f3;
    public final boolean g;
    public float g0;
    public TLRPC.TL_peerColorCollectible g1;
    public boolean g2;
    public jfc g3;
    public Boolean h;
    public float h0;
    public boolean h1;
    public TLRPC.Peer h2;
    public jfc h3;
    public final boolean i;
    public int i0;
    public boolean i1;
    public final Drawable[] i2;
    public jfc i3;
    public o5b j;
    public int j0;
    public TLRPC.TL_forumTopic j1;
    public final boolean j2;
    public boolean j3;
    public TLRPC.Message k;
    public double k0;
    public boolean k1;
    public final boolean k2;
    public Integer k3;
    public final TL_stories.StoryItem l;
    public boolean l0;
    public boolean l1;
    public boolean l2;
    public Float l3;
    public b6b m;
    public boolean m0;
    public int m1;
    public Drawable m2;
    public TLRPC.Document n;
    public TLObject n0;
    public boolean n1;
    public boolean n2;
    public Long o;
    public TLRPC.Photo o0;
    public boolean o1;
    public boolean o2;
    public boolean p;
    public ArrayList p0;
    public boolean p1;
    public final int p2;
    public boolean q;
    public ArrayList q0;
    public boolean q1;
    public ed q2;
    public boolean r;
    public oec r0;
    public boolean r1;
    public byte[] r2;
    public TLRPC.VideoSize s;
    public ArrayList s0;
    public boolean s1;
    public boolean s2;
    public boolean t;
    public boolean t0;
    public boolean t1;
    public Boolean t2;
    public String u;
    public boolean u0;
    public boolean u1;
    public int u2;
    public CharSequence v;
    public boolean v0;
    public boolean v1;
    public int v2;
    public CharSequence w;
    public long w0;
    public boolean w1;
    public boolean w2;
    public SpannableStringBuilder x;
    public int x0;
    public ArrayList x1;
    public float x2;
    public CharSequence y;
    public boolean y0;
    public CharSequence y1;
    public hl9 y2;
    public CharSequence z;
    public boolean z0;
    public ArrayList z1;
    public TL_iv.RichMessage z2;

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0468, code lost:
    
        if (r10.until_date != r15.until_date) goto L205;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x1cb0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x1cff  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x1d04  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x1d9b  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x04e1 A[LOOP:0: B:421:0x049f->B:435:0x04e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x04fa A[EDGE_INSN: B:436:0x04fa->B:437:0x04fa BREAK  A[LOOP:0: B:421:0x049f->B:435:0x04e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x1d90  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x1d01  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0cd4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r47(int i, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, TLRPC.Chat chat, int[] iArr, boolean z) {
        TLRPC.User user;
        String str;
        TLRPC.ChannelParticipant channelParticipant;
        TLRPC.ChannelParticipant channelParticipant2;
        TLRPC.Chat chat2;
        StringBuilder sb;
        SpannableString spannableString;
        SpannableString spannableString2;
        SpannableString spannableString3;
        boolean z2;
        SpannableString spannableString4;
        int i2;
        CharSequence D5;
        TLRPC.Message message;
        char c;
        String G;
        CharSequence D52;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        TLRPC.WebPage webPage;
        TLRPC.Message message2;
        ArrayList<TLRPC.MessageEntity> arrayList3;
        int i3;
        boolean z3;
        boolean z4;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo;
        TLRPC.Peer peer;
        String str2;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.User user2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        StringBuilder sb2;
        boolean z5;
        char c2;
        int i4;
        String G2;
        int i5;
        boolean z6;
        char c3;
        TLRPC.Message message3;
        TLRPC.Message message4;
        ArrayList arrayList4;
        String str3;
        int[] iArr2;
        int i6;
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.L1 = tL_channelAdminLogEvent2;
        this.K1 = i;
        TLRPC.User X1 = tL_channelAdminLogEvent2.user_id > 0 ? uc7.s1(i).X1(Long.valueOf(tL_channelAdminLogEvent2.user_id)) : null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(tL_channelAdminLogEvent2.date * 1000);
        int i7 = gregorianCalendar.get(6);
        int i8 = gregorianCalendar.get(1);
        int i9 = gregorianCalendar.get(2);
        this.W = String.format("%d_%02d_%02d", Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i7));
        this.X = (i7 * 100000) + (i9 * 1000) + i8;
        this.Y = String.format("%d_%02d", Integer.valueOf(i8), Integer.valueOf(i9));
        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
        tL_peerChannel.channel_id = chat.id;
        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent2.action;
        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTitle) {
            String str4 = ((TLRPC.TL_channelAdminLogEventActionChangeTitle) channelAdminLogEventAction).new_value;
            if (chat.megagroup) {
                this.v = D5(ob6.Y(2131750983, "EventLogEditedGroupTitle", str4), "un1", X1);
            } else {
                this.v = D5(ob6.Y(2131750988, "EventLogEditedChannelTitle", str4), "un1", X1);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePhoto) {
            TLRPC.TL_channelAdminLogEventActionChangePhoto tL_channelAdminLogEventActionChangePhoto = (TLRPC.TL_channelAdminLogEventActionChangePhoto) channelAdminLogEventAction;
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            this.k = tL_messageService;
            if (tL_channelAdminLogEventActionChangePhoto.new_photo instanceof TLRPC.TL_photoEmpty) {
                tL_messageService.action = new TLRPC.TL_messageActionChatDeletePhoto();
                if (chat.megagroup) {
                    this.v = D5(ob6.L0(2131750893), "un1", X1);
                } else {
                    this.v = D5(ob6.L0(2131750900), "un1", X1);
                }
            } else {
                tL_messageService.action = new TLRPC.TL_messageActionChatEditPhoto();
                this.k.action.photo = tL_channelAdminLogEventActionChangePhoto.new_photo;
                if (chat.megagroup) {
                    if (H4()) {
                        this.v = D5(ob6.L0(2131750982), "un1", X1);
                    } else {
                        this.v = D5(ob6.L0(2131750985), "un1", X1);
                    }
                } else if (H4()) {
                    this.v = D5(ob6.L0(2131750987), "un1", X1);
                } else {
                    this.v = D5(ob6.L0(2131750990), "un1", X1);
                }
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoin) {
            if (chat.megagroup) {
                this.v = D5(ob6.L0(2131750943), "un1", X1);
            } else {
                this.v = D5(ob6.L0(2131751011), "un1", X1);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantLeave) {
            TLRPC.TL_messageService tL_messageService2 = new TLRPC.TL_messageService();
            this.k = tL_messageService2;
            tL_messageService2.action = new TLRPC.TL_messageActionChatDeleteUser();
            this.k.action.user_id = tL_channelAdminLogEvent2.user_id;
            if (chat.megagroup) {
                this.v = D5(ob6.L0(2131750938), "un1", X1);
            } else {
                this.v = D5(ob6.L0(2131750939), "un1", X1);
            }
        } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantInvite) {
            TLRPC.TL_messageService tL_messageService3 = new TLRPC.TL_messageService();
            this.k = tL_messageService3;
            tL_messageService3.action = new TLRPC.TL_messageActionChatAddUser();
            long B1 = B1(((TLRPC.TL_channelAdminLogEventActionParticipantInvite) channelAdminLogEventAction).participant.peer);
            TLObject X12 = B1 > 0 ? uc7.s1(i).X1(Long.valueOf(B1)) : uc7.s1(i).M0(Long.valueOf(-B1));
            TLRPC.Peer peer2 = this.k.from_id;
            if (!(peer2 instanceof TLRPC.TL_peerUser) || B1 != peer2.user_id) {
                CharSequence D53 = D5(ob6.L0(2131751042), "un2", X12);
                this.v = D53;
                this.v = D5(D53, "un1", X1);
            } else if (chat.megagroup) {
                this.v = D5(ob6.L0(2131750943), "un1", X1);
            } else {
                this.v = D5(ob6.L0(2131751011), "un1", X1);
            }
        } else {
            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) {
                user = X1;
                str = "";
                TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin tL_channelAdminLogEventActionParticipantToggleAdmin = (TLRPC.TL_channelAdminLogEventActionParticipantToggleAdmin) channelAdminLogEventAction;
                channelParticipant = tL_channelAdminLogEventActionParticipantToggleAdmin.prev_participant;
                channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleAdmin.new_participant;
            } else {
                boolean z7 = channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantToggleBan;
                if (z7) {
                    TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                    if ((tL_channelAdminLogEventActionParticipantToggleBan.prev_participant instanceof TLRPC.TL_channelParticipantAdmin) && (tL_channelAdminLogEventActionParticipantToggleBan.new_participant instanceof TLRPC.TL_channelParticipant)) {
                        TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan2 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                        channelParticipant = tL_channelAdminLogEventActionParticipantToggleBan2.prev_participant;
                        channelParticipant2 = tL_channelAdminLogEventActionParticipantToggleBan2.new_participant;
                        user = X1;
                        str = "";
                    }
                }
                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) {
                    TLRPC.TL_channelAdminLogEventActionDefaultBannedRights tL_channelAdminLogEventActionDefaultBannedRights = (TLRPC.TL_channelAdminLogEventActionDefaultBannedRights) channelAdminLogEventAction;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    this.k = tL_message;
                    tL_message.realId = -1;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = tL_channelAdminLogEventActionDefaultBannedRights.prev_banned_rights;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = tL_channelAdminLogEventActionDefaultBannedRights.new_banned_rights;
                    StringBuilder sb3 = new StringBuilder(ob6.L0(2131751005));
                    tL_chatBannedRights2 = tL_chatBannedRights2 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights2;
                    tL_chatBannedRights3 = tL_chatBannedRights3 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights3;
                    if (tL_chatBannedRights2.send_messages != tL_chatBannedRights3.send_messages) {
                        sb3.append("\n\n");
                        qu6.t(sb3, !tL_chatBannedRights3.send_messages ? '+' : '-', ' ', 2131750882);
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (tL_chatBannedRights2.send_stickers == tL_chatBannedRights3.send_stickers && tL_chatBannedRights2.send_inline == tL_chatBannedRights3.send_inline && tL_chatBannedRights2.send_gifs == tL_chatBannedRights3.send_gifs && tL_chatBannedRights2.send_games == tL_chatBannedRights3.send_games) {
                        c3 = '\n';
                    } else {
                        c3 = '\n';
                        if (!z6) {
                            sb3.append('\n');
                            z6 = true;
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.send_stickers ? '+' : '-', ' ', 2131750879);
                    }
                    if (tL_chatBannedRights2.send_media != tL_chatBannedRights3.send_media) {
                        if (!z6) {
                            sb3.append(c3);
                            z6 = true;
                        }
                        sb3.append(c3);
                        qu6.t(sb3, !tL_chatBannedRights3.send_media ? '+' : '-', ' ', 2131750883);
                    }
                    if (tL_chatBannedRights2.send_polls != tL_chatBannedRights3.send_polls) {
                        if (!z6) {
                            sb3.append('\n');
                            z6 = true;
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.send_polls ? '+' : '-', ' ', 2131750881);
                    }
                    if (tL_chatBannedRights2.embed_links != tL_chatBannedRights3.embed_links) {
                        if (!z6) {
                            sb3.append('\n');
                            z6 = true;
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.embed_links ? '+' : '-', ' ', 2131750884);
                    }
                    if (tL_chatBannedRights2.change_info != tL_chatBannedRights3.change_info) {
                        if (!z6) {
                            sb3.append('\n');
                            z6 = true;
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.change_info ? '+' : '-', ' ', 2131750889);
                    }
                    if (tL_chatBannedRights2.invite_users != tL_chatBannedRights3.invite_users) {
                        if (!z6) {
                            sb3.append('\n');
                            z6 = true;
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.invite_users ? '+' : '-', ' ', 2131750887);
                    }
                    if (tL_chatBannedRights2.pin_messages != tL_chatBannedRights3.pin_messages) {
                        if (!z6) {
                            sb3.append('\n');
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.pin_messages ? '+' : '-', ' ', 2131750886);
                    }
                    if (tL_chatBannedRights2.edit_rank != tL_chatBannedRights3.edit_rank) {
                        if (!z6) {
                            sb3.append('\n');
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.edit_rank ? '+' : '-', ' ', 2131750888);
                    }
                    if (tL_chatBannedRights2.send_reactions != tL_chatBannedRights3.send_reactions) {
                        if (!z6) {
                            sb3.append('\n');
                        }
                        sb3.append('\n');
                        qu6.t(sb3, !tL_chatBannedRights3.send_reactions ? '+' : '-', ' ', 2131750880);
                    }
                    this.v = sb3.toString();
                } else {
                    if (z7) {
                        TLRPC.TL_channelAdminLogEventActionParticipantToggleBan tL_channelAdminLogEventActionParticipantToggleBan3 = (TLRPC.TL_channelAdminLogEventActionParticipantToggleBan) channelAdminLogEventAction;
                        TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                        this.k = tL_message2;
                        tL_message2.realId = -1;
                        long B12 = B1(tL_channelAdminLogEventActionParticipantToggleBan3.prev_participant.peer);
                        TLObject X13 = B12 > 0 ? uc7.s1(i).X1(Long.valueOf(B12)) : uc7.s1(i).M0(Long.valueOf(-B12));
                        TLRPC.TL_chatBannedRights tL_chatBannedRights4 = tL_channelAdminLogEventActionParticipantToggleBan3.prev_participant.banned_rights;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights5 = tL_channelAdminLogEventActionParticipantToggleBan3.new_participant.banned_rights;
                        if (chat.megagroup) {
                            if (tL_chatBannedRights5 != null && tL_chatBannedRights5.view_messages) {
                                if (tL_chatBannedRights4 != null) {
                                }
                            }
                            if (tL_chatBannedRights5 == null || hl.B1(tL_chatBannedRights5)) {
                                user2 = X1;
                                str = "";
                                tL_chatBannedRights = tL_chatBannedRights4;
                                sb2 = new StringBuilder(ob6.L0(2131743339));
                            } else {
                                sb2 = new StringBuilder();
                                int i10 = tL_chatBannedRights5.until_date - tL_channelAdminLogEvent2.date;
                                int i11 = ((i10 / 60) / 60) / 24;
                                int i12 = i10 - (i11 * 86400);
                                tL_chatBannedRights = tL_chatBannedRights4;
                                int i13 = (i12 / 60) / 60;
                                str = "";
                                int i14 = (i12 - (i13 * 3600)) / 60;
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    user2 = X1;
                                    if (i15 >= 3) {
                                        break;
                                    }
                                    if (i15 == 0) {
                                        if (i11 != 0) {
                                            G2 = ob6.G(i11, "Days", new Object[0]);
                                            i4 = i16 + 1;
                                            i5 = i4;
                                            if (G2 != null) {
                                                if (sb2.length() > 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(G2);
                                            }
                                            if (i5 == 2) {
                                                break;
                                            }
                                            i15++;
                                            i16 = i5;
                                            X1 = user2;
                                        }
                                        i5 = i16;
                                        G2 = null;
                                        if (G2 != null) {
                                        }
                                        if (i5 == 2) {
                                        }
                                    } else {
                                        if (i15 == 1) {
                                            if (i13 != 0) {
                                                G2 = ob6.G(i13, "Hours", new Object[0]);
                                                i4 = i16 + 1;
                                                i5 = i4;
                                                if (G2 != null) {
                                                }
                                                if (i5 == 2) {
                                                }
                                            }
                                        } else if (i14 != 0) {
                                            i4 = i16 + 1;
                                            G2 = ob6.G(i14, "Minutes", new Object[0]);
                                            i5 = i4;
                                            if (G2 != null) {
                                            }
                                            if (i5 == 2) {
                                            }
                                        }
                                        i5 = i16;
                                        G2 = null;
                                        if (G2 != null) {
                                        }
                                        if (i5 == 2) {
                                        }
                                    }
                                }
                            }
                            String L0 = ob6.L0(2131750878);
                            StringBuilder sb4 = new StringBuilder(String.format(L0, e2(X13, this.k.entities, L0.indexOf("%1$s")), sb2.toString()));
                            TLRPC.TL_chatBannedRights tL_chatBannedRights6 = tL_chatBannedRights == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights;
                            tL_chatBannedRights5 = tL_chatBannedRights5 == null ? new TLRPC.TL_chatBannedRights() : tL_chatBannedRights5;
                            if (tL_chatBannedRights6.view_messages != tL_chatBannedRights5.view_messages) {
                                sb4.append("\n\n");
                                qu6.t(sb4, !tL_chatBannedRights5.view_messages ? '+' : '-', ' ', 2131750885);
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (tL_chatBannedRights6.send_messages != tL_chatBannedRights5.send_messages) {
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.send_messages ? '+' : '-', ' ', 2131750882);
                            }
                            if (tL_chatBannedRights6.send_stickers == tL_chatBannedRights5.send_stickers && tL_chatBannedRights6.send_inline == tL_chatBannedRights5.send_inline && tL_chatBannedRights6.send_gifs == tL_chatBannedRights5.send_gifs && tL_chatBannedRights6.send_games == tL_chatBannedRights5.send_games) {
                                c2 = '\n';
                            } else {
                                c2 = '\n';
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.send_stickers ? '+' : '-', ' ', 2131750879);
                            }
                            if (tL_chatBannedRights6.send_media != tL_chatBannedRights5.send_media) {
                                if (!z5) {
                                    sb4.append(c2);
                                    z5 = true;
                                }
                                sb4.append(c2);
                                qu6.t(sb4, !tL_chatBannedRights5.send_media ? '+' : '-', ' ', 2131750883);
                            }
                            if (tL_chatBannedRights6.send_polls != tL_chatBannedRights5.send_polls) {
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.send_polls ? '+' : '-', ' ', 2131750881);
                            }
                            if (tL_chatBannedRights6.embed_links != tL_chatBannedRights5.embed_links) {
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.embed_links ? '+' : '-', ' ', 2131750884);
                            }
                            if (tL_chatBannedRights6.change_info != tL_chatBannedRights5.change_info) {
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.change_info ? '+' : '-', ' ', 2131750889);
                            }
                            if (tL_chatBannedRights6.invite_users != tL_chatBannedRights5.invite_users) {
                                if (!z5) {
                                    sb4.append('\n');
                                    z5 = true;
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.invite_users ? '+' : '-', ' ', 2131750887);
                            }
                            if (tL_chatBannedRights6.pin_messages != tL_chatBannedRights5.pin_messages) {
                                if (!z5) {
                                    sb4.append('\n');
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.pin_messages ? '+' : '-', ' ', 2131750886);
                            }
                            if (tL_chatBannedRights6.edit_rank != tL_chatBannedRights5.edit_rank) {
                                if (!z5) {
                                    sb4.append('\n');
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.edit_rank ? '+' : '-', ' ', 2131750888);
                            }
                            if (tL_chatBannedRights6.send_reactions != tL_chatBannedRights5.send_reactions) {
                                if (!z5) {
                                    sb4.append('\n');
                                }
                                sb4.append('\n');
                                qu6.t(sb4, !tL_chatBannedRights5.send_reactions ? '+' : '-', ' ', 2131750880);
                            }
                            this.v = sb4.toString();
                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                            chat2 = chat;
                            user = user2;
                        }
                        user2 = X1;
                        str = "";
                        String L02 = (tL_chatBannedRights5 == null || !(tL_chatBannedRights4 == null || tL_chatBannedRights5.view_messages)) ? ob6.L0(2131751009) : ob6.L0(2131751010);
                        this.v = String.format(L02, e2(X13, this.k.entities, L02.indexOf("%1$s")));
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        user = user2;
                    } else {
                        TLRPC.User user3 = X1;
                        str = "";
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionUpdatePinned) {
                            TLRPC.TL_channelAdminLogEventActionUpdatePinned tL_channelAdminLogEventActionUpdatePinned = (TLRPC.TL_channelAdminLogEventActionUpdatePinned) channelAdminLogEventAction;
                            message2 = tL_channelAdminLogEventActionUpdatePinned.message;
                            user = user3;
                            if (user3 != null && user.id == 136817688 && (messageFwdHeader = message2.fwd_from) != null && (messageFwdHeader.from_id instanceof TLRPC.TL_peerChannel)) {
                                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(tL_channelAdminLogEventActionUpdatePinned.message.fwd_from.from_id.channel_id));
                                TLRPC.Message message5 = tL_channelAdminLogEventActionUpdatePinned.message;
                                if ((message5 instanceof TLRPC.TL_messageEmpty) || !message5.pinned) {
                                    this.v = D5(ob6.L0(2131750855), "un1", M0);
                                } else {
                                    this.v = D5(ob6.L0(2131750933), "un1", M0);
                                }
                            } else if ((message2 instanceof TLRPC.TL_messageEmpty) || !message2.pinned) {
                                this.v = D5(ob6.L0(2131750855), "un1", user);
                            } else {
                                this.v = D5(ob6.L0(2131750933), "un1", user);
                            }
                        } else {
                            user = user3;
                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStopPoll) {
                                message2 = ((TLRPC.TL_channelAdminLogEventActionStopPoll) channelAdminLogEventAction).message;
                                if ((n1(message2) instanceof TLRPC.TL_messageMediaPoll) && ((TLRPC.TL_messageMediaPoll) n1(message2)).poll.quiz) {
                                    this.v = D5(ob6.L0(2131750872), "un1", user);
                                } else {
                                    this.v = D5(ob6.L0(2131750873), "un1", user);
                                }
                            } else {
                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatures) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatures) channelAdminLogEventAction).new_value) {
                                        this.v = D5(ob6.L0(2131750861), "un1", user);
                                    } else {
                                        this.v = D5(ob6.L0(2131750862), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantSubExtend) {
                                    this.v = D5(ob6.L0(2131750871), "un1", user);
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleSignatureProfiles) channelAdminLogEventAction).value) {
                                        this.v = D5(ob6.L0(2131750859), "un1", user);
                                    } else {
                                        this.v = D5(ob6.L0(2131750860), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleInvites) {
                                    if (((TLRPC.TL_channelAdminLogEventActionToggleInvites) channelAdminLogEventAction).new_value) {
                                        this.v = D5(ob6.L0(2131750863), "un1", user);
                                    } else {
                                        this.v = D5(ob6.L0(2131750864), "un1", user);
                                    }
                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                    message2 = ((TLRPC.TL_channelAdminLogEventActionDeleteMessage) channelAdminLogEventAction).message;
                                    if (user == null || user.id != uc7.s1(i).L3) {
                                        this.v = D5(ob6.L0(2131751003), "un1", user);
                                    } else {
                                        this.v = ob6.L0(2131751003).replace("un1", lbc.r(user));
                                    }
                                } else {
                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) {
                                        TLRPC.TL_channelAdminLogEventActionChangeLinkedChat tL_channelAdminLogEventActionChangeLinkedChat = (TLRPC.TL_channelAdminLogEventActionChangeLinkedChat) channelAdminLogEventAction;
                                        long j = tL_channelAdminLogEventActionChangeLinkedChat.new_value;
                                        long j2 = tL_channelAdminLogEventActionChangeLinkedChat.prev_value;
                                        chat2 = chat;
                                        if (chat2.megagroup) {
                                            if (j == 0) {
                                                TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(j2));
                                                CharSequence D54 = D5(ob6.L0(2131750897), "un1", user);
                                                this.v = D54;
                                                this.v = D5(D54, "un2", M02);
                                            } else {
                                                TLRPC.Chat M03 = uc7.s1(i).M0(Long.valueOf(j));
                                                CharSequence D55 = D5(ob6.L0(2131751022), "un1", user);
                                                this.v = D55;
                                                this.v = D5(D55, "un2", M03);
                                            }
                                        } else if (j == 0) {
                                            TLRPC.Chat M04 = uc7.s1(i).M0(Long.valueOf(j2));
                                            CharSequence D56 = D5(ob6.L0(2131750896), "un1", user);
                                            this.v = D56;
                                            this.v = D5(D56, "un2", M04);
                                        } else {
                                            TLRPC.Chat M05 = uc7.s1(i).M0(Long.valueOf(j));
                                            CharSequence D57 = D5(ob6.L0(2131751021), "un1", user);
                                            this.v = D57;
                                            this.v = D5(D57, "un2", M05);
                                        }
                                    } else {
                                        chat2 = chat;
                                        if (!(channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden)) {
                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAbout) {
                                                this.v = D5(ob6.L0(chat2.megagroup ? 2131750986 : 2131750991), "un1", user);
                                                message2 = new TLRPC.TL_message();
                                                message2.out = false;
                                                message2.unread = false;
                                                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                                message2.from_id = tL_peerUser;
                                                tL_peerUser.user_id = tL_channelAdminLogEvent.user_id;
                                                message2.peer_id = tL_peerChannel;
                                                message2.date = tL_channelAdminLogEvent.date;
                                                TLRPC.TL_channelAdminLogEventActionChangeAbout tL_channelAdminLogEventActionChangeAbout = (TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent.action;
                                                message2.message = tL_channelAdminLogEventActionChangeAbout.new_value;
                                                if (TextUtils.isEmpty(tL_channelAdminLogEventActionChangeAbout.prev_value)) {
                                                    str2 = str;
                                                    message2.media = new TLRPC.TL_messageMediaEmpty();
                                                } else {
                                                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                                                    message2.media = tL_messageMediaWebPage;
                                                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPage();
                                                    TLRPC.WebPage webPage2 = message2.media.webpage;
                                                    webPage2.flags = 10;
                                                    str2 = str;
                                                    webPage2.display_url = str2;
                                                    webPage2.url = str2;
                                                    webPage2.site_name = ob6.L0(2131750932);
                                                    message2.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeAbout) tL_channelAdminLogEvent.action).prev_value;
                                                }
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                str = str2;
                                            } else {
                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeTheme) {
                                                    this.v = D5(ob6.L0(chat2.megagroup ? 2131750984 : 2131750989), "un1", user);
                                                    message = new TLRPC.TL_message();
                                                    message.out = false;
                                                    message.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                                                    message.from_id = tL_peerUser2;
                                                    tL_peerUser2.user_id = tL_channelAdminLogEvent.user_id;
                                                    message.peer_id = tL_peerChannel;
                                                    message.date = tL_channelAdminLogEvent.date;
                                                    TLRPC.TL_channelAdminLogEventActionChangeTheme tL_channelAdminLogEventActionChangeTheme = (TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent.action;
                                                    message.message = tL_channelAdminLogEventActionChangeTheme.new_value;
                                                    if (TextUtils.isEmpty(tL_channelAdminLogEventActionChangeTheme.prev_value)) {
                                                        message.media = new TLRPC.TL_messageMediaEmpty();
                                                    } else {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = new TLRPC.TL_messageMediaWebPage();
                                                        message.media = tL_messageMediaWebPage2;
                                                        tL_messageMediaWebPage2.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage3 = message.media.webpage;
                                                        webPage3.flags = 10;
                                                        webPage3.display_url = str;
                                                        webPage3.url = str;
                                                        webPage3.site_name = ob6.L0(2131750931);
                                                        message.media.webpage.description = ((TLRPC.TL_channelAdminLogEventActionChangeTheme) tL_channelAdminLogEvent.action).prev_value;
                                                    }
                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsername) {
                                                    String str5 = ((TLRPC.TL_channelAdminLogEventActionChangeUsername) channelAdminLogEventAction).new_value;
                                                    boolean isEmpty = TextUtils.isEmpty(str5);
                                                    boolean z8 = chat2.megagroup;
                                                    if (isEmpty) {
                                                        this.v = D5(ob6.L0(z8 ? 2131750898 : 2131750901), "un1", user);
                                                    } else {
                                                        this.v = D5(ob6.L0(z8 ? 2131751023 : 2131751037), "un1", user);
                                                    }
                                                    TLRPC.Message tL_message3 = new TLRPC.TL_message();
                                                    tL_message3.out = false;
                                                    tL_message3.unread = false;
                                                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                                                    tL_message3.from_id = tL_peerUser3;
                                                    tL_peerUser3.user_id = tL_channelAdminLogEvent.user_id;
                                                    tL_message3.peer_id = tL_peerChannel;
                                                    tL_message3.date = tL_channelAdminLogEvent.date;
                                                    if (TextUtils.isEmpty(str5)) {
                                                        tL_message3.message = str;
                                                    } else {
                                                        tL_message3.message = qu6.o(uc7.s1(i).N2, "/", str5, new StringBuilder("https://"));
                                                    }
                                                    TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                                                    tL_messageEntityUrl.offset = 0;
                                                    tL_messageEntityUrl.length = tL_message3.message.length();
                                                    tL_message3.entities.add(tL_messageEntityUrl);
                                                    if (TextUtils.isEmpty(((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent.action).prev_value)) {
                                                        tL_message3.media = new TLRPC.TL_messageMediaEmpty();
                                                    } else {
                                                        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage3 = new TLRPC.TL_messageMediaWebPage();
                                                        tL_message3.media = tL_messageMediaWebPage3;
                                                        tL_messageMediaWebPage3.webpage = new TLRPC.TL_webPage();
                                                        TLRPC.WebPage webPage4 = tL_message3.media.webpage;
                                                        webPage4.flags = 10;
                                                        webPage4.display_url = str;
                                                        webPage4.url = str;
                                                        webPage4.site_name = ob6.L0(2131750930);
                                                        tL_message3.media.webpage.description = "https://" + uc7.s1(i).N2 + "/" + ((TLRPC.TL_channelAdminLogEventActionChangeUsername) tL_channelAdminLogEvent.action).prev_value;
                                                    }
                                                    str = str;
                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                    message2 = tL_message3;
                                                } else {
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditMessage) {
                                                        TLRPC.Message tL_message4 = new TLRPC.TL_message();
                                                        tL_message4.out = false;
                                                        tL_message4.unread = false;
                                                        tL_message4.peer_id = tL_peerChannel;
                                                        tL_message4.date = tL_channelAdminLogEvent.date;
                                                        TLRPC.TL_channelAdminLogEventActionEditMessage tL_channelAdminLogEventActionEditMessage = (TLRPC.TL_channelAdminLogEventActionEditMessage) tL_channelAdminLogEvent.action;
                                                        TLRPC.Message message6 = tL_channelAdminLogEventActionEditMessage.new_message;
                                                        TLRPC.Message message7 = tL_channelAdminLogEventActionEditMessage.prev_message;
                                                        if (message7 != null) {
                                                            tL_message4.reply_to = message7.reply_to;
                                                            tL_message4.id = message7.id;
                                                        } else if (message6 != null) {
                                                            tL_message4.reply_to = message6.reply_to;
                                                            tL_message4.id = message6.id;
                                                        }
                                                        if (message6 == null || (peer = message6.from_id) == null) {
                                                            TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                                                            tL_message4.from_id = tL_peerUser4;
                                                            tL_peerUser4.user_id = tL_channelAdminLogEvent.user_id;
                                                        } else {
                                                            tL_message4.from_id = peer;
                                                        }
                                                        if (n1(message6) == null || (n1(message6) instanceof TLRPC.TL_messageMediaEmpty) || (n1(message6) instanceof TLRPC.TL_messageMediaWebPage)) {
                                                            this.v = D5(ob6.L0(2131750979), "un1", user);
                                                            if (message6.action instanceof TLRPC.TL_messageActionGroupCall) {
                                                                message6.media = new TLRPC.TL_messageMediaEmpty();
                                                                tL_message4 = message6;
                                                            } else {
                                                                tL_message4.message = message6.message;
                                                                tL_message4.entities = message6.entities;
                                                                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage4 = new TLRPC.TL_messageMediaWebPage();
                                                                tL_message4.media = tL_messageMediaWebPage4;
                                                                tL_messageMediaWebPage4.webpage = new TLRPC.TL_webPage();
                                                                tL_message4.media.webpage.site_name = ob6.L0(2131750935);
                                                                boolean isEmpty2 = TextUtils.isEmpty(message7.message);
                                                                TLRPC.MessageMedia messageMedia2 = tL_message4.media;
                                                                if (isEmpty2) {
                                                                    messageMedia2.webpage.description = ob6.L0(2131750936);
                                                                } else {
                                                                    messageMedia2.webpage.description = message7.message;
                                                                    arrayList2 = message7.entities;
                                                                    tL_message4.reply_markup = message6.reply_markup;
                                                                    webPage = tL_message4.media.webpage;
                                                                    if (webPage != null) {
                                                                        webPage.flags = 10;
                                                                        webPage.display_url = str;
                                                                        webPage.url = str;
                                                                    }
                                                                    str = str;
                                                                    message2 = tL_message4;
                                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                    arrayList3 = arrayList2;
                                                                }
                                                            }
                                                            arrayList2 = null;
                                                            tL_message4.reply_markup = message6.reply_markup;
                                                            webPage = tL_message4.media.webpage;
                                                            if (webPage != null) {
                                                            }
                                                            str = str;
                                                            message2 = tL_message4;
                                                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                            arrayList3 = arrayList2;
                                                        } else {
                                                            boolean equals = TextUtils.equals(message6.message, message7.message);
                                                            TLRPC.MessageMedia n1 = n1(message6);
                                                            TLRPC.MessageMedia n12 = n1(message7);
                                                            if (n12 == null) {
                                                                i3 = 2131750936;
                                                                z3 = false;
                                                                z4 = true;
                                                            } else {
                                                                if (n1.getClass() == n12.getClass()) {
                                                                    TLRPC.Photo photo2 = n1.photo;
                                                                    if (photo2 == null || (photo = n12.photo) == null) {
                                                                        i3 = 2131750936;
                                                                        messageMedia = n1;
                                                                    } else {
                                                                        i3 = 2131750936;
                                                                        messageMedia = photo2.id == photo.id ? n1 : messageMedia;
                                                                    }
                                                                    if (messageMedia.document == null || n12.document == null || n1(message6).document.id == n12.document.id) {
                                                                        z3 = false;
                                                                        z4 = false;
                                                                    }
                                                                } else {
                                                                    i3 = 2131750936;
                                                                }
                                                                z3 = true;
                                                                z4 = false;
                                                            }
                                                            if (z4) {
                                                                this.v = D5(ob6.L0(2131751041), "un1", user);
                                                            } else if (z3 && !equals) {
                                                                this.v = D5(ob6.L0(2131750980), "un1", user);
                                                            } else if (equals) {
                                                                this.v = D5(ob6.L0(2131750981), "un1", user);
                                                            } else {
                                                                this.v = D5(ob6.L0(2131750992), "un1", user);
                                                            }
                                                            TLRPC.MessageMedia n13 = n1(message6);
                                                            tL_message4.media = n13;
                                                            if (!equals) {
                                                                n13.webpage = new TLRPC.TL_webPage();
                                                                tL_message4.media.webpage.site_name = ob6.L0(2131750937);
                                                                boolean isEmpty3 = TextUtils.isEmpty(message7.message);
                                                                TLRPC.MessageMedia messageMedia3 = tL_message4.media;
                                                                if (isEmpty3) {
                                                                    messageMedia3.webpage.description = ob6.L0(i3);
                                                                } else {
                                                                    messageMedia3.webpage.description = message7.message;
                                                                    arrayList2 = message7.entities;
                                                                    tL_message4.reply_markup = message6.reply_markup;
                                                                    webPage = tL_message4.media.webpage;
                                                                    if (webPage != null) {
                                                                    }
                                                                    str = str;
                                                                    message2 = tL_message4;
                                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                    arrayList3 = arrayList2;
                                                                }
                                                            }
                                                            arrayList2 = null;
                                                            tL_message4.reply_markup = message6.reply_markup;
                                                            webPage = tL_message4.media.webpage;
                                                            if (webPage != null) {
                                                            }
                                                            str = str;
                                                            message2 = tL_message4;
                                                            tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                            arrayList3 = arrayList2;
                                                        }
                                                        message3 = this.k;
                                                        if (message3 == null) {
                                                            message3 = new TLRPC.TL_messageService();
                                                            this.k = message3;
                                                        }
                                                        message3.message = this.v.toString();
                                                        this.k.from_id = new TLRPC.TL_peerUser();
                                                        TLRPC.Message message8 = this.k;
                                                        message8.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                                        message8.date = tL_channelAdminLogEvent2.date;
                                                        int i17 = iArr[0];
                                                        iArr[0] = i17 + 1;
                                                        message8.id = i17;
                                                        this.T = tL_channelAdminLogEvent2.id;
                                                        message8.out = false;
                                                        message8.peer_id = new TLRPC.TL_peerChannel();
                                                        TLRPC.Message message9 = this.k;
                                                        message9.peer_id.channel_id = chat2.id;
                                                        message9.unread = false;
                                                        MediaController z9 = MediaController.z();
                                                        this.W2 = null;
                                                        message4 = !(message2 instanceof TLRPC.TL_messageEmpty) ? null : message2;
                                                        if (message4 == null) {
                                                            message4.out = false;
                                                            message4.realId = message4.id;
                                                            int i18 = iArr[0];
                                                            iArr[0] = i18 + 1;
                                                            message4.id = i18;
                                                            message4.flags &= -32769;
                                                            message4.dialog_id = -chat2.id;
                                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                                i6 = message4.date;
                                                                message4.date = tL_channelAdminLogEvent2.date;
                                                            } else {
                                                                i6 = 0;
                                                            }
                                                            r47 r47Var = new r47(this.K1, message4, (AbstractMap) null, (AbstractMap) null, true, true, this.T);
                                                            r47Var.V = i6;
                                                            r47Var.L1 = tL_channelAdminLogEvent2;
                                                            if (r47Var.U >= 0) {
                                                                if (z9.H(r47Var)) {
                                                                    r47 r47Var2 = z9.v0;
                                                                    r47Var.b0 = r47Var2.b0;
                                                                    r47Var.i0 = r47Var2.i0;
                                                                }
                                                                arrayList4 = arrayList;
                                                                str3 = str;
                                                                O(this.K1, tL_channelAdminLogEvent2, arrayList4, hashMap, z);
                                                                if (z) {
                                                                    arrayList4.add(0, r47Var);
                                                                } else {
                                                                    arrayList4.add(arrayList4.size() - 1, r47Var);
                                                                }
                                                            } else {
                                                                arrayList4 = arrayList;
                                                                str3 = str;
                                                                this.U = -1;
                                                            }
                                                            if (arrayList3 != null) {
                                                                r47Var.B1 = arrayList3;
                                                                iArr2 = null;
                                                                r47Var.y = null;
                                                                r47Var.o0();
                                                                if ((tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) || this.U < 0) {
                                                                    return;
                                                                }
                                                                O(this.K1, tL_channelAdminLogEvent2, arrayList4, hashMap, z);
                                                                if (z) {
                                                                    arrayList4.add(0, this);
                                                                } else {
                                                                    arrayList4.add(arrayList4.size() - 1, this);
                                                                }
                                                                if (this.v == null) {
                                                                    this.v = str3;
                                                                }
                                                                TextPaint textPaint = n1(this.k) instanceof TLRPC.TL_messageMediaGame ? aob.x2 : aob.o2;
                                                                int[] iArr3 = i() ? new int[1] : iArr2;
                                                                CharSequence m = pv3.m(this.v, textPaint.getFontMetricsInt(), false, iArr3, 0);
                                                                this.v = m;
                                                                Spannable z52 = z5(m, textPaint.getFontMetricsInt());
                                                                this.v = z52;
                                                                if (iArr3 != null && iArr3[0] > 1) {
                                                                    C5(z52, iArr3);
                                                                }
                                                                H(iArr3);
                                                                K5();
                                                                h5();
                                                                k0();
                                                                if (z9.H(this)) {
                                                                    r47 r47Var3 = z9.v0;
                                                                    this.b0 = r47Var3.b0;
                                                                    this.i0 = r47Var3.i0;
                                                                }
                                                                n0(user);
                                                                this.S1 = true;
                                                                r0(false);
                                                                J();
                                                                return;
                                                            }
                                                        } else {
                                                            arrayList4 = arrayList;
                                                            str3 = str;
                                                        }
                                                        iArr2 = null;
                                                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                                            return;
                                                        } else {
                                                            return;
                                                        }
                                                    }
                                                    if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet = ((TLRPC.TL_channelAdminLogEventActionChangeEmojiStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet == null || (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.v = D5(ob6.L0(2131750899), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131751032), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeStickerSet) {
                                                        TLRPC.InputStickerSet inputStickerSet2 = ((TLRPC.TL_channelAdminLogEventActionChangeStickerSet) channelAdminLogEventAction).new_stickerset;
                                                        if (inputStickerSet2 == null || (inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                                                            this.v = D5(ob6.L0(2131750894), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131751014), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeLocation) {
                                                        TLRPC.ChannelLocation channelLocation = ((TLRPC.TL_channelAdminLogEventActionChangeLocation) channelAdminLogEventAction).new_value;
                                                        if (channelLocation instanceof TLRPC.TL_channelLocationEmpty) {
                                                            this.v = D5(ob6.L0(2131750895), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.Y(2131751020, "EventLogChangedLocation", ((TLRPC.TL_channelLocation) channelLocation).address), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleSlowMode) {
                                                        int i19 = ((TLRPC.TL_channelAdminLogEventActionToggleSlowMode) channelAdminLogEventAction).new_value;
                                                        if (i19 == 0) {
                                                            this.v = D5(ob6.L0(2131750858), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.Z(2131750857, i19 < 60 ? ob6.G(i19, "Seconds", new Object[0]) : i19 < 3600 ? ob6.G(i19 / 60, "Minutes", new Object[0]) : ob6.G((i19 / 60) / 60, "Hours", new Object[0])), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) {
                                                        this.v = D5(ob6.L0(((TLRPC.TL_channelAdminLogEventActionToggleAutotranslation) channelAdminLogEventAction).new_value ? 2131750867 : 2131750868), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionStartGroupCall) {
                                                        if (!xc2.T(chat2) || (chat2.megagroup && !chat2.gigagroup)) {
                                                            this.v = D5(ob6.L0(2131750874), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131750875), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDiscardGroupCall) {
                                                        if (!xc2.T(chat2) || (chat2.megagroup && !chat2.gigagroup)) {
                                                            this.v = D5(ob6.L0(2131750973), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131750974), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantMute) {
                                                        long B13 = B1(((TLRPC.TL_channelAdminLogEventActionParticipantMute) channelAdminLogEventAction).participant.peer);
                                                        TLObject X14 = B13 > 0 ? uc7.s1(i).X1(Long.valueOf(B13)) : uc7.s1(i).M0(Long.valueOf(-B13));
                                                        CharSequence D58 = D5(ob6.L0(2131750853), "un1", user);
                                                        this.v = D58;
                                                        this.v = D5(D58, "un2", X14);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantUnmute) {
                                                        long B14 = B1(((TLRPC.TL_channelAdminLogEventActionParticipantUnmute) channelAdminLogEventAction).participant.peer);
                                                        TLObject X15 = B14 > 0 ? uc7.s1(i).X1(Long.valueOf(B14)) : uc7.s1(i).M0(Long.valueOf(-B14));
                                                        CharSequence D59 = D5(ob6.L0(2131750851), "un1", user);
                                                        this.v = D59;
                                                        this.v = D5(D59, "un2", X15);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) {
                                                        if (((TLRPC.TL_channelAdminLogEventActionToggleGroupCallSetting) channelAdminLogEventAction).join_muted) {
                                                            this.v = D5(ob6.L0(2131750852), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131750854), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite tL_channelAdminLogEventActionParticipantJoinByInvite = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByInvite) channelAdminLogEventAction;
                                                        if (tL_channelAdminLogEventActionParticipantJoinByInvite.via_chatlist) {
                                                            this.v = D5(ob6.L0(xc2.V(chat2) ? 2131754607 : 2131754605), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(xc2.V(chat2) ? 2131754608 : 2131754606), "un1", user);
                                                        }
                                                        TLRPC.TL_chatInviteExported tL_chatInviteExported = tL_channelAdminLogEventActionParticipantJoinByInvite.invite;
                                                        if (tL_chatInviteExported != null && !TextUtils.isEmpty(tL_chatInviteExported.link)) {
                                                            this.v = TextUtils.concat(this.v, " ", tL_channelAdminLogEventActionParticipantJoinByInvite.invite.link);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleNoForwards) {
                                                        TLRPC.TL_channelAdminLogEventActionToggleNoForwards tL_channelAdminLogEventActionToggleNoForwards = (TLRPC.TL_channelAdminLogEventActionToggleNoForwards) channelAdminLogEventAction;
                                                        boolean z10 = xc2.T(chat2) && !chat2.megagroup;
                                                        if (tL_channelAdminLogEventActionToggleNoForwards.new_value) {
                                                            if (z10) {
                                                                this.v = D5(ob6.L0(2131754642), "un1", user);
                                                            } else {
                                                                this.v = D5(ob6.L0(2131754641), "un1", user);
                                                            }
                                                        } else if (z10) {
                                                            this.v = D5(ob6.L0(2131754644), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131754643), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) {
                                                        CharSequence D510 = D5(ob6.Z(2131754647, new Object[0]), "un1", user);
                                                        this.v = D510;
                                                        this.v = D5(D510, "un2", ((TLRPC.TL_channelAdminLogEventActionExportedInviteDelete) channelAdminLogEventAction).invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) {
                                                        TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke tL_channelAdminLogEventActionExportedInviteRevoke = (TLRPC.TL_channelAdminLogEventActionExportedInviteRevoke) channelAdminLogEventAction;
                                                        CharSequence D511 = D5(ob6.Z(2131754561, tL_channelAdminLogEventActionExportedInviteRevoke.invite.link), "un1", user);
                                                        this.v = D511;
                                                        this.v = D5(D511, "un2", tL_channelAdminLogEventActionExportedInviteRevoke.invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) {
                                                        TLRPC.TL_channelAdminLogEventActionExportedInviteEdit tL_channelAdminLogEventActionExportedInviteEdit = (TLRPC.TL_channelAdminLogEventActionExportedInviteEdit) channelAdminLogEventAction;
                                                        String str6 = tL_channelAdminLogEventActionExportedInviteEdit.prev_invite.link;
                                                        if (str6 == null || !str6.equals(tL_channelAdminLogEventActionExportedInviteEdit.new_invite.link)) {
                                                            D52 = D5(ob6.Z(2131754646, new Object[0]), "un1", user);
                                                            this.v = D52;
                                                        } else {
                                                            D52 = D5(ob6.Z(2131754645, new Object[0]), "un1", user);
                                                            this.v = D52;
                                                        }
                                                        CharSequence D512 = D5(D52, "un2", tL_channelAdminLogEventActionExportedInviteEdit.prev_invite);
                                                        this.v = D512;
                                                        this.v = D5(D512, "un3", tL_channelAdminLogEventActionExportedInviteEdit.new_invite);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantVolume) {
                                                        long B15 = B1(((TLRPC.TL_channelAdminLogEventActionParticipantVolume) channelAdminLogEventAction).participant.peer);
                                                        TLObject X16 = B15 > 0 ? uc7.s1(i).X1(Long.valueOf(B15)) : uc7.s1(i).M0(Long.valueOf(-B15));
                                                        double H = xc2.H(r10.participant) / 100.0d;
                                                        CharSequence D513 = D5(ob6.Y(2131754494, "ActionVolumeChanged", Integer.valueOf((int) (H > 0.0d ? Math.max(H, 1.0d) : 0.0d))), "un1", user);
                                                        this.v = D513;
                                                        this.v = D5(D513, "un2", X16);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) {
                                                        boolean z11 = chat2.megagroup;
                                                        int i20 = ((TLRPC.TL_channelAdminLogEventActionChangeHistoryTTL) channelAdminLogEventAction).new_value;
                                                        if (z11) {
                                                            if (i20 == 0) {
                                                                this.v = D5(ob6.L0(2131754531), "un1", user);
                                                            } else {
                                                                if (i20 > 86400) {
                                                                    c = 0;
                                                                    G = ob6.G(i20 / 86400, "Days", new Object[0]);
                                                                } else {
                                                                    c = 0;
                                                                    G = i20 >= 3600 ? ob6.G(i20 / 3600, "Hours", new Object[0]) : i20 >= 60 ? ob6.G(i20 / 60, "Minutes", new Object[0]) : ob6.G(i20, "Seconds", new Object[0]);
                                                                }
                                                                Object[] objArr = new Object[1];
                                                                objArr[c] = G;
                                                                this.v = D5(ob6.Z(2131754534, objArr), "un1", user);
                                                            }
                                                        } else if (i20 != 0) {
                                                            this.v = ob6.Y(2131754533, "ActionTTLChannelChanged", ob6.c0(i20));
                                                        } else {
                                                            this.v = ob6.L0(2131754532);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest tL_channelAdminLogEventActionParticipantJoinByRequest = (TLRPC.TL_channelAdminLogEventActionParticipantJoinByRequest) channelAdminLogEventAction;
                                                        TLRPC.ExportedChatInvite exportedChatInvite = tL_channelAdminLogEventActionParticipantJoinByRequest.invite;
                                                        if (((exportedChatInvite instanceof TLRPC.TL_chatInviteExported) && "https://t.me/+PublicChat".equals(((TLRPC.TL_chatInviteExported) exportedChatInvite).link)) || (tL_channelAdminLogEventActionParticipantJoinByRequest.invite instanceof TLRPC.TL_chatInvitePublicJoinRequests)) {
                                                            CharSequence D514 = D5(ob6.L0(2131748821), "un1", user);
                                                            this.v = D514;
                                                            this.v = D5(D514, "un2", uc7.s1(i).X1(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                        } else {
                                                            CharSequence D515 = D5(ob6.L0(2131748822), "un1", user);
                                                            this.v = D515;
                                                            CharSequence D516 = D5(D515, "un2", tL_channelAdminLogEventActionParticipantJoinByRequest.invite);
                                                            this.v = D516;
                                                            this.v = D5(D516, "un3", uc7.s1(i).X1(Long.valueOf(tL_channelAdminLogEventActionParticipantJoinByRequest.approved_by)));
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionSendMessage) {
                                                        message = ((TLRPC.TL_channelAdminLogEventActionSendMessage) channelAdminLogEventAction).message;
                                                        this.v = D5(ob6.L0(2131750876), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionParticipantEditRank) {
                                                        TLRPC.TL_channelAdminLogEventActionParticipantEditRank tL_channelAdminLogEventActionParticipantEditRank = (TLRPC.TL_channelAdminLogEventActionParticipantEditRank) channelAdminLogEventAction;
                                                        if (tL_channelAdminLogEventActionParticipantEditRank.user_id != tL_channelAdminLogEvent.user_id) {
                                                            TLRPC.User X17 = uc7.s1(i).X1(Long.valueOf(tL_channelAdminLogEventActionParticipantEditRank.user_id));
                                                            if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z = ob6.Z(2131750906, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z;
                                                                CharSequence D517 = D5(Z, "un1", user);
                                                                this.v = D517;
                                                                this.v = D5(D517, "un2", X17);
                                                            } else if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) || TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                                String Z2 = ob6.Z(2131750905, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                                this.v = Z2;
                                                                CharSequence D518 = D5(Z2, "un1", user);
                                                                this.v = D518;
                                                                this.v = D5(D518, "un2", X17);
                                                            } else {
                                                                String Z3 = ob6.Z(2131750907, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                                this.v = Z3;
                                                                CharSequence D519 = D5(Z3, "un1", user);
                                                                this.v = D519;
                                                                this.v = D5(D519, "un2", X17);
                                                            }
                                                        } else if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) && !TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                            String Z4 = ob6.Z(2131750903, tL_channelAdminLogEventActionParticipantEditRank.prev_rank, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                            this.v = Z4;
                                                            this.v = D5(Z4, "un1", user);
                                                        } else if (!TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.prev_rank) || TextUtils.isEmpty(tL_channelAdminLogEventActionParticipantEditRank.new_rank)) {
                                                            String Z5 = ob6.Z(2131750902, tL_channelAdminLogEventActionParticipantEditRank.prev_rank);
                                                            this.v = Z5;
                                                            this.v = D5(Z5, "un1", user);
                                                        } else {
                                                            String Z6 = ob6.Z(2131750904, tL_channelAdminLogEventActionParticipantEditRank.new_rank);
                                                            this.v = Z6;
                                                            this.v = D5(Z6, "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) {
                                                        TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions tL_channelAdminLogEventActionChangeAvailableReactions = (TLRPC.TL_channelAdminLogEventActionChangeAvailableReactions) channelAdminLogEventAction;
                                                        boolean z12 = (tL_channelAdminLogEventActionChangeAvailableReactions.prev_value instanceof TLRPC.TL_chatReactionsSome) && (tL_channelAdminLogEventActionChangeAvailableReactions.new_value instanceof TLRPC.TL_chatReactionsSome);
                                                        CharSequence X18 = X1(tL_channelAdminLogEventActionChangeAvailableReactions.new_value);
                                                        if (z12) {
                                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(D5(ob6.Z(2131754574, "**new**"), "un1", user));
                                                            int indexOf = spannableStringBuilder.toString().indexOf("**new**");
                                                            if (indexOf > 0) {
                                                                spannableStringBuilder.replace(indexOf, indexOf + 7, X18);
                                                            }
                                                            this.v = spannableStringBuilder;
                                                        } else {
                                                            CharSequence X19 = X1(tL_channelAdminLogEventActionChangeAvailableReactions.prev_value);
                                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(D5(ob6.Z(2131754575, "**old**", "**new**"), "un1", user));
                                                            int indexOf2 = spannableStringBuilder2.toString().indexOf("**old**");
                                                            if (indexOf2 > 0) {
                                                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 7, X19);
                                                            }
                                                            int indexOf3 = spannableStringBuilder2.toString().indexOf("**new**");
                                                            if (indexOf3 > 0) {
                                                                spannableStringBuilder2.replace(indexOf3, indexOf3 + 7, X18);
                                                            }
                                                            this.v = spannableStringBuilder2;
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeUsernames) {
                                                        TLRPC.TL_channelAdminLogEventActionChangeUsernames tL_channelAdminLogEventActionChangeUsernames = (TLRPC.TL_channelAdminLogEventActionChangeUsernames) channelAdminLogEventAction;
                                                        ArrayList<String> arrayList5 = tL_channelAdminLogEventActionChangeUsernames.prev_value;
                                                        ArrayList<String> arrayList6 = tL_channelAdminLogEventActionChangeUsernames.new_value;
                                                        this.v = null;
                                                        if (arrayList5 != null && arrayList6 != null) {
                                                            if (arrayList6.size() + 1 == arrayList5.size()) {
                                                                int i21 = 0;
                                                                String str7 = null;
                                                                while (true) {
                                                                    if (i21 >= arrayList5.size()) {
                                                                        break;
                                                                    }
                                                                    String str8 = arrayList5.get(i21);
                                                                    if (!arrayList6.contains(str8)) {
                                                                        if (str7 != null) {
                                                                            str7 = null;
                                                                            break;
                                                                        }
                                                                        str7 = str8;
                                                                    }
                                                                    i21++;
                                                                }
                                                                if (str7 != null) {
                                                                    this.v = D5(ob6.Y(2131751006, "EventLogDeactivatedUsername", "@".concat(str7)), "un1", user);
                                                                }
                                                            } else if (arrayList5.size() + 1 == arrayList6.size()) {
                                                                int i22 = 0;
                                                                String str9 = null;
                                                                while (true) {
                                                                    if (i22 >= arrayList6.size()) {
                                                                        break;
                                                                    }
                                                                    String str10 = arrayList6.get(i22);
                                                                    if (!arrayList5.contains(str10)) {
                                                                        if (str9 != null) {
                                                                            str9 = null;
                                                                            break;
                                                                        }
                                                                        str9 = str10;
                                                                    }
                                                                    i22++;
                                                                }
                                                                if (str9 != null) {
                                                                    this.v = D5(ob6.Y(2131751043, "EventLogActivatedUsername", "@".concat(str9)), "un1", user);
                                                                }
                                                            }
                                                        }
                                                        if (this.v == null) {
                                                            this.v = D5(ob6.Y(2131751038, "EventLogChangeUsernames", f2(arrayList5), f2(arrayList6)), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleForum) {
                                                        if (((TLRPC.TL_channelAdminLogEventActionToggleForum) channelAdminLogEventAction).new_value) {
                                                            this.v = D5(ob6.Y(2131750870, "EventLogSwitchToForum", new Object[0]), "un1", user);
                                                        } else {
                                                            this.v = D5(ob6.Y(2131750869, "EventLogSwitchToGroup", new Object[0]), "un1", user);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionCreateTopic) {
                                                        CharSequence D520 = D5(ob6.Y(2131751007, "EventLogCreateTopic", new Object[0]), "un1", user);
                                                        this.v = D520;
                                                        this.v = D5(D520, "un2", ((TLRPC.TL_channelAdminLogEventActionCreateTopic) channelAdminLogEventAction).topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionEditTopic) {
                                                        TLRPC.TL_channelAdminLogEventActionEditTopic tL_channelAdminLogEventActionEditTopic = (TLRPC.TL_channelAdminLogEventActionEditTopic) channelAdminLogEventAction;
                                                        TLRPC.ForumTopic forumTopic = tL_channelAdminLogEventActionEditTopic.prev_topic;
                                                        boolean z13 = forumTopic instanceof TLRPC.TL_forumTopic;
                                                        if (z13) {
                                                            TLRPC.ForumTopic forumTopic2 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                            if (forumTopic2 instanceof TLRPC.TL_forumTopic) {
                                                                boolean z14 = ((TLRPC.TL_forumTopic) forumTopic).hidden;
                                                                boolean z15 = ((TLRPC.TL_forumTopic) forumTopic2).hidden;
                                                                if (z14 != z15) {
                                                                    this.v = D5(ob6.L0(z15 ? 2131743674 : 2131743660), "%s", user);
                                                                }
                                                            }
                                                        }
                                                        if (z13) {
                                                            TLRPC.ForumTopic forumTopic3 = tL_channelAdminLogEventActionEditTopic.new_topic;
                                                            if (forumTopic3 instanceof TLRPC.TL_forumTopic) {
                                                                boolean z16 = ((TLRPC.TL_forumTopic) forumTopic).closed;
                                                                boolean z17 = ((TLRPC.TL_forumTopic) forumTopic3).closed;
                                                                if (z16 != z17) {
                                                                    if (z17) {
                                                                        D5 = D5(ob6.L0(2131751008), "%s", user);
                                                                        this.v = D5;
                                                                    } else {
                                                                        D5 = D5(ob6.L0(2131750890), "%s", user);
                                                                        this.v = D5;
                                                                    }
                                                                    this.v = D5(D5, "un2", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                                }
                                                            }
                                                        }
                                                        CharSequence D521 = D5(ob6.L0(2131750993), "un1", user);
                                                        this.v = D521;
                                                        CharSequence D522 = D5(D521, "un2", tL_channelAdminLogEventActionEditTopic.prev_topic);
                                                        this.v = D522;
                                                        this.v = D5(D522, "un3", tL_channelAdminLogEventActionEditTopic.new_topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionDeleteTopic) {
                                                        CharSequence D523 = D5(ob6.L0(2131751004), "un1", user);
                                                        this.v = D523;
                                                        this.v = D5(D523, "un2", ((TLRPC.TL_channelAdminLogEventActionDeleteTopic) channelAdminLogEventAction).topic);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionPinTopic) {
                                                        TLRPC.TL_channelAdminLogEventActionPinTopic tL_channelAdminLogEventActionPinTopic = (TLRPC.TL_channelAdminLogEventActionPinTopic) channelAdminLogEventAction;
                                                        TLRPC.ForumTopic forumTopic4 = tL_channelAdminLogEventActionPinTopic.new_topic;
                                                        if ((forumTopic4 instanceof TLRPC.TL_forumTopic) && ((TLRPC.TL_forumTopic) forumTopic4).pinned) {
                                                            CharSequence D524 = D5(ob6.Y(2131750934, "EventLogPinTopic", new Object[0]), "un1", user);
                                                            this.v = D524;
                                                            this.v = D5(D524, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                        } else {
                                                            CharSequence D525 = D5(ob6.Y(2131750856, "EventLogUnpinTopic", new Object[0]), "un1", user);
                                                            this.v = D525;
                                                            this.v = D5(D525, "un2", tL_channelAdminLogEventActionPinTopic.new_topic);
                                                        }
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) {
                                                        this.v = D5(((TLRPC.TL_channelAdminLogEventActionToggleAntiSpam) channelAdminLogEventAction).new_value ? ob6.L0(2131750975) : ob6.L0(2131750994), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeColor) {
                                                        boolean V = xc2.V(chat2);
                                                        TLRPC.TL_channelAdminLogEventActionChangeColor tL_channelAdminLogEventActionChangeColor = (TLRPC.TL_channelAdminLogEventActionChangeColor) tL_channelAdminLogEvent.action;
                                                        int i23 = V ? 2131751036 : 2131751035;
                                                        int i24 = tL_channelAdminLogEventActionChangeColor.prev_value;
                                                        int[][] iArr4 = rb0.L;
                                                        this.v = D5(ob6.Z(i23, ob6.M0(new int[]{2131751977, 2131751982, 2131751973, 2131751983, 2131751984, 2131751985, 2131751978}[i24 % 7], null).toLowerCase(), ob6.M0(new int[]{2131751977, 2131751982, 2131751973, 2131751983, 2131751984, 2131751985, 2131751978}[tL_channelAdminLogEventActionChangeColor.new_value % 7], null).toLowerCase()), "un1", user);
                                                    } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangePeerColor) {
                                                        boolean V2 = xc2.V(chat2);
                                                        TLRPC.TL_channelAdminLogEventActionChangePeerColor tL_channelAdminLogEventActionChangePeerColor = (TLRPC.TL_channelAdminLogEventActionChangePeerColor) tL_channelAdminLogEvent.action;
                                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(ob6.L0(V2 ? 2131751018 : 2131751017));
                                                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 1) != 0) {
                                                            spannableStringBuilder4.append((CharSequence) "c");
                                                            str = str;
                                                            i2 = i;
                                                            e48 e48Var = new e48(false, i2, tL_channelAdminLogEventActionChangePeerColor.prev_value.color);
                                                            e48Var.a(hl.L(18.0f));
                                                            spannableStringBuilder4.setSpan(e48Var, spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                        } else {
                                                            str = str;
                                                            i2 = i;
                                                        }
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.prev_value.flags & 2) != 0) {
                                                            if (spannableStringBuilder4.length() > 0) {
                                                                spannableStringBuilder4.append((CharSequence) ", ");
                                                            }
                                                            spannableStringBuilder4.append((CharSequence) "e");
                                                            spannableStringBuilder4.setSpan(new hm(tL_channelAdminLogEventActionChangePeerColor.prev_value.background_emoji_id, aob.s2.getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                                                        }
                                                        if (spannableStringBuilder4.length() == 0) {
                                                            spannableStringBuilder4.append((CharSequence) ob6.L0(2131750978));
                                                        }
                                                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 1) != 0) {
                                                            spannableStringBuilder5.append((CharSequence) "c");
                                                            e48 e48Var2 = new e48(false, i2, tL_channelAdminLogEventActionChangePeerColor.new_value.color);
                                                            e48Var2.a(hl.L(18.0f));
                                                            spannableStringBuilder5.setSpan(e48Var2, spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                        }
                                                        if ((tL_channelAdminLogEventActionChangePeerColor.new_value.flags & 2) != 0) {
                                                            if (spannableStringBuilder5.length() > 0) {
                                                                spannableStringBuilder5.append((CharSequence) ", ");
                                                            }
                                                            spannableStringBuilder5.append((CharSequence) "e");
                                                            spannableStringBuilder5.setSpan(new hm(tL_channelAdminLogEventActionChangePeerColor.new_value.background_emoji_id, aob.s2.getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                                                        }
                                                        if (spannableStringBuilder5.length() == 0) {
                                                            spannableStringBuilder5.append((CharSequence) ob6.L0(2131750978));
                                                        }
                                                        this.v = D5(hl.G2(hl.G2(spannableStringBuilder3, spannableStringBuilder4, "%1$s"), spannableStringBuilder5, "%2$s"), "un1", user);
                                                    } else {
                                                        str = str;
                                                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) {
                                                            boolean V3 = xc2.V(chat);
                                                            TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor tL_channelAdminLogEventActionChangeProfilePeerColor = (TLRPC.TL_channelAdminLogEventActionChangeProfilePeerColor) tL_channelAdminLogEvent.action;
                                                            SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(ob6.L0(V3 ? 2131751016 : 2131751015));
                                                            SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 1) != 0) {
                                                                spannableStringBuilder7.append((CharSequence) "c");
                                                                e48 e48Var3 = new e48(true, i, tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.color);
                                                                e48Var3.a(hl.L(18.0f));
                                                                spannableStringBuilder7.setSpan(e48Var3, spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                            }
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.flags & 2) != 0) {
                                                                if (spannableStringBuilder7.length() > 0) {
                                                                    spannableStringBuilder7.append((CharSequence) ", ");
                                                                }
                                                                spannableStringBuilder7.append((CharSequence) "e");
                                                                spannableStringBuilder7.setSpan(new hm(tL_channelAdminLogEventActionChangeProfilePeerColor.prev_value.background_emoji_id, aob.s2.getFontMetricsInt()), spannableStringBuilder7.length() - 1, spannableStringBuilder7.length(), 33);
                                                            }
                                                            if (spannableStringBuilder7.length() == 0) {
                                                                spannableStringBuilder7.append((CharSequence) ob6.L0(2131750978));
                                                            }
                                                            SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 1) != 0) {
                                                                spannableStringBuilder8.append((CharSequence) "c");
                                                                e48 e48Var4 = new e48(true, i, tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.color);
                                                                e48Var4.a(hl.L(18.0f));
                                                                spannableStringBuilder8.setSpan(e48Var4, spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                            }
                                                            if ((tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.flags & 2) != 0) {
                                                                if (spannableStringBuilder8.length() > 0) {
                                                                    spannableStringBuilder8.append((CharSequence) ", ");
                                                                }
                                                                spannableStringBuilder8.append((CharSequence) "e");
                                                                spannableStringBuilder8.setSpan(new hm(tL_channelAdminLogEventActionChangeProfilePeerColor.new_value.background_emoji_id, aob.s2.getFontMetricsInt()), spannableStringBuilder8.length() - 1, spannableStringBuilder8.length(), 33);
                                                            }
                                                            if (spannableStringBuilder8.length() == 0) {
                                                                spannableStringBuilder8.append((CharSequence) ob6.L0(2131750978));
                                                            }
                                                            this.v = D5(hl.G2(hl.G2(spannableStringBuilder6, spannableStringBuilder7, "%1$s"), spannableStringBuilder8, "%2$s"), "un1", user);
                                                        } else {
                                                            if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) {
                                                                boolean V4 = xc2.V(chat);
                                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus tL_channelAdminLogEventActionChangeEmojiStatus = (TLRPC.TL_channelAdminLogEventActionChangeEmojiStatus) tL_channelAdminLogEvent2.action;
                                                                if (tL_channelAdminLogEventActionChangeEmojiStatus.prev_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                    spannableString3 = new SpannableString(ob6.L0(2131750978));
                                                                    z2 = true;
                                                                } else {
                                                                    spannableString3 = new SpannableString("e");
                                                                    spannableString3.setSpan(new hm(wf3.f(tL_channelAdminLogEventActionChangeEmojiStatus.prev_value), aob.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    z2 = false;
                                                                }
                                                                int g = wf3.g(tL_channelAdminLogEventActionChangeEmojiStatus.new_value);
                                                                if (tL_channelAdminLogEventActionChangeEmojiStatus.new_value instanceof TLRPC.TL_emojiStatusEmpty) {
                                                                    spannableString4 = new SpannableString(ob6.L0(2131750978));
                                                                } else {
                                                                    SpannableString spannableString5 = new SpannableString("e");
                                                                    spannableString5.setSpan(new hm(wf3.f(tL_channelAdminLogEventActionChangeEmojiStatus.new_value), aob.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    spannableString4 = spannableString5;
                                                                }
                                                                SpannableStringBuilder G22 = hl.G2(hl.G2(new SpannableStringBuilder(ob6.L0(z2 ? g != 0 ? V4 ? 2131751030 : 2131751029 : V4 ? 2131751031 : 2131751024 : g != 0 ? V4 ? 2131751027 : 2131751026 : V4 ? 2131751028 : 2131751025)), spannableString3, "%1$s"), spannableString4, "%2$s");
                                                                this.v = D5(g != 0 ? hl.G2(G22, ob6.c0((int) ((g - tL_channelAdminLogEvent2.date) * 1.05f)), "%3$s") : G22, "un1", user);
                                                            } else {
                                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                                if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                                                                    TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                                                                    boolean V5 = xc2.V(chat);
                                                                    TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                                                                    if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                                                        this.v = D5(ob6.L0(V5 ? 2131750892 : 2131750891), "un1", user);
                                                                    } else {
                                                                        ArrayList arrayList7 = new ArrayList();
                                                                        this.p0 = arrayList7;
                                                                        TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                        if (document != null) {
                                                                            arrayList7.addAll(document.thumbs);
                                                                            this.n0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                                                        }
                                                                        this.v = D5(ob6.L0(V5 ? 2131751013 : 2131751012), "un1", user);
                                                                    }
                                                                } else if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) {
                                                                    boolean V6 = xc2.V(chat);
                                                                    TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji tL_channelAdminLogEventActionChangeBackgroundEmoji = (TLRPC.TL_channelAdminLogEventActionChangeBackgroundEmoji) tL_channelAdminLogEvent2.action;
                                                                    this.v = D5(ob6.L0(V6 ? 2131751034 : 2131751033), "un1", user);
                                                                    if (tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value == 0) {
                                                                        spannableString = new SpannableString(ob6.L0(2131750978));
                                                                    } else {
                                                                        spannableString = new SpannableString("e");
                                                                        spannableString.setSpan(new hm(tL_channelAdminLogEventActionChangeBackgroundEmoji.prev_value, aob.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    }
                                                                    this.v = hl.G2(this.v, spannableString, "%1$s");
                                                                    if (tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value == 0) {
                                                                        spannableString2 = new SpannableString(ob6.L0(2131750978));
                                                                    } else {
                                                                        spannableString2 = new SpannableString("e");
                                                                        spannableString2.setSpan(new hm(tL_channelAdminLogEventActionChangeBackgroundEmoji.new_value, aob.s2.getFontMetricsInt()), 0, 1, 33);
                                                                    }
                                                                    this.v = hl.G2(this.v, spannableString2, "%2$s");
                                                                } else {
                                                                    this.v = "unsupported " + tL_channelAdminLogEvent2.action;
                                                                }
                                                            }
                                                            chat2 = chat;
                                                        }
                                                    }
                                                    str = str;
                                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                                }
                                                str = str;
                                                message2 = message;
                                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                            }
                                            arrayList3 = null;
                                            message3 = this.k;
                                            if (message3 == null) {
                                            }
                                            message3.message = this.v.toString();
                                            this.k.from_id = new TLRPC.TL_peerUser();
                                            TLRPC.Message message82 = this.k;
                                            message82.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                                            message82.date = tL_channelAdminLogEvent2.date;
                                            int i172 = iArr[0];
                                            iArr[0] = i172 + 1;
                                            message82.id = i172;
                                            this.T = tL_channelAdminLogEvent2.id;
                                            message82.out = false;
                                            message82.peer_id = new TLRPC.TL_peerChannel();
                                            TLRPC.Message message92 = this.k;
                                            message92.peer_id.channel_id = chat2.id;
                                            message92.unread = false;
                                            MediaController z92 = MediaController.z();
                                            this.W2 = null;
                                            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                                            }
                                            if (message4 == null) {
                                            }
                                            iArr2 = null;
                                            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                                            }
                                        } else if (((TLRPC.TL_channelAdminLogEventActionTogglePreHistoryHidden) channelAdminLogEventAction).new_value) {
                                            this.v = D5(ob6.L0(2131750866), "un1", user);
                                        } else {
                                            this.v = D5(ob6.L0(2131750865), "un1", user);
                                        }
                                    }
                                    tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                }
                                tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                                chat2 = chat;
                            }
                        }
                        tL_channelAdminLogEvent2 = tL_channelAdminLogEvent;
                        chat2 = chat;
                        arrayList3 = null;
                        message3 = this.k;
                        if (message3 == null) {
                        }
                        message3.message = this.v.toString();
                        this.k.from_id = new TLRPC.TL_peerUser();
                        TLRPC.Message message822 = this.k;
                        message822.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                        message822.date = tL_channelAdminLogEvent2.date;
                        int i1722 = iArr[0];
                        iArr[0] = i1722 + 1;
                        message822.id = i1722;
                        this.T = tL_channelAdminLogEvent2.id;
                        message822.out = false;
                        message822.peer_id = new TLRPC.TL_peerChannel();
                        TLRPC.Message message922 = this.k;
                        message922.peer_id.channel_id = chat2.id;
                        message922.unread = false;
                        MediaController z922 = MediaController.z();
                        this.W2 = null;
                        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                        }
                        if (message4 == null) {
                        }
                        iArr2 = null;
                        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                        }
                    }
                    message2 = null;
                    arrayList3 = null;
                    message3 = this.k;
                    if (message3 == null) {
                    }
                    message3.message = this.v.toString();
                    this.k.from_id = new TLRPC.TL_peerUser();
                    TLRPC.Message message8222 = this.k;
                    message8222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
                    message8222.date = tL_channelAdminLogEvent2.date;
                    int i17222 = iArr[0];
                    iArr[0] = i17222 + 1;
                    message8222.id = i17222;
                    this.T = tL_channelAdminLogEvent2.id;
                    message8222.out = false;
                    message8222.peer_id = new TLRPC.TL_peerChannel();
                    TLRPC.Message message9222 = this.k;
                    message9222.peer_id.channel_id = chat2.id;
                    message9222.unread = false;
                    MediaController z9222 = MediaController.z();
                    this.W2 = null;
                    if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                    }
                    if (message4 == null) {
                    }
                    iArr2 = null;
                    if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
                    }
                }
            }
            TLRPC.TL_message tL_message5 = new TLRPC.TL_message();
            this.k = tL_message5;
            tL_message5.realId = -1;
            long B16 = B1(channelParticipant.peer);
            TLRPC.User X110 = B16 > 0 ? uc7.s1(i).X1(Long.valueOf(B16)) : uc7.s1(i).X1(Long.valueOf(-B16));
            if ((channelParticipant instanceof TLRPC.TL_channelParticipantCreator) || !(channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) {
                TLRPC.TL_chatAdminRights tL_chatAdminRights = channelParticipant.admin_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant2.admin_rights;
                tL_chatAdminRights = tL_chatAdminRights == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights;
                tL_chatAdminRights2 = tL_chatAdminRights2 == null ? new TLRPC.TL_chatAdminRights() : tL_chatAdminRights2;
                String L03 = tL_chatAdminRights2.other ? ob6.L0(2131750914) : ob6.L0(2131750929);
                StringBuilder sb5 = new StringBuilder(String.format(L03, e2(X110, this.k.entities, L03.indexOf("%1$s"))));
                sb5.append("\n");
                if (!TextUtils.equals(channelParticipant.rank, channelParticipant2.rank)) {
                    if (TextUtils.isEmpty(channelParticipant2.rank)) {
                        sb5.append("\n- ");
                        sb5.append(ob6.L0(2131750910));
                    } else {
                        sb5.append("\n+ ");
                        sb5.append(ob6.Y(2131750908, "EventLogPromotedTitle", channelParticipant2.rank));
                    }
                }
                if (tL_chatAdminRights.change_info != tL_chatAdminRights2.change_info) {
                    sb5.append('\n');
                    sb5.append(tL_chatAdminRights2.change_info ? '+' : '-');
                    sb5.append(' ');
                    chat2 = chat;
                    sb5.append(ob6.L0(chat2.megagroup ? 2131750924 : 2131750925));
                } else {
                    chat2 = chat;
                }
                if (!chat2.megagroup) {
                    if (tL_chatAdminRights.post_messages != tL_chatAdminRights2.post_messages) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.post_messages ? '+' : '-', ' ', 2131750912);
                    }
                    if (tL_chatAdminRights.edit_messages != tL_chatAdminRights2.edit_messages) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.edit_messages ? '+' : '-', ' ', 2131750921);
                    }
                }
                if (tL_chatAdminRights.post_stories != tL_chatAdminRights2.post_stories) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.post_stories ? '+' : '-', ' ', 2131750911);
                }
                if (tL_chatAdminRights.edit_stories != tL_chatAdminRights2.edit_stories) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.edit_stories ? '+' : '-', ' ', 2131750919);
                }
                if (tL_chatAdminRights.delete_stories != tL_chatAdminRights2.delete_stories) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.delete_stories ? '+' : '-', ' ', 2131750922);
                }
                if (tL_chatAdminRights.delete_messages != tL_chatAdminRights2.delete_messages) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.delete_messages ? '+' : '-', ' ', 2131750923);
                }
                if (tL_chatAdminRights.add_admins != tL_chatAdminRights2.add_admins) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.add_admins ? '+' : '-', ' ', 2131750928);
                }
                if (tL_chatAdminRights.anonymous != tL_chatAdminRights2.anonymous) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.anonymous ? '+' : '-', ' ', 2131750909);
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.ban_users != tL_chatAdminRights2.ban_users) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.ban_users ? '+' : '-', ' ', 2131750926);
                    }
                    if (tL_chatAdminRights.manage_call != tL_chatAdminRights2.manage_call) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.manage_call ? '+' : '-', ' ', 2131750918);
                    }
                }
                if (tL_chatAdminRights.invite_users != tL_chatAdminRights2.invite_users) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.invite_users ? '+' : '-', ' ', 2131750927);
                }
                if (chat2.megagroup) {
                    if (tL_chatAdminRights.pin_messages != tL_chatAdminRights2.pin_messages) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.pin_messages ? '+' : '-', ' ', 2131750913);
                    }
                    if (tL_chatAdminRights.manage_ranks != tL_chatAdminRights2.manage_ranks) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.manage_ranks ? '+' : '-', ' ', 2131750920);
                    }
                    if (tL_chatAdminRights.manage_topics != tL_chatAdminRights2.manage_topics) {
                        sb5.append('\n');
                        qu6.t(sb5, tL_chatAdminRights2.manage_topics ? '+' : '-', ' ', 2131750916);
                    }
                }
                if (tL_chatAdminRights.manage_direct_messages != tL_chatAdminRights2.manage_direct_messages) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.manage_direct_messages ? '+' : '-', ' ', 2131750917);
                }
                if (tL_chatAdminRights.manage_welcome_messages != tL_chatAdminRights2.manage_welcome_messages) {
                    sb5.append('\n');
                    qu6.t(sb5, tL_chatAdminRights2.manage_welcome_messages ? '+' : '-', ' ', 2131750915);
                }
                sb = sb5;
            } else {
                String L04 = ob6.L0(2131751019);
                sb = new StringBuilder(String.format(L04, e2(X110, this.k.entities, L04.indexOf("%1$s"))));
                chat2 = chat;
            }
            this.v = sb.toString();
            message2 = null;
            arrayList3 = null;
            message3 = this.k;
            if (message3 == null) {
            }
            message3.message = this.v.toString();
            this.k.from_id = new TLRPC.TL_peerUser();
            TLRPC.Message message82222 = this.k;
            message82222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
            message82222.date = tL_channelAdminLogEvent2.date;
            int i172222 = iArr[0];
            iArr[0] = i172222 + 1;
            message82222.id = i172222;
            this.T = tL_channelAdminLogEvent2.id;
            message82222.out = false;
            message82222.peer_id = new TLRPC.TL_peerChannel();
            TLRPC.Message message92222 = this.k;
            message92222.peer_id.channel_id = chat2.id;
            message92222.unread = false;
            MediaController z92222 = MediaController.z();
            this.W2 = null;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
            }
            if (message4 == null) {
            }
            iArr2 = null;
            if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
            }
        }
        user = X1;
        str = "";
        chat2 = chat;
        message2 = null;
        arrayList3 = null;
        message3 = this.k;
        if (message3 == null) {
        }
        message3.message = this.v.toString();
        this.k.from_id = new TLRPC.TL_peerUser();
        TLRPC.Message message822222 = this.k;
        message822222.from_id.user_id = tL_channelAdminLogEvent2.user_id;
        message822222.date = tL_channelAdminLogEvent2.date;
        int i1722222 = iArr[0];
        iArr[0] = i1722222 + 1;
        message822222.id = i1722222;
        this.T = tL_channelAdminLogEvent2.id;
        message822222.out = false;
        message822222.peer_id = new TLRPC.TL_peerChannel();
        TLRPC.Message message922222 = this.k;
        message922222.peer_id.channel_id = chat2.id;
        message922222.unread = false;
        MediaController z922222 = MediaController.z();
        this.W2 = null;
        if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
        }
        if (message4 == null) {
        }
        iArr2 = null;
        if (tL_channelAdminLogEvent2.action instanceof TLRPC.TL_channelAdminLogEventActionDeleteMessage) {
        }
    }

    public static boolean A(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults == null || pollResults.results.isEmpty()) {
            return false;
        }
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        if (!poll.public_voters) {
            return false;
        }
        if (poll.closed || poll.creator) {
            return true;
        }
        return V4(tL_messageMediaPoll) && !tL_messageMediaPoll.poll.hide_results_until_close;
    }

    public static boolean A4(r47 r47Var) {
        if (r47Var == null) {
            return false;
        }
        TLRPC.Message message = r47Var.k;
        return (message instanceof TLRPC.TL_messageService) && (((TLRPC.TL_messageService) message).action instanceof TLRPC.TL_messageActionContactSignUp);
    }

    public static Spannable A5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return B5(charSequence, arrayList, fontMetricsInt, z, 1.2f, 0);
    }

    public static long B0(TLRPC.Message message) {
        TLRPC.Peer peer;
        long j = message.dialog_id;
        if (j != 0 || (peer = message.peer_id) == null) {
            return j;
        }
        long j2 = peer.chat_id;
        if (j2 != 0) {
            long j3 = -j2;
            message.dialog_id = j3;
            return j3;
        }
        long j4 = peer.channel_id;
        if (j4 != 0) {
            long j5 = -j4;
            message.dialog_id = j5;
            return j5;
        }
        TLRPC.Peer peer2 = message.from_id;
        if (peer2 == null || message.out || message.guestchat_via_from != null) {
            long j6 = peer.user_id;
            message.dialog_id = j6;
            return j6;
        }
        long j7 = peer2.user_id;
        message.dialog_id = j7;
        return j7;
    }

    public static long B1(TLRPC.Peer peer) {
        long j;
        if (peer == null) {
            return 0L;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            j = peer.chat_id;
        } else {
            if (!(peer instanceof TLRPC.TL_peerChannel)) {
                return peer.user_id;
            }
            j = peer.channel_id;
        }
        return -j;
    }

    public static boolean B4(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        i1(document);
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetID) && inputStickerSet.id == 1269403972611866647L) {
                    return true;
                }
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).text_color;
            }
        }
        return false;
    }

    public static Spannable B5(CharSequence charSequence, ArrayList arrayList, Paint.FontMetricsInt fontMetricsInt, boolean z, float f, int i) {
        mv3 mv3Var;
        mv3 mv3Var2;
        mv3 mv3Var3 = null;
        if (charSequence == null) {
            return null;
        }
        Spannable spannableString = charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence);
        if (arrayList != null) {
            int i2 = (xea.o() >= 2 ? 100 : 50) - i;
            mv3[] mv3VarArr = (mv3[]) spannableString.getSpans(0, spannableString.length(), mv3.class);
            int i3 = 0;
            while (i3 < arrayList.size() && i2 > 0) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i3);
                if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                    int i4 = 0;
                    while (i4 < mv3VarArr.length) {
                        mv3 mv3Var4 = mv3VarArr[i4];
                        if (mv3Var4 != null) {
                            int spanStart = spannableString.getSpanStart(mv3Var4);
                            int spanEnd = spannableString.getSpanEnd(mv3Var4);
                            int i5 = tL_messageEntityCustomEmoji.offset;
                            mv3Var2 = mv3Var3;
                            if (hl.z1(i5, tL_messageEntityCustomEmoji.length + i5, spanStart, spanEnd)) {
                                spannableString.removeSpan(mv3Var4);
                                mv3VarArr[i4] = mv3Var2;
                            }
                        } else {
                            mv3Var2 = mv3Var3;
                        }
                        i4++;
                        mv3Var3 = mv3Var2;
                    }
                    mv3Var = mv3Var3;
                    if (messageEntity.offset + messageEntity.length <= spannableString.length()) {
                        int i6 = messageEntity.offset;
                        hm[] hmVarArr = (hm[]) spannableString.getSpans(i6, messageEntity.length + i6, hm.class);
                        if (hmVarArr != null && hmVarArr.length > 0) {
                            for (hm hmVar : hmVarArr) {
                                spannableString.removeSpan(hmVar);
                            }
                        }
                        hm hmVar2 = tL_messageEntityCustomEmoji.document != null ? new hm(tL_messageEntityCustomEmoji.document, f, fontMetricsInt) : new hm(tL_messageEntityCustomEmoji.document_id, f, fontMetricsInt);
                        hmVar2.top = z;
                        int i7 = messageEntity.offset;
                        spannableString.setSpan(hmVar2, i7, messageEntity.length + i7, 33);
                        i2--;
                    }
                } else {
                    mv3Var = mv3Var3;
                }
                i3++;
                mv3Var3 = mv3Var;
            }
        }
        return spannableString;
    }

    public static TLRPC.Photo C1(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage);
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return n1(message).webpage.photo;
        }
        if (n1(message) != null) {
            return n1(message).photo;
        }
        return null;
    }

    public static boolean D(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults != null && !pollResults.results.isEmpty() && !tL_messageMediaPoll.poll.revoting_disabled) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean D4(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var == null || (message = r47Var.k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionTopicCreate) || (messageAction instanceof TLRPC.TL_messageActionTopicEdit);
    }

    public static CharSequence D5(CharSequence charSequence, String str, TLObject tLObject) {
        CharSequence charSequence2;
        String str2;
        String str3;
        TLObject tLObject2;
        int indexOf = TextUtils.indexOf(charSequence, str);
        if (indexOf < 0) {
            return charSequence;
        }
        TLObject tLObject3 = null;
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            charSequence2 = lbc.r(user).replace('\n', ' ');
            str2 = String.valueOf(user.id);
        } else if (tLObject instanceof TLRPC.Chat) {
            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
            charSequence2 = chat.title.replace('\n', ' ');
            str2 = String.valueOf(-chat.id);
        } else if (tLObject instanceof TLRPC.TL_game) {
            charSequence2 = ((TLRPC.TL_game) tLObject).title.replace('\n', ' ');
            str2 = "game";
        } else {
            if (tLObject instanceof TLRPC.TL_chatInviteExported) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) tLObject;
                charSequence2 = tL_chatInviteExported.link.replace('\n', ' ');
                str3 = "invite";
                tLObject2 = tL_chatInviteExported;
            } else if (tLObject instanceof TLRPC.ForumTopic) {
                charSequence2 = ro4.k((TLRPC.ForumTopic) tLObject, null, null);
                str3 = "topic";
                tLObject2 = tLObject;
            } else {
                charSequence2 = "";
                str2 = "0";
            }
            String str4 = str3;
            tLObject3 = tLObject2;
            str2 = str4;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(TextUtils.replace(charSequence, new String[]{str}, new CharSequence[]{charSequence2}));
        g8c g8cVar = new g8c(str2);
        g8cVar.c = tLObject3;
        spannableStringBuilder.setSpan(g8cVar, indexOf, charSequence2.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    public static TLRPC.PollAnswerVoters E1(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, byte[] bArr) {
        TLRPC.PollResults pollResults = tL_messageMediaPoll.results;
        if (pollResults == null || pollResults.results.isEmpty()) {
            return null;
        }
        int size = tL_messageMediaPoll.results.results.size();
        for (int i = 0; i < size; i++) {
            TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i);
            if (Arrays.equals(pollAnswerVoters.option, bArr)) {
                return pollAnswerVoters;
            }
        }
        return null;
    }

    public static boolean E3(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && documentAttribute.mask) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence F() {
        if (t3 == null) {
            t3 = new SpannableStringBuilder("c");
            wm2 wm2Var = new wm2(R.drawable.msg_folders_channels, 0);
            wm2Var.I = 0.7f;
            wm2Var.J = 0.7f;
            t3.setSpan(wm2Var, 0, 1, 33);
        }
        return t3;
    }

    public static TLRPC.VideoSize F1(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return document.video_thumbs.get(i);
                }
            }
        }
        return null;
    }

    public static TLRPC.Document G0(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return a0(richMessage.blocks, richMessage);
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return n1(message).webpage.document;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaGame) {
            return n1(message).game.document;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaStory) {
            TL_stories.StoryItem storyItem = ((TLRPC.TL_messageMediaStory) n1(message)).storyItem;
            if (storyItem != null && (messageMedia = storyItem.media) != null && (document = messageMedia.document) != null) {
                return document;
            }
        } else if (n1(message) instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) n1(message);
            if (tL_messageMediaPaidMedia.extended_media.size() == 1 && (tL_messageMediaPaidMedia.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) {
                return ((TLRPC.TL_messageExtendedMedia) tL_messageMediaPaidMedia.extended_media.get(0)).media.document;
            }
        }
        if (n1(message) != null) {
            return n1(message).document;
        }
        return null;
    }

    public static boolean G3(TLRPC.Message message, boolean z) {
        if (message == null || n1(message) == null || (n1(message) instanceof TLRPC.TL_messageMediaEmpty)) {
            return true;
        }
        return z && (n1(message) instanceof TLRPC.TL_messageMediaWebPage);
    }

    public static double H0(TLRPC.Document document) {
        if (document == null) {
            return 0.0d;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int H1(int i, TLRPC.Message message) {
        a19 d;
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        String J1 = J1(message);
        if (J1 == null || (d = b19.f(i).d(J1)) == null) {
            return 0;
        }
        return d.a;
    }

    public static boolean H2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return true;
            }
        }
        return false;
    }

    public static int I1(TLRPC.Message message) {
        if (message == null) {
            return 0;
        }
        if ((message.flags & TLObject.FLAG_30) != 0) {
            return message.quick_reply_shortcut_id;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcutId) {
            return ((TLRPC.TL_inputQuickReplyShortcutId) inputQuickReplyShortcut).shortcut_id;
        }
        return 0;
    }

    public static TLRPC.VideoSize J0(TLRPC.Document document) {
        if (document == null || document.video_thumbs.isEmpty()) {
            return null;
        }
        return document.video_thumbs.get(0);
    }

    public static String J1(TLRPC.Message message) {
        if (message == null) {
            return null;
        }
        TLRPC.InputQuickReplyShortcut inputQuickReplyShortcut = message.quick_reply_shortcut;
        if (inputQuickReplyShortcut instanceof TLRPC.TL_inputQuickReplyShortcut) {
            return ((TLRPC.TL_inputQuickReplyShortcut) inputQuickReplyShortcut).shortcut;
        }
        return null;
    }

    public static boolean J3(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeAudio) {
                    return !r2.voice;
                }
            }
            if (!TextUtils.isEmpty(document.mime_type)) {
                String lowerCase = document.mime_type.toLowerCase();
                if (lowerCase.equals("audio/flac") || lowerCase.equals("audio/ogg") || lowerCase.equals("audio/opus") || lowerCase.equals("audio/x-opus+ogg") || (lowerCase.equals("application/octet-stream") && xb4.B(document).endsWith(".opus"))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean J4(TLRPC.Document document) {
        int lastIndexOf;
        if (document != null) {
            String str = null;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            boolean z2 = false;
            while (true) {
                if (i >= document.attributes.size()) {
                    if (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) {
                        switch (str.substring(lastIndexOf + 1).toLowerCase().hashCode()) {
                            case -1535907675:
                            case -1422950858:
                            case -1253501876:
                            case -907685685:
                            case -788047292:
                            case -338481545:
                            case 3106:
                            case 3184:
                            case 3215:
                            case 3401:
                            case 3479:
                            case 3494:
                            case 3580:
                            case 3581:
                            case 3593:
                            case 3632:
                            case 3669:
                            case 3756:
                            case 3804:
                            case 96400:
                            case 96586:
                            case 96796:
                            case 96801:
                            case 96894:
                            case 97013:
                            case 97300:
                            case 97301:
                            case 97543:
                            case 98437:
                            case 98472:
                            case 98618:
                            case 98689:
                            case 98719:
                            case 98789:
                            case 98808:
                            case 98819:
                            case 99338:
                            case 99351:
                            case 99548:
                            case 99556:
                            case 99582:
                            case 99640:
                            case 99752:
                            case 100208:
                            case 100511:
                            case 100542:
                            case 100730:
                            case 100882:
                            case 100958:
                            case 101460:
                            case 101671:
                            case 101854:
                            case 102556:
                            case 102572:
                            case 103404:
                            case 103438:
                            case 103637:
                            case 103649:
                            case 104074:
                            case 104269:
                            case 104417:
                            case 104430:
                            case 104435:
                            case 104474:
                            case 104479:
                            case 104582:
                            case 104587:
                            case 104987:
                            case 105532:
                            case 105543:
                            case 105551:
                            case 106202:
                            case 106496:
                            case 107141:
                            case 107305:
                            case 107932:
                            case 107988:
                            case 107989:
                            case 108341:
                            case 108382:
                            case 108413:
                            case 108419:
                            case 108426:
                            case 108430:
                            case 108570:
                            case 109824:
                            case 109860:
                            case 110754:
                            case 110801:
                            case 110834:
                            case 110883:
                            case 110968:
                            case 110989:
                            case 111052:
                            case 111220:
                            case 111265:
                            case 111269:
                            case 111390:
                            case 111420:
                            case 111482:
                            case 111494:
                            case 112185:
                            case 112712:
                            case 112788:
                            case 112862:
                            case 113115:
                            case 113132:
                            case 113291:
                            case 113698:
                            case 113700:
                            case 113837:
                            case 113854:
                            case 114101:
                            case 114130:
                            case 114276:
                            case 114381:
                            case 114809:
                            case 114922:
                            case 114970:
                            case 115161:
                            case 115312:
                            case 115639:
                            case 116079:
                            case 116537:
                            case 116551:
                            case 116609:
                            case 117218:
                            case 117537:
                            case 117840:
                            case 117938:
                            case 118023:
                            case 118026:
                            case 118028:
                            case 118439:
                            case 118783:
                            case 118807:
                            case 118939:
                            case 120703:
                            case 3003834:
                            case 3016404:
                            case 3088960:
                            case 3213227:
                            case 3271912:
                            case 3358271:
                            case 3444044:
                            case 3446979:
                            case 3447940:
                            case 3524225:
                            case 3524692:
                            case 3526257:
                            case 3682393:
                            case 35379135:
                            case 114035747:
                                break;
                        }
                    }
                    if (z && (i2 > 1280 || i3 > 1280)) {
                        z = false;
                    }
                    if (xea.z0 && !z2 && "video/x-matroska".equals(document.mime_type)) {
                        z2 = true;
                    }
                    if (!z2 || z) {
                        break;
                    }
                    return true;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    if (documentAttribute.round_message) {
                        break;
                    }
                    i2 = documentAttribute.w;
                    i3 = documentAttribute.h;
                    z2 = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
                i++;
            }
        }
        return false;
    }

    public static TLRPC.Document K0(TLRPC.WebPage webPage, long j) {
        if (webPage.cached_page == null) {
            return null;
        }
        TLRPC.Document document = webPage.document;
        if (document != null && document.id == j) {
            return document;
        }
        for (int i = 0; i < webPage.cached_page.documents.size(); i++) {
            TLRPC.Document document2 = webPage.cached_page.documents.get(i);
            if (document2.id == j) {
                return document2;
            }
        }
        return null;
    }

    public static boolean K2(TLRPC.Document document, boolean z) {
        if (document != null && (("application/x-tgsticker".equals(document.mime_type) && !document.thumbs.isEmpty()) || "application/x-tgsdice".equals(document.mime_type))) {
            if (z) {
                return true;
            }
            int size = document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    return documentAttribute.stickerset instanceof TLRPC.TL_inputStickerSetShortName;
                }
                if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean K3(TLRPC.Message message) {
        return n1(message) instanceof TLRPC.TL_messageMediaWebPage ? J3(n1(message).webpage.document) : n1(message) != null && J3(n1(message).document);
    }

    public static boolean K4(TLRPC.Message message) {
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return J4(a0(richMessage.blocks, richMessage));
        }
        if (n1(message) == null || !M4(n1(message).document)) {
            return n1(message) instanceof TLRPC.TL_messageMediaWebPage ? J4(n1(message).webpage.document) : n1(message) != null && J4(n1(message).document);
        }
        return false;
    }

    public static SpannableStringBuilder L(boolean z) {
        String str;
        int i;
        if (z) {
            str = "✅";
            i = R.drawable.iv_checkbox_on;
        } else {
            str = "☑️";
            i = R.drawable.iv_checkbox_off;
        }
        return S5(i, str);
    }

    public static boolean L2(TLRPC.Message message) {
        boolean B = wf3.B(message.dialog_id);
        if ((!B || message.stickerVerified == 1) && n1(message) != null) {
            if (K2(n1(message).document, !B || message.out)) {
                return true;
            }
        }
        return false;
    }

    public static void L5(int i, TLRPC.Message message) {
        message.unread = (i & 1) == 0;
        message.media_unread = (i & 2) == 0;
    }

    public static boolean M(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() >= 2 && charSequence.length() <= 20480) {
            int length = charSequence.length();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            char c = 0;
            while (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= '0' && charAt <= '9') {
                    i2++;
                    if (i2 >= 6) {
                        return true;
                    }
                    i3 = 0;
                    i4 = 0;
                } else if (charAt == ' ' || i2 <= 0) {
                    i2 = 0;
                }
                if ((charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') || i != 0) {
                    if (i != 0) {
                        int i5 = i - 1;
                        if (charSequence.charAt(i5) != ' ') {
                            if (charSequence.charAt(i5) == '\n') {
                            }
                        }
                    }
                    if (charAt == ':') {
                        if (i3 == 0) {
                            i3 = 1;
                        }
                        i3 = 0;
                    } else if (charAt != '/') {
                        if (charAt == '.') {
                            if (i4 == 0 && c != ' ') {
                                i4++;
                            }
                        } else if (charAt != ' ' && c == '.' && i4 == 1) {
                            return true;
                        }
                        i4 = 0;
                    } else {
                        if (i3 == 2) {
                            return true;
                        }
                        if (i3 == 1) {
                            i3++;
                        }
                        i3 = 0;
                    }
                    i++;
                    c = charAt;
                }
                return true;
            }
        }
        return false;
    }

    public static boolean M3(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) {
                    z = true;
                } else if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static boolean M4(TLRPC.Document document) {
        return document != null && N4(document);
    }

    public static boolean N2(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                return true;
            }
        }
        return false;
    }

    public static boolean N4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                    return "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean O2(TL_iv.PageBlock pageBlock) {
        return (pageBlock instanceof TL_iv.pageBlockTable) || (pageBlock instanceof TL_iv.pageBlockMath) || (pageBlock instanceof TL_iv.pageBlockAudio) || (pageBlock instanceof TL_iv.pageBlockDocument) || (pageBlock instanceof TL_iv.pageBlockMap) || (pageBlock instanceof TL_iv.pageBlockPhoto) || (pageBlock instanceof TL_iv.pageBlockVideo) || (pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow);
    }

    public static boolean P4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    return documentAttribute.voice;
                }
            }
        }
        return false;
    }

    public static long Q1(long j, TLRPC.Message message) {
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = message.saved_peer_id;
        if (peer2 != null) {
            long j2 = peer2.chat_id;
            if (j2 == 0) {
                j2 = peer2.channel_id;
                if (j2 == 0) {
                    return peer2.user_id;
                }
            }
            return -j2;
        }
        if (message.from_id.user_id != j) {
            return 0L;
        }
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            return wf3.n(peer);
        }
        if ((messageFwdHeader == null || messageFwdHeader.from_id == null) && messageFwdHeader != null) {
            return 2666000L;
        }
        return j;
    }

    public static boolean Q2(int i, r47 r47Var) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m1 = m1(r47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m1).todo) != null && todoList.list != null) {
            for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
                if (tL_messageMediaToDo.completions.get(i2).id == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean Q4(TLRPC.Message message) {
        return n1(message) instanceof TLRPC.TL_messageMediaWebPage ? P4(n1(message).webpage.document) : n1(message) != null && P4(n1(message).document);
    }

    public static boolean Q5(TLRPC.Message message) {
        int i;
        if ((message == null || message.media == null || !((P4(G0(message)) || i4(message)) && message.media.ttl_seconds == Integer.MAX_VALUE)) && !(n1(message) instanceof TLRPC.TL_messageMediaPaidMedia)) {
            return message instanceof TLRPC.TL_message_secret ? ((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || K4(message)) && (i = message.ttl) > 0 && i <= 60 : ((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (n1(message) instanceof TLRPC.TL_messageMediaDocument)) && n1(message).ttl_seconds != 0;
        }
        return true;
    }

    public static void R(Spanned spanned, ArrayList arrayList) {
        String str;
        int i;
        TreeSet treeSet = new TreeSet();
        HashMap hashMap = new HashMap();
        q19[] q19VarArr = (q19[]) spanned.getSpans(0, spanned.length(), q19.class);
        int i2 = 0;
        while (true) {
            if (i2 >= q19VarArr.length) {
                break;
            }
            q19 q19Var = q19VarArr[i2];
            q19Var.a.b = false;
            int spanStart = spanned.getSpanStart(q19Var);
            int spanEnd = spanned.getSpanEnd(q19VarArr[i2]);
            treeSet.add(Integer.valueOf(spanStart));
            hashMap.put(Integer.valueOf(spanStart), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart))).intValue() : 0) | (q19VarArr[i2].a.e ? 16 : 1)));
            treeSet.add(Integer.valueOf(spanEnd));
            hashMap.put(Integer.valueOf(spanEnd), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd))).intValue() : 0) | 2));
            i2++;
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            int intValue = num.intValue();
            if (intValue >= 0 && intValue < spanned.length() && hashMap.containsKey(num)) {
                int intValue2 = ((Integer) hashMap.get(num)).intValue();
                if ((intValue2 & 17) != 0 && (intValue2 & 2) != 0 && spanned.charAt(intValue) != '\n' && (intValue - 1 <= 0 || spanned.charAt(i) != '\n')) {
                    it.remove();
                    hashMap.remove(num);
                }
            }
        }
        jk2[] jk2VarArr = (jk2[]) spanned.getSpans(0, spanned.length(), jk2.class);
        for (int i3 = 0; i3 < jk2VarArr.length; i3++) {
            int spanStart2 = spanned.getSpanStart(jk2VarArr[i3]);
            int spanEnd2 = spanned.getSpanEnd(jk2VarArr[i3]);
            treeSet.add(Integer.valueOf(spanStart2));
            hashMap.put(Integer.valueOf(spanStart2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanStart2)) ? ((Integer) hashMap.get(Integer.valueOf(spanStart2))).intValue() : 0) | 4));
            treeSet.add(Integer.valueOf(spanEnd2));
            hashMap.put(Integer.valueOf(spanEnd2), Integer.valueOf((hashMap.containsKey(Integer.valueOf(spanEnd2)) ? ((Integer) hashMap.get(Integer.valueOf(spanEnd2))).intValue() : 0) | 8));
        }
        Iterator it2 = treeSet.iterator();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        while (it2.hasNext()) {
            Integer num2 = (Integer) it2.next();
            int intValue3 = num2.intValue();
            int intValue4 = ((Integer) hashMap.get(num2)).intValue();
            if (i6 != intValue3) {
                int i8 = intValue3 - 1;
                if (i8 >= 0 && i8 < spanned.length() && spanned.charAt(i8) == '\n') {
                    intValue3--;
                }
                int i9 = intValue3;
                if ((intValue4 & 8) == 0 || i5 >= jk2VarArr.length) {
                    str = null;
                } else {
                    str = jk2VarArr[i5].a;
                    i5++;
                }
                int i10 = i5;
                arrayList.add(new q47(i6, i9, i4 > 0, i7 > 0, z, str));
                i6 = i9 + 1;
                if (i6 >= spanned.length() || spanned.charAt(i9) != '\n') {
                    i6 = i9;
                }
                i5 = i10;
            }
            if ((intValue4 & 2) != 0) {
                i4--;
            }
            if ((intValue4 & 1) != 0 || (intValue4 & 16) != 0) {
                i4++;
                z = (intValue4 & 16) != 0;
            }
            if ((intValue4 & 8) != 0) {
                i7--;
            }
            if ((intValue4 & 4) != 0) {
                i7++;
            }
        }
        if (i6 < spanned.length()) {
            arrayList.add(new q47(i6, spanned.length(), i4 > 0, i7 > 0, z, null));
        }
    }

    public static boolean R3(TLRPC.Message message) {
        TLRPC.Photo photo;
        TL_iv.RichMessage richMessage;
        if (message != null && (richMessage = message.rich_message) != null) {
            return W(richMessage.blocks, richMessage) != null;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return (n1(message).webpage.photo instanceof TLRPC.TL_photo) && !(n1(message).webpage.document instanceof TLRPC.TL_document);
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction == null || (photo = messageAction.photo) == null) ? n1(message) instanceof TLRPC.TL_messageMediaPhoto : photo instanceof TLRPC.TL_photo;
    }

    public static int S(int i) {
        return f3(i) ? i & (-1879048193) : i;
    }

    public static SpannableStringBuilder S5(int i, String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new wm2(i, 0), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String T0(TLRPC.Message message) {
        TLRPC.PhotoSize w;
        if (n1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return xb4.r(null, G0(message));
        }
        if (!(n1(message) instanceof TLRPC.TL_messageMediaPhoto)) {
            return (!(n1(message) instanceof TLRPC.TL_messageMediaWebPage) || n1(message).webpage == null) ? "" : xb4.r(null, n1(message).webpage.document);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = n1(message).photo.sizes;
        return (arrayList.size() <= 0 || (w = xb4.w(arrayList, hl.Y0(false), false, null, false)) == null) ? "" : xb4.r(null, w);
    }

    public static boolean T3(TLRPC.StickerSetCovered stickerSetCovered) {
        TLRPC.StickerSet stickerSet;
        if (stickerSetCovered != null && (stickerSet = stickerSetCovered.set) != null && !stickerSet.emojis) {
            return false;
        }
        ArrayList<TLRPC.Document> arrayList = stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered ? ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents : stickerSetCovered.covers;
        if (stickerSetCovered != null && arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!m3(arrayList.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean T4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).voters > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String U(TLRPC.Document document) {
        return V(document, "😀", null);
    }

    public static String U0(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.PhotoSize w;
        if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            return xb4.r(null, messageMedia.document);
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
            return (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (webPage = messageMedia.webpage) == null) ? "" : xb4.r(null, webPage.document);
        }
        ArrayList<TLRPC.PhotoSize> arrayList = messageMedia.photo.sizes;
        return (arrayList.size() <= 0 || (w = xb4.w(arrayList, hl.Y0(false), false, null, false)) == null) ? "" : xb4.r(null, w);
    }

    public static boolean U3(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.StickerSet stickerSet;
        if ((tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null || stickerSet.emojis) && tL_messages_stickerSet != null && tL_messages_stickerSet.documents != null) {
            for (int i = 0; i < tL_messages_stickerSet.documents.size(); i++) {
                if (!m3(tL_messages_stickerSet.documents.get(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String V(TLRPC.Document document, String str, Integer num) {
        if (document != null) {
            int size = document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeSticker)) {
                    if (num != null) {
                        TLRPC.TL_messages_stickerSet n0 = ls6.d0(num.intValue()).n0(documentAttribute.stickerset, true);
                        StringBuilder sb = new StringBuilder("");
                        if (n0 != null && n0.packs != null) {
                            for (int i2 = 0; i2 < n0.packs.size(); i2++) {
                                TLRPC.TL_stickerPack tL_stickerPack = n0.packs.get(i2);
                                if (tL_stickerPack.documents.contains(Long.valueOf(document.id))) {
                                    sb.append(tL_stickerPack.emoticon);
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(sb)) {
                            return sb.toString();
                        }
                    }
                    return documentAttribute.alt;
                }
            }
        }
        return str;
    }

    public static boolean V2(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeHasStickers) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean V4(TLRPC.TL_messageMediaPoll tL_messageMediaPoll) {
        TLRPC.PollResults pollResults;
        if (tL_messageMediaPoll != null && (pollResults = tL_messageMediaPoll.results) != null && !pollResults.results.isEmpty()) {
            int size = tL_messageMediaPoll.results.results.size();
            for (int i = 0; i < size; i++) {
                if (tL_messageMediaPoll.results.results.get(i).chosen) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.Photo W(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockPhoto) {
                    ArrayList<TLRPC.Photo> arrayList2 = richMessage.photos;
                    long j = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
                    Typeface typeface = hl.a;
                    if (arrayList2 != null) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            TLRPC.Photo photo = arrayList2.get(i2);
                            if (photo != null && photo.id == j) {
                                return photo;
                            }
                        }
                    }
                    return null;
                }
                if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return W(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                }
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    return W(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                }
            }
        }
        return null;
    }

    public static boolean W2(TLRPC.Document document) {
        if (document != null && !document.thumbs.isEmpty()) {
            int size = document.thumbs.size();
            for (int i = 0; i < size; i++) {
                TLRPC.PhotoSize photoSize = document.thumbs.get(i);
                if (photoSize != null && !(photoSize instanceof TLRPC.TL_photoSizeEmpty) && (!(photoSize.location instanceof TLRPC.TL_fileLocationUnavailable) || photoSize.bytes != null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean W3(TLRPC.Document document) {
        if (document != null && document.thumbs != null) {
            for (int i = 0; i < document.video_thumbs.size(); i++) {
                if ("f".equals(document.video_thumbs.get(i).type)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.PollAnswer X(r47 r47Var, byte[] bArr) {
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll;
        TLRPC.Poll poll;
        TLRPC.MessageMedia m1 = m1(r47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaPoll) && (poll = (tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) m1).poll) != null && poll.answers != null) {
            for (int i = 0; i < tL_messageMediaPoll.poll.answers.size(); i++) {
                TLRPC.PollAnswer pollAnswer = tL_messageMediaPoll.poll.answers.get(i);
                if (Arrays.equals(pollAnswer.option, bArr)) {
                    return pollAnswer;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CharSequence X1(TLRPC.ChatReactions chatReactions) {
        String str;
        if (chatReactions instanceof TLRPC.TL_chatReactionsAll) {
            return ob6.M0(2131754284, null);
        }
        if (!(chatReactions instanceof TLRPC.TL_chatReactionsSome)) {
            return ob6.M0(2131747906, null);
        }
        TLRPC.TL_chatReactionsSome tL_chatReactionsSome = (TLRPC.TL_chatReactionsSome) chatReactions;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < tL_chatReactionsSome.reactions.size(); i++) {
            if (i != 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            TLRPC.Reaction reaction = tL_chatReactionsSome.reactions.get(i);
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                str = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
            } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d");
                spannableStringBuilder2.setSpan(new hm(((TLRPC.TL_reactionCustomEmoji) reaction).document_id, (Paint.FontMetricsInt) null), 0, 1, 0);
                str = spannableStringBuilder2;
            } else {
                str = "";
            }
            spannableStringBuilder.append(pv3.m(str, null, false, null, 0));
        }
        return spannableStringBuilder;
    }

    public static int Y(int i, String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        if (i == -1) {
            return str.indexOf(str2);
        }
        if (str2.length() + i < str.length() && str.startsWith(str2, i)) {
            return i;
        }
        int indexOf = str.indexOf(str2, i);
        int lastIndexOf = str.lastIndexOf(str2, i);
        return (indexOf == -1 || (lastIndexOf != -1 && indexOf - i >= i - lastIndexOf)) ? lastIndexOf : indexOf;
    }

    public static void Y5(int i, long j, TLRPC.TL_messageMediaToDo tL_messageMediaToDo, int i2, boolean z, int i3) {
        int i4 = 0;
        while (i4 < tL_messageMediaToDo.completions.size()) {
            if (tL_messageMediaToDo.completions.get(i4).id == i2) {
                tL_messageMediaToDo.completions.remove(i4);
                if (tL_messageMediaToDo.completions.isEmpty()) {
                    tL_messageMediaToDo.flags &= -2;
                }
                i4--;
            }
            i4++;
        }
        if (z) {
            TLRPC.TL_todoCompletion tL_todoCompletion = new TLRPC.TL_todoCompletion();
            tL_todoCompletion.id = i2;
            tL_todoCompletion.completed_by = uc7.s1(i).y1(j);
            tL_todoCompletion.date = i3;
            tL_messageMediaToDo.flags |= 1;
            tL_messageMediaToDo.completions.add(tL_todoCompletion);
        }
    }

    public static TLRPC.TodoItem Z(int i, r47 r47Var) {
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo;
        TLRPC.TodoList todoList;
        TLRPC.MessageMedia m1 = m1(r47Var);
        if ((m1 instanceof TLRPC.TL_messageMediaToDo) && (todoList = (tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) m1).todo) != null && todoList.list != null) {
            for (int i2 = 0; i2 < tL_messageMediaToDo.todo.list.size(); i2++) {
                TLRPC.TodoItem todoItem = tL_messageMediaToDo.todo.list.get(i2);
                if (todoItem.id == i) {
                    return todoItem;
                }
            }
        }
        return null;
    }

    public static long Z1(int i, TLRPC.Message message, int i2) {
        long b2 = b2(i, message, vsd.a(i2, 1), vsd.a(i2, 4));
        if (b2 == 0 && vsd.a(i2, 8)) {
            return -1L;
        }
        return b2;
    }

    public static void a(Spannable spannable, ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        b(spannable, arrayList, z, false, z2, z3, 0);
    }

    public static TLRPC.Document a0(ArrayList arrayList, TL_iv.RichMessage richMessage) {
        if (arrayList != null && richMessage != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) obj;
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return hl.Z(((TL_iv.pageBlockVideo) pageBlock).video_id, richMessage.documents);
                }
                if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    return a0(((TL_iv.pageBlockCollage) pageBlock).items, richMessage);
                }
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    return a0(((TL_iv.pageBlockSlideshow) pageBlock).items, richMessage);
                }
            }
        }
        return null;
    }

    public static long a1(TLRPC.Message message) {
        return B1(message.from_id);
    }

    public static long a2(int i, TLRPC.Message message, boolean z) {
        return b2(i, message, z, false);
    }

    public static boolean a4(TLRPC.Message message) {
        if (message != null) {
            return ((message.flags & TLObject.FLAG_30) == 0 && message.quick_reply_shortcut == null) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:166:0x01bc, code lost:
    
        if (r8.contains("domain=telegrampassport") == false) goto L145;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(CharSequence charSequence, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        int i2;
        CharSequence charSequence2;
        Spannable spannable;
        byte b;
        int i3;
        String str;
        int i4;
        boolean z5;
        int i5;
        int i6;
        String str2;
        int i7;
        if (!(charSequence instanceof Spannable)) {
            return false;
        }
        CharSequence a = no4.a(charSequence, false);
        Spannable spannable2 = (Spannable) a;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable2.getSpans(0, a.length(), URLSpan.class);
        boolean z6 = uRLSpanArr != null && uRLSpanArr.length > 0;
        if (arrayList != null && !arrayList.isEmpty()) {
            byte b2 = z3 ? (byte) 2 : z ? (byte) 1 : (byte) 0;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Collections.sort(arrayList3, new vk6((byte) 10));
            int size = arrayList3.size();
            int i8 = 0;
            while (i8 < size) {
                TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList3.get(i8);
                if (messageEntity.length > 0 && (i6 = messageEntity.offset) >= 0 && i6 < a.length()) {
                    if (messageEntity.offset + messageEntity.length > a.length()) {
                        messageEntity.length = a.length() - messageEntity.offset;
                    }
                    if ((!z4 || (messageEntity instanceof TLRPC.TL_messageEntityBold) || (messageEntity instanceof TLRPC.TL_messageEntityItalic) || (messageEntity instanceof TLRPC.TL_messageEntityStrike) || (messageEntity instanceof TLRPC.TL_messageEntityUnderline) || (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate) || (messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre) || (messageEntity instanceof TLRPC.TL_messageEntityMentionName) || (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) || (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) || (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) || (messageEntity instanceof TLRPC.TL_messageEntityDiffReplace) || (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete)) && uRLSpanArr != null && uRLSpanArr.length > 0) {
                        for (int i9 = 0; i9 < uRLSpanArr.length; i9++) {
                            URLSpan uRLSpan = uRLSpanArr[i9];
                            if (uRLSpan != null) {
                                int spanStart = spannable2.getSpanStart(uRLSpan);
                                int spanEnd = spannable2.getSpanEnd(uRLSpanArr[i9]);
                                int i10 = messageEntity.offset;
                                if ((i10 <= spanStart && messageEntity.length + i10 >= spanStart) || (i10 <= spanEnd && i10 + messageEntity.length >= spanEnd)) {
                                    spannable2.removeSpan(uRLSpanArr[i9]);
                                    uRLSpanArr[i9] = null;
                                }
                            }
                        }
                    }
                    if ((i != 1 || (messageEntity instanceof TLRPC.TL_messageEntityHashtag)) && !(messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) && !(messageEntity instanceof TLRPC.TL_messageEntityBlockquote) && !(messageEntity instanceof TLRPC.TL_messageEntityPre) && !(messageEntity instanceof TLRPC.TL_messageEntityDiffReplace)) {
                        rmb rmbVar = new rmb();
                        int i11 = messageEntity.offset;
                        rmbVar.b = i11;
                        rmbVar.c = i11 + messageEntity.length;
                        if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                            rmbVar.a = 256;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                            rmbVar.a = 8;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffDelete) {
                            rmbVar.a = TLObject.FLAG_13;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                            rmbVar.a = 16;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                            rmbVar.a = 1;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                            rmbVar.a = 2;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityCode) {
                            rmbVar.a = 4;
                        } else if (messageEntity instanceof TLRPC.TL_messageEntityDiffInsert) {
                            rmbVar.a = TLObject.FLAG_12;
                        } else {
                            if (messageEntity instanceof TLRPC.TL_messageEntityMentionName) {
                                if (z2) {
                                    rmbVar.a = 64;
                                    rmbVar.d = messageEntity;
                                }
                            } else if (messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                if (z2) {
                                    rmbVar.a = 64;
                                    rmbVar.d = messageEntity;
                                }
                            } else if (!z4 || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) || (messageEntity instanceof TLRPC.TL_messageEntityFormattedDate)) {
                                if (((messageEntity instanceof TLRPC.TL_messageEntityUrl) || (messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) && (str2 = messageEntity.url) != null) {
                                    try {
                                        String lowerCase = str2.toLowerCase();
                                        if (!lowerCase.startsWith("tg:passport")) {
                                            if (!lowerCase.startsWith("tg://passport")) {
                                                if (!lowerCase.startsWith("tg:secureid")) {
                                                    if (lowerCase.contains("resolve")) {
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityMention) || z2) {
                                    rmbVar.a = 128;
                                    rmbVar.d = messageEntity;
                                    if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        rmbVar.a = 1152;
                                    }
                                }
                            }
                            i8++;
                            size = i5;
                        }
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            rmb rmbVar2 = (rmb) arrayList2.get(i12);
                            if ((rmbVar2.a & 256) == 0 || rmbVar.b < rmbVar2.b || rmbVar.c > rmbVar2.c) {
                                int i13 = rmbVar.b;
                                int i14 = rmbVar2.b;
                                if (i13 > i14) {
                                    int i15 = rmbVar2.c;
                                    if (i13 < i15) {
                                        if (rmbVar.c < i15) {
                                            rmb rmbVar3 = new rmb(rmbVar);
                                            rmbVar3.c(rmbVar2);
                                            arrayList2.add(i12 + 1, rmbVar3);
                                            rmb rmbVar4 = new rmb(rmbVar2);
                                            rmbVar4.b = rmbVar.c;
                                            i12 += 2;
                                            size2 += 2;
                                            arrayList2.add(i12, rmbVar4);
                                        } else {
                                            rmb rmbVar5 = new rmb(rmbVar);
                                            rmbVar5.c(rmbVar2);
                                            rmbVar5.c = rmbVar2.c;
                                            i12++;
                                            size2++;
                                            arrayList2.add(i12, rmbVar5);
                                        }
                                        int i16 = rmbVar.b;
                                        rmbVar.b = rmbVar2.c;
                                        rmbVar2.c = i16;
                                    }
                                } else {
                                    int i17 = rmbVar.c;
                                    if (i14 < i17) {
                                        i7 = size;
                                        int i18 = rmbVar2.c;
                                        if (i17 == i18) {
                                            rmbVar2.c(rmbVar);
                                        } else if (i17 < i18) {
                                            rmb rmbVar6 = new rmb(rmbVar2);
                                            rmbVar6.c(rmbVar);
                                            rmbVar6.c = rmbVar.c;
                                            i12++;
                                            size2++;
                                            arrayList2.add(i12, rmbVar6);
                                            rmbVar2.b = rmbVar.c;
                                        } else {
                                            rmb rmbVar7 = new rmb(rmbVar);
                                            rmbVar7.b = rmbVar2.c;
                                            i12++;
                                            size2++;
                                            arrayList2.add(i12, rmbVar7);
                                            rmbVar2.c(rmbVar);
                                        }
                                        rmbVar.c = i14;
                                        i12++;
                                        size = i7;
                                    }
                                }
                            }
                            i7 = size;
                            i12++;
                            size = i7;
                        }
                        i5 = size;
                        if (rmbVar.b < rmbVar.c) {
                            arrayList2.add(rmbVar);
                        }
                        i8++;
                        size = i5;
                    }
                }
                i5 = size;
                i8++;
                size = i5;
            }
            int min = Math.min(1000, arrayList2.size());
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < min) {
                rmb rmbVar8 = (rmb) arrayList2.get(i19);
                int i22 = rmbVar8.b;
                if (i22 >= 0 && i22 < (i3 = rmbVar8.c) && i3 <= a.length() && (i != 1 || (rmbVar8.d instanceof TLRPC.TL_messageEntityHashtag))) {
                    TLRPC.MessageEntity messageEntity2 = rmbVar8.d;
                    if (messageEntity2 != null) {
                        int i23 = messageEntity2.offset;
                        str = TextUtils.substring(a, i23, messageEntity2.length + i23);
                    } else {
                        str = null;
                    }
                    TLRPC.MessageEntity messageEntity3 = rmbVar8.d;
                    if (!(messageEntity3 instanceof TLRPC.TL_messageEntityBotCommand)) {
                        if ((messageEntity3 instanceof TLRPC.TL_messageEntityHashtag) || (messageEntity3 instanceof TLRPC.TL_messageEntityMention)) {
                            charSequence2 = a;
                            spannable = spannable2;
                            b = b2;
                            i4 = jn7.Y3;
                        } else if (messageEntity3 instanceof TLRPC.TL_messageEntityCashtag) {
                            charSequence2 = a;
                            spannable = spannable2;
                            i4 = 250;
                            b = b2;
                        } else if (!(messageEntity3 instanceof TLRPC.TL_messageEntityEmail)) {
                            charSequence2 = a;
                            if (messageEntity3 instanceof TLRPC.TL_messageEntityUrl) {
                                if (i20 < 250) {
                                    i20++;
                                    if (!str.toLowerCase().contains("://")) {
                                        boolean z7 = rv0.R0;
                                        str = (rv0.n(Uri.parse(str)) ? "tonsite://" : "http://").concat(str);
                                    }
                                    String replaceAll = str.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                    if (m01.l(replaceAll)) {
                                        spannable = spannable2;
                                        b = b2;
                                        z6 = true;
                                        i19++;
                                        spannable2 = spannable;
                                        b2 = b;
                                        a = charSequence2;
                                    } else {
                                        spannable2.setSpan(new d8c(replaceAll, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                        spannable = spannable2;
                                        b = b2;
                                        z5 = false;
                                        z6 = true;
                                    }
                                }
                                spannable = spannable2;
                                b = b2;
                                i19++;
                                spannable2 = spannable;
                                b2 = b;
                                a = charSequence2;
                            } else if (messageEntity3 instanceof TLRPC.TL_messageEntityFormattedDate) {
                                if (i20 < 250) {
                                    i20++;
                                    spannable2.setSpan(new no4(str, rmbVar8, (TLRPC.TL_messageEntityFormattedDate) rmbVar8.d), rmbVar8.b, rmbVar8.c, 33);
                                    spannable = spannable2;
                                    b = b2;
                                    z5 = false;
                                }
                                spannable = spannable2;
                                b = b2;
                                i19++;
                                spannable2 = spannable;
                                b2 = b;
                                a = charSequence2;
                            } else {
                                if (messageEntity3 instanceof TLRPC.TL_messageEntityTonAddress) {
                                    spannable2.setSpan(new f8c(c00.i("tonaddress:", str), rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityBankCard) {
                                    spannable2.setSpan(new f8c(c00.i("card:", str), rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                } else if (messageEntity3 instanceof TLRPC.TL_messageEntityPhone) {
                                    String h = f78.h(str, false);
                                    if (str.startsWith("+")) {
                                        h = c00.i("+", h);
                                    }
                                    spannable2.setSpan(new f8c(c00.i("tel:", h), rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                } else {
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityTextUrl) {
                                        if (i20 < 250) {
                                            i20++;
                                            String str3 = messageEntity3.url;
                                            if (str3 != null) {
                                                str3 = str3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                                            }
                                            if (!m01.l(str3)) {
                                                spannable2.setSpan(new h8c(str3, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                            }
                                        }
                                        spannable = spannable2;
                                        b = b2;
                                        i19++;
                                        spannable2 = spannable;
                                        b2 = b;
                                        a = charSequence2;
                                    } else if (messageEntity3 instanceof TLRPC.TL_messageEntityMentionName) {
                                        spannable2.setSpan(new i8c(String.valueOf(((TLRPC.TL_messageEntityMentionName) rmbVar8.d).user_id), b2, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                    } else if (messageEntity3 instanceof TLRPC.TL_inputMessageEntityMentionName) {
                                        spannable2.setSpan(new i8c(String.valueOf(((TLRPC.TL_inputMessageEntityMentionName) rmbVar8.d).user_id.user_id), b2, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                    } else if ((rmbVar8.a & 4) != 0) {
                                        Spannable spannable3 = spannable2;
                                        byte b3 = b2;
                                        spannable = spannable3;
                                        b = b3;
                                        spannable.setSpan(new e8c(spannable3, rmbVar8.b, rmbVar8.c, b3, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                                        z5 = false;
                                    } else {
                                        spannable = spannable2;
                                        b = b2;
                                        spannable.setSpan(new smb(rmbVar8, 0), rmbVar8.b, rmbVar8.c, 33);
                                        z5 = true;
                                    }
                                    spannable = spannable2;
                                    b = b2;
                                    z5 = false;
                                }
                                spannable = spannable2;
                                b = b2;
                                z5 = false;
                                z6 = true;
                            }
                        } else if (i20 < 250) {
                            i20++;
                            spannable2.setSpan(new h8c(c00.i("mailto:", str), rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                            charSequence2 = a;
                            spannable = spannable2;
                            b = b2;
                            z5 = false;
                        }
                        if (i20 < i4) {
                            i20++;
                            spannable.setSpan(new f8c(str, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                            z5 = false;
                        } else {
                            i19++;
                            spannable2 = spannable;
                            b2 = b;
                            a = charSequence2;
                        }
                    } else if (i20 < 250) {
                        i20++;
                        spannable2.setSpan(new c8c(str, b2, rmbVar8), rmbVar8.b, rmbVar8.c, 33);
                        charSequence2 = a;
                        spannable = spannable2;
                        b = b2;
                        z5 = false;
                    }
                    if (!z5 && (rmbVar8.a & 256) != 0 && i21 < 100) {
                        i21++;
                        spannable.setSpan(new smb(rmbVar8, 0), rmbVar8.b, rmbVar8.c, 33);
                    }
                    i19++;
                    spannable2 = spannable;
                    b2 = b;
                    a = charSequence2;
                }
                charSequence2 = a;
                spannable = spannable2;
                b = b2;
                i19++;
                spannable2 = spannable;
                b2 = b;
                a = charSequence2;
            }
            CharSequence charSequence3 = a;
            Spannable spannable4 = spannable2;
            int i24 = 0;
            int size3 = arrayList3.size();
            for (int i25 = 0; i25 < size3; i25++) {
                TLRPC.MessageEntity messageEntity4 = (TLRPC.MessageEntity) arrayList3.get(i25);
                if (messageEntity4.length > 0 && (i2 = messageEntity4.offset) >= 0 && i2 < charSequence3.length()) {
                    if (messageEntity4.offset + messageEntity4.length > charSequence3.length()) {
                        messageEntity4.length = charSequence3.length() - messageEntity4.offset;
                    }
                    if (messageEntity4 instanceof TLRPC.TL_messageEntityBlockquote) {
                        int i26 = messageEntity4.offset;
                        r19.b(spannable4, i26, messageEntity4.length + i26, messageEntity4.collapsed);
                    } else if (messageEntity4 instanceof TLRPC.TL_messageEntityPre) {
                        if (i24 < 50) {
                            i24++;
                            int i27 = messageEntity4.offset;
                            int i28 = messageEntity4.length + i27;
                            spannable4.setSpan(new jk2(messageEntity4.language, spannable4.subSequence(i27, i28).toString(), true), i27, i28, 33);
                        }
                    } else if (messageEntity4 instanceof TLRPC.TL_messageEntityDiffReplace) {
                        int i29 = messageEntity4.offset;
                        spannable4.setSpan(new xpa(), i29, messageEntity4.length + i29, 33);
                    }
                }
            }
        }
        return z6;
    }

    public static void b0(ArrayList arrayList, long j) {
        if (arrayList == null || arrayList.isEmpty() || j == 0) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            if (message instanceof TLRPC.TL_messageEmpty) {
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                message.peer_id = tL_peerChannel;
                tL_peerChannel.channel_id = j;
            }
        }
    }

    public static long b2(int i, TLRPC.Message message, boolean z, boolean z2) {
        int i2;
        long e = yac.h(i).e();
        if (z2) {
            return u1(message);
        }
        if ((message.flags & TLObject.FLAG_30) != 0 && wf3.n(message.peer_id) == e) {
            i2 = message.quick_reply_shortcut_id;
        } else {
            if (!z && i >= 0 && wf3.n(message.peer_id) == e) {
                return Q1(e, message);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionTopicCreate) {
                i2 = message.id;
            } else {
                TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                if (messageReplyHeader == null || !messageReplyHeader.forum_topic) {
                    return z ? 1L : 0L;
                }
                if (!(message instanceof TLRPC.TL_messageService) || (messageAction instanceof TLRPC.TL_messageActionPinMessage)) {
                    i2 = messageReplyHeader.reply_to_top_id;
                    if (i2 == 0) {
                        i2 = messageReplyHeader.reply_to_msg_id;
                    }
                } else {
                    i2 = messageReplyHeader.reply_to_msg_id;
                    if (i2 == 0) {
                        i2 = messageReplyHeader.reply_to_top_id;
                    }
                }
            }
        }
        return i2;
    }

    public static void b6(ArrayList arrayList, List list) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize != null) {
                int size2 = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        TLRPC.PhotoSize photoSize2 = (TLRPC.PhotoSize) list.get(i2);
                        if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize2 instanceof TLRPC.TL_photoCachedSize) && photoSize2 != null && photoSize2.type.equals(photoSize.type)) {
                            photoSize.location = photoSize2.location;
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public static void c0(TL_iv.PageBlock pageBlock, int i, SpannableStringBuilder spannableStringBuilder, TL_iv.RichMessage richMessage) {
        if ((pageBlock instanceof TL_iv.pageBlockTitle) || (pageBlock instanceof TL_iv.pageBlockHeader) || (pageBlock instanceof TL_iv.pageBlockSubheader) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            f0(pageBlock.text, i, spannableStringBuilder, 1);
            return;
        }
        int i2 = 0;
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockKicker)) {
            f0(pageBlock.text, i, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            TL_iv.pageBlockBlockquoteBlocks pageblockblockquoteblocks = (TL_iv.pageBlockBlockquoteBlocks) pageBlock;
            while (i2 < pageblockblockquoteblocks.blocks.size()) {
                if (i2 > 0) {
                    spannableStringBuilder.append("  ");
                }
                c0(pageblockblockquoteblocks.blocks.get(i2), i, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i) {
                    spannableStringBuilder.delete(i, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
                i2++;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDetails) {
            f0(((TL_iv.pageBlockDetails) pageBlock).title, i, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockAuthorDate) {
            f0(((TL_iv.pageBlockAuthorDate) pageBlock).author, i, spannableStringBuilder, 0);
            return;
        }
        TLRPC.Document document = null;
        if (pageBlock instanceof TL_iv.pageBlockMath) {
            spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_formula, "fx")).append(" ").append((CharSequence) ob6.M0(2131754859, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131748444, null));
            TL_iv.PageCaption pageCaption = pageBlock.caption;
            if (pageCaption == null || (pageCaption.text instanceof TL_iv.textEmpty)) {
                return;
            }
            spannableStringBuilder.append("  ");
            f0(pageBlock.caption.text, i, spannableStringBuilder, 0);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPreformatted) {
            f0(pageBlock.text, i, spannableStringBuilder, 4);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockList) {
            TL_iv.pageBlockList pageblocklist = (TL_iv.pageBlockList) pageBlock;
            for (int i3 = 0; i3 < pageblocklist.items.size(); i3++) {
                if (i3 > 0) {
                    spannableStringBuilder.append("  ");
                }
                TL_iv.PageListItem pageListItem = pageblocklist.items.get(i3);
                if (pageListItem instanceof TL_iv.TL_pageListItemText) {
                    TL_iv.TL_pageListItemText tL_pageListItemText = (TL_iv.TL_pageListItemText) pageListItem;
                    if (tL_pageListItemText.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListItemText.checked)).append(" ");
                    } else {
                        spannableStringBuilder.append("• ");
                    }
                    f0(tL_pageListItemText.text, i, spannableStringBuilder, 0);
                } else if (pageListItem instanceof TL_iv.TL_pageListItemBlocks) {
                    TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = (TL_iv.TL_pageListItemBlocks) pageListItem;
                    if (tL_pageListItemBlocks.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListItemBlocks.checked)).append(" ");
                    } else {
                        spannableStringBuilder.append("• ");
                    }
                    for (int i4 = 0; i4 < tL_pageListItemBlocks.blocks.size(); i4++) {
                        if (i4 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(tL_pageListItemBlocks.blocks.get(i4), i, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i) {
                            spannableStringBuilder.delete(i, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                    }
                }
                if (spannableStringBuilder.length() >= i) {
                    spannableStringBuilder.delete(i, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockOrderedList) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = (TL_iv.pageBlockOrderedList) pageBlock;
            for (int i5 = 0; i5 < pageblockorderedlist.items.size(); i5++) {
                if (i5 > 0) {
                    spannableStringBuilder.append("  ");
                }
                TL_iv.PageListOrderedItem pageListOrderedItem = pageblockorderedlist.items.get(i5);
                if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemText) {
                    TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = (TL_iv.TL_pageListOrderedItemText) pageListOrderedItem;
                    spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemText.num);
                    spannableStringBuilder.append(". ");
                    if (tL_pageListOrderedItemText.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemText.checked)).append(" ");
                    }
                    f0(tL_pageListOrderedItemText.text, i, spannableStringBuilder, 0);
                } else if (pageListOrderedItem instanceof TL_iv.TL_pageListOrderedItemBlocks) {
                    TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = (TL_iv.TL_pageListOrderedItemBlocks) pageListOrderedItem;
                    spannableStringBuilder.append((CharSequence) tL_pageListOrderedItemBlocks.num);
                    spannableStringBuilder.append(". ");
                    if (tL_pageListOrderedItemBlocks.checkbox) {
                        spannableStringBuilder.append((CharSequence) L(tL_pageListOrderedItemBlocks.checked)).append(" ");
                    }
                    for (int i6 = 0; i6 < tL_pageListOrderedItemBlocks.blocks.size(); i6++) {
                        if (i6 > 0) {
                            spannableStringBuilder.append("  ");
                        }
                        c0(tL_pageListOrderedItemBlocks.blocks.get(i6), i, spannableStringBuilder, richMessage);
                        if (spannableStringBuilder.length() >= i) {
                            spannableStringBuilder.delete(i, spannableStringBuilder.length());
                            spannableStringBuilder.append("…");
                            return;
                        }
                    }
                }
                if (spannableStringBuilder.length() >= i) {
                    spannableStringBuilder.delete(i, spannableStringBuilder.length());
                    spannableStringBuilder.append("…");
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockTable) {
            spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_preview_table, "⊞")).append(" ");
            TL_iv.RichText richText = ((TL_iv.pageBlockTable) pageBlock).title;
            if (richText == null || (richText instanceof TL_iv.textEmpty)) {
                spannableStringBuilder.append((CharSequence) ob6.M0(2131754850, null));
                return;
            } else {
                f0(richText, i, spannableStringBuilder, 0);
                return;
            }
        }
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            TL_iv.pageBlockAudio pageblockaudio = (TL_iv.pageBlockAudio) pageBlock;
            while (true) {
                if (i2 >= richMessage.documents.size()) {
                    break;
                }
                if (richMessage.documents.get(i2).id == pageblockaudio.audio_id) {
                    document = richMessage.documents.get(i2);
                    break;
                }
                i2++;
            }
            if (document != null) {
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) hl.V(TLRPC.TL_documentAttributeAudio.class, document.attributes);
                TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = (TLRPC.TL_documentAttributeFilename) hl.V(TLRPC.TL_documentAttributeFilename.class, document.attributes);
                if (tL_documentAttributeAudio == null) {
                    if (tL_documentAttributeFilename == null || tL_documentAttributeFilename.file_name == null) {
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                    return;
                }
                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title) && !TextUtils.isEmpty(tL_documentAttributeAudio.performer)) {
                    spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.performer).append(" – ").append((CharSequence) tL_documentAttributeAudio.title);
                    return;
                }
                if (!TextUtils.isEmpty(tL_documentAttributeAudio.title)) {
                    spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeAudio.title);
                    return;
                } else {
                    if (tL_documentAttributeFilename == null || tL_documentAttributeFilename.file_name == null) {
                        return;
                    }
                    spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_audio_preview, "🎵")).append(" ").append((CharSequence) tL_documentAttributeFilename.file_name);
                    return;
                }
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            TLRPC.Document Z = hl.Z(((TL_iv.pageBlockDocument) pageBlock).document_id, richMessage.documents);
            if (Z != null) {
                String B = xb4.B(Z);
                SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) S5(R.drawable.msg_filled_data_files, "📎")).append(" ");
                if (TextUtils.isEmpty(B)) {
                    B = ob6.M0(2131753968, null);
                }
                append.append((CharSequence) B);
                return;
            }
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCover) {
            c0(((TL_iv.pageBlockCover) pageBlock).cover, i, spannableStringBuilder, richMessage);
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131753941, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockVideo) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131753926, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockCollage) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131754891, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131754851, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockUnsupported) {
            spannableStringBuilder.append((CharSequence) ob6.M0(2131743488, null));
            return;
        }
        if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
            TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
            for (int i7 = 0; i7 < pageblockbuttonrow.buttons.size(); i7++) {
                if (i7 > 0) {
                    spannableStringBuilder.append("  ");
                }
                f0(pageblockbuttonrow.buttons.get(i7).text, i, spannableStringBuilder, 0);
            }
        }
    }

    public static int c2(TLRPC.Message message) {
        int i = !message.unread ? 1 : 0;
        return !message.media_unread ? i | 2 : i;
    }

    public static boolean c3(TLRPC.Message message) {
        if (message != null) {
            return f3(message.id) || message.ephemeralReceiverBotId != 0;
        }
        return false;
    }

    public static boolean c5(TLRPC.Message message) {
        if (c3(message)) {
            return message.ephemeralReceiverBotId == -1 || message.ephemeralAnchorMsgId != 0;
        }
        return false;
    }

    public static void c6(TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollResults pollResults) {
        TLRPC.Poll poll;
        ArrayList<TLRPC.PollAnswerVoters> arrayList;
        ArrayList arrayList2;
        byte[] bArr;
        ArrayList<TLRPC.PollAnswerVoters> arrayList3;
        if (tL_messageMediaPoll == null || pollResults == null) {
            return;
        }
        int i = pollResults.flags & 2;
        boolean z = pollResults.min;
        if (i != 0) {
            if (!z || (arrayList3 = tL_messageMediaPoll.results.results) == null) {
                arrayList2 = null;
                bArr = null;
            } else {
                int size = arrayList3.size();
                arrayList2 = null;
                bArr = null;
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters = tL_messageMediaPoll.results.results.get(i2);
                    if (pollAnswerVoters.chosen) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(pollAnswerVoters.option);
                    }
                    if (pollAnswerVoters.correct) {
                        bArr = pollAnswerVoters.option;
                    }
                }
            }
            TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
            ArrayList<TLRPC.PollAnswerVoters> arrayList4 = pollResults.results;
            pollResults2.results = arrayList4;
            if (arrayList2 != null || bArr != null) {
                int size2 = arrayList4.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    TLRPC.PollAnswerVoters pollAnswerVoters2 = tL_messageMediaPoll.results.results.get(i3);
                    if (arrayList2 != null) {
                        int size3 = arrayList2.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                                break;
                            }
                            if (Arrays.equals(pollAnswerVoters2.option, (byte[]) arrayList2.get(i4))) {
                                pollAnswerVoters2.chosen = true;
                                arrayList2.remove(i4);
                                break;
                            }
                            i4++;
                        }
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                    }
                    if (bArr != null && Arrays.equals(pollAnswerVoters2.option, bArr)) {
                        pollAnswerVoters2.correct = true;
                        bArr = null;
                    }
                    if (arrayList2 == null && bArr == null) {
                        break;
                    }
                }
            }
            tL_messageMediaPoll.results.flags |= 2;
        } else if (!z && (poll = tL_messageMediaPoll.poll) != null && poll.hide_results_until_close && ((arrayList = pollResults.results) == null || arrayList.isEmpty())) {
            tL_messageMediaPoll.results.results = new ArrayList<>();
            TLRPC.PollResults pollResults3 = tL_messageMediaPoll.results;
            pollResults3.flags = vsd.b(pollResults3.flags, 2, false);
        }
        if ((pollResults.flags & 4) != 0) {
            TLRPC.PollResults pollResults4 = tL_messageMediaPoll.results;
            pollResults4.total_voters = pollResults.total_voters;
            pollResults4.flags |= 4;
        }
        if ((pollResults.flags & 8) != 0) {
            TLRPC.PollResults pollResults5 = tL_messageMediaPoll.results;
            pollResults5.recent_voters = pollResults.recent_voters;
            pollResults5.flags |= 8;
        }
        if ((pollResults.flags & 16) != 0) {
            TLRPC.PollResults pollResults6 = tL_messageMediaPoll.results;
            pollResults6.solution = pollResults.solution;
            pollResults6.solution_entities = pollResults.solution_entities;
            pollResults6.flags |= 16;
        }
        if (pollResults.min) {
            return;
        }
        TLRPC.PollResults pollResults7 = tL_messageMediaPoll.results;
        pollResults7.has_unread_votes = pollResults.has_unread_votes;
        pollResults7.can_view_stats = pollResults.can_view_stats;
    }

    public static void d(CharSequence charSequence, boolean z) {
        e(z, charSequence, true, false, false);
    }

    public static SpannableStringBuilder d0(TL_iv.RichMessage richMessage) {
        return e0(richMessage, 1024);
    }

    public static void e(boolean z, CharSequence charSequence, boolean z2, boolean z3, boolean z4) {
        if ((charSequence instanceof Spannable) && M(charSequence)) {
            try {
                hl.c((Spannable) charSequence, 1, z4, false);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            h(z, charSequence, z2, 0, 0, z3);
        }
    }

    public static SpannableStringBuilder e0(TL_iv.RichMessage richMessage, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (richMessage != null) {
            for (int i2 = 0; i2 < richMessage.blocks.size(); i2++) {
                TL_iv.PageBlock pageBlock = richMessage.blocks.get(i2);
                if (i2 > 0) {
                    spannableStringBuilder.append((CharSequence) "  ");
                }
                c0(pageBlock, i, spannableStringBuilder, richMessage);
                if (spannableStringBuilder.length() >= i) {
                    spannableStringBuilder.delete(i, spannableStringBuilder.length());
                    spannableStringBuilder.append((CharSequence) "…");
                    return spannableStringBuilder;
                }
            }
        }
        return spannableStringBuilder;
    }

    public static String e2(TLObject tLObject, ArrayList arrayList, int i) {
        String str;
        String K;
        long j;
        String str2;
        long j2;
        String str3 = null;
        if (tLObject == null) {
            str2 = "";
            j2 = 0;
        } else {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = user.deleted ? ob6.M0(2131749082, null) : lv2.m(0, user.first_name, user.last_name);
                K = lbc.p(user);
                j = user.id;
            } else {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = chat.title;
                K = xc2.K(chat, false);
                j = -chat.id;
            }
            str2 = str;
            str3 = K;
            j2 = j;
        }
        if (i >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName.user_id = j2;
            tL_messageEntityMentionName.offset = i;
            tL_messageEntityMentionName.length = str2.length();
            arrayList.add(tL_messageEntityMentionName);
        }
        if (TextUtils.isEmpty(str3)) {
            return str2;
        }
        if (i >= 0) {
            TLRPC.TL_messageEntityMentionName tL_messageEntityMentionName2 = new TLRPC.TL_messageEntityMentionName();
            tL_messageEntityMentionName2.user_id = j2;
            tL_messageEntityMentionName2.offset = str2.length() + i + 2;
            tL_messageEntityMentionName2.length = str3.length() + 1;
            arrayList.add(tL_messageEntityMentionName2);
        }
        return String.format("%1$s (@%2$s)", str2, str3);
    }

    public static boolean e3(TLRPC.Message message) {
        return c3(message) && !c5(message);
    }

    public static void e6(TLRPC.Message message, TLRPC.TL_messageReactions tL_messageReactions) {
        if (message == null || tL_messageReactions == null) {
            return;
        }
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        if (tL_messageReactions2 != null) {
            int size = tL_messageReactions2.results.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                TLRPC.ReactionCount reactionCount = message.reactions.results.get(i);
                int size2 = tL_messageReactions.results.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    TLRPC.ReactionCount reactionCount2 = tL_messageReactions.results.get(i2);
                    if (x49.g(reactionCount.reaction, reactionCount2.reaction)) {
                        if (!z && tL_messageReactions.min && reactionCount.chosen) {
                            reactionCount2.chosen = true;
                            z = true;
                        }
                        reactionCount2.lastDrawnPosition = reactionCount.lastDrawnPosition;
                    }
                }
                if (reactionCount.chosen) {
                    z = true;
                }
            }
        }
        message.reactions = tL_messageReactions;
        message.flags |= TLObject.FLAG_20;
    }

    public static void f0(TL_iv.RichText richText, int i, SpannableStringBuilder spannableStringBuilder, int i2) {
        if (richText != null) {
            int length = spannableStringBuilder.length();
            if (richText instanceof TL_iv.textPlain) {
                spannableStringBuilder.append((CharSequence) ((TL_iv.textPlain) richText).text);
            } else if (richText instanceof TL_iv.textButton) {
                f0(richText.text, i, spannableStringBuilder, i2);
            } else if (richText instanceof TL_iv.textBold) {
                f0(richText.text, i, spannableStringBuilder, i2 | 1);
            } else if (richText instanceof TL_iv.textItalic) {
                f0(richText.text, i, spannableStringBuilder, i2 | 2);
            } else if (richText instanceof TL_iv.textUnderline) {
                f0(richText.text, i, spannableStringBuilder, i2 | 16);
            } else if (richText instanceof TL_iv.textStrike) {
                f0(richText.text, i, spannableStringBuilder, i2 | 8);
            } else if (richText instanceof TL_iv.textFixed) {
                f0(richText.text, i, spannableStringBuilder, i2 | 4);
            } else if (richText instanceof TL_iv.textSpoiler) {
                f0(richText.text, i, spannableStringBuilder, i2 | 256);
            } else if (richText instanceof TL_iv.textUrl) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    rmb rmbVar = new rmb();
                    rmbVar.a = i2;
                    spannableStringBuilder.setSpan(new d8c(richText.url, rmbVar), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textEmail) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    rmb rmbVar2 = new rmb();
                    rmbVar2.a = i2;
                    spannableStringBuilder.setSpan(new h8c("mailto:" + richText.email, rmbVar2), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textMath) {
                spannableStringBuilder.append((CharSequence) S5(R.drawable.iv_formula, "fx")).append(" ").append((CharSequence) ob6.M0(2131754859, null));
            } else if (richText instanceof TL_iv.textPhone) {
                f0(richText.text, i, spannableStringBuilder, i2);
                if (spannableStringBuilder.length() > length) {
                    TL_iv.textPhone textphone = (TL_iv.textPhone) richText;
                    String h = f78.h(textphone.phone, false);
                    if (textphone.phone.startsWith("+")) {
                        h = c00.i("+", h);
                    }
                    rmb rmbVar3 = new rmb();
                    rmbVar3.a = i2;
                    spannableStringBuilder.setSpan(new f8c(c00.i("tel:", h), rmbVar3), length, spannableStringBuilder.length(), 33);
                }
            } else if (richText instanceof TL_iv.textConcat) {
                ArrayList<TL_iv.RichText> arrayList = ((TL_iv.textConcat) richText).texts;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    TL_iv.RichText richText2 = arrayList.get(i3);
                    i3++;
                    f0(richText2, i, spannableStringBuilder, i2);
                    if (spannableStringBuilder.length() >= i) {
                        spannableStringBuilder.delete(i, spannableStringBuilder.length());
                        spannableStringBuilder.append("…");
                        return;
                    }
                }
            }
            if (spannableStringBuilder.length() <= length || i2 == 0) {
                return;
            }
            rmb rmbVar4 = new rmb();
            rmbVar4.a = i2;
            spannableStringBuilder.setSpan(new smb(rmbVar4, 0), length, spannableStringBuilder.length(), 33);
        }
    }

    public static int f1(TLRPC.BotInlineResult botInlineResult) {
        int j2 = (int) j2(botInlineResult.content);
        return j2 == 0 ? (int) j2(botInlineResult.thumb) : j2;
    }

    public static String f2(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return ob6.M0(2131743316, null).toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            sb.append("@");
            sb.append((String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static boolean f3(int i) {
        return (i & 1879048192) == 1610612736;
    }

    public static StaticLayout f5(float f, float f2, int i, Layout.Alignment alignment, TextPaint textPaint, CharSequence charSequence, boolean z) {
        int i2 = i <= 0 ? 1 : i;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 24) {
            return new StaticLayout(charSequence, textPaint, i2, alignment, f, f2, false);
        }
        StaticLayout.Builder alignment2 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setLineSpacing(f2, f).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment);
        if (z) {
            alignment2.setIncludePad(false);
        }
        if (i3 >= 28) {
            alignment2.setUseLineSpacingFromFallbacks(false);
        }
        StaticLayout build = alignment2.build();
        for (int i4 = 0; i4 < build.getLineCount(); i4++) {
            if (build.getLineRight(i4) > i2) {
                StaticLayout.Builder alignment3 = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i2).setLineSpacing(f2, f).setBreakStrategy(0).setHyphenationFrequency(0).setAlignment(alignment);
                if (z) {
                    alignment3.setIncludePad(false);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    alignment3.setUseLineSpacingFromFallbacks(false);
                }
                return alignment3.build();
            }
        }
        return build;
    }

    public static void g(int i, TLRPC.MessageReactions messageReactions, int i2, long j, boolean z) {
        TLRPC.MessageReactor messageReactor = null;
        TLRPC.ReactionCount reactionCount = null;
        for (int i3 = 0; i3 < messageReactions.results.size(); i3++) {
            if (messageReactions.results.get(i3).reaction instanceof TLRPC.TL_reactionPaid) {
                reactionCount = messageReactions.results.get(i3);
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 >= messageReactions.top_reactors.size()) {
                break;
            }
            if (messageReactions.top_reactors.get(i4).my) {
                messageReactor = messageReactions.top_reactors.get(i4);
                break;
            }
            i4++;
        }
        if (reactionCount == null && i2 > 0) {
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = new TLRPC.TL_reactionPaid();
            messageReactions.results.add(0, reactionCount);
        }
        if (reactionCount != null) {
            reactionCount.chosen = z;
            int max = Math.max(0, reactionCount.count + i2);
            reactionCount.count = max;
            if (max <= 0) {
                messageReactions.results.remove(reactionCount);
            }
        }
        if (messageReactor == null && i2 > 0) {
            messageReactor = new TLRPC.TL_messageReactor();
            messageReactor.my = true;
            messageReactions.top_reactors.add(messageReactor);
        }
        if (messageReactor != null) {
            messageReactor.count = Math.max(0, messageReactor.count + i2);
            messageReactor.anonymous = j == 2666000;
            if (j == 0 || j == 2666000) {
                messageReactor.peer_id = uc7.s1(i).y1(yac.h(i).e());
            } else {
                messageReactor.peer_id = uc7.s1(i).y1(j);
            }
            if (messageReactor.count <= 0) {
                messageReactions.top_reactors.remove(messageReactor);
            }
        }
    }

    public static int[] g1(TLRPC.BotInlineResult botInlineResult) {
        int[] k2 = k2(botInlineResult.content);
        if (k2 != null) {
            return k2;
        }
        int[] k22 = k2(botInlineResult.thumb);
        return k22 == null ? new int[]{0, 0} : k22;
    }

    public static CharSequence g6() {
        CharSequence[] charSequenceArr = r3;
        if (charSequenceArr == null) {
            charSequenceArr = new CharSequence[2];
            r3 = charSequenceArr;
        }
        if (charSequenceArr[0] == null) {
            charSequenceArr[0] = new SpannableStringBuilder("u");
            wm2 wm2Var = new wm2(R.drawable.mini_reply_user, 0);
            wm2Var.H = 0.9f;
            float L = hl.L(1.0f);
            wm2Var.r = 0.0f;
            wm2Var.s = L;
            ((SpannableStringBuilder) r3[0]).setSpan(wm2Var, 0, 1, 33);
        }
        return r3[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(boolean z, CharSequence charSequence, boolean z2, int i, int i2, boolean z3) {
        boolean z4;
        Matcher matcher;
        int i3;
        int i4;
        int i5;
        f8c f8cVar;
        Object[] objArr;
        f8c c8cVar;
        if (charSequence == null) {
            return;
        }
        int i6 = 3;
        int i7 = 1;
        try {
            if (i == 3 || i == 4) {
                try {
                    Pattern pattern = o3;
                    if (pattern == null) {
                        pattern = Pattern.compile("\\b(?:(\\d{1,2}):)?(\\d{1,3}):([0-5][0-9])\\b(?: - |)([^\\n]*)");
                        o3 = pattern;
                    }
                    matcher = pattern.matcher(charSequence);
                } catch (Exception e) {
                    e = e;
                    z4 = 1;
                    cc4.g(e, z4);
                    return;
                }
            } else if (i == 1) {
                Pattern pattern2 = n3;
                if (pattern2 == null) {
                    pattern2 = Pattern.compile("(^|\\s|\\()@[a-zA-Z\\d_.]{1,32}|(^|\\s|\\()#[\\w.]+");
                    n3 = pattern2;
                }
                matcher = pattern2.matcher(charSequence);
            } else {
                Pattern pattern3 = m3;
                if (pattern3 == null) {
                    pattern3 = Pattern.compile("(^|\\s)/[a-zA-Z@\\d_]{1,255}|(^|\\s|\\()@[a-zA-Z\\d_]{1,32}|(^|\\s|\\()#[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s|\\()\\$[^0-9][\\w.]+(@[^0-9][\\w.]+)?|(^|\\s)\\$[A-Z]{3,8}([ ,.]|$)");
                    m3 = pattern3;
                }
                matcher = pattern3.matcher(charSequence);
            }
            if (charSequence instanceof Spannable) {
                Spannable spannable = (Spannable) charSequence;
                int i8 = 0;
                while (matcher.find() && i8 < 100) {
                    int start = matcher.start();
                    int end = matcher.end();
                    f8c f8cVar2 = null;
                    if (i == i6 || i == 4) {
                        i3 = 0;
                        matcher.groupCount();
                        int start2 = matcher.start(i7);
                        int end2 = matcher.end(i7);
                        int start3 = matcher.start(2);
                        int end3 = matcher.end(2);
                        int start4 = matcher.start(i6);
                        int end4 = matcher.end(i6);
                        int start5 = matcher.start(4);
                        i4 = i8;
                        int end5 = matcher.end(4);
                        int intValue = Utilities.z(charSequence.subSequence(start3, end3)).intValue();
                        int intValue2 = Utilities.z(charSequence.subSequence(start4, end4)).intValue();
                        int intValue3 = (start2 < 0 || end2 < 0) ? -1 : Utilities.z(charSequence.subSequence(start2, end2)).intValue();
                        String charSequence2 = (start5 < 0 || end5 < 0) ? null : charSequence.subSequence(start5, end5).toString();
                        if (start5 >= 0 || end5 >= 0) {
                            end = end4;
                        }
                        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(start, end, URLSpan.class);
                        if (uRLSpanArr == null || uRLSpanArr.length <= 0) {
                            int i9 = (intValue * 60) + intValue2;
                            if (intValue3 > 0) {
                                i9 += intValue3 * 3600;
                            }
                            if (i9 <= i2) {
                                i5 = 3;
                                if (i == 3) {
                                    f8cVar = new f8c("video?" + i9, (rmb) null);
                                } else {
                                    f8cVar = new f8c("audio?" + i9, (rmb) null);
                                }
                                f8cVar2 = f8cVar;
                                f8cVar2.d = charSequence2;
                                if (f8cVar2 == null) {
                                    if (z3 && (objArr = (ClickableSpan[]) spannable.getSpans(start, end, ClickableSpan.class)) != null && objArr.length > 0) {
                                        spannable.removeSpan(objArr[i3]);
                                    }
                                    spannable.setSpan(f8cVar2, start, end, i3);
                                    i8 = i4 + 1;
                                } else {
                                    i8 = i4;
                                }
                                i6 = i5;
                            }
                        }
                        i8 = i4;
                        i6 = 3;
                    } else {
                        char charAt = charSequence.charAt(start);
                        i3 = 0;
                        if (i != 0) {
                            if (charAt != '@' && charAt != '#') {
                                start++;
                            }
                            charAt = charSequence.charAt(start);
                            if (charAt != '@' && charAt != '#') {
                                i4 = i8;
                                i8 = i4;
                                i6 = 3;
                            }
                        } else if (charAt != '@' && charAt != '#' && charAt != '/' && charAt != '$') {
                            start++;
                        }
                        if (i == i7) {
                            if (charAt == '@') {
                                c8cVar = new f8c("https://instagram.com/" + charSequence.subSequence(start + 1, end).toString(), (rmb) null);
                            } else {
                                c8cVar = new f8c("https://www.instagram.com/explore/tags/" + charSequence.subSequence(start + 1, end).toString(), (rmb) null);
                            }
                        } else if (i == 2) {
                            if (charAt == '@') {
                                c8cVar = new f8c("https://twitter.com/" + charSequence.subSequence(start + 1, end).toString(), (rmb) null);
                            } else {
                                c8cVar = new f8c("https://twitter.com/hashtag/" + charSequence.subSequence(start + 1, end).toString(), (rmb) null);
                            }
                        } else if (charSequence.charAt(start) != '/') {
                            String charSequence3 = charSequence.subSequence(start, end).toString();
                            if (charSequence3 != null) {
                                charSequence3 = charSequence3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                            }
                            i5 = i6;
                            i4 = i8;
                            f8cVar2 = new f8c(charSequence3, (rmb) null);
                            if (f8cVar2 == null) {
                            }
                            i6 = i5;
                        } else if (z2) {
                            c8cVar = new c8c(charSequence.subSequence(start, end).toString(), z ? 1 : 0, null);
                        } else {
                            i5 = i6;
                            i4 = i8;
                            if (f8cVar2 == null) {
                            }
                            i6 = i5;
                        }
                        i5 = i6;
                        f8cVar2 = c8cVar;
                        i4 = i8;
                        if (f8cVar2 == null) {
                        }
                        i6 = i5;
                    }
                    i7 = 1;
                }
            }
        } catch (Exception e2) {
            e = e2;
            z4 = i7;
        }
    }

    public static CharSequence h0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z) {
        aob.O();
        TextPaint textPaint = aob.s2;
        if (textPaint == null) {
            textPaint = new TextPaint(1);
            textPaint.setTypeface(hl.o());
            textPaint.setTextSize(hl.L(Math.max(16, xea.S0) - 2));
        }
        return j0(tL_textWithEntities, z, false, textPaint);
    }

    public static int h2(TLRPC.TL_document tL_document) {
        if (tL_document != null) {
            int size = tL_document.attributes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.DocumentAttribute documentAttribute = tL_document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.w;
                }
            }
        }
        return 0;
    }

    public static boolean h4(TLRPC.Document document) {
        if (document != null && "video/mp4".equals(document.mime_type)) {
            boolean z = false;
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    i = documentAttribute.w;
                    i2 = documentAttribute.h;
                    z = documentAttribute.round_message;
                }
            }
            if (z && i <= 1280 && i2 <= 1280) {
                return true;
            }
        }
        return false;
    }

    public static CharSequence i0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, TextPaint textPaint) {
        return j0(tL_textWithEntities, z, false, textPaint);
    }

    public static TLRPC.InputStickerSet i1(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                TLRPC.InputStickerSet inputStickerSet = documentAttribute.stickerset;
                if (inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty) {
                    return null;
                }
                return inputStickerSet;
            }
        }
        return null;
    }

    public static boolean i4(TLRPC.Message message) {
        return (!(n1(message) instanceof TLRPC.TL_messageMediaWebPage) || n1(message).webpage == null) ? n1(message) != null && h4(n1(message).document) : h4(n1(message).webpage.document);
    }

    public static CharSequence j0(TLRPC.TL_textWithEntities tL_textWithEntities, boolean z, boolean z2, TextPaint textPaint) {
        if (tL_textWithEntities == null || tL_textWithEntities.text == null) {
            return "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_textWithEntities.text);
        b(spannableStringBuilder, tL_textWithEntities.entities, z, false, z2, false, 0);
        return A5(pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0), tL_textWithEntities.entities, textPaint.getFontMetricsInt(), false);
    }

    public static TLRPC.InputStickerSet j1(TLRPC.Message message) {
        TLRPC.Document G0 = G0(message);
        if (G0 != null) {
            return i1(G0);
        }
        return null;
    }

    public static double j2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return 0.0d;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return documentAttribute.duration;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                return documentAttribute.duration;
            }
        }
        return 0.0d;
    }

    public static int[] k2(TLRPC.WebDocument webDocument) {
        if (webDocument == null) {
            return null;
        }
        int size = webDocument.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = webDocument.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                return new int[]{documentAttribute.w, documentAttribute.h};
            }
        }
        return null;
    }

    public static boolean l3(TLRPC.Message message) {
        return ((message.flags & 4) == 0 || message.fwd_from == null) ? false : true;
    }

    public static boolean l4(TLRPC.Message message) {
        if (message instanceof TLRPC.TL_message_secret) {
            return ((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || i4(message) || K4(message)) && n1(message).ttl_seconds != 0;
        }
        if (message instanceof TLRPC.TL_message) {
            return ((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || (n1(message) instanceof TLRPC.TL_messageMediaDocument)) && n1(message).ttl_seconds != 0;
        }
        return false;
    }

    public static TLRPC.MessageMedia m1(r47 r47Var) {
        TLRPC.Message message;
        if (r47Var == null || (message = r47Var.k) == null) {
            return null;
        }
        TLRPC.MessageMedia messageMedia = r47Var.a1;
        return messageMedia != null ? messageMedia : n1(message);
    }

    public static CharSequence m2() {
        if (s3 == null) {
            s3 = new SpannableStringBuilder("g");
            wm2 wm2Var = new wm2(R.drawable.msg_folders_groups, 0);
            wm2Var.I = 0.7f;
            wm2Var.J = 0.7f;
            s3.setSpan(wm2Var, 0, 1, 33);
        }
        return s3;
    }

    public static boolean m3(TLRPC.Document document) {
        if (document == null) {
            return false;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) {
                return ((TLRPC.TL_documentAttributeCustomEmoji) documentAttribute).free;
            }
        }
        return false;
    }

    public static TLRPC.MessageMedia n1(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? message.media : ((TLRPC.TL_messageExtendedMedia) message.media.extended_media.get(0)).media;
    }

    public static boolean p(TLRPC.Document document) {
        return (K2(document, true) || N4(document)) && i86.e(1);
    }

    public static long p1(TLRPC.MessageMedia messageMedia) {
        TLRPC.WebPage webPage;
        TLRPC.Document document = (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || (webPage = messageMedia.webpage) == null) ? messageMedia instanceof TLRPC.TL_messageMediaGame ? messageMedia.game.document : messageMedia != null ? messageMedia.document : null : webPage.document;
        if (document != null) {
            return document.size;
        }
        return 0L;
    }

    public static void p5(TLRPC.Message message) {
        TLRPC.Peer peer = message.from_id;
        if (peer == null) {
            message.flags &= -257;
        }
        if (peer == null) {
            message.flags &= -5;
        }
        if (message.reply_to == null) {
            message.flags &= -9;
        }
        if (message.media == null) {
            message.flags &= -513;
        }
        if (message.reply_markup == null) {
            message.flags &= -65;
        }
        if (message.replies == null) {
            message.flags &= -8388609;
        }
        if (message.reactions == null) {
            message.flags &= -1048577;
        }
    }

    public static boolean r(int i, boolean z, TLRPC.Message message, TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.Peer peer;
        if (message == null) {
            return false;
        }
        if (xc2.V(chat) && (message.action instanceof TLRPC.TL_messageActionChatJoinedByRequest)) {
            return false;
        }
        if (message.id >= 0) {
            if (chat == null && (peer = message.peer_id) != null && peer.channel_id != 0) {
                chat = uc7.s1(i).M0(Long.valueOf(message.peer_id.channel_id));
            }
            if (xc2.T(chat)) {
                if (!z || chat.megagroup) {
                    boolean z2 = message.out;
                    if (z2 && (message instanceof TLRPC.TL_messageService)) {
                        if (message.id == 1 || !xc2.y(13, chat)) {
                            return false;
                        }
                    } else if (!z) {
                        if (message.id == 1) {
                            return false;
                        }
                        if (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || (!tL_chatAdminRights.delete_messages && (!z2 || (!chat.megagroup && !tL_chatAdminRights.post_messages)))) && (!chat.megagroup || !z2))) {
                            return false;
                        }
                    }
                } else if (!chat.creator) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights2 = chat.admin_rights;
                    if (tL_chatAdminRights2 == null) {
                        return false;
                    }
                    if (!tL_chatAdminRights2.delete_messages && !message.out) {
                        return false;
                    }
                }
            } else if (!z && !message.out && xc2.T(chat)) {
                return false;
            }
        }
        return true;
    }

    public static boolean r3(jxc jxcVar) {
        if (jxcVar != null) {
            if (jxcVar.e.equals("image/gif")) {
                return true;
            }
            if ("video/mp4".equals(jxcVar.e)) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < jxcVar.c.size(); i3++) {
                    TLRPC.DocumentAttribute documentAttribute = (TLRPC.DocumentAttribute) jxcVar.c.get(i3);
                    if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAnimated) && (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                        i = documentAttribute.w;
                        i2 = documentAttribute.h;
                    }
                }
                if (i <= 1280 && i2 <= 1280) {
                    return true;
                }
            }
        }
        return false;
    }

    public static CharSequence r5(int i, long j) {
        if (j >= 0) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(j));
            return X1 != null ? hl.A2(lbc.r(X1)) : "";
        }
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-j));
        if (M0 != null) {
            return new SpannableStringBuilder(xc2.V(M0) ? F() : m2()).append((CharSequence) " ").append((CharSequence) hl.A2(M0.title));
        }
        return "";
    }

    public static boolean s3(TLRPC.Document document, boolean z) {
        String str;
        if (document == null || (str = document.mime_type) == null) {
            return false;
        }
        return (str.equals("image/gif") && !z) || M3(document);
    }

    public static CharSequence s5(int i, TLRPC.Peer peer, boolean z) {
        TLRPC.Chat M0;
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(peer.user_id));
            return X1 != null ? z ? new SpannableStringBuilder(g6()).append((CharSequence) " ").append((CharSequence) lbc.r(X1)) : lbc.r(X1) : "";
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(peer.chat_id));
            if (M02 == null) {
                return "";
            }
            if (z) {
                return new SpannableStringBuilder(xc2.V(M02) ? F() : m2()).append((CharSequence) " ").append((CharSequence) M02.title);
            }
            return M02.title;
        }
        if (!(peer instanceof TLRPC.TL_peerChannel) || (M0 = uc7.s1(i).M0(Long.valueOf(peer.channel_id))) == null) {
            return "";
        }
        if (z) {
            return new SpannableStringBuilder(xc2.V(M0) ? F() : m2()).append((CharSequence) " ").append((CharSequence) M0.title);
        }
        return M0.title;
    }

    public static String t0(TLRPC.Document document, boolean z) {
        if (document == null || "audio/ogg".equals(document.mime_type)) {
            return null;
        }
        int size = document.attributes.size();
        for (int i = 0; i < size; i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                if (documentAttribute.voice) {
                    return null;
                }
                String str = documentAttribute.performer;
                String str2 = documentAttribute.title;
                if (!TextUtils.isEmpty(str)) {
                    for (int i2 = 0; i2 < 14; i2++) {
                        str = str.replace(p3[i2], " ");
                    }
                }
                if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
                    return null;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("athumb://itunes.apple.com/search?term=");
                    sb.append(URLEncoder.encode(str + " - " + str2, "UTF-8"));
                    sb.append("&entity=song&limit=4");
                    sb.append(z ? "&s=1" : "");
                    return sb.toString();
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    public static boolean t3(TLRPC.Message message) {
        if (n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            return s3(n1(message).webpage.document, false);
        }
        if (n1(message) != null) {
            if (s3(n1(message).document, message.grouped_id != 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean t4(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                if (document.attributes.get(i) instanceof TLRPC.TL_documentAttributeSticker) {
                    return "image/webp".equals(document.mime_type) || "video/webm".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public static boolean t5(TLRPC.InputPeer inputPeer, TLRPC.InputPeer inputPeer2) {
        if (inputPeer == null) {
            if (inputPeer2 == null) {
                return true;
            }
        } else if (inputPeer2 != null) {
            return ((inputPeer instanceof TLRPC.TL_inputPeerChat) && (inputPeer2 instanceof TLRPC.TL_inputPeerChat)) ? inputPeer.chat_id == inputPeer2.chat_id : ((inputPeer instanceof TLRPC.TL_inputPeerChannel) && (inputPeer2 instanceof TLRPC.TL_inputPeerChannel)) ? inputPeer.channel_id == inputPeer2.channel_id : ((inputPeer instanceof TLRPC.TL_inputPeerUser) && (inputPeer2 instanceof TLRPC.TL_inputPeerUser)) ? inputPeer.user_id == inputPeer2.user_id : (inputPeer instanceof TLRPC.TL_inputPeerSelf) && (inputPeer2 instanceof TLRPC.TL_inputPeerSelf);
        }
        return false;
    }

    public static long u1(TLRPC.Message message) {
        TLRPC.Peer peer;
        if (message == null || (peer = message.saved_peer_id) == null) {
            return 0L;
        }
        long j = peer.chat_id;
        if (j == 0) {
            j = peer.channel_id;
            if (j == 0) {
                return peer.user_id;
            }
        }
        return -j;
    }

    public static boolean u4(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null && !(inputStickerSet instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean u5(TLRPC.Peer peer, TLRPC.Peer peer2) {
        if (peer == null) {
            if (peer2 == null) {
                return true;
            }
        } else if (peer2 != null) {
            return ((peer instanceof TLRPC.TL_peerChat) && (peer2 instanceof TLRPC.TL_peerChat)) ? peer.chat_id == peer2.chat_id : ((peer instanceof TLRPC.TL_peerChannel) && (peer2 instanceof TLRPC.TL_peerChannel)) ? peer.channel_id == peer2.channel_id : (peer instanceof TLRPC.TL_peerUser) && (peer2 instanceof TLRPC.TL_peerUser) && peer.user_id == peer2.user_id;
        }
        return false;
    }

    public static long v0(TLRPC.Message message) {
        TLRPC.Peer peer = message.peer_id;
        if (peer != null) {
            return peer.channel_id;
        }
        return 0L;
    }

    public static String v1(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    String str = documentAttribute.performer;
                    return TextUtils.isEmpty(str) ? ob6.M0(2131753893, null) : str;
                }
            }
        }
        return ob6.M0(2131753893, null);
    }

    public static boolean v4(TLRPC.Message message) {
        return n1(message) != null && t4(n1(message).document);
    }

    public static TLRPC.TL_textWithEntities w5(TLRPC.TL_textWithEntities tL_textWithEntities) {
        if (tL_textWithEntities == null) {
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities2 = new TLRPC.TL_textWithEntities();
        tL_textWithEntities2.text = tL_textWithEntities.text;
        for (int i = 0; i < tL_textWithEntities.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities.entities.get(i);
            if (!(messageEntity instanceof TLRPC.TL_messageEntityUrl) && !(messageEntity instanceof TLRPC.TL_messageEntityTextUrl)) {
                tL_textWithEntities2.entities.add(messageEntity);
            }
        }
        return tL_textWithEntities2;
    }

    public static String x1(TLRPC.Document document) {
        if (document == null) {
            return ob6.M0(2131753892, null);
        }
        for (int i = 0; i < document.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                String str = documentAttribute.title;
                if (str != null && !str.isEmpty()) {
                    return str;
                }
                String B = xb4.B(document);
                return TextUtils.isEmpty(B) ? ob6.M0(2131753892, null) : B;
            }
        }
        String B2 = xb4.B(document);
        return !TextUtils.isEmpty(B2) ? B2 : ob6.M0(2131753892, null);
    }

    public static void x5(CharSequence charSequence) {
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
                if (!(uRLSpan instanceof no4)) {
                    spannable.removeSpan(uRLSpan);
                }
            }
        }
    }

    public static boolean y(TLRPC.Document document) {
        String str;
        if (document != null && (str = document.mime_type) != null) {
            if (!(W2(document) && (str.equalsIgnoreCase("image/png") || str.equalsIgnoreCase("image/jpg") || str.equalsIgnoreCase("image/jpeg"))) && (Build.VERSION.SDK_INT < 26 || !str.equalsIgnoreCase("image/heic"))) {
                boolean z = f11.a;
            } else {
                for (int i = 0; i < document.attributes.size(); i++) {
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                        TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = (TLRPC.TL_documentAttributeImageSize) documentAttribute;
                        return tL_documentAttributeImageSize.w < 6000 && tL_documentAttributeImageSize.h < 6000;
                    }
                }
            }
        }
        return false;
    }

    public static Spannable y5(Paint.FontMetricsInt fontMetricsInt, CharSequence charSequence, ArrayList arrayList) {
        return A5(charSequence, arrayList, fontMetricsInt, false);
    }

    public static int z0(TLRPC.TL_messageMediaToDo tL_messageMediaToDo) {
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        if (todoList == null || todoList.list == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < tL_messageMediaToDo.completions.size(); i2++) {
            TLRPC.TodoCompletion todoCompletion = tL_messageMediaToDo.completions.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= tL_messageMediaToDo.todo.list.size()) {
                    break;
                }
                if (tL_messageMediaToDo.todo.list.get(i3).id == todoCompletion.id) {
                    i++;
                    break;
                }
                i3++;
            }
        }
        return i;
    }

    public final long A0() {
        return B0(this.k);
    }

    public final int A1() {
        int i;
        int L;
        int i2;
        if (this.t1 && (i2 = this.d2) > 0) {
            return i2;
        }
        if (!hl.O1()) {
            Point point = hl.q;
            i = point.x;
            if (i <= point.y) {
                return i;
            }
            L = hl.L(50.0f);
        } else {
            if (this.D != 36) {
                return hl.P0();
            }
            Point point2 = hl.q;
            i = point2.x;
            if (hl.E) {
                return i;
            }
            if (hl.N1() && i <= point2.y) {
                return i;
            }
            L = hl.k1(i, 0, 0);
        }
        return i - L;
    }

    public final boolean A2() {
        int i;
        if (c1() == 0) {
            return false;
        }
        ArrayList arrayList = this.p0;
        return !(arrayList == null || arrayList.isEmpty()) || (i = this.D) == 3 || i == 1 || i == 14 || i == 9;
    }

    public final boolean A3() {
        TLRPC.WebPage webPage = (this.G0 || this.N2 || !(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || !(n1(this.k).webpage instanceof TLRPC.TL_webPage)) ? null : n1(this.k).webpage;
        String str = webPage != null ? webPage.type : null;
        if (webPage != null && TextUtils.isEmpty(webPage.description) && TextUtils.isEmpty(webPage.title)) {
            return false;
        }
        return "app".equals(str) || "profile".equals(str) || "article".equals(str) || "telegram_bot".equals(str) || "telegram_botinvite".equals(str) || "telegram_user".equals(str) || "telegram_channel".equals(str) || "telegram_megagroup".equals(str) || "telegram_voicechat".equals(str) || "telegram_videochat".equals(str) || "telegram_livestream".equals(str) || "telegram_channel_boost".equals(str) || "telegram_group_boost".equals(str) || "telegram_chat".equals(str);
    }

    public final boolean B() {
        if (D2(true)) {
            return true;
        }
        TLRPC.Document F0 = F0();
        if (F0 != null && !(F0 instanceof TLRPC.TL_documentEncrypted)) {
            if (xea.y0) {
                return true;
            }
            for (int i = 0; i < F0.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    return documentAttribute.supports_streaming;
                }
            }
            if (xea.z0 && "video/x-matroska".equals(F0.mime_type)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B2() {
        r47 r47Var;
        TLRPC.MessageReplyHeader messageReplyHeader;
        TLRPC.Message message = this.k;
        if ((message == null || (messageReplyHeader = message.reply_to) == null || !messageReplyHeader.forum_topic || messageReplyHeader.reply_to_msg_id != messageReplyHeader.reply_to_top_id) && (r47Var = this.C) != null) {
            TLRPC.Message message2 = r47Var.k;
            if (!(message2 instanceof TLRPC.TL_messageEmpty)) {
                TLRPC.MessageAction messageAction = message2.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear) && !(messageAction instanceof TLRPC.TL_messageActionTopicCreate)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean B3(long j) {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            return j == 0 || messageReplies.channel_id == j;
        }
        return false;
    }

    public final boolean C() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return D((TLRPC.TL_messageMediaPoll) n1);
        }
        return false;
    }

    public final String C0() {
        if (!T2()) {
            return null;
        }
        TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) n1(this.k);
        return TextUtils.isEmpty(tL_messageMediaDice.emoticon) ? "🎲" : tL_messageMediaDice.emoticon.replace("️", "");
    }

    public final boolean C2() {
        return D2(true);
    }

    public final boolean C3() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaGeoLive;
    }

    public final boolean C4() {
        return this.D == 17 && (n1(this.k) instanceof TLRPC.TL_messageMediaToDo);
    }

    public final void C5(Spannable spannable, int[] iArr) {
        boolean z;
        CharSequence charSequence;
        if (ik8.A(spannable)) {
            mv3[] mv3VarArr = (mv3[]) spannable.getSpans(0, spannable.length(), mv3.class);
            hm[] hmVarArr = (hm[]) spannable.getSpans(0, spannable.length(), hm.class);
            if (mv3VarArr != null) {
                if ((iArr[0] - mv3VarArr.length) - (hmVarArr == null ? 0 : hmVarArr.length) <= 0) {
                    for (int i = 0; i < mv3VarArr.length; i++) {
                        String str = mv3VarArr[i].d;
                        if (pv3.b(str)) {
                            z = true;
                            charSequence = str.subSequence(0, str.length() - 2);
                        } else {
                            z = false;
                            charSequence = str;
                        }
                        TLRPC.Document V = ls6.d0(this.K1).V(charSequence);
                        if (V != null) {
                            int spanStart = spannable.getSpanStart(mv3VarArr[i]);
                            int spanEnd = spannable.getSpanEnd(mv3VarArr[i]);
                            spannable.removeSpan(mv3VarArr[i]);
                            hm hmVar = new hm(V, mv3VarArr[i].a);
                            hmVar.standard = true;
                            hmVar.invert = z;
                            spannable.setSpan(hmVar, spanStart, spanEnd, 33);
                        }
                    }
                }
            }
        }
    }

    public final int D0() {
        if (n1(this.k) instanceof TLRPC.TL_messageMediaDice) {
            return ((TLRPC.TL_messageMediaDice) n1(this.k)).value;
        }
        return -1;
    }

    public final long D1() {
        if (this.D != 17) {
            return 0L;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) n1).poll.id;
        }
        return 0L;
    }

    public final boolean D2(boolean z) {
        TLRPC.MessageMedia messageMedia;
        ArrayList X;
        if (this.d3 == null) {
            try {
                TLRPC.Message message = this.k;
                if (message == null || (messageMedia = message.media) == null || messageMedia.document == null || messageMedia.alt_documents.isEmpty()) {
                    this.d3 = Boolean.FALSE;
                    return false;
                }
                int i = this.K1;
                TLRPC.Message message2 = this.k;
                TLRPC.MessageMedia messageMedia2 = message2 != null ? message2.media : null;
                if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    X = kfc.X(i, messageMedia2.document, messageMedia2.alt_documents, 0, z);
                } else {
                    int i2 = kfc.k0;
                    X = new ArrayList();
                }
                this.e3 = X;
                this.d3 = Boolean.valueOf(X.size() > 1);
                this.g3 = kfc.a0(this.e3);
                this.h3 = kfc.b0(this.e3);
                this.i3 = kfc.O(this.e3);
            } catch (Exception e) {
                cc4.g(e, true);
                this.d3 = Boolean.FALSE;
            }
        }
        return this.d3.booleanValue();
    }

    public final boolean D3() {
        TLRPC.MessageMedia m1 = m1(this);
        return m1 != null && m1.live_photo;
    }

    public final boolean E() {
        if (this.k.action == null) {
            if (x2()) {
                return true;
            }
            r47 r47Var = this.C;
            if (r47Var != null && r47Var.k.replies != null) {
                return true;
            }
            TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
            if ((messageReplyHeader != null ? messageReplyHeader.reply_to_top_id : 0) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r10 > 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TL_iv.RichMessage E0() {
        h0d h0dVar;
        long j;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        if (this.L2 && (richMessage = message.translatedRichMessage) != null) {
            return richMessage;
        }
        if (message.rich_message != null || !(n1(message) instanceof TLRPC.TL_messageMediaWidget)) {
            return this.k.rich_message;
        }
        TL_iv.RichMessage richMessage2 = this.z2;
        if (richMessage2 != null) {
            return richMessage2;
        }
        TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) n1(this.k);
        ConcurrentHashMap concurrentHashMap = k0d.a;
        String str = "tg-widget:" + this.K1 + "/" + B0(this.k) + "/" + this.k.id + "/" + Arrays.hashCode(tL_messageMediaWidget.payload);
        ConcurrentHashMap concurrentHashMap2 = k0d.a;
        h0d h0dVar2 = (h0d) concurrentHashMap2.get(str);
        if (h0dVar2 == null) {
            int i = this.K1;
            long B0 = B0(this.k);
            TLRPC.Message message2 = this.k;
            int i2 = message2.id;
            long j2 = message2.via_bot_id;
            if (j2 == 0) {
                TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                if (messageFwdHeader != null) {
                    TLRPC.Peer peer = messageFwdHeader.from_id;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j2 = peer.user_id;
                    }
                    j = 0;
                } else {
                    j2 = Z0();
                }
                h0dVar = new h0d(str, i, B0, i2, j, tL_messageMediaWidget, false);
                if (!z.a()) {
                    x xVar = x.v;
                    synchronized (xVar.a) {
                        if (xVar.k && xVar.l && xVar.r() > 1) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (elapsedRealtime >= xVar.f) {
                                xVar.e = 1;
                            }
                            xVar.e = Math.min(4, xVar.e + 1);
                            xVar.f = elapsedRealtime + 4000;
                            xVar.u();
                            xVar.b.removeCallbacks(xVar.t);
                            xVar.b.postDelayed(xVar.t, 4050L);
                        }
                    }
                }
                if (((h0d) concurrentHashMap2.putIfAbsent(str, h0dVar)) == null) {
                    jf7 Y = jf7.Y(h0dVar.b);
                    Y.a.c(new cxc((Object) Y, (Object) h0dVar, (byte) 11));
                }
            }
            j = j2;
            h0dVar = new h0d(str, i, B0, i2, j, tL_messageMediaWidget, false);
            if (!z.a()) {
            }
            if (((h0d) concurrentHashMap2.putIfAbsent(str, h0dVar)) == null) {
            }
        } else if (h0dVar2.t != tL_messageMediaWidget) {
            hl.c3(new cxc((Object) h0dVar2, (Object) tL_messageMediaWidget, (byte) 9));
        }
        TL_iv.RichMessage n = k0d.n(str);
        this.z2 = n;
        return n;
    }

    public final boolean E2() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return T4((TLRPC.TL_messageMediaPoll) n1);
        }
        return false;
    }

    public final boolean E4() {
        TLRPC.Message message = this.k;
        return message != null && message.unread;
    }

    public final CharSequence E5(String str, ArrayList arrayList, AbstractMap abstractMap, zh6 zh6Var) {
        if (TextUtils.indexOf(str, "un2") < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.User user = abstractMap != null ? (TLRPC.User) abstractMap.get(arrayList.get(i)) : zh6Var != null ? (TLRPC.User) zh6Var.f(((Long) arrayList.get(i)).longValue()) : null;
            if (user == null) {
                user = uc7.s1(this.K1).X1((Long) arrayList.get(i));
            }
            if (user != null) {
                String r = lbc.r(user);
                int length = spannableStringBuilder.length();
                if (spannableStringBuilder.length() != 0) {
                    spannableStringBuilder.append((CharSequence) ", ");
                }
                spannableStringBuilder.append((CharSequence) r);
                spannableStringBuilder.setSpan(new g8c(String.valueOf(user.id)), length, r.length() + length, 33);
            }
        }
        return TextUtils.replace(str, new String[]{"un2"}, new CharSequence[]{spannableStringBuilder});
    }

    public final TLRPC.Document F0() {
        jfc jfcVar;
        TLRPC.Document document = this.n;
        return document != null ? document : (!D2(true) || (jfcVar = this.g3) == null) ? G0(this.k) : jfcVar.g;
    }

    public final boolean F2() {
        return G2() && H2(F0());
    }

    public final boolean F3() {
        return G3(this.k, true);
    }

    public final boolean F4() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported;
    }

    public final void F5() {
        this.b0 = 0.0f;
        this.i0 = 0;
        this.g0 = 0.0f;
    }

    public final void G() {
        hm[] hmVarArr;
        int i;
        this.n = null;
        this.o = null;
        if (this.P1 == 1 && !(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && !(n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && ((n1(this.k) instanceof TLRPC.TL_messageMediaEmpty) || n1(this.k) == null)) {
            TLRPC.Message message = this.k;
            if (message.grouped_id == 0) {
                boolean isEmpty = message.entities.isEmpty();
                int i2 = this.K1;
                if (isEmpty) {
                    CharSequence charSequence = this.v;
                    int indexOf = TextUtils.indexOf(charSequence, "🏻");
                    if (indexOf >= 0) {
                        this.u = "_c1";
                        charSequence = charSequence.subSequence(0, indexOf);
                    } else {
                        indexOf = TextUtils.indexOf(charSequence, "🏼");
                        if (indexOf >= 0) {
                            this.u = "_c2";
                            charSequence = charSequence.subSequence(0, indexOf);
                        } else {
                            indexOf = TextUtils.indexOf(charSequence, "🏽");
                            if (indexOf >= 0) {
                                this.u = "_c3";
                                charSequence = charSequence.subSequence(0, indexOf);
                            } else {
                                indexOf = TextUtils.indexOf(charSequence, "🏾");
                                if (indexOf >= 0) {
                                    this.u = "_c4";
                                    charSequence = charSequence.subSequence(0, indexOf);
                                } else {
                                    indexOf = TextUtils.indexOf(charSequence, "🏿");
                                    if (indexOf >= 0) {
                                        this.u = "_c5";
                                        charSequence = charSequence.subSequence(0, indexOf);
                                    } else {
                                        this.u = "";
                                    }
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(this.u) && (i = indexOf + 2) < this.v.length()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(charSequence.toString());
                        CharSequence charSequence2 = this.v;
                        sb.append(charSequence2.subSequence(i, charSequence2.length()).toString());
                        charSequence = sb.toString();
                    }
                    if (TextUtils.isEmpty(this.u) || jx3.l.contains(charSequence.toString())) {
                        this.n = ls6.d0(i2).V(charSequence);
                    }
                } else if (this.k.entities.size() == 1 && (this.k.entities.get(0) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    try {
                        Long valueOf = Long.valueOf(((TLRPC.TL_messageEntityCustomEmoji) this.k.entities.get(0)).document_id);
                        this.o = valueOf;
                        TLRPC.Document e = wl.e(i2, valueOf.longValue());
                        this.n = e;
                        if (e == null) {
                            CharSequence charSequence3 = this.v;
                            if ((charSequence3 instanceof Spanned) && (hmVarArr = (hm[]) ((Spanned) charSequence3).getSpans(0, charSequence3.length(), hm.class)) != null && hmVarArr.length == 1) {
                                this.n = hmVarArr[0].document;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (this.n == null && this.o == null) {
            n0(null);
            return;
        }
        if (s4()) {
            this.D = 13;
        } else if (J2()) {
            this.D = 15;
        } else {
            this.D = 1000;
        }
    }

    public float G1() {
        return 0.0f;
    }

    public final boolean G2() {
        return (this.n == null && this.o == null) ? false : true;
    }

    public final boolean G4() {
        return K4(this.k);
    }

    public final boolean G5(w49 w49Var, boolean z) {
        TLRPC.Peer tL_peerUser;
        TLRPC.Peer tL_peerUser2;
        int i;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.Message message = this.k;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i2 = this.K1;
        if (tL_messageReactions2 == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            message2.reactions.reactions_as_tags = B0(message2) == yac.h(i2).e();
            this.k.reactions.can_see_list = o3() || p3();
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.ReactionCount reactionCount = null;
        int i3 = 0;
        for (int i4 = 0; i4 < this.k.reactions.results.size(); i4++) {
            TLRPC.ReactionCount reactionCount2 = this.k.reactions.results.get(i4);
            if (reactionCount2.chosen && !(reactionCount2.reaction instanceof TLRPC.TL_reactionPaid)) {
                arrayList.add(reactionCount2);
                int i5 = reactionCount2.chosen_order;
                if (i5 > i3) {
                    i3 = i5;
                }
            }
            TLRPC.Reaction reaction = this.k.reactions.results.get(i4).reaction;
            if (reaction instanceof TLRPC.TL_reactionEmoji) {
                String str = w49Var.f;
                if (str != null) {
                    if (((TLRPC.TL_reactionEmoji) reaction).emoticon.equals(str)) {
                        reactionCount = this.k.reactions.results.get(i4);
                    }
                }
            }
            if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
                long j = w49Var.g;
                if (j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j) {
                    reactionCount = this.k.reactions.results.get(i4);
                }
            }
        }
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount) && z) {
            return true;
        }
        uc7 s1 = uc7.s1(i2);
        boolean p = s1.getUserConfig().p();
        hr hrVar = s1.k4;
        int f = (p ? hrVar.v1 : hrVar.u1).f();
        if (!arrayList.isEmpty() && arrayList.contains(reactionCount)) {
            if (reactionCount != null) {
                reactionCount.chosen = false;
                int i6 = reactionCount.count - 1;
                reactionCount.count = i6;
                if (i6 <= 0) {
                    this.k.reactions.results.remove(reactionCount);
                }
            }
            if (this.k.reactions.can_see_list) {
                int i7 = 0;
                while (i7 < this.k.reactions.recent_reactions.size()) {
                    if (B1(this.k.reactions.recent_reactions.get(i7).peer_id) == yac.h(i2).e() && z49.c(this.k.reactions.recent_reactions.get(i7).reaction, w49Var)) {
                        this.k.reactions.recent_reactions.remove(i7);
                        i7--;
                    }
                    i7++;
                }
            }
            this.H = true;
            return false;
        }
        while (!arrayList.isEmpty() && arrayList.size() >= f) {
            int i8 = 0;
            for (int i9 = 1; i9 < arrayList.size(); i9++) {
                if (!(((TLRPC.ReactionCount) arrayList.get(i9)).reaction instanceof TLRPC.TL_reactionPaid) && ((TLRPC.ReactionCount) arrayList.get(i9)).chosen_order < ((TLRPC.ReactionCount) arrayList.get(i8)).chosen_order) {
                    i8 = i9;
                }
            }
            TLRPC.ReactionCount reactionCount3 = (TLRPC.ReactionCount) arrayList.get(i8);
            reactionCount3.chosen = false;
            int i10 = reactionCount3.count - 1;
            reactionCount3.count = i10;
            if (i10 <= 0) {
                this.k.reactions.results.remove(reactionCount3);
            }
            arrayList.remove(reactionCount3);
            if (this.k.reactions.can_see_list) {
                int i11 = 0;
                while (i11 < this.k.reactions.recent_reactions.size()) {
                    if (B1(this.k.reactions.recent_reactions.get(i11).peer_id) == yac.h(i2).e() && z49.c(this.k.reactions.recent_reactions.get(i11).reaction, w49Var)) {
                        this.k.reactions.recent_reactions.remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        if (reactionCount == null) {
            int O0 = uc7.s1(i2).O0(B0(this.k));
            TLRPC.Message message3 = this.k;
            if (message3 == null || (tL_messageReactions = message3.reactions) == null) {
                i = 0;
            } else {
                ArrayList<TLRPC.ReactionCount> arrayList2 = tL_messageReactions.results;
                int size = arrayList2.size();
                i = 0;
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.ReactionCount reactionCount4 = arrayList2.get(i12);
                    i12++;
                    if (!(reactionCount4.reaction instanceof TLRPC.TL_reactionPaid)) {
                        i++;
                    }
                }
            }
            if (i + 1 > O0) {
                return false;
            }
            reactionCount = new TLRPC.TL_reactionCount();
            reactionCount.reaction = w49Var.g();
            this.k.reactions.results.add(reactionCount);
        }
        reactionCount.chosen = true;
        reactionCount.count++;
        reactionCount.chosen_order = i3 + 1;
        TLRPC.Message message4 = this.k;
        if (message4.reactions.can_see_list || (message4.dialog_id > 0 && f > 1)) {
            TLRPC.TL_messagePeerReaction tL_messagePeerReaction = new TLRPC.TL_messagePeerReaction();
            TLRPC.Message message5 = this.k;
            if (!message5.isThreadMessage || message5.fwd_from == null) {
                uc7 s12 = uc7.s1(i2);
                TLRPC.ChatFull N0 = s12.N0(-B0(this.k));
                if (N0 == null || (tL_peerUser = N0.default_send_as) == null) {
                    tL_peerUser = new TLRPC.TL_peerUser();
                    tL_peerUser.user_id = yac.h(s12.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser;
            } else {
                uc7 s13 = uc7.s1(i2);
                TLRPC.ChatFull N02 = s13.N0(-Z0());
                if (N02 == null || (tL_peerUser2 = N02.default_send_as) == null) {
                    tL_peerUser2 = new TLRPC.TL_peerUser();
                    tL_peerUser2.user_id = yac.h(s13.getAccountInstance().a).n;
                }
                tL_messagePeerReaction.peer_id = tL_peerUser2;
            }
            this.k.reactions.recent_reactions.add(0, tL_messagePeerReaction);
            if (w49Var.f != null) {
                TLRPC.TL_reactionEmoji tL_reactionEmoji = new TLRPC.TL_reactionEmoji();
                tL_messagePeerReaction.reaction = tL_reactionEmoji;
                tL_reactionEmoji.emoticon = w49Var.f;
            } else {
                TLRPC.TL_reactionCustomEmoji tL_reactionCustomEmoji = new TLRPC.TL_reactionCustomEmoji();
                tL_messagePeerReaction.reaction = tL_reactionCustomEmoji;
                tL_reactionCustomEmoji.document_id = w49Var.g;
            }
        }
        this.H = true;
        return true;
    }

    public final void H(int[] iArr) {
        TextPaint textPaint;
        Integer valueOf = iArr == null ? null : Integer.valueOf(iArr[0]);
        if (valueOf == null || valueOf.intValue() < 1 || this.k == null || u2()) {
            CharSequence charSequence = this.v;
            hm[] hmVarArr = (hm[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), hm.class);
            if (hmVarArr == null || hmVarArr.length <= 0) {
                this.R1 = 0;
                return;
            }
            this.R1 = hmVarArr.length;
            for (int i = 0; i < hmVarArr.length; i++) {
                hmVarArr[i].replaceFontMetrics(aob.o2.getFontMetricsInt(), (int) (aob.o2.getTextSize() + hl.L(4.0f)), -1);
                hmVarArr[i].full = false;
            }
            return;
        }
        CharSequence charSequence2 = this.v;
        mv3[] mv3VarArr = (mv3[]) ((Spannable) charSequence2).getSpans(0, charSequence2.length(), mv3.class);
        CharSequence charSequence3 = this.v;
        hm[] hmVarArr2 = (hm[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), hm.class);
        this.P1 = Math.max(valueOf.intValue(), (mv3VarArr == null ? 0 : mv3VarArr.length) + (hmVarArr2 == null ? 0 : hmVarArr2.length));
        this.R1 = hmVarArr2 == null ? 0 : hmVarArr2.length;
        this.Q1 = 0;
        if (hmVarArr2 != null) {
            for (hm hmVar : hmVarArr2) {
                if (!hmVar.standard) {
                    this.Q1++;
                }
            }
        }
        int i2 = this.P1;
        boolean z = (i2 - (mv3VarArr == null ? 0 : mv3VarArr.length)) - (hmVarArr2 == null ? 0 : hmVarArr2.length) > 0;
        this.O1 = z;
        if (i2 == 0 || z) {
            if (hmVarArr2 == null || hmVarArr2.length <= 0) {
                return;
            }
            for (int i3 = 0; i3 < hmVarArr2.length; i3++) {
                hmVarArr2[i3].replaceFontMetrics(aob.o2.getFontMetricsInt(), (int) (aob.o2.getTextSize() + hl.L(4.0f)), -1);
                hmVarArr2[i3].full = false;
            }
            return;
        }
        int i4 = this.Q1;
        boolean z2 = i2 == i4;
        int i5 = 2;
        switch (Math.max(i2, i4)) {
            case 0:
            case 1:
            case 2:
                TextPaint[] textPaintArr = aob.y2;
                textPaint = z2 ? textPaintArr[0] : textPaintArr[2];
                i5 = 1;
                break;
            case 3:
                TextPaint[] textPaintArr2 = aob.y2;
                textPaint = z2 ? textPaintArr2[1] : textPaintArr2[3];
                i5 = 1;
                break;
            case 4:
                TextPaint[] textPaintArr3 = aob.y2;
                textPaint = z2 ? textPaintArr3[2] : textPaintArr3[4];
                i5 = 1;
                break;
            case 5:
                TextPaint[] textPaintArr4 = aob.y2;
                if (z2) {
                    textPaint = textPaintArr4[3];
                    break;
                } else {
                    textPaint = textPaintArr4[5];
                    break;
                }
            case 6:
                TextPaint[] textPaintArr5 = aob.y2;
                if (z2) {
                    textPaint = textPaintArr5[4];
                    break;
                } else {
                    textPaint = textPaintArr5[5];
                    break;
                }
            default:
                int i6 = this.P1 > 9 ? 0 : -1;
                textPaint = aob.y2[5];
                i5 = i6;
                break;
        }
        int textSize = (int) (textPaint.getTextSize() + hl.L(4.0f));
        if (mv3VarArr != null && mv3VarArr.length > 0) {
            for (mv3 mv3Var : mv3VarArr) {
                mv3Var.a = textPaint.getFontMetricsInt();
                mv3Var.c = textSize;
            }
        }
        if (hmVarArr2 == null || hmVarArr2.length <= 0) {
            return;
        }
        for (int i7 = 0; i7 < hmVarArr2.length; i7++) {
            hmVarArr2[i7].replaceFontMetrics(textPaint.getFontMetricsInt(), textSize, i5);
            hmVarArr2[i7].full = true;
        }
    }

    public final boolean H3() {
        TLRPC.Message message = this.k;
        return message == null || n1(message) == null || (n1(message) instanceof TLRPC.TL_messageMediaEmpty);
    }

    public final boolean H4() {
        TLRPC.Photo photo;
        TLRPC.MessageAction messageAction = this.k.action;
        return (messageAction == null || (photo = messageAction.photo) == null || photo.video_sizes.isEmpty()) ? false : true;
    }

    public final void H5() {
        this.k.unread = false;
    }

    public final boolean I() {
        CharSequence charSequence;
        int i = this.D;
        if ((i == 0 || i == 19 || i == 36) && this.k.peer_id != null && (charSequence = this.v) != null && (charSequence.length() != 0 || this.Y1)) {
            if (this.S1) {
                int A1 = (!hl.O1() || this.T == 0) ? A1() : hl.L(530.0f);
                TextPaint textPaint = aob.o2;
                float textSize = textPaint != null ? textPaint.getTextSize() : 0.0f;
                if (Math.abs(this.T1 - A1) > (this.D == 36 ? 0 : hl.L(52.0f)) || this.U1 != hl.p || this.W1 != textSize || this.V1 != P2()) {
                    this.S1 = false;
                }
            }
            if (!this.S1) {
                this.S1 = true;
                TLRPC.User X1 = p3() ? uc7.s1(this.K1).X1(Long.valueOf(this.k.from_id.user_id)) : null;
                TextPaint textPaint2 = n1(this.k) instanceof TLRPC.TL_messageMediaGame ? aob.x2 : aob.o2;
                int[] iArr = i() ? new int[1] : null;
                CharSequence m = pv3.m(this.v, textPaint2.getFontMetricsInt(), false, iArr, 0);
                this.v = m;
                Spannable z5 = z5(m, textPaint2.getFontMetricsInt());
                this.v = z5;
                if (iArr != null && iArr[0] > 1) {
                    C5(z5, iArr);
                }
                H(iArr);
                G();
                K5();
                n0(X1);
                if (this.z != null) {
                    this.z = null;
                    k0();
                }
                return true;
            }
        }
        return false;
    }

    public final String I0() {
        return xb4.B(F0());
    }

    public final boolean I2() {
        return this.D == 19;
    }

    public final boolean I3() {
        return (!K3(this.k) || K4(this.k) || g4()) ? false : true;
    }

    public final boolean I4() {
        TLRPC.MessageAction messageAction = this.k.action;
        if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) && messageAction.video) {
            return true;
        }
        return (messageAction instanceof TLRPC.TL_messageActionConferenceCall) && messageAction.video;
    }

    public final void I5(long j) {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i);
            i++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                boolean z = j == 2666000;
                messageReactor2.anonymous = z;
                int i2 = messageReactor2.flags;
                if (z) {
                    messageReactor2.flags = i2 & (-9);
                    messageReactor2.peer_id = null;
                } else {
                    messageReactor2.flags = i2 | 8;
                    messageReactor2.peer_id = uc7.s1(this.K1).y1(j);
                }
            }
        }
    }

    public final void J() {
        K(true);
    }

    public final boolean J2() {
        int i = this.D;
        if (i != 1000) {
            return i == 15;
        }
        boolean B = wf3.B(B0(this.k));
        if (B && this.k.stickerVerified != 1) {
            return false;
        }
        if (this.o == null || this.n != null) {
            return K2(F0(), (this.n == null && B && !N3()) ? false : true);
        }
        return true;
    }

    public final void J5(String str, boolean z) {
        String str2;
        int indexOf;
        if (TextUtils.isEmpty(str)) {
            this.a2 = null;
            this.c2 = null;
            this.b2 = true;
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.trim().toLowerCase();
        String[] split = lowerCase.split("[^\\p{L}#$]+");
        ArrayList arrayList2 = new ArrayList();
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null && !TextUtils.isEmpty(messageReplyHeader.quote_text)) {
            String lowerCase2 = this.k.reply_to.quote_text.trim().toLowerCase();
            if (lowerCase2.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, true, z);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase2.split("[^\\p{L}#$]+")));
        }
        if (!TextUtils.isEmpty(this.k.message)) {
            String lowerCase3 = this.k.message.trim().toLowerCase();
            if (lowerCase3.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
                n2(arrayList, split, false, z);
                return;
            }
            arrayList2.addAll(Arrays.asList(lowerCase3.split("[^\\p{L}#$]+")));
        }
        if (F0() != null) {
            String lowerCase4 = xb4.B(F0()).toLowerCase();
            if (lowerCase4.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase4.split("[^\\p{L}#$]+")));
        }
        if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            TLRPC.WebPage webPage = n1(this.k).webpage;
            String str3 = webPage.title;
            if (str3 == null) {
                str3 = webPage.site_name;
            }
            if (str3 != null) {
                String lowerCase5 = str3.toLowerCase();
                if (lowerCase5.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                    arrayList.add(lowerCase);
                }
                arrayList2.addAll(Arrays.asList(lowerCase5.split("[^\\p{L}#$]+")));
            }
        }
        String w1 = w1(true);
        if (w1 != null) {
            String lowerCase6 = w1.toLowerCase();
            if (lowerCase6.contains(lowerCase) && !arrayList.contains(lowerCase)) {
                arrayList.add(lowerCase);
            }
            arrayList2.addAll(Arrays.asList(lowerCase6.split("[^\\p{L}#$]+")));
        }
        for (String str4 : split) {
            if (str4.length() >= 2) {
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (!arrayList.contains(arrayList2.get(i)) && (indexOf = (str2 = (String) arrayList2.get(i)).indexOf(str4.charAt(0))) >= 0) {
                        int max = Math.max(str4.length(), str2.length());
                        if (indexOf != 0) {
                            str2 = str2.substring(indexOf);
                        }
                        int min = Math.min(str4.length(), str2.length());
                        int i2 = 0;
                        for (int i3 = 0; i3 < min && str2.charAt(i3) == str4.charAt(i3); i3++) {
                            i2++;
                        }
                        if (i2 / max >= 0.5d) {
                            arrayList.add((String) arrayList2.get(i));
                        }
                    }
                }
            }
        }
        n2(arrayList, split, false, z);
    }

    public final void K(boolean z) {
        int i;
        File M;
        this.y0 = false;
        this.z0 = false;
        int i2 = this.D;
        int i3 = this.K1;
        if (i2 == 20) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) this.k.media.extended_media.get(0);
            if (tL_messageExtendedMediaPreview.thumb != null) {
                xb4.G(i3);
                File J = xb4.J(tL_messageExtendedMediaPreview.thumb, null, z, true);
                if (!this.z0) {
                    this.z0 = J.exists() || (tL_messageExtendedMediaPreview.thumb instanceof TLRPC.TL_photoStrippedSize);
                }
            }
        } else if (i2 == 1 && xb4.w(this.p0, hl.Y0(true), false, null, false) != null) {
            xb4.G(i3);
            File M2 = xb4.M(this.k, false, z);
            if (l5()) {
                this.z0 = new File(M2.getAbsolutePath() + ".enc").exists();
            }
            if (!this.z0) {
                this.z0 = M2.exists();
            }
        }
        if ((!this.z0 && this.D == 8) || (i = this.D) == 3 || i == 9 || i == 2 || i == 14 || i == 5) {
            String str = this.k.attachPath;
            if (str != null && str.length() > 0) {
                this.y0 = new File(this.k.attachPath).exists();
            }
            if (!this.y0) {
                if (this.D == 3 && l5() && D3() && F0() != null) {
                    xb4.G(i3);
                    M = xb4.J(F0(), null, true, z);
                } else {
                    xb4.G(i3);
                    M = xb4.M(this.k, false, z);
                }
                if ((this.D == 3 && l5()) || R4() || f4()) {
                    this.z0 = new File(M.getAbsolutePath() + ".enc").exists();
                }
                if (!this.z0) {
                    this.z0 = M.exists();
                }
            }
        }
        if (!this.z0) {
            TLRPC.Document F0 = F0();
            if (F0 == null) {
                int i4 = this.D;
                if (i4 == 0) {
                    TLRPC.PhotoSize w = xb4.w(this.p0, hl.Y0(false), false, null, false);
                    if (w == null) {
                        return;
                    }
                    xb4.G(i3);
                    this.z0 = xb4.J(w, null, true, z).exists();
                } else if (i4 == 11) {
                    TLRPC.Photo photo = this.k.action.photo;
                    if (photo == null || photo.video_sizes.isEmpty()) {
                        return;
                    }
                    xb4.G(i3);
                    this.z0 = xb4.J(photo.video_sizes.get(0), null, true, z).exists();
                }
            } else if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage != null && "telegram_background".equals(n1(this.k).webpage.type)) {
                xb4.G(i3);
                this.z0 = xb4.J(F0, null, true, z).exists();
            } else {
                xb4.G(i3);
                this.z0 = xb4.J(F0, null, false, z).exists();
            }
        }
        d6(z);
    }

    public final TLRPC.MessagePeerReaction K1() {
        ArrayList<TLRPC.MessagePeerReaction> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions == null || (arrayList = tL_messageReactions.recent_reactions) == null || arrayList.isEmpty()) {
            return null;
        }
        return this.k.reactions.recent_reactions.get(0);
    }

    public final void K5() {
        int i;
        int i2 = this.D;
        this.D = 1000;
        this.S = (byte) 0;
        boolean q4 = q4();
        int i3 = this.K1;
        if (q4) {
            this.D = 0;
        } else {
            if (this.h1) {
                this.U = 0;
                this.D = 27;
                this.i1 = uc7.s1(i3).X3.getBoolean("c" + B0(this.k) + "_rec", true);
            } else {
                TLRPC.Message message = this.k;
                if (!(message instanceof TLRPC.TL_message) && !(message instanceof TLRPC.TL_messageForwarded_old2)) {
                    TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = this.L1;
                    if (tL_channelAdminLogEvent != null) {
                        TLRPC.ChannelAdminLogEventAction channelAdminLogEventAction = tL_channelAdminLogEvent.action;
                        if (channelAdminLogEventAction instanceof TLRPC.TL_channelAdminLogEventActionChangeWallpaper) {
                            TLRPC.TL_channelAdminLogEventActionChangeWallpaper tL_channelAdminLogEventActionChangeWallpaper = (TLRPC.TL_channelAdminLogEventActionChangeWallpaper) channelAdminLogEventAction;
                            this.U = 1;
                            TLRPC.WallPaper wallPaper = tL_channelAdminLogEventActionChangeWallpaper.new_value;
                            if ((wallPaper instanceof TLRPC.TL_wallPaperNoFile) && wallPaper.id == 0 && wallPaper.settings == null) {
                                this.D = 10;
                            } else {
                                this.D = 22;
                                ArrayList arrayList = new ArrayList();
                                this.p0 = arrayList;
                                TLRPC.Document document = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                if (document != null) {
                                    arrayList.addAll(document.thumbs);
                                    this.n0 = tL_channelAdminLogEventActionChangeWallpaper.new_value.document;
                                }
                            }
                        }
                    }
                    if (message instanceof TLRPC.TL_messageService) {
                        TLRPC.MessageAction messageAction = message.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionChangeCreator) || (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) || (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated)) {
                            this.U = 1;
                            this.D = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                            this.U = 1;
                            this.D = 10;
                        } else if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                            this.U = 1;
                            this.D = 22;
                            TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                            ArrayList arrayList2 = new ArrayList();
                            this.p0 = arrayList2;
                            TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            if (document2 != null) {
                                arrayList2.addAll(document2.thumbs);
                                this.n0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                            }
                        } else if (messageAction instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                            this.U = 1;
                            this.D = 21;
                            ArrayList arrayList3 = new ArrayList();
                            this.p0 = arrayList3;
                            arrayList3.addAll(this.k.action.photo.sizes);
                            this.n0 = this.k.action.photo;
                        } else if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                            this.D = 0;
                        } else {
                            boolean z = messageAction instanceof TLRPC.TL_messageActionGiftCode;
                            if (z && ((TLRPC.TL_messageActionGiftCode) messageAction).boost_peer != null) {
                                this.U = 1;
                                this.D = 25;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftPremium) || z) {
                                this.U = 1;
                                this.D = 18;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionGiftStars) || (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionPrizeStars) || (((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).refunded) || (messageAction instanceof TLRPC.TL_messageActionGiftTon))) {
                                this.U = 1;
                                this.D = 30;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                this.U = 1;
                                this.D = 11;
                            } else if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
                                TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
                                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                                    this.U = 1;
                                    this.D = 10;
                                } else {
                                    this.U = -1;
                                    this.D = -1;
                                }
                            } else if (messageAction instanceof TLRPC.TL_messageActionHistoryClear) {
                                this.U = -1;
                                this.D = -1;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionPhoneCall) || (messageAction instanceof TLRPC.TL_messageActionConferenceCall)) {
                                this.D = 16;
                            } else if ((messageAction instanceof TLRPC.TL_messageActionSetChatTheme) && (((TLRPC.TL_messageActionSetChatTheme) messageAction).theme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                this.D = 31;
                                this.U = 1;
                            } else if (vs7.o(message)) {
                                this.D = 10;
                                this.U = 1;
                            } else {
                                TLRPC.MessageAction messageAction2 = this.k.action;
                                if ((messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) || (messageAction2 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer)) {
                                    this.D = 33;
                                    this.U = 1;
                                } else if ((messageAction2 instanceof TLRPC.TL_messageActionChangeCommunity) && ((TLRPC.TL_messageActionChangeCommunity) messageAction2).community_id != 0) {
                                    this.D = 37;
                                    this.U = 1;
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                    this.D = 34;
                                    this.U = 1;
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                    this.D = 32;
                                    this.U = 1;
                                } else if (messageAction2 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                    this.D = 35;
                                    this.U = 1;
                                } else {
                                    this.U = 1;
                                    this.D = 10;
                                }
                            }
                        }
                    }
                } else if (n1(message) instanceof TLRPC.TL_messageMediaUnsupported) {
                    this.U = 10;
                    this.D = 38;
                } else if (this.G0) {
                    this.D = 0;
                } else {
                    TLRPC.Message message2 = this.k;
                    if (message2.rich_message != null || (n1(message2) instanceof TLRPC.TL_messageMediaWidget)) {
                        this.D = 36;
                    } else if (this.n == null && this.o == null) {
                        TLRPC.Message message3 = this.k;
                        if (message3.media instanceof TLRPC.TL_messageMediaPaidMedia) {
                            this.D = 29;
                        } else if (G3(message3, false) && !T2() && !q4() && this.P1 >= 1 && !this.O1 && this.k != null && !u2()) {
                            this.D = 19;
                        } else if (F3()) {
                            this.D = 0;
                            if (TextUtils.isEmpty(this.v) && this.T == 0) {
                                this.v = "";
                            }
                        } else if (q2()) {
                            this.D = 20;
                        } else if (n1(this.k).ttl_seconds != 0 && ((n1(this.k).photo instanceof TLRPC.TL_photoEmpty) || (F0() instanceof TLRPC.TL_documentEmpty) || (((n1(this.k) instanceof TLRPC.TL_messageMediaDocument) && F0() == null) || this.I0))) {
                            this.U = 1;
                            this.D = 10;
                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGiveaway) {
                            this.D = 26;
                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                            this.D = 28;
                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaDice) {
                            this.D = 15;
                            if (n1(this.k).document == null) {
                                n1(this.k).document = new TLRPC.TL_document();
                                n1(this.k).document.file_reference = new byte[0];
                                n1(this.k).document.mime_type = "application/x-tgsdice";
                                n1(this.k).document.dc_id = TLObject.FLAG_31;
                                n1(this.k).document.id = -2147483648L;
                                TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                                tL_documentAttributeImageSize.w = 512;
                                tL_documentAttributeImageSize.h = 512;
                                n1(this.k).document.attributes.add(tL_documentAttributeImageSize);
                            }
                        } else {
                            boolean z2 = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
                            TLRPC.Message message4 = this.k;
                            if (z2) {
                                this.D = K4(message4) ? 3 : 1;
                            } else if ((n1(message4) instanceof TLRPC.TL_messageMediaGeo) || (n1(this.k) instanceof TLRPC.TL_messageMediaVenue) || (n1(this.k) instanceof TLRPC.TL_messageMediaGeoLive)) {
                                this.D = 4;
                            } else if (g4()) {
                                this.D = 5;
                            } else if (K4(this.k)) {
                                this.D = 3;
                            } else if (Q4(this.k)) {
                                this.D = 2;
                            } else if (I3()) {
                                this.D = 14;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaContact) {
                                this.D = 12;
                            } else if ((n1(this.k) instanceof TLRPC.TL_messageMediaPoll) || (n1(this.k) instanceof TLRPC.TL_messageMediaToDo)) {
                                this.D = 17;
                                this.x1 = new ArrayList();
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported) {
                                this.D = 0;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                                TLRPC.Document F0 = F0();
                                if (F0 == null || F0.mime_type == null) {
                                    this.D = 9;
                                } else if (s3(F0, z2())) {
                                    this.D = 8;
                                } else if (s4()) {
                                    this.D = 13;
                                } else if (J2()) {
                                    this.D = 15;
                                } else {
                                    this.D = 9;
                                }
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                                this.D = 0;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) {
                                this.D = 0;
                            } else if (n1(this.k) instanceof TLRPC.TL_messageMediaStory) {
                                int i4 = n1(this.k).via_mention ? 24 : 23;
                                this.D = i4;
                                if (i4 == 24) {
                                    this.U = 1;
                                }
                            }
                        }
                    } else if (s4()) {
                        this.D = 13;
                    } else {
                        this.D = 15;
                    }
                }
            }
        }
        if (i2 == 1000 || i2 == (i = this.D) || i == 19) {
            return;
        }
        a6(uc7.s1(i3).d, uc7.s1(i3).b, null, null);
        r0(false);
    }

    public final double L0() {
        TL_stories.StoryItem storyItem;
        TLRPC.MessageMedia messageMedia;
        double d = this.k0;
        if (d > 0.0d) {
            return d;
        }
        TLRPC.Document F0 = F0();
        if (F0 == null && this.D == 23 && (storyItem = n1(this.k).storyItem) != null && (messageMedia = storyItem.media) != null) {
            F0 = messageMedia.document;
        }
        if (F0 == null) {
            return 0.0d;
        }
        int i = this.j0;
        if (i > 0) {
            return i;
        }
        for (int i2 = 0; i2 < F0.attributes.size(); i2++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                double d2 = documentAttribute.duration;
                this.k0 = d2;
                return d2;
            }
            if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                double d3 = documentAttribute.duration;
                this.k0 = d3;
                return d3;
            }
        }
        return this.j0;
    }

    public final int L1() {
        TLRPC.Message message = this.k;
        int i = message.realId;
        return i != 0 ? i : message.id;
    }

    public final boolean L3() {
        return n1(this.k) != null && M3(F0());
    }

    public final boolean L4() {
        return F0() != null && N4(F0());
    }

    public final TLRPC.TL_availableEffect M0() {
        TLRPC.Message message = this.k;
        if (message == null || (message.flags2 & 4) == 0) {
            return null;
        }
        return uc7.s1(this.K1).Z0(this.k.effect);
    }

    public final int M1() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        if (messageReplies != null) {
            return messageReplies.replies;
        }
        return 0;
    }

    public final boolean M2() {
        int i = this.D;
        return i == 13 || i == 15 || i == 19;
    }

    public final boolean M5() {
        if (!this.X1) {
            return false;
        }
        if (this.D == 5 || Q4(this.k)) {
            return true;
        }
        if (!M2() || this.N1 == null) {
            return (this.v == null || this.N1 == null) ? false : true;
        }
        return true;
    }

    public final void N(r47 r47Var) {
        ArrayList arrayList;
        TLRPC.MessageMedia messageMedia;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        TLRPC.TL_messageReactions tL_messageReactions;
        this.m1 = r47Var.m1;
        TLRPC.Message message = this.k;
        message.premiumEffectWasPlayed = r47Var.k.premiumEffectWasPlayed;
        this.R = r47Var.R;
        this.X1 = r47Var.X1;
        TLRPC.TL_messageReactions tL_messageReactions2 = message.reactions;
        int i = 0;
        if (tL_messageReactions2 != null && (arrayList2 = tL_messageReactions2.results) != null && !arrayList2.isEmpty() && (tL_messageReactions = r47Var.k.reactions) != null && tL_messageReactions.results != null) {
            for (int i2 = 0; i2 < this.k.reactions.results.size(); i2++) {
                TLRPC.ReactionCount reactionCount = this.k.reactions.results.get(i2);
                for (int i3 = 0; i3 < r47Var.k.reactions.results.size(); i3++) {
                    TLRPC.ReactionCount reactionCount2 = r47Var.k.reactions.results.get(i3);
                    if (x49.g(reactionCount.reaction, reactionCount2.reaction)) {
                        reactionCount.lastDrawnPosition = reactionCount2.lastDrawnPosition;
                    }
                }
            }
        }
        boolean z = r47Var.N0;
        this.N0 = z;
        TLRPC.Message message2 = this.k;
        TLRPC.Message message3 = r47Var.k;
        message2.replyStory = message3.replyStory;
        TLRPC.MessageMedia messageMedia2 = message2.media;
        if (messageMedia2 != null && (messageMedia = message3.media) != null) {
            messageMedia2.storyItem = messageMedia.storyItem;
        }
        if (!z || (arrayList = this.B2) == null) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o47) obj).y.clear();
        }
    }

    public final long N0() {
        TLRPC.Message message = this.k;
        if (message == null || (message.flags2 & 4) == 0) {
            return 0L;
        }
        return message.effect;
    }

    public final int N1() {
        TLRPC.MessageReplyHeader messageReplyHeader = this.k.reply_to;
        if (messageReplyHeader != null) {
            return messageReplyHeader.reply_to_msg_id;
        }
        return 0;
    }

    public boolean N3() {
        return this.k.out;
    }

    public final boolean N5() {
        return !this.j2;
    }

    public final void O(int i, TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent, ArrayList arrayList, HashMap hashMap, boolean z) {
        String str = this.W;
        if (((ArrayList) hashMap.get(str)) == null) {
            hashMap.put(str, new ArrayList());
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = ob6.u(tL_channelAdminLogEvent.date, false);
            tL_message.id = 0;
            tL_message.date = tL_channelAdminLogEvent.date;
            r47 r47Var = new r47(i, tL_message, false, false);
            r47Var.D = 10;
            r47Var.U = 1;
            r47Var.l0 = true;
            if (z) {
                arrayList.add(0, r47Var);
            } else {
                arrayList.add(r47Var);
            }
        }
    }

    public final ArrayList O0() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        boolean z = this.M2;
        boolean z2 = this.L2;
        if (z) {
            if (z2 && (tL_textWithEntities = message.translatedSummaryText) != null) {
                return tL_textWithEntities.entities;
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = message.summaryText;
            if (tL_textWithEntities2 != null) {
                return tL_textWithEntities2.entities;
            }
            return null;
        }
        if (!z2) {
            return message.entities;
        }
        if (message.voiceTranscriptionOpen) {
            TLRPC.TL_textWithEntities tL_textWithEntities3 = message.translatedVoiceTranscription;
            if (tL_textWithEntities3 != null) {
                return tL_textWithEntities3.entities;
            }
            return null;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities4 = message.translatedText;
        if (tL_textWithEntities4 != null) {
            return tL_textWithEntities4.entities;
        }
        return null;
    }

    public final CharSequence O1() {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence s5;
        TLRPC.Message message = this.k;
        if (message == null) {
            return "";
        }
        TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
        int i = this.K1;
        if (messageReplyHeader == null) {
            boolean y = wf3.y(B0(message));
            TLRPC.Message message2 = this.k;
            if (y) {
                s5 = r5(i, B0(message2));
                charSequence2 = s5;
                charSequence = null;
            } else {
                charSequence = r5(i, B0(message2));
                charSequence2 = null;
            }
        } else {
            if (messageReplyHeader.reply_from != null) {
                TLRPC.Peer peer = messageReplyHeader.reply_to_peer_id;
                boolean z = peer == null || wf3.n(peer) != B0(this.k);
                TLRPC.MessageFwdHeader messageFwdHeader = this.k.reply_to.reply_from;
                TLRPC.Peer peer2 = messageFwdHeader.from_id;
                if (peer2 == null) {
                    TLRPC.Peer peer3 = messageFwdHeader.saved_from_peer;
                    if (peer3 != null) {
                        if (peer3 instanceof TLRPC.TL_peerUser) {
                            charSequence = s5(i, peer3, z);
                        } else {
                            s5 = s5(i, peer3, z);
                            charSequence2 = s5;
                            charSequence = null;
                        }
                    } else if (!TextUtils.isEmpty(messageFwdHeader.from_name)) {
                        charSequence = z ? new SpannableStringBuilder(g6()).append((CharSequence) " ").append((CharSequence) this.k.reply_to.reply_from.from_name) : new SpannableStringBuilder(this.k.reply_to.reply_from.from_name);
                    }
                    charSequence2 = null;
                } else if (peer2 instanceof TLRPC.TL_peerUser) {
                    charSequence = s5(i, peer2, z);
                    charSequence2 = null;
                } else {
                    s5 = s5(i, peer2, z);
                    charSequence2 = s5;
                    charSequence = null;
                }
            }
            charSequence = null;
            charSequence2 = null;
        }
        TLRPC.Peer peer4 = this.k.reply_to.reply_to_peer_id;
        if (peer4 != null && wf3.n(peer4) != B0(this.k)) {
            TLRPC.Peer peer5 = this.k.reply_to.reply_to_peer_id;
            boolean z2 = peer5 instanceof TLRPC.TL_peerUser;
            if (z2) {
                charSequence = s5(i, peer5, true);
            } else {
                charSequence2 = s5(i, peer5, !z2);
            }
        }
        r47 r47Var = this.C;
        if (r47Var != null) {
            if (wf3.y(r47Var.R1())) {
                if (charSequence2 == null) {
                    charSequence2 = r5(i, this.C.R1());
                }
            } else if (charSequence == null) {
                charSequence = r5(i, this.C.R1());
            }
        }
        return charSequence2 != null ? charSequence != null ? new SpannableStringBuilder(charSequence).append((CharSequence) " ").append(charSequence2) : charSequence2 : charSequence != null ? charSequence : ob6.M0(2131748533, null);
    }

    public boolean O3() {
        boolean z = true;
        if (this.u1) {
            return true;
        }
        Boolean bool = this.W2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (c5(this.k) && !a5()) {
            this.W2 = Boolean.FALSE;
            return false;
        }
        long e = yac.h(this.K1).e();
        if (this.n2 || B0(this.k) == e) {
            TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
            if (messageFwdHeader == null) {
                this.W2 = Boolean.TRUE;
                return true;
            }
            TLRPC.Peer peer = messageFwdHeader.from_id;
            if ((peer == null || peer.user_id != e) && !messageFwdHeader.saved_out) {
                z = false;
            }
            this.W2 = Boolean.valueOf(z);
            return z;
        }
        TLRPC.Peer peer2 = this.k.peer_id;
        TLRPC.Chat chat = null;
        if (peer2 != null) {
            long j = peer2.channel_id;
            if (j != 0) {
                chat = w0(null, null, j);
            }
        }
        TLRPC.Message message = this.k;
        if (message.out) {
            TLRPC.Peer peer3 = message.from_id;
            if ((peer3 instanceof TLRPC.TL_peerUser) || ((peer3 instanceof TLRPC.TL_peerChannel) && !xc2.V(chat))) {
                TLRPC.Message message2 = this.k;
                if (!message2.post) {
                    TLRPC.MessageFwdHeader messageFwdHeader2 = message2.fwd_from;
                    if (messageFwdHeader2 == null) {
                        this.W2 = Boolean.TRUE;
                        return true;
                    }
                    TLRPC.Peer peer4 = messageFwdHeader2.saved_from_peer;
                    if (peer4 != null && peer4.user_id != e) {
                        z = false;
                    }
                    this.W2 = Boolean.valueOf(z);
                    return z;
                }
            }
        }
        this.W2 = Boolean.FALSE;
        return false;
    }

    public final boolean O4() {
        return Q4(this.k);
    }

    public final boolean O5() {
        if (q4()) {
            return false;
        }
        int i = this.D;
        return i == 13 || i == 15 || i == 5 || i == 19 || g3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (J4(r6.document) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r6).flags & 4) != 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P(boolean z) {
        boolean z2;
        String str;
        TLRPC.Message message;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        int parseInt;
        TLRPC.MessageMedia f;
        oec oecVar = this.r0;
        boolean z3 = oecVar != null && oecVar.O;
        TLRPC.Message message2 = this.k;
        if (message2.message == null) {
            return;
        }
        if ((message2.id >= 0 && !Y2()) || this.k.params == null) {
            return;
        }
        TLRPC.MessageMedia m1 = m1(this);
        if (!z && !K4(this.k) && !L3() && !g4() && !L4()) {
            if ((m1 instanceof TLRPC.TL_messageMediaPaidMedia) && m1.extended_media.size() == 1) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = m1.extended_media.get(0);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    }
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (!z2 && (m1 instanceof TLRPC.TL_messageMediaPoll)) {
                    str5 = this.k.params.get("pollMediaIndex");
                    if (str5 != null) {
                        try {
                            parseInt = Integer.parseInt(str5);
                        } catch (Throwable unused) {
                        }
                        f = ih8.f((TLRPC.TL_messageMediaPoll) m1, parseInt);
                        if (f != null && J4(f.document)) {
                            z2 = true;
                        }
                    }
                    parseInt = -1;
                    f = ih8.f((TLRPC.TL_messageMediaPoll) m1, parseInt);
                    if (f != null) {
                        z2 = true;
                    }
                }
                str = this.k.params.get("ve");
                if (str != null && z2) {
                    oec oecVar2 = new oec();
                    this.r0 = oecVar2;
                    if (str.length() >= 6) {
                        try {
                            String[] split = str.split("_");
                            if (split.length >= 12) {
                                oecVar2.a = Long.parseLong(split[1]);
                                oecVar2.b = Long.parseLong(split[2]);
                                oecVar2.g = Integer.parseInt(split[3]);
                                oecVar2.h = Integer.parseInt(split[4]);
                                oecVar2.i = Integer.parseInt(split[5]);
                                oecVar2.m = Integer.parseInt(split[6]);
                                oecVar2.k = Integer.parseInt(split[7]);
                                oecVar2.l = Integer.parseInt(split[8]);
                                oecVar2.v = Long.parseLong(split[9]);
                                oecVar2.n = Integer.parseInt(split[10]);
                                oecVar2.p = Long.parseLong(split[11]);
                                oecVar2.t = oecVar2.m == -1;
                                if (split[12].startsWith("-")) {
                                    String substring = split[12].substring(1);
                                    if (substring.length() > 0) {
                                        SerializedData serializedData = new SerializedData(Utilities.v(substring));
                                        int readInt32 = serializedData.readInt32(false);
                                        if (readInt32 >= 3) {
                                            str3 = "_";
                                            oecVar2.c = serializedData.readInt64(false);
                                            oecVar2.j = serializedData.readInt32(false);
                                        } else {
                                            str3 = "_";
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            po6 po6Var = new po6();
                                            oecVar2.A = po6Var;
                                            po6Var.a = serializedData.readFloat(false);
                                            if (readInt32 >= 5) {
                                                oecVar2.A.b = serializedData.readFloat(false);
                                            }
                                            oecVar2.A.c = serializedData.readFloat(false);
                                            oecVar2.A.d = serializedData.readFloat(false);
                                            oecVar2.A.e = serializedData.readFloat(false);
                                            oecVar2.A.f = serializedData.readFloat(false);
                                            oecVar2.A.g = serializedData.readFloat(false);
                                            oecVar2.A.h = serializedData.readInt32(false);
                                            oecVar2.A.i = serializedData.readInt32(false);
                                            oecVar2.A.j = serializedData.readFloat(false);
                                            oecVar2.A.k = serializedData.readFloat(false);
                                            oecVar2.A.l = serializedData.readFloat(false);
                                            oecVar2.A.m = serializedData.readFloat(false);
                                            oecVar2.A.n = serializedData.readInt32(false);
                                            oecVar2.A.o = serializedData.readFloat(false);
                                            oecVar2.A.q = serializedData.readFloat(false);
                                            oecVar2.A.r = new PointF(serializedData.readFloat(false), serializedData.readFloat(false));
                                            oecVar2.A.s = serializedData.readFloat(false);
                                            oecVar2.A.t = serializedData.readFloat(false);
                                            int i2 = 0;
                                            while (i2 < 4) {
                                                po6 po6Var2 = oecVar2.A;
                                                a98 a98Var = i2 == 0 ? (a98) po6Var2.p.b : i2 == 1 ? (a98) po6Var2.p.c : i2 == 2 ? (a98) po6Var2.p.d : (a98) po6Var2.p.e;
                                                a98Var.a = serializedData.readFloat(false);
                                                a98Var.b = serializedData.readFloat(false);
                                                a98Var.c = serializedData.readFloat(false);
                                                a98Var.d = serializedData.readFloat(false);
                                                a98Var.e = serializedData.readFloat(false);
                                                i2++;
                                            }
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            oecVar2.B = new String(serializedData.readByteArray(false));
                                        }
                                        if (serializedData.readByte(false) != 0) {
                                            int readInt322 = serializedData.readInt32(false);
                                            oecVar2.G = new ArrayList(readInt322);
                                            for (int i3 = 0; i3 < readInt322; i3++) {
                                                oecVar2.G.add(new mec(serializedData, false, false));
                                            }
                                            oecVar2.I = serializedData.readByte(false) == 1;
                                        }
                                        if (readInt32 >= 2 && serializedData.readByte(false) != 0) {
                                            fo6 fo6Var = new fo6();
                                            oecVar2.H = fo6Var;
                                            fo6Var.a = serializedData.readFloat(false);
                                            oecVar2.H.b = serializedData.readFloat(false);
                                            oecVar2.H.e = serializedData.readFloat(false);
                                            oecVar2.H.f = serializedData.readFloat(false);
                                            oecVar2.H.c = serializedData.readFloat(false);
                                            oecVar2.H.d = serializedData.readFloat(false);
                                            oecVar2.H.i = serializedData.readInt32(false);
                                            oecVar2.H.j = serializedData.readInt32(false);
                                            oecVar2.H.k = serializedData.readInt32(false);
                                            if (readInt32 >= 4) {
                                                oecVar2.H.l = serializedData.readBool(false);
                                            }
                                        }
                                        if (readInt32 >= 6) {
                                            serializedData.readInt32(false);
                                        }
                                        if (readInt32 >= 7) {
                                            oecVar2.J = serializedData.readBool(false);
                                            oecVar2.Z = serializedData.readBool(false);
                                        }
                                        if (readInt32 >= 8 && serializedData.readByte(false) != 0) {
                                            oecVar2.C = new String(serializedData.readByteArray(false));
                                        }
                                        if (readInt32 >= 9) {
                                            oecVar2.u = serializedData.readFloat(false);
                                        }
                                        if (readInt32 >= 10) {
                                            oecVar2.N = serializedData.readBool(false);
                                        }
                                        if (readInt32 >= 11 && serializedData.readInt32(false) == -559038737) {
                                            oecVar2.L = new al2(serializedData.readString(false));
                                            oecVar2.M = new ArrayList();
                                            for (int i4 = 0; i4 < oecVar2.L.e.size(); i4++) {
                                                nec necVar = new nec();
                                                necVar.r = (zk2) oecVar2.L.e.get(i4);
                                                necVar.readParams(serializedData, false);
                                                oecVar2.M.add(necVar);
                                            }
                                        }
                                        serializedData.cleanup();
                                    } else {
                                        str3 = "_";
                                    }
                                    i = 13;
                                } else {
                                    str3 = "_";
                                    i = 12;
                                }
                                while (i < split.length) {
                                    if (oecVar2.o == null) {
                                        oecVar2.o = split[i];
                                        str4 = str3;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(oecVar2.o);
                                        str4 = str3;
                                        sb.append(str4);
                                        sb.append(split[i]);
                                        oecVar2.o = sb.toString();
                                    }
                                    i++;
                                    str3 = str4;
                                }
                            }
                            this.r0.s = g4();
                            this.r0.O = z3;
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    this.r0 = null;
                }
                message = this.k;
                if (message.send_state != 3 || (str2 = message.params.get("prevMedia")) == null) {
                    return;
                }
                SerializedData serializedData2 = new SerializedData(Base64.decode(str2, 0));
                this.D1 = TLRPC.MessageMedia.TLdeserialize(serializedData2, serializedData2.readInt32(false), false);
                this.C1 = serializedData2.readString(false);
                this.G1 = serializedData2.readString(false);
                int readInt323 = serializedData2.readInt32(false);
                this.F1 = new ArrayList(readInt323);
                for (int i5 = 0; i5 < readInt323; i5++) {
                    this.F1.add(TLRPC.MessageEntity.TLdeserialize(serializedData2, serializedData2.readInt32(false), false));
                }
                serializedData2.cleanup();
                return;
            }
            z2 = false;
            if (!z2) {
                str5 = this.k.params.get("pollMediaIndex");
                if (str5 != null) {
                }
                parseInt = -1;
                f = ih8.f((TLRPC.TL_messageMediaPoll) m1, parseInt);
                if (f != null) {
                }
            }
            str = this.k.params.get("ve");
            if (str != null) {
                oec oecVar22 = new oec();
                this.r0 = oecVar22;
                if (str.length() >= 6) {
                }
                this.r0 = null;
            }
            message = this.k;
            if (message.send_state != 3) {
                return;
            } else {
                return;
            }
        }
        z2 = true;
        if (!z2) {
        }
        str = this.k.params.get("ve");
        if (str != null) {
        }
        message = this.k;
        if (message.send_state != 3) {
        }
    }

    public final int P0() {
        if (c3(this.k)) {
            return S(this.k.id);
        }
        return 0;
    }

    public final long P1() {
        return Q1(yac.h(this.K1).e(), this.k);
    }

    public final boolean P2() {
        TLRPC.Message message;
        if (!xea.D0) {
            if (this.X2 == 0 && (message = this.k) != null) {
                long B0 = B0(message);
                if (B0 != 0) {
                    this.X2 = (xea.D0 || (B0 > 0 && uc7.s1(this.K1).k4.z0.f.contains(Long.valueOf(B0)))) ? (byte) 2 : (byte) 1;
                }
            }
            if (this.X2 != 2) {
                return false;
            }
        }
        return true;
    }

    public final boolean P3() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        if (!message.paid_suggested_post_stars && !message.paid_suggested_post_ton) {
            return false;
        }
        int i = this.K1;
        return ((long) (ConnectionsManager.getInstance(i).getCurrentTime() - this.k.date)) < uc7.s1(i).k4.h.g(TimeUnit.SECONDS);
    }

    public final boolean P5() {
        return Q5(this.k);
    }

    public final void Q() {
        if (this.p0 != null) {
            if ((xea.o() == 2 || q2()) && this.I1 == null) {
                try {
                    String str = g4() ? "br" : "b";
                    int size = this.p0.size();
                    for (int i = 0; i < size; i++) {
                        TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.p0.get(i);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            this.I1 = new BitmapDrawable(a.b.getResources(), in5.B(str, photoSize.bytes));
                            return;
                        }
                    }
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
        }
    }

    public final String Q0() {
        String S0 = S0();
        int lastIndexOf = S0.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? S0.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = F0().mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public final boolean Q3() {
        return R3(this.k);
    }

    public final TLRPC.TL_factCheck R0() {
        TLRPC.TL_factCheck tL_factCheck;
        q84 b = q84.b(this.K1);
        LongSparseArray longSparseArray = b.c;
        LongSparseArray longSparseArray2 = b.b;
        TLRPC.Message message = this.k;
        if (message == null || (tL_factCheck = message.factcheck) == null) {
            return null;
        }
        if (!tL_factCheck.need_check) {
            if (longSparseArray2.get(tL_factCheck.hash) == null) {
                TLRPC.TL_factCheck tL_factCheck2 = this.k.factcheck;
                longSparseArray2.put(tL_factCheck2.hash, tL_factCheck2);
                TLRPC.TL_factCheck tL_factCheck3 = this.k.factcheck;
                int i = b.a;
                if (tL_factCheck3 != null) {
                    jf7 Y = jf7.Y(i);
                    Y.a.c(new vx3(Y, tL_factCheck3, (byte) 13));
                    if (!b.f) {
                        b.f = true;
                        jf7 Y2 = jf7.Y(i);
                        Y2.a.c(new be7(Y2, (byte) 6));
                    }
                }
            }
            return this.k.factcheck;
        }
        long B0 = B0(message);
        int e1 = e1();
        long j = this.k.factcheck.hash;
        p84 p84Var = new p84(B0, e1, j);
        if (e1 < 0) {
            return null;
        }
        TLRPC.TL_factCheck tL_factCheck4 = (TLRPC.TL_factCheck) longSparseArray2.get(j);
        if (tL_factCheck4 != null) {
            this.k.factcheck = tL_factCheck4;
            return tL_factCheck4;
        }
        if (b.d.contains(p84Var)) {
            return this.k.factcheck;
        }
        HashMap hashMap = (HashMap) longSparseArray.get(B0);
        if (hashMap == null) {
            hashMap = new HashMap();
            longSparseArray.put(B0, hashMap);
        }
        if (!hashMap.containsKey(p84Var)) {
            hashMap.put(p84Var, new gt(b, p84Var, this, (byte) 16));
            lw3 lw3Var = b.e;
            hl.r(lw3Var);
            hl.d3(lw3Var, 80L);
        }
        return this.k.factcheck;
    }

    public final long R1() {
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        TLRPC.MessageFwdHeader messageFwdHeader = message.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null) {
            TLRPC.Peer peer2 = message.from_id;
            if (peer2 instanceof TLRPC.TL_peerUser) {
                return peer2.user_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                return -peer2.channel_id;
            }
            if (peer2 instanceof TLRPC.TL_peerChat) {
                return -peer2.chat_id;
            }
            if (message.post) {
                return message.peer_id.channel_id;
            }
        } else {
            long j = peer.user_id;
            if (j != 0) {
                TLRPC.Peer peer3 = messageFwdHeader.from_id;
                return peer3 instanceof TLRPC.TL_peerUser ? peer3.user_id : j;
            }
            if (peer.channel_id != 0) {
                if (j4()) {
                    TLRPC.Peer peer4 = this.k.fwd_from.from_id;
                    if (peer4 instanceof TLRPC.TL_peerUser) {
                        return peer4.user_id;
                    }
                }
                TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
                TLRPC.Peer peer5 = messageFwdHeader2.from_id;
                return peer5 instanceof TLRPC.TL_peerChannel ? -peer5.channel_id : peer5 instanceof TLRPC.TL_peerChat ? -peer5.chat_id : -messageFwdHeader2.saved_from_peer.channel_id;
            }
            long j2 = peer.chat_id;
            if (j2 != 0) {
                TLRPC.Peer peer6 = messageFwdHeader.from_id;
                return peer6 instanceof TLRPC.TL_peerUser ? peer6.user_id : peer6 instanceof TLRPC.TL_peerChannel ? -peer6.channel_id : peer6 instanceof TLRPC.TL_peerChat ? -peer6.chat_id : -j2;
            }
        }
        return 0L;
    }

    public final boolean R2() {
        return this.k.media_unread;
    }

    public final boolean R4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return Q4(this.k) && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    public final boolean R5() {
        TLRPC.Message message = this.k;
        return (message == null || message.peer_id == null || N3() || q4() || !uc7.s1(this.K1).O2(B0(this.k))) ? false : true;
    }

    public final String S0() {
        return F0() != null ? xb4.r(null, F0()) : T0(this.k);
    }

    public final long S1() {
        jfc jfcVar = this.g3;
        if (jfcVar != null) {
            return jfcVar.g.size;
        }
        jfc jfcVar2 = this.h3;
        if (jfcVar2 != null) {
            return jfcVar2.g.size;
        }
        jfc jfcVar3 = this.i3;
        return jfcVar3 != null ? jfcVar3.g.size : p1(n1(this.k));
    }

    public final boolean S2() {
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        TLRPC.UserFull Y1;
        TLRPC.WallPaper wallPaper;
        return (!W4() || (message = this.k) == null || (messageAction = message.action) == null || messageAction.wallpaper == null || (Y1 = uc7.s1(this.K1).Y1(B0(this.k))) == null || (wallPaper = Y1.wallpaper) == null || !Y1.wallpaper_overridden || this.k.action.wallpaper.id != wallPaper.id) ? false : true;
    }

    public final boolean S3() {
        return this.D == 17 && (n1(this.k) instanceof TLRPC.TL_messageMediaPoll);
    }

    public final boolean S4() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        if (!Q4(message) && (!g4() || !u2c.m(this))) {
            return false;
        }
        TLRPC.Message message2 = this.k;
        if (!message2.voiceTranscriptionOpen || message2.voiceTranscription == null) {
            return false;
        }
        return message2.voiceTranscriptionFinal || u2c.l(this);
    }

    public final boolean T(r47 r47Var) {
        return r47Var != null && e1() == r47Var.e1() && B0(this.k) == B0(r47Var.k);
    }

    public final long T1() {
        TLRPC.TL_messages_emojiGameOutcome tL_messages_emojiGameOutcome;
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaDice) || (tL_messages_emojiGameOutcome = ((TLRPC.TL_messageMediaDice) n1).game_outcome) == null) {
            return 0L;
        }
        long j = tL_messages_emojiGameOutcome.ton_amount;
        return j > 0 ? j : -tL_messages_emojiGameOutcome.stake_ton_amount;
    }

    public final boolean T2() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaDice;
    }

    public final void T5() {
        TLRPC.Message message;
        if (this.K2 || this.v == null || (message = this.k) == null || message.entities == null) {
            return;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j = peer.user_id;
            if (j == 777000 || j == 489000) {
                Pattern pattern = q3;
                if (pattern == null) {
                    pattern = Pattern.compile("[\\d\\-]{5,8}");
                    q3 = pattern;
                }
                try {
                    Matcher matcher = pattern.matcher(this.v);
                    if (matcher.find()) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = matcher.start();
                        tL_messageEntitySpoiler.length = matcher.end() - tL_messageEntitySpoiler.offset;
                        this.k.entities.add(tL_messageEntitySpoiler);
                    }
                } catch (Exception e) {
                    cc4.g(e, false);
                }
                this.K2 = true;
            }
        }
    }

    public final String U1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        ArrayList<TLRPC.DocumentAttribute> arrayList = F0.attributes;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.DocumentAttribute documentAttribute = arrayList.get(i);
            i++;
            TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
            if (documentAttribute2 instanceof TLRPC.TL_documentAttributeSticker) {
                return documentAttribute2.alt;
            }
        }
        return null;
    }

    public final boolean U2() {
        return (F0() == null || K4(this.k) || I3() || Q4(this.k) || M2()) ? false : true;
    }

    public final boolean U4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return V4((TLRPC.TL_messageMediaPoll) n1);
        }
        return false;
    }

    public final int U5() {
        hl9 hl9Var = this.y2;
        if (hl9Var != null) {
            return hl9Var.t();
        }
        if (this.B2 == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.B2.size(); i2++) {
            int i3 = ((o47) this.B2.get(i2)).f;
            o47 o47Var = (o47) this.B2.get(i2);
            i += ((o47Var.K && o47Var.f()) ? o47Var.G : o47Var.w) + i3 + ((o47) this.B2.get(i2)).h;
        }
        return i;
    }

    public final String V0() {
        TLRPC.Document document = this.n;
        if (document == null) {
            document = G0(this.k);
        }
        if (document == null) {
            return T0(this.k);
        }
        TLRPC.Document document2 = this.n;
        if (document2 == null) {
            document2 = G0(this.k);
        }
        return xb4.r(null, document2);
    }

    public final String V1() {
        TLRPC.Document F0 = F0();
        if (F0 == null) {
            return null;
        }
        for (int i = 0; i < F0.attributes.size(); i++) {
            TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji)) {
                String str = documentAttribute.alt;
                if (str != null && str.length() > 0) {
                    return documentAttribute.alt;
                }
                return null;
            }
        }
        return null;
    }

    public final boolean V3() {
        if (n1(this.k) == null || !n1(this.k).nopremium) {
            return W3(F0());
        }
        return false;
    }

    public final int V5(dc2 dc2Var) {
        if (this.B2 == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.B2.size(); i2++) {
            i += ((o47) this.B2.get(i2)).j(dc2Var) + ((o47) this.B2.get(i2)).f + ((o47) this.B2.get(i2)).h;
        }
        return i;
    }

    public final Long W0() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.Message message = this.k;
        if (message == null || (messageFwdHeader = message.fwd_from) == null || (peer = messageFwdHeader.from_id) == null) {
            return null;
        }
        return Long.valueOf(wf3.n(peer));
    }

    public final TLRPC.WebPage W1() {
        if (!y4()) {
            return null;
        }
        TLRPC.TL_webPage tL_webPage = this.b3;
        if (tL_webPage != null) {
            return tL_webPage;
        }
        TLRPC.TL_webPage tL_webPage2 = new TLRPC.TL_webPage();
        tL_webPage2.type = "telegram_story";
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = new TLRPC.TL_webPageAttributeStory();
        tL_webPageAttributeStory.id = this.k.media.id;
        tL_webPageAttributeStory.peer = uc7.s1(this.K1).y1(this.k.media.user_id);
        TL_stories.StoryItem storyItem = this.k.media.storyItem;
        if (storyItem != null) {
            tL_webPageAttributeStory.flags |= 1;
            tL_webPageAttributeStory.storyItem = storyItem;
        }
        tL_webPage2.attributes.add(tL_webPageAttributeStory);
        this.b3 = tL_webPage2;
        return tL_webPage2;
    }

    public final boolean W4() {
        if (this.D == 22) {
            return true;
        }
        TLRPC.Message message = this.k;
        return message != null && (message.action instanceof TLRPC.TL_messageActionSetSameChatWallPaper);
    }

    public final int W5() {
        hl9 hl9Var = this.y2;
        if (hl9Var != null) {
            return hl9Var.t();
        }
        Integer num = this.V2;
        if (num != null) {
            return num.intValue();
        }
        if (this.B2 == null) {
            this.V2 = 0;
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.B2.size(); i2++) {
            int i3 = ((o47) this.B2.get(i2)).f;
            o47 o47Var = (o47) this.B2.get(i2);
            i += i3 + (o47Var.K ? o47Var.G : o47Var.w) + ((o47) this.B2.get(i2)).h;
        }
        this.V2 = Integer.valueOf(i);
        return i;
    }

    public final TLObject X0() {
        Long W0 = W0();
        if (W0 == null) {
            return null;
        }
        return uc7.s1(this.K1).b2(W0.longValue());
    }

    public final boolean X2() {
        TLRPC.Message message = this.k;
        return (message == null || (message.flags & 32768) == 0 || message.edit_date == 0 || message.edit_hide) ? false : true;
    }

    public final boolean X3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        return (messageFwdHeader == null || TextUtils.isEmpty(messageFwdHeader.from_name)) ? false : true;
    }

    public final boolean X4() {
        TLRPC.Message message;
        if (!W4() || (message = this.k) == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) && ((TLRPC.TL_messageActionSetChatWallPaper) messageAction).for_both;
    }

    public final void X5() {
        boolean z = !this.i1;
        SharedPreferences.Editor edit = uc7.s1(this.K1).X3.edit();
        String str = "c" + B0(this.k) + "_rec";
        this.i1 = z;
        edit.putBoolean(str, z).apply();
    }

    public final String Y0() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader == null) {
            return null;
        }
        TLRPC.Peer peer = messageFwdHeader.from_id;
        boolean z = peer instanceof TLRPC.TL_peerChannel;
        int i = this.K1;
        if (z) {
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(this.k.fwd_from.from_id.channel_id));
            if (M0 != null) {
                return M0.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerChat) {
            TLRPC.Chat M02 = uc7.s1(i).M0(Long.valueOf(this.k.fwd_from.from_id.chat_id));
            if (M02 != null) {
                return M02.title;
            }
            return null;
        }
        if (peer instanceof TLRPC.TL_peerUser) {
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(this.k.fwd_from.from_id.user_id));
            if (X1 != null) {
                return lbc.r(X1);
            }
            return null;
        }
        String str = messageFwdHeader.from_name;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final long Y1() {
        int i = this.K1;
        TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B0(this.k)));
        return Z1(i, this.k, vsd.b(vsd.b(vsd.b(0, 1, xc2.c0(M0)), 4, xc2.p0(M0)), 8, lbc.w(uc7.s1(i).X1(Long.valueOf(B0(this.k))))));
    }

    public final boolean Y2() {
        TLRPC.Message message = this.k;
        return message.send_state == 3 && message.id > 0;
    }

    public final boolean Y3() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) n1).poll.public_voters;
        }
        return false;
    }

    public final boolean Y4() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaWebPage;
    }

    public final long Z0() {
        return B1(this.k.from_id);
    }

    public final boolean Z2() {
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
        TLRPC.Message message = this.k;
        return z ? n1(message).photo.id == 0 : (n1(message) instanceof TLRPC.TL_messageMediaDocument) && n1(this.k).document.dc_id == 0;
    }

    public final boolean Z3() {
        return a4(this.k);
    }

    public final boolean Z4() {
        return (!(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || n1(this.k).webpage.document == null || s3(n1(this.k).webpage.document, false)) ? false : true;
    }

    public final void Z5() {
        int i = this.K1;
        a6(uc7.s1(i).d, uc7.s1(i).b, null, null);
    }

    public final boolean a3() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        TLRPC.MessageMedia messageMedia2;
        Boolean bool = this.T2;
        TLRPC.Message message = this.k;
        boolean z = false;
        if (bool != null) {
            return (message == null || (messageMedia2 = message.media) == null || messageMedia2.webpage == null || !bool.booleanValue()) ? false : true;
        }
        if (message != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && !TextUtils.isEmpty(hyc.e(webPage.url))) {
            z = true;
        }
        this.T2 = Boolean.valueOf(z);
        return z;
    }

    public final boolean a5() {
        TLRPC.Message message = this.k;
        return c3(message) && message.ephemeralAnchorMsgId != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1507:0x27a1, code lost:
    
        if (J4(r4.document) != false) goto L1490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1508:0x27b2, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1528:0x27b0, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r5).flags & 4) != 0) goto L1490;
     */
    /* JADX WARN: Removed duplicated region for block: B:1434:0x25b0  */
    /* JADX WARN: Removed duplicated region for block: B:1452:0x261b  */
    /* JADX WARN: Removed duplicated region for block: B:1454:0x261f  */
    /* JADX WARN: Removed duplicated region for block: B:1634:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09e4  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x2a58  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0f58  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x1132  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x11c0  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x1208  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x1419  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x14b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a6(AbstractMap abstractMap, AbstractMap abstractMap2, zh6 zh6Var, zh6 zh6Var2) {
        TLRPC.User user;
        TLRPC.Chat w0;
        boolean z;
        String str;
        char c;
        String G;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String str2;
        String p;
        boolean V;
        String str3;
        TLRPC.Chat w02;
        TLRPC.TodoItem todoItem;
        String p2;
        String str4;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        long j;
        String str5;
        String str6;
        TLObject tLObject;
        TLRPC.Chat chat3;
        TLRPC.Chat chat4;
        TLRPC.Chat chat5;
        ArrayList<TLRPC.VideoSize> arrayList;
        CharSequence D5;
        int indexOf;
        SpannableStringBuilder S2;
        int i;
        TLObject tLObject2;
        TLRPC.Peer peer;
        TLRPC.Chat chat6;
        boolean z2;
        TLRPC.Chat chat7;
        String str7;
        boolean z3;
        TLRPC.Chat chat8;
        oj ojVar;
        oj ojVar2;
        TLRPC.Chat w03;
        char c2;
        String G2;
        String L0;
        TLRPC.Peer peer2 = this.k.from_id;
        if (peer2 instanceof TLRPC.TL_peerUser) {
            user = d2(abstractMap, zh6Var, peer2.user_id);
        } else {
            if (peer2 instanceof TLRPC.TL_peerChannel) {
                w0 = w0(abstractMap2, zh6Var2, peer2.channel_id);
                user = null;
                TLObject tLObject3 = user == null ? user : w0;
                this.s2 = false;
                this.h1 = false;
                TLRPC.Message message = this.k;
                z = message instanceof TLRPC.TL_messageService;
                int i2 = this.K1;
                if (z) {
                    TLRPC.Chat chat9 = w0;
                    str = "";
                    this.G0 = false;
                    String E1 = uc7.s1(i2).E1(this.k.restriction_reason);
                    if (TextUtils.isEmpty(E1)) {
                        TL_iv.RichMessage richMessage = this.k.rich_message;
                        if (richMessage != null) {
                            O3();
                            SpannableStringBuilder d0 = d0(richMessage);
                            this.v = d0;
                            this.v = hl.J2(d0);
                        } else if (F3() || q4()) {
                            String str8 = this.k.message;
                            if (str8 != null) {
                                try {
                                    if (str8.length() > 200) {
                                        this.v = hl.V.matcher(this.k.message).replaceAll("\u200c");
                                    } else {
                                        this.v = hl.U.matcher(this.k.message).replaceAll("\u200c");
                                    }
                                } catch (Throwable unused) {
                                    this.v = this.k.message;
                                }
                            } else {
                                this.v = str8;
                            }
                        } else {
                            boolean z4 = n1(this.k) instanceof TLRPC.TL_messageMediaGiveaway;
                            TLRPC.Message message2 = this.k;
                            if (z4) {
                                TLRPC.MessageFwdHeader messageFwdHeader = message2.fwd_from;
                                if (messageFwdHeader != null) {
                                    TLRPC.Peer peer3 = messageFwdHeader.from_id;
                                    if (peer3 instanceof TLRPC.TL_peerChannel) {
                                        V = xc2.V(w0(abstractMap2, zh6Var2, peer3.channel_id));
                                        this.v = ob6.L0(!V ? 2131753475 : 2131753469);
                                    }
                                }
                                V = xc2.V(chat9);
                                this.v = ob6.L0(!V ? 2131753475 : 2131753469);
                            } else if (n1(message2) instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                this.v = ob6.L0(2131753385);
                            } else {
                                boolean z5 = n1(this.k) instanceof TLRPC.TL_messageMediaStory;
                                TLRPC.Message message3 = this.k;
                                if (z5) {
                                    if (n1(message3).via_mention) {
                                        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(n1(this.k).user_id));
                                        if (X1 == null || (p = lbc.p(X1)) == null) {
                                            str2 = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            qu6.u(sb, uc7.s1(i2).N2, "/", p, "/s/");
                                            sb.append(n1(this.k).id);
                                            str2 = sb.toString();
                                        }
                                        if (str2 != null) {
                                            SpannableString spannableString = new SpannableString(str2);
                                            this.v = spannableString;
                                            spannableString.setSpan(new h8c("https://".concat(str2), new rmb()), 0, this.v.length(), 33);
                                        } else {
                                            this.v = str;
                                        }
                                    } else {
                                        this.v = ob6.L0(2131750503);
                                    }
                                } else if (n1(message3) instanceof TLRPC.TL_messageMediaDice) {
                                    this.v = C0();
                                } else {
                                    boolean z6 = n1(this.k) instanceof TLRPC.TL_messageMediaPoll;
                                    TLRPC.Message message4 = this.k;
                                    if (z6) {
                                        if (((TLRPC.TL_messageMediaPoll) n1(message4)).poll.quiz) {
                                            this.v = ob6.L0(2131746172);
                                        } else {
                                            this.v = ob6.L0(2131746912);
                                        }
                                    } else if (n1(message4) instanceof TLRPC.TL_messageMediaToDo) {
                                        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1(this.k);
                                        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
                                        if (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) {
                                            this.v = ob6.L0(2131748223);
                                        } else {
                                            this.v = ob6.U(2131748221, h0(tL_messageMediaToDo.todo.title, O3()));
                                        }
                                    } else if (R4()) {
                                        this.v = ob6.L0(2131753944);
                                    } else if (f4()) {
                                        this.v = ob6.L0(2131753943);
                                    } else {
                                        boolean z7 = n1(this.k) instanceof TLRPC.TL_messageMediaPaidMedia;
                                        TLRPC.Message message5 = this.k;
                                        if (z7) {
                                            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) n1(message5);
                                            int size = tL_messageMediaPaidMedia.extended_media.size();
                                            boolean z8 = false;
                                            for (int i3 = 0; i3 < size; i3++) {
                                                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i3);
                                                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                                    TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                                                    if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                                    }
                                                    z8 = false;
                                                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                                }
                                                if (z8) {
                                                    break;
                                                }
                                            }
                                            if (size == 1) {
                                                G = ob6.L0(z8 ? 2131753926 : 2131753941);
                                                c = 0;
                                            } else {
                                                c = 0;
                                                G = ob6.G(size, z8 ? "Media" : "Photos", new Object[0]);
                                            }
                                            this.v = G;
                                            Object[] objArr = new Object[1];
                                            objArr[c] = G;
                                            this.v = nza.T0(ob6.Z(2131753942, objArr));
                                        } else if (n1(message5) instanceof TLRPC.TL_messageMediaPhoto) {
                                            if (n1(this.k).ttl_seconds != 0 && !(this.k instanceof TLRPC.TL_message_secret)) {
                                                this.v = ob6.L0(2131753970);
                                            } else if (c1() != 0) {
                                                this.v = ob6.L0(2131754298);
                                            } else if (D3()) {
                                                this.v = ob6.L0(2131753955);
                                            } else {
                                                this.v = ob6.L0(2131753941);
                                            }
                                        } else if (G4() || ((n1(this.k) instanceof TLRPC.TL_messageMediaDocument) && (((F0() instanceof TLRPC.TL_documentEmpty) || F0() == null) && n1(this.k).ttl_seconds != 0))) {
                                            if (n1(this.k).ttl_seconds != 0) {
                                                TLRPC.Message message6 = this.k;
                                                if (!(message6 instanceof TLRPC.TL_message_secret)) {
                                                    if (n1(message6).voice) {
                                                        this.v = ob6.L0(2131753922);
                                                    } else if (n1(this.k).round) {
                                                        this.v = ob6.L0(2131753933);
                                                    } else {
                                                        this.v = ob6.L0(2131753969);
                                                    }
                                                }
                                            }
                                            this.v = ob6.L0(2131753926);
                                        } else if (O4()) {
                                            this.v = ob6.L0(2131753975);
                                        } else if (g4()) {
                                            this.v = ob6.L0(2131753934);
                                        } else if ((n1(this.k) instanceof TLRPC.TL_messageMediaGeo) || (n1(this.k) instanceof TLRPC.TL_messageMediaVenue)) {
                                            this.v = ob6.L0(2131753954);
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaGeoLive) {
                                            this.v = ob6.L0(2131753959);
                                        } else if (n1(this.k) instanceof TLRPC.TL_messageMediaContact) {
                                            this.v = ob6.L0(2131753972);
                                            if (!TextUtils.isEmpty(n1(this.k).vcard)) {
                                                this.Z1 = pm3.C(n1(this.k).vcard);
                                            }
                                        } else {
                                            boolean z9 = n1(this.k) instanceof TLRPC.TL_messageMediaGame;
                                            TLRPC.Message message7 = this.k;
                                            if (z9) {
                                                this.v = message7.message;
                                            } else {
                                                boolean z10 = n1(message7) instanceof TLRPC.TL_messageMediaInvoice;
                                                TLRPC.Message message8 = this.k;
                                                if (z10) {
                                                    this.v = n1(message8).description;
                                                } else if (n1(message8) instanceof TLRPC.TL_messageMediaUnsupported) {
                                                    this.v = ob6.L0(2131743484);
                                                } else {
                                                    boolean z11 = n1(this.k) instanceof TLRPC.TL_messageMediaWidget;
                                                    TLRPC.Message message9 = this.k;
                                                    if (z11) {
                                                        this.v = TextUtils.isEmpty(message9.message) ? ob6.L0(2131753919) : this.k.message;
                                                    } else if (n1(message9) instanceof TLRPC.TL_messageMediaDocument) {
                                                        if (s4() || K2(F0(), true)) {
                                                            String U1 = U1();
                                                            if (U1 == null || U1.length() <= 0) {
                                                                this.v = ob6.L0(2131753929);
                                                            } else {
                                                                this.v = qd4.y(U1, " ", ob6.L0(2131753929));
                                                            }
                                                        } else if (I3()) {
                                                            this.v = ob6.L0(2131753945);
                                                        } else if (q3()) {
                                                            this.v = ob6.L0(2131753964);
                                                        } else {
                                                            String B = xb4.B(F0());
                                                            if (TextUtils.isEmpty(B)) {
                                                                this.v = ob6.L0(2131753968);
                                                            } else {
                                                                this.v = B;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        this.v = E1;
                        this.G0 = true;
                    }
                } else {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction != null) {
                        String str9 = "un1";
                        if (messageAction instanceof TLRPC.TL_messageActionNewCreatorPending) {
                            TLRPC.User d2 = d2(abstractMap, zh6Var, ((TLRPC.TL_messageActionNewCreatorPending) messageAction).new_creator_id);
                            String L02 = ob6.L0(2131754594);
                            this.v = L02;
                            CharSequence D52 = D5(L02, "un1", d2);
                            this.v = D52;
                            this.v = D5(D52, "un2", tLObject3);
                        } else if (messageAction instanceof TLRPC.TL_messageActionChangeCreator) {
                            TLRPC.User d22 = d2(abstractMap, zh6Var, ((TLRPC.TL_messageActionChangeCreator) messageAction).new_creator_id);
                            String L03 = ob6.L0(2131754661);
                            this.v = L03;
                            CharSequence D53 = D5(L03, "un1", tLObject3);
                            this.v = D53;
                            this.v = D5(D53, "un2", d22);
                        } else if (messageAction instanceof TLRPC.TL_messageActionManagedBotCreated) {
                            TLRPC.User d23 = d2(abstractMap, zh6Var, ((TLRPC.TL_messageActionManagedBotCreated) messageAction).bot_id);
                            TLRPC.User d24 = d2(abstractMap, zh6Var, this.k.peer_id.user_id);
                            String L04 = ob6.L0(2131754597);
                            this.v = L04;
                            CharSequence D54 = D5(L04, "un1", d23);
                            this.v = D54;
                            this.v = D5(D54, "un2", d24);
                        } else if (messageAction instanceof TLRPC.TL_messageActionBotInvite) {
                            long j2 = ((TLRPC.TL_messageActionBotInvite) messageAction).inviter_id;
                            TLRPC.User d25 = j2 != 0 ? d2(abstractMap, zh6Var, j2) : null;
                            if (d25 == null || lbc.D(d25)) {
                                this.v = ob6.L0(2131754663);
                            } else {
                                this.v = D5(ob6.L0(2131754664), "un1", d25);
                            }
                        } else {
                            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                str3 = "";
                                this.U = 1;
                                this.D = 10;
                                TLRPC.TL_messageActionSetSameChatWallPaper tL_messageActionSetSameChatWallPaper = (TLRPC.TL_messageActionSetSameChatWallPaper) messageAction;
                                TLRPC.User d26 = d2(abstractMap, zh6Var, O3() ? 0L : A0());
                                ArrayList arrayList2 = new ArrayList();
                                this.p0 = arrayList2;
                                TLRPC.Document document = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                                if (document != null) {
                                    arrayList2.addAll(document.thumbs);
                                    this.n0 = tL_messageActionSetSameChatWallPaper.wallpaper.document;
                                }
                                if (d26 != null) {
                                    if (d26.id == yac.h(i2).n) {
                                        this.v = ob6.Z(2131754559, new Object[0]);
                                    } else {
                                        this.v = ob6.Z(2131754560, d26.first_name);
                                    }
                                } else if (w0 != null) {
                                    this.v = ob6.L0(xc2.V(w0) ? 2131754558 : 2131754553);
                                } else if (user != null) {
                                    this.v = ob6.Z(2131754552, lbc.j(user));
                                }
                            } else {
                                str3 = "";
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    this.U = 1;
                                    TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                    this.D = 22;
                                    ArrayList arrayList3 = new ArrayList();
                                    this.p0 = arrayList3;
                                    TLRPC.Document document2 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                    if (document2 != null) {
                                        arrayList3.addAll(document2.thumbs);
                                        this.n0 = tL_messageActionSetChatWallPaper.wallpaper.document;
                                    }
                                    TLRPC.User d27 = d2(abstractMap, zh6Var, O3() ? 0L : A0());
                                    TLRPC.User d28 = d2(abstractMap, zh6Var, A0());
                                    if (d27 != null) {
                                        if (d27.id != yac.h(i2).n) {
                                            SpannableString spannableString2 = new SpannableString(lbc.j(d27));
                                            spannableString2.setSpan(new y7c(hl.o()), 0, spannableString2.length(), 33);
                                            if (tL_messageActionSetChatWallPaper.same) {
                                                this.D = 10;
                                                L0 = ob6.L0(2131754560);
                                                this.v = L0;
                                            } else if (tL_messageActionSetChatWallPaper.for_both) {
                                                L0 = ob6.L0(2131754556);
                                                this.v = L0;
                                            } else {
                                                L0 = ob6.L0(2131754557);
                                                this.v = L0;
                                            }
                                            this.v = hl.G2(L0, spannableString2, "%s");
                                        } else if (tL_messageActionSetChatWallPaper.same) {
                                            this.D = 10;
                                            this.v = ob6.Z(2131754559, new Object[0]);
                                        } else if (!tL_messageActionSetChatWallPaper.for_both || d28 == null) {
                                            this.v = ob6.L0(2131754555);
                                        } else {
                                            this.v = ob6.L0(2131754554);
                                            SpannableString spannableString3 = new SpannableString(lbc.j(d28));
                                            spannableString3.setSpan(new y7c(hl.o()), 0, spannableString3.length(), 33);
                                            this.v = hl.G2(this.v, spannableString3, "%s");
                                        }
                                    } else if (w0 != null) {
                                        this.v = ob6.L0(xc2.V(w0) ? 2131754558 : 2131754553);
                                    } else if (user != null) {
                                        this.v = ob6.Z(2131754552, lbc.j(user));
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                    TLRPC.TL_messageActionGroupCallScheduled tL_messageActionGroupCallScheduled = (TLRPC.TL_messageActionGroupCallScheduled) messageAction;
                                    if ((message.peer_id instanceof TLRPC.TL_peerChat) || z4()) {
                                        this.v = ob6.Z(2131754612, ob6.W(3, tL_messageActionGroupCallScheduled.schedule_date, false));
                                    } else {
                                        this.v = ob6.Z(2131754655, ob6.W(3, tL_messageActionGroupCallScheduled.schedule_date, false));
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGroupCall) {
                                    int i4 = messageAction.duration;
                                    if (i4 != 0) {
                                        int i5 = i4 / 86400;
                                        if (i5 > 0) {
                                            c2 = 0;
                                            G2 = ob6.G(i5, "Days", new Object[0]);
                                        } else {
                                            c2 = 0;
                                            int i6 = i4 / 3600;
                                            if (i6 > 0) {
                                                G2 = ob6.G(i6, "Hours", new Object[0]);
                                            } else {
                                                int i7 = i4 / 60;
                                                G2 = i7 > 0 ? ob6.G(i7, "Minutes", new Object[0]) : ob6.G(i4, "Seconds", new Object[0]);
                                            }
                                        }
                                        if (!(this.k.peer_id instanceof TLRPC.TL_peerChat) && !z4()) {
                                            Object[] objArr2 = new Object[1];
                                            objArr2[c2] = G2;
                                            this.v = ob6.Z(2131754657, objArr2);
                                        } else if (N3()) {
                                            Object[] objArr3 = new Object[1];
                                            objArr3[c2] = G2;
                                            this.v = ob6.Z(2131754615, objArr3);
                                        } else {
                                            Object[] objArr4 = new Object[1];
                                            objArr4[c2] = G2;
                                            this.v = D5(ob6.Z(2131754616, objArr4), "un1", tLObject3);
                                        }
                                    } else if (!(message.peer_id instanceof TLRPC.TL_peerChat) && !z4()) {
                                        this.v = ob6.L0(2131754656);
                                    } else if (N3()) {
                                        this.v = ob6.L0(2131754610);
                                    } else {
                                        this.v = D5(ob6.L0(2131754611), "un1", tLObject3);
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                    long j3 = messageAction.user_id;
                                    if (j3 == 0 && messageAction.users.size() == 1) {
                                        j3 = this.k.action.users.get(0).longValue();
                                    }
                                    if (j3 != 0) {
                                        TLRPC.User d29 = d2(abstractMap, zh6Var, j3);
                                        if (N3()) {
                                            this.v = D5(ob6.L0(2131754609), "un2", d29);
                                        } else if (j3 == yac.h(i2).e()) {
                                            this.v = D5(ob6.L0(2131754613), "un1", tLObject3);
                                        } else {
                                            CharSequence D55 = D5(ob6.L0(2131754614), "un2", d29);
                                            this.v = D55;
                                            this.v = D5(D55, "un1", tLObject3);
                                        }
                                    } else if (N3()) {
                                        this.v = E5(ob6.L0(2131754609), this.k.action.users, abstractMap, zh6Var);
                                    } else {
                                        CharSequence E5 = E5(ob6.L0(2131754614), this.k.action.users, abstractMap, zh6Var);
                                        this.v = E5;
                                        this.v = D5(E5, "un1", tLObject3);
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                    TLRPC.TL_messageActionGeoProximityReached tL_messageActionGeoProximityReached = (TLRPC.TL_messageActionGeoProximityReached) messageAction;
                                    long B1 = B1(tL_messageActionGeoProximityReached.from_id);
                                    TLObject d210 = B1 > 0 ? d2(abstractMap, zh6Var, B1) : w0(abstractMap2, zh6Var2, -B1);
                                    long B12 = B1(tL_messageActionGeoProximityReached.to_id);
                                    long e = yac.h(i2).e();
                                    if (B12 == e) {
                                        this.v = D5(ob6.Z(2131754496, ob6.y(tL_messageActionGeoProximityReached.distance, 2, null)), "un1", d210);
                                    } else {
                                        TLObject d211 = B12 > 0 ? d2(abstractMap, zh6Var, B12) : w0(abstractMap2, zh6Var2, -B12);
                                        int i8 = tL_messageActionGeoProximityReached.distance;
                                        if (B1 == e) {
                                            this.v = D5(ob6.Z(2131754495, ob6.y(i8, 2, null)), "un1", d211);
                                        } else {
                                            CharSequence D56 = D5(ob6.Z(2131754497, ob6.y(i8, 2, null)), "un2", d211);
                                            this.v = D56;
                                            this.v = D5(D56, "un1", d210);
                                        }
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionCustomAction) {
                                    this.v = messageAction.message;
                                } else if (messageAction instanceof TLRPC.TL_messageActionChatCreate) {
                                    if (N3()) {
                                        this.v = ob6.L0(2131754489);
                                    } else {
                                        this.v = D5(ob6.L0(2131754649), "un1", tLObject3);
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                    if (p3()) {
                                        TLRPC.Message message10 = this.k;
                                        if (message10.action.user_id == message10.from_id.user_id) {
                                            if (N3()) {
                                                this.v = ob6.L0(2131754487);
                                            } else {
                                                this.v = D5(ob6.L0(2131754598), "un1", tLObject3);
                                            }
                                        }
                                    }
                                    TLRPC.User d212 = d2(abstractMap, zh6Var, this.k.action.user_id);
                                    if (N3()) {
                                        this.v = D5(ob6.L0(2131754488), "un2", d212);
                                    } else if (this.k.action.user_id == yac.h(i2).e()) {
                                        this.v = D5(ob6.L0(2131754599), "un1", tLObject3);
                                    } else {
                                        CharSequence D57 = D5(ob6.L0(2131754600), "un2", d212);
                                        this.v = D57;
                                        this.v = D5(D57, "un1", tLObject3);
                                    }
                                } else if (messageAction instanceof TLRPC.TL_messageActionPaymentRefunded) {
                                    TLRPC.TL_messageActionPaymentRefunded tL_messageActionPaymentRefunded = (TLRPC.TL_messageActionPaymentRefunded) messageAction;
                                    long n = wf3.n(tL_messageActionPaymentRefunded.peer);
                                    TLObject d213 = n >= 0 ? d2(abstractMap, zh6Var, n) : w0(abstractMap2, zh6Var2, -n);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(tL_messageActionPaymentRefunded.currency);
                                    sb2.append(" ");
                                    this.v = nza.T0(D5(ob6.Z(2131754573, qu6.m(tL_messageActionPaymentRefunded.total_amount, ',', sb2)), "un1", d213));
                                } else {
                                    boolean g = atb.g(messageAction, TLRPC.TL_messageActionSuggestedPostRefund.class, TLRPC.TL_messageActionSuggestedPostSuccess.class);
                                    TLRPC.Message message11 = this.k;
                                    pj pjVar = pj.b;
                                    if (g) {
                                        String i9 = ro4.i(i2, wf3.n(message11.peer_id));
                                        if (i9 == null) {
                                            TLRPC.Chat w04 = w0(abstractMap2, zh6Var2, -wf3.n(this.k.peer_id));
                                            if (w04 != null) {
                                                long j4 = w04.linked_monoforum_id;
                                                if (j4 != 0 && (w03 = w0(abstractMap2, zh6Var2, j4)) != null) {
                                                    w04 = w03;
                                                }
                                            }
                                            i9 = wf3.G(null, null, w04);
                                        }
                                        String l = wf3.l(d2(abstractMap, zh6Var, wf3.n(this.k.saved_peer_id)));
                                        b77 q5 = q5();
                                        TLRPC.MessageAction messageAction2 = this.k.action;
                                        if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostRefund) {
                                            boolean z12 = ((TLRPC.TL_messageActionSuggestedPostRefund) messageAction2).payer_initiated;
                                            if (q5 == null || (ojVar2 = q5.a) == null) {
                                                this.v = ob6.Z(z12 ? 2131744031 : 2131744033, l, i9);
                                            } else {
                                                this.v = nza.V0(ob6.Z(z12 ? 2131744032 : 2131744034, l, i9, ojVar2.b()), ojVar2.a == pjVar);
                                            }
                                        } else if (messageAction2 instanceof TLRPC.TL_messageActionSuggestedPostSuccess) {
                                            if (q5 == null || (ojVar = q5.a) == null) {
                                                this.v = ob6.Z(2131744036, i9);
                                            } else {
                                                this.v = nza.V0(ob6.Z(2131744037, i9, ojVar.b()), ojVar.a == pjVar);
                                            }
                                        }
                                    } else {
                                        TLRPC.MessageAction messageAction3 = message11.action;
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                            long j5 = messageAction3.user_id;
                                            if (j5 == 0 && messageAction3.users.size() == 1) {
                                                j5 = this.k.action.users.get(0).longValue();
                                            }
                                            if (j5 != 0) {
                                                TLRPC.User d214 = d2(abstractMap, zh6Var, j5);
                                                long j6 = this.k.peer_id.channel_id;
                                                TLRPC.Chat w05 = j6 != 0 ? w0(abstractMap2, zh6Var2, j6) : null;
                                                TLRPC.Peer peer4 = this.k.from_id;
                                                if (peer4 == null || j5 != peer4.user_id) {
                                                    if (N3()) {
                                                        this.v = D5(ob6.L0(2131754493), "un2", d214);
                                                    } else if (j5 != yac.h(i2).e()) {
                                                        CharSequence D58 = D5(ob6.L0(2131754687), "un2", d214);
                                                        this.v = D58;
                                                        this.v = D5(D58, "un1", tLObject3);
                                                    } else if (this.k.peer_id.channel_id == 0) {
                                                        this.v = D5(ob6.L0(2131754683), "un1", tLObject3);
                                                    } else if (w05 == null || !w05.megagroup) {
                                                        this.v = D5(ob6.L0(2131752501), "un1", tLObject3);
                                                    } else {
                                                        this.v = D5(ob6.L0(2131748400), "un1", tLObject3);
                                                    }
                                                } else if (xc2.T(w05) && !w05.megagroup) {
                                                    this.h1 = true;
                                                    this.v = ob6.L0(2131752363);
                                                } else if (this.k.peer_id.channel_id != 0) {
                                                    if (j5 == yac.h(i2).e()) {
                                                        this.v = ob6.L0(2131752352);
                                                    } else {
                                                        this.v = D5(ob6.L0(2131754685), "un1", tLObject3);
                                                    }
                                                } else if (N3()) {
                                                    this.v = ob6.L0(2131754684);
                                                } else {
                                                    this.v = D5(ob6.L0(2131754686), "un1", tLObject3);
                                                }
                                            } else if (N3()) {
                                                this.v = E5(ob6.L0(2131754493), this.k.action.users, abstractMap, zh6Var);
                                            } else {
                                                CharSequence E52 = E5(ob6.L0(2131754687), this.k.action.users, abstractMap, zh6Var);
                                                this.v = E52;
                                                this.v = D5(E52, "un1", tLObject3);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedViaCommunity) {
                                            TLRPC.Chat w06 = w0(abstractMap2, zh6Var2, ((TLRPC.TL_messageActionChatJoinedViaCommunity) messageAction3).community_id);
                                            boolean V2 = xc2.V(w0(abstractMap2, zh6Var2, -wf3.n(this.k.peer_id)));
                                            if (N3()) {
                                                this.v = D5(ob6.L0(V2 ? 2131754601 : 2131754602), "un1", w06);
                                            } else {
                                                CharSequence D59 = D5(ob6.L0(2131754603), "un1", w06);
                                                this.v = D59;
                                                this.v = D5(D59, "un2", tLObject3);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                            if (N3()) {
                                                this.v = ob6.L0(2131754604);
                                            } else {
                                                this.v = D5(ob6.L0(2131754606), "un1", tLObject3);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                            TLRPC.TL_messageActionGiveawayLaunch tL_messageActionGiveawayLaunch = (TLRPC.TL_messageActionGiveawayLaunch) messageAction3;
                                            TLRPC.Peer peer5 = message11.peer_id;
                                            if (peer5 != null) {
                                                long j7 = peer5.channel_id;
                                                if (j7 != 0) {
                                                    chat8 = w0(abstractMap2, zh6Var2, j7);
                                                    boolean V3 = xc2.V(chat8);
                                                    if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                                        this.v = ob6.J((int) tL_messageActionGiveawayLaunch.stars, V3 ? "BoostingStarsGiveawayJustStarted" : "BoostingStarsGiveawayJustStartedGroup", chat8 != null ? chat8.title : str3);
                                                    } else {
                                                        this.v = ob6.Z(V3 ? 2131753423 : 2131753422, chat8 != null ? chat8.title : str3);
                                                    }
                                                }
                                            }
                                            chat8 = null;
                                            boolean V32 = xc2.V(chat8);
                                            if ((tL_messageActionGiveawayLaunch.flags & 1) == 0) {
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionWalletTonConnectRequest) {
                                            TLRPC.TL_messageActionWalletTonConnectRequest tL_messageActionWalletTonConnectRequest = (TLRPC.TL_messageActionWalletTonConnectRequest) messageAction3;
                                            boolean isEmpty = TextUtils.isEmpty(tL_messageActionWalletTonConnectRequest.dapp_name);
                                            boolean z13 = tL_messageActionWalletTonConnectRequest.declined;
                                            if (isEmpty) {
                                                this.v = ob6.L0(z13 ? 2131742628 : tL_messageActionWalletTonConnectRequest.accepted ? 2131742625 : tL_messageActionWalletTonConnectRequest.expires <= ConnectionsManager.getInstance(i2).getCurrentTime() ? 2131742627 : 2131742626);
                                            } else {
                                                this.v = ob6.Z(z13 ? 2131742632 : tL_messageActionWalletTonConnectRequest.accepted ? 2131742629 : tL_messageActionWalletTonConnectRequest.expires <= ConnectionsManager.getInstance(i2).getCurrentTime() ? 2131742631 : 2131742630, tL_messageActionWalletTonConnectRequest.dapp_name);
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionBoostApply) {
                                            TLRPC.Peer peer6 = message11.peer_id;
                                            if (peer6 != null) {
                                                long j8 = peer6.channel_id;
                                                if (j8 != 0) {
                                                    chat7 = w0(abstractMap2, zh6Var2, j8);
                                                    boolean V4 = xc2.V(chat7);
                                                    TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply = (TLRPC.TL_messageActionBoostApply) this.k.action;
                                                    if (tLObject3 instanceof TLRPC.User) {
                                                        str7 = tLObject3 instanceof TLRPC.Chat ? ((TLRPC.Chat) tLObject3).title : str3;
                                                        z3 = false;
                                                    } else {
                                                        TLRPC.User user2 = (TLRPC.User) tLObject3;
                                                        z3 = lbc.D(user2);
                                                        str7 = lbc.j(user2);
                                                    }
                                                    if (z3) {
                                                        int i10 = tL_messageActionBoostApply.boosts;
                                                        if (i10 <= 1) {
                                                            this.v = ob6.Z(V4 ? 2131753573 : 2131753561, str7);
                                                        } else {
                                                            this.v = ob6.G(i10, V4 ? "BoostingBoostsChannelByUserServiceMsgCount" : "BoostingBoostsGroupByUserServiceMsgCount", str7);
                                                        }
                                                    } else {
                                                        int i11 = tL_messageActionBoostApply.boosts;
                                                        if (i11 <= 1) {
                                                            this.v = ob6.L0(V4 ? 2131753570 : 2131753558);
                                                        } else {
                                                            this.v = ob6.G(i11, V4 ? "BoostingBoostsChannelByYouServiceMsgCount" : "BoostingBoostsGroupByYouServiceMsgCount", new Object[0]);
                                                        }
                                                    }
                                                }
                                            }
                                            chat7 = null;
                                            boolean V42 = xc2.V(chat7);
                                            TLRPC.TL_messageActionBoostApply tL_messageActionBoostApply2 = (TLRPC.TL_messageActionBoostApply) this.k.action;
                                            if (tLObject3 instanceof TLRPC.User) {
                                            }
                                            if (z3) {
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                            TLRPC.Peer peer7 = message11.peer_id;
                                            if (peer7 != null) {
                                                long j9 = peer7.channel_id;
                                                if (j9 != 0) {
                                                    chat6 = w0(abstractMap2, zh6Var2, j9);
                                                    boolean V5 = xc2.V(chat6);
                                                    TLRPC.TL_messageActionGiveawayResults tL_messageActionGiveawayResults = (TLRPC.TL_messageActionGiveawayResults) this.k.action;
                                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                    z2 = tL_messageActionGiveawayResults.stars;
                                                    int i12 = tL_messageActionGiveawayResults.winners_count;
                                                    if (z2) {
                                                        spannableStringBuilder.append((CharSequence) ob6.G(i12, "BoostingGiveawayServiceWinnersSelected", new Object[0]));
                                                        if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            spannableStringBuilder.append((CharSequence) ob6.G(tL_messageActionGiveawayResults.unclaimed_count, V5 ? "BoostingGiveawayServiceUndistributed" : "BoostingGiveawayServiceUndistributedGroup", new Object[0]));
                                                        }
                                                    } else {
                                                        spannableStringBuilder.append((CharSequence) ob6.I(i12, "BoostingStarsGiveawayServiceWinnersSelected"));
                                                        if (tL_messageActionGiveawayResults.unclaimed_count > 0) {
                                                            spannableStringBuilder.append((CharSequence) "\n");
                                                            spannableStringBuilder.append((CharSequence) ob6.G(tL_messageActionGiveawayResults.unclaimed_count, V5 ? "BoostingStarsGiveawayServiceUndistributed" : "BoostingStarsGiveawayServiceUndistributedGroup", new Object[0]));
                                                        }
                                                    }
                                                    this.v = spannableStringBuilder;
                                                }
                                            }
                                            chat6 = null;
                                            boolean V52 = xc2.V(chat6);
                                            TLRPC.TL_messageActionGiveawayResults tL_messageActionGiveawayResults2 = (TLRPC.TL_messageActionGiveawayResults) this.k.action;
                                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                            z2 = tL_messageActionGiveawayResults2.stars;
                                            int i122 = tL_messageActionGiveawayResults2.winners_count;
                                            if (z2) {
                                            }
                                            this.v = spannableStringBuilder2;
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                            this.v = D5(hl.S2(ob6.I((int) tL_messageActionPrizeStars.stars, "ActionStarGiveawayPrize")), "un1", w0(abstractMap2, zh6Var2, -wf3.n(tL_messageActionPrizeStars.boost_peer)));
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction3;
                                            if (tL_messageActionStarGift.prepaid_upgrade) {
                                                i = (int) tL_messageActionStarGift.upgrade_stars;
                                            } else {
                                                TL_stars.StarGift starGift = tL_messageActionStarGift.gift;
                                                i = starGift != null ? (int) starGift.stars : 0;
                                                if (!tL_messageActionStarGift.upgrade_separate) {
                                                    i += (int) tL_messageActionStarGift.upgrade_stars;
                                                }
                                            }
                                            TLRPC.Peer peer8 = tL_messageActionStarGift.peer;
                                            boolean z14 = peer8 != null && wf3.n(peer8) < 0;
                                            TLRPC.User d215 = d2(abstractMap, zh6Var, this.k.peer_id.user_id);
                                            if (!tL_messageActionStarGift.prepaid_upgrade && (peer = tL_messageActionStarGift.from_id) != null) {
                                                long n2 = wf3.n(peer);
                                                tLObject3 = n2 >= 0 ? d2(abstractMap, zh6Var, n2) : w0(abstractMap2, zh6Var2, -n2);
                                            }
                                            TLRPC.Peer peer9 = tL_messageActionStarGift.peer;
                                            if (peer9 != null) {
                                                long n4 = wf3.n(peer9);
                                                tLObject2 = n4 >= 0 ? d2(abstractMap, zh6Var, n4) : w0(abstractMap2, zh6Var2, -n4);
                                            } else {
                                                tLObject2 = null;
                                            }
                                            if (!tL_messageActionStarGift.prepaid_upgrade) {
                                                if (lbc.C(A0()) && tL_messageActionStarGift.from_id == null) {
                                                    this.v = hl.S2(ob6.L0(tL_messageActionStarGift.auction_acquired ? 2131754640 : 2131754625));
                                                    this.w = ob6.L0(2131754549);
                                                } else if (z14) {
                                                    SpannableStringBuilder S22 = hl.S2(ob6.I(i, "ActionGiftChannel"));
                                                    this.v = S22;
                                                    CharSequence D510 = D5(S22, "un1", tLObject3);
                                                    this.v = D510;
                                                    this.v = D5(D510, "un2", tLObject2);
                                                    this.w = ob6.L0(2131754549);
                                                } else if (lbc.D(d215)) {
                                                    this.v = hl.S2(ob6.L0(tL_messageActionStarGift.auction_acquired ? 2131754640 : 2131754626));
                                                    this.w = ob6.L0(2131754549);
                                                } else {
                                                    boolean z15 = tLObject3 instanceof TLRPC.User;
                                                    if (z15 && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                        this.v = D5(hl.S2(ob6.L0(2131754635)), "un1", d215);
                                                        TLRPC.TL_textWithEntities tL_textWithEntities2 = tL_messageActionStarGift.message;
                                                        if (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                                            this.w = ob6.L0(2131754549);
                                                        } else {
                                                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                            a(spannableStringBuilder3, tL_messageActionStarGift.message.entities, O3(), false, false);
                                                            this.w = spannableStringBuilder3;
                                                        }
                                                    } else if (z15 && lbc.C(((TLRPC.User) tLObject3).id)) {
                                                        this.v = TextUtils.replace(hl.S2(ob6.L0(2131754636)), new String[]{"un1"}, new CharSequence[]{ob6.L0(2131744582)});
                                                    } else {
                                                        this.v = D5(hl.S2(ob6.L0(2131754636)), "un1", tLObject3);
                                                        TLRPC.TL_textWithEntities tL_textWithEntities3 = tL_messageActionStarGift.message;
                                                        if (tL_textWithEntities3 == null || TextUtils.isEmpty(tL_textWithEntities3.text)) {
                                                            this.w = ob6.L0(2131754549);
                                                        } else {
                                                            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(tL_messageActionStarGift.message.text);
                                                            a(spannableStringBuilder4, tL_messageActionStarGift.message.entities, O3(), false, false);
                                                            this.w = spannableStringBuilder4;
                                                        }
                                                    }
                                                }
                                            } else if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self && !tL_messageActionStarGift.forceIn) {
                                                this.v = D5(hl.S2(ob6.L0(2131754576)), "un1", d215);
                                            } else {
                                                this.v = D5(hl.S2(ob6.L0(2131754577)), "un1", tLObject3);
                                            }
                                            int indexOf2 = this.v.toString().indexOf("un2");
                                            if (indexOf2 != -1) {
                                                this.v = SpannableStringBuilder.valueOf(this.v).replace(indexOf2, indexOf2 + 3, (CharSequence) ob6.I(i, "Gift2StarsCount"));
                                            }
                                        } else if (messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                                            TLRPC.User d216 = d2(abstractMap, zh6Var, A0());
                                            TL_stars.StarsAmount starsAmount = tL_messageActionStarGiftUnique.resale_amount;
                                            if (starsAmount != null) {
                                                oj n5 = oj.n(starsAmount);
                                                long A0 = A0();
                                                TLRPC.Peer peer10 = tL_messageActionStarGiftUnique.from_id;
                                                if (peer10 != null) {
                                                    A0 = wf3.n(peer10);
                                                }
                                                TLObject d217 = A0 >= 0 ? d2(abstractMap, zh6Var, A0) : w0(abstractMap2, zh6Var2, -A0);
                                                if (tL_messageActionStarGiftUnique.craft) {
                                                    this.v = hl.S2(ob6.L0(2131754526));
                                                } else {
                                                    TLRPC.Peer peer11 = tL_messageActionStarGiftUnique.peer;
                                                    if (peer11 != null) {
                                                        long n6 = wf3.n(peer11);
                                                        TLObject d218 = n6 >= 0 ? d2(abstractMap, zh6Var, n6) : w0(abstractMap2, zh6Var2, -n6);
                                                        if (n5.a == pjVar) {
                                                            S2 = hl.S2(ob6.Z(2131754516, n5.d()));
                                                            this.v = S2;
                                                        } else {
                                                            S2 = hl.S2(ob6.I((int) n5.a(), "ActionUniqueGiftResaleService"));
                                                            this.v = S2;
                                                        }
                                                        CharSequence D511 = D5(S2, "un1", d217);
                                                        this.v = D511;
                                                        this.v = D5(D511, "un2", d218);
                                                    } else {
                                                        if (tL_messageActionStarGiftUnique.from_offer) {
                                                            boolean z16 = O3() && A0() != yac.h(i2).e();
                                                            if (n5.a == pjVar) {
                                                                this.v = hl.S2(ob6.Z(z16 ? 2131754512 : 2131754520, n5.d()));
                                                            } else {
                                                                this.v = hl.S2(ob6.I((int) n5.a(), z16 ? "ActionUniqueGiftResaleSoldOutbound" : "ActionUniqueGiftResaleOutbound"));
                                                            }
                                                        } else if (n5.a == pjVar) {
                                                            this.v = D5(hl.S2(ob6.Z(O3() ? 2131754520 : 2131754524, n5.d())), "un1", d217);
                                                        } else {
                                                            this.v = D5(hl.S2(ob6.I((int) n5.a(), O3() ? "ActionUniqueGiftResaleOutbound" : "ActionUniqueGiftResaleInbound")), "un1", d217);
                                                        }
                                                    }
                                                }
                                            } else if (tL_messageActionStarGiftUnique.upgrade) {
                                                TLRPC.Peer peer12 = tL_messageActionStarGiftUnique.peer;
                                                if (peer12 != null) {
                                                    long n7 = wf3.n(peer12);
                                                    this.v = D5(hl.S2(ob6.L0(2131754504)), "un1", n7 >= 0 ? d2(abstractMap, zh6Var, n7) : w0(abstractMap2, zh6Var2, -n7));
                                                } else if (lbc.D(d216)) {
                                                    this.v = hl.S2(ob6.L0(2131754502));
                                                } else {
                                                    this.v = D5(hl.S2(ob6.L0(O3() ? 2131754503 : 2131754505)), "un1", d216);
                                                }
                                            } else {
                                                long A02 = A0();
                                                TLRPC.Peer peer13 = tL_messageActionStarGiftUnique.from_id;
                                                if (peer13 != null) {
                                                    A02 = wf3.n(peer13);
                                                }
                                                TLObject d219 = A02 >= 0 ? d2(abstractMap, zh6Var, A02) : w0(abstractMap2, zh6Var2, -A02);
                                                if (tL_messageActionStarGiftUnique.craft) {
                                                    this.v = hl.S2(ob6.L0(2131754526));
                                                } else {
                                                    TLRPC.Peer peer14 = tL_messageActionStarGiftUnique.peer;
                                                    if (peer14 != null) {
                                                        long n8 = wf3.n(peer14);
                                                        TLObject d220 = n8 >= 0 ? d2(abstractMap, zh6Var, n8) : w0(abstractMap2, zh6Var2, -n8);
                                                        SpannableStringBuilder S23 = hl.S2(ob6.L0(2131754506));
                                                        this.v = S23;
                                                        CharSequence D512 = D5(S23, "un1", d219);
                                                        this.v = D512;
                                                        this.v = D5(D512, "un2", d220);
                                                    } else if (tL_messageActionStarGiftUnique.assigned) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        sb3.append(tL_messageActionStarGiftUnique.gift.title);
                                                        sb3.append(" #");
                                                        this.v = D5(hl.S2(ob6.Z(2131754507, qu6.m(tL_messageActionStarGiftUnique.gift.num, ',', sb3))), "un1", d219);
                                                    } else {
                                                        this.v = D5(hl.S2(ob6.L0(O3() ? 2131754508 : 2131754509)), "un1", d219);
                                                    }
                                                }
                                            }
                                        } else {
                                            TLRPC.Chat chat10 = w0;
                                            if (messageAction3 instanceof TLRPC.TL_messageActionGiftStars) {
                                                if (tLObject3 instanceof TLRPC.User) {
                                                    TLRPC.User user3 = (TLRPC.User) tLObject3;
                                                    if (user3.self) {
                                                        D5 = D5(hl.S2(ob6.L0(2131754635)), "un1", d2(abstractMap, zh6Var, message11.peer_id.user_id));
                                                        this.v = D5;
                                                    } else if (lbc.C(user3.id)) {
                                                        D5 = TextUtils.replace(hl.S2(ob6.L0(2131754636)), new String[]{"un1"}, new CharSequence[]{ob6.L0(2131744582)});
                                                        this.v = D5;
                                                    }
                                                    indexOf = D5.toString().indexOf("un2");
                                                    if (indexOf != -1) {
                                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(this.v);
                                                        di0 h = di0.h();
                                                        TLRPC.MessageAction messageAction4 = this.k.action;
                                                        String e2 = h.e(messageAction4.amount, messageAction4.currency);
                                                        if ((this.k.action.flags & 1) != 0) {
                                                            e2 = String.format("%.2f", Double.valueOf(r4.cryptoAmount * 1.0E-9d)) + " " + this.k.action.cryptoCurrency + " (~ " + ((Object) e2) + ")";
                                                        }
                                                        this.v = valueOf.replace(indexOf, indexOf + 3, (CharSequence) e2);
                                                    }
                                                }
                                                D5 = D5(hl.S2(ob6.L0(2131754636)), "un1", tLObject3);
                                                this.v = D5;
                                                indexOf = D5.toString().indexOf("un2");
                                                if (indexOf != -1) {
                                                }
                                            } else if ((messageAction3 instanceof TLRPC.TL_messageActionGiftCode) && ((TLRPC.TL_messageActionGiftCode) messageAction3).boost_peer != null) {
                                                this.v = ob6.L0(2131753303);
                                            } else if (atb.g(messageAction3, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionGiftCode.class, TLRPC.TL_messageActionGiftTon.class)) {
                                                if ((tLObject3 instanceof TLRPC.User) && ((TLRPC.User) tLObject3).self) {
                                                    this.v = D5(hl.S2(ob6.L0(2131754635)), "un1", d2(abstractMap, zh6Var, this.k.peer_id.user_id));
                                                } else if (this.k.action instanceof TLRPC.TL_messageActionGiftTon) {
                                                    this.v = hl.S2(ob6.L0(2131754618));
                                                } else {
                                                    this.v = D5(hl.S2(ob6.L0(2131754636)), "un1", tLObject3);
                                                }
                                                int indexOf3 = this.v.toString().indexOf("un2");
                                                if (indexOf3 != -1) {
                                                    SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(this.v);
                                                    di0 h2 = di0.h();
                                                    TLRPC.MessageAction messageAction5 = this.k.action;
                                                    String e3 = h2.e(messageAction5.amount, messageAction5.currency);
                                                    if ((this.k.action.flags & 1) != 0) {
                                                        e3 = String.format("%.2f", Double.valueOf(r4.cryptoAmount * 1.0E-9d)) + " " + this.k.action.cryptoCurrency + " (~ " + ((Object) e3) + ")";
                                                    }
                                                    this.v = valueOf2.replace(indexOf3, indexOf3 + 3, (CharSequence) e3);
                                                }
                                                this.v = nza.T0(this.v);
                                            } else {
                                                TLRPC.Message message12 = this.k;
                                                TLRPC.MessageAction messageAction6 = message12.action;
                                                if (messageAction6 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                                    if (O3()) {
                                                        this.v = ob6.L0(2131754483);
                                                    } else {
                                                        this.v = D5(hl.S2(ob6.L0(2131754543)), "un1", tLObject3);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestProfilePhoto) {
                                                    TLRPC.Photo photo = messageAction6.photo;
                                                    if (photo == null || (arrayList = photo.video_sizes) == null || arrayList.isEmpty()) {
                                                        this.v = ob6.L0(2131754540);
                                                    } else {
                                                        this.v = ob6.L0(2131754536);
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditPhoto) {
                                                    TLRPC.Peer peer15 = message12.peer_id;
                                                    if (peer15 != null) {
                                                        long j10 = peer15.channel_id;
                                                        if (j10 != 0) {
                                                            chat5 = w0(abstractMap2, zh6Var2, j10);
                                                            if (xc2.T(chat5) || chat5.megagroup) {
                                                                if (N3()) {
                                                                    if (H4()) {
                                                                        this.v = D5(ob6.L0(2131754658), "un1", tLObject3);
                                                                    } else {
                                                                        this.v = D5(ob6.L0(2131754660), "un1", tLObject3);
                                                                    }
                                                                } else if (H4()) {
                                                                    this.v = ob6.L0(2131754490);
                                                                } else {
                                                                    this.v = ob6.L0(2131754492);
                                                                }
                                                            } else if (H4()) {
                                                                this.v = ob6.L0(2131754652);
                                                            } else {
                                                                this.v = ob6.L0(2131754654);
                                                            }
                                                        }
                                                    }
                                                    chat5 = null;
                                                    if (xc2.T(chat5)) {
                                                    }
                                                    if (N3()) {
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                                    TLRPC.Peer peer16 = message12.peer_id;
                                                    if (peer16 != null) {
                                                        long j11 = peer16.channel_id;
                                                        if (j11 != 0) {
                                                            chat4 = w0(abstractMap2, zh6Var2, j11);
                                                            if (!xc2.T(chat4) && !chat4.megagroup) {
                                                                this.v = ob6.L0(2131754653).replace("un2", this.k.action.title);
                                                            } else if (N3()) {
                                                                this.v = D5(ob6.L0(2131754659).replace("un2", this.k.action.title), "un1", tLObject3);
                                                            } else {
                                                                this.v = ob6.L0(2131754491).replace("un2", this.k.action.title);
                                                            }
                                                        }
                                                    }
                                                    chat4 = null;
                                                    if (!xc2.T(chat4)) {
                                                    }
                                                    if (N3()) {
                                                    }
                                                } else if (messageAction6 instanceof TLRPC.TL_messageActionChatDeletePhoto) {
                                                    TLRPC.Peer peer17 = message12.peer_id;
                                                    if (peer17 != null) {
                                                        long j12 = peer17.channel_id;
                                                        if (j12 != 0) {
                                                            chat3 = w0(abstractMap2, zh6Var2, j12);
                                                            if (!xc2.T(chat3) && !chat3.megagroup) {
                                                                this.v = ob6.L0(2131754651);
                                                            } else if (N3()) {
                                                                this.v = D5(ob6.L0(2131754572), "un1", tLObject3);
                                                            } else {
                                                                this.v = ob6.L0(2131754486);
                                                            }
                                                        }
                                                    }
                                                    chat3 = null;
                                                    if (!xc2.T(chat3)) {
                                                    }
                                                    if (N3()) {
                                                    }
                                                } else if (!(messageAction6 instanceof TLRPC.TL_messageActionTTLChange)) {
                                                    String str10 = ", ";
                                                    if (messageAction6 instanceof TLRPC.TL_messageActionRequestedPeer) {
                                                        ArrayList arrayList4 = new ArrayList();
                                                        ArrayList<TLRPC.Peer> arrayList5 = ((TLRPC.TL_messageActionRequestedPeer) this.k.action).peers;
                                                        int size2 = arrayList5.size();
                                                        int i13 = 0;
                                                        int i14 = 0;
                                                        int i15 = 0;
                                                        int i16 = 0;
                                                        while (i16 < size2) {
                                                            TLRPC.Peer peer18 = arrayList5.get(i16);
                                                            i16++;
                                                            TLRPC.Peer peer19 = peer18;
                                                            ArrayList<TLRPC.Peer> arrayList6 = arrayList5;
                                                            boolean z17 = peer19 instanceof TLRPC.TL_peerUser;
                                                            if (z17) {
                                                                str5 = str10;
                                                                str6 = str9;
                                                                tLObject = uc7.s1(i2).X1(Long.valueOf(peer19.user_id));
                                                                if (tLObject == null) {
                                                                    tLObject = d2(abstractMap, zh6Var, peer19.user_id);
                                                                }
                                                            } else {
                                                                str5 = str10;
                                                                str6 = str9;
                                                                if (peer19 instanceof TLRPC.TL_peerChat) {
                                                                    tLObject = uc7.s1(i2).M0(Long.valueOf(peer19.chat_id));
                                                                    if (tLObject == null) {
                                                                        tLObject = w0(abstractMap2, zh6Var2, peer19.chat_id);
                                                                    }
                                                                } else if (peer19 instanceof TLRPC.TL_peerChannel) {
                                                                    tLObject = uc7.s1(i2).M0(Long.valueOf(peer19.channel_id));
                                                                    if (tLObject == null) {
                                                                        tLObject = w0(abstractMap2, zh6Var2, peer19.channel_id);
                                                                    }
                                                                } else {
                                                                    tLObject = null;
                                                                }
                                                            }
                                                            if (z17) {
                                                                i13++;
                                                            } else if (peer19 instanceof TLRPC.TL_peerChat) {
                                                                i15++;
                                                            } else {
                                                                i14++;
                                                            }
                                                            if (tLObject != null) {
                                                                arrayList4.add(tLObject);
                                                            }
                                                            arrayList5 = arrayList6;
                                                            str9 = str6;
                                                            str10 = str5;
                                                        }
                                                        String str11 = str10;
                                                        String str12 = str9;
                                                        if (i13 > 0 && i13 != arrayList4.size()) {
                                                            this.v = ob6.J0(i13, "ActionRequestedPeerUserPlural");
                                                        } else if (i14 > 0 && i14 != arrayList4.size()) {
                                                            this.v = ob6.J0(i14, "ActionRequestedPeerChannelPlural");
                                                        } else if (i15 <= 0 || i15 == arrayList4.size()) {
                                                            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                                                            int i17 = 0;
                                                            while (i17 < arrayList4.size()) {
                                                                String str13 = str12;
                                                                spannableStringBuilder5.append(D5(str13, str13, (TLObject) arrayList4.get(i17)));
                                                                String str14 = str11;
                                                                if (i17 < arrayList4.size() - 1) {
                                                                    spannableStringBuilder5.append((CharSequence) str14);
                                                                }
                                                                i17++;
                                                                str12 = str13;
                                                                str11 = str14;
                                                            }
                                                            this.v = hl.G2(ob6.L0(2131754571), spannableStringBuilder5, str12);
                                                        } else {
                                                            this.v = ob6.J0(i15, "ActionRequestedPeerChatPlural");
                                                        }
                                                        TLRPC.User X12 = uc7.s1(i2).X1(Long.valueOf(A0()));
                                                        if (X12 == null) {
                                                            X12 = d2(abstractMap, zh6Var, A0());
                                                        }
                                                        this.v = D5(this.v, "un2", X12);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionSetMessagesTTL) {
                                                        TLRPC.TL_messageActionSetMessagesTTL tL_messageActionSetMessagesTTL = (TLRPC.TL_messageActionSetMessagesTTL) messageAction6;
                                                        TLRPC.Peer peer20 = message12.peer_id;
                                                        if (peer20 != null) {
                                                            long j13 = peer20.channel_id;
                                                            if (j13 != 0) {
                                                                chat2 = w0(abstractMap2, zh6Var2, j13);
                                                                if (chat2 != null || chat2.megagroup) {
                                                                    j = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                                    if (j == 0) {
                                                                        this.s2 = true;
                                                                        if (j == yac.h(i2).n) {
                                                                            this.v = hl.S2(ob6.Z(2131753852, ob6.c0(tL_messageActionSetMessagesTTL.period)));
                                                                        } else {
                                                                            TLObject tLObject4 = zh6Var != null ? (TLObject) zh6Var.f(tL_messageActionSetMessagesTTL.auto_setting_from) : null;
                                                                            if (tLObject4 == null && abstractMap != null) {
                                                                                tLObject4 = (TLObject) abstractMap.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                            }
                                                                            if (tLObject4 == null && abstractMap2 != null) {
                                                                                tLObject4 = (TLObject) abstractMap2.get(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                            }
                                                                            if (tLObject4 == null) {
                                                                                tLObject4 = tL_messageActionSetMessagesTTL.auto_setting_from > 0 ? uc7.s1(i2).X1(Long.valueOf(tL_messageActionSetMessagesTTL.auto_setting_from)) : uc7.s1(i2).M0(Long.valueOf(-tL_messageActionSetMessagesTTL.auto_setting_from));
                                                                            }
                                                                            if (tLObject4 != null) {
                                                                                tLObject3 = tLObject4;
                                                                            }
                                                                            this.v = D5(hl.S2(ob6.Z(2131753853, ob6.c0(tL_messageActionSetMessagesTTL.period))), "un1", tLObject3);
                                                                        }
                                                                    } else if (tL_messageActionSetMessagesTTL.period != 0) {
                                                                        boolean N3 = N3();
                                                                        int i18 = tL_messageActionSetMessagesTTL.period;
                                                                        if (N3) {
                                                                            this.v = ob6.Z(2131754530, ob6.c0(i18));
                                                                        } else {
                                                                            this.v = D5(ob6.Z(2131754534, ob6.c0(i18)), "un1", tLObject3);
                                                                        }
                                                                    } else if (N3()) {
                                                                        this.v = ob6.L0(2131754529);
                                                                    } else {
                                                                        this.v = D5(ob6.L0(2131754531), "un1", tLObject3);
                                                                    }
                                                                } else {
                                                                    int i19 = tL_messageActionSetMessagesTTL.period;
                                                                    if (i19 != 0) {
                                                                        this.v = ob6.Z(2131754533, ob6.c0(i19));
                                                                    } else {
                                                                        this.v = ob6.L0(2131754532);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        chat2 = null;
                                                        if (chat2 != null) {
                                                        }
                                                        j = tL_messageActionSetMessagesTTL.auto_setting_from;
                                                        if (j == 0) {
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                                        long j14 = message12.date * 1000;
                                                        String valueOf3 = (ob6.D0().o0() == null || ob6.D0().B0() == null) ? String.valueOf(this.k.date) : ob6.Z(2131742414, ob6.D0().B0().format(j14), ob6.D0().o0().format(j14));
                                                        TLRPC.User f = yac.h(i2).f();
                                                        if (f == null) {
                                                            f = d2(abstractMap, zh6Var, this.k.peer_id.user_id);
                                                        }
                                                        String j15 = f != null ? lbc.j(f) : str3;
                                                        TLRPC.MessageAction messageAction7 = this.k.action;
                                                        this.v = ob6.Z(2131747654, j15, valueOf3, messageAction7.title, messageAction7.address);
                                                    } else if ((messageAction6 instanceof TLRPC.TL_messageActionUserJoined) || (messageAction6 instanceof TLRPC.TL_messageActionContactSignUp)) {
                                                        str = str3;
                                                        this.v = ob6.Z(2131747774, lbc.r(user));
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                                        this.v = ob6.Z(2131747773, lbc.r(user));
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageEncryptedAction) {
                                                        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction6.encryptedAction;
                                                        if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) {
                                                            if (N3()) {
                                                                this.v = ob6.L0(2131754527);
                                                            } else {
                                                                this.v = D5(ob6.L0(2131754528), "un1", tLObject3);
                                                            }
                                                        } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                                                            TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = (TLRPC.TL_decryptedMessageActionSetMessageTTL) decryptedMessageAction;
                                                            if (tL_decryptedMessageActionSetMessageTTL.ttl_seconds != 0) {
                                                                if (N3()) {
                                                                    this.v = ob6.Z(2131748339, ob6.c0(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                                } else {
                                                                    this.v = ob6.Z(2131748340, lbc.j(user), ob6.c0(tL_decryptedMessageActionSetMessageTTL.ttl_seconds));
                                                                }
                                                            } else if (N3()) {
                                                                this.v = ob6.L0(2131748337);
                                                            } else {
                                                                this.v = ob6.Z(2131748338, lbc.j(user));
                                                            }
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                                        if (N3()) {
                                                            this.v = ob6.L0(2131754527);
                                                        } else {
                                                            this.v = D5(ob6.L0(2131754528), "un1", tLObject3);
                                                        }
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionCreatedBroadcastList) {
                                                        this.v = ob6.L0(2131742469);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelCreate) {
                                                        TLRPC.Peer peer21 = message12.peer_id;
                                                        if (peer21 != null) {
                                                            long j16 = peer21.channel_id;
                                                            if (j16 != 0) {
                                                                chat = w0(abstractMap2, zh6Var2, j16);
                                                                if (xc2.T(chat) || !chat.megagroup) {
                                                                    this.v = ob6.L0(2131754650);
                                                                } else {
                                                                    this.v = ob6.L0(2131754648);
                                                                }
                                                            }
                                                        }
                                                        chat = null;
                                                        if (xc2.T(chat)) {
                                                        }
                                                        this.v = ob6.L0(2131754650);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                                        this.v = ob6.L0(2131754596);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                                        this.v = ob6.L0(2131754596);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionPinMessage) {
                                                        q0(user == null ? w0(abstractMap2, zh6Var2, message12.peer_id.channel_id) : null, user);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionHistoryClear) {
                                                        this.v = ob6.L0(2131749048);
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicCreate) {
                                                        this.v = ob6.L0(2131743678);
                                                        TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = (TLRPC.TL_messageActionTopicCreate) this.k.action;
                                                        TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                                                        tL_forumTopic.icon_emoji_id = tL_messageActionTopicCreate.icon_emoji_id;
                                                        tL_forumTopic.title = tL_messageActionTopicCreate.title;
                                                        tL_forumTopic.icon_color = tL_messageActionTopicCreate.icon_color;
                                                        this.w = hl.G2(ob6.L0(2131743656), ro4.k(tL_forumTopic, null, null), "%s");
                                                    } else if (messageAction6 instanceof TLRPC.TL_messageActionTopicEdit) {
                                                        TLRPC.TL_messageActionTopicEdit tL_messageActionTopicEdit = (TLRPC.TL_messageActionTopicEdit) messageAction6;
                                                        if (user != null) {
                                                            str4 = lv2.n(user.first_name, user.last_name);
                                                        } else if (chat10 != null) {
                                                            str4 = chat10.title;
                                                            user = chat10;
                                                        } else {
                                                            str4 = null;
                                                            user = null;
                                                        }
                                                        String trim = str4 != null ? str4.trim() : "DELETED";
                                                        TLRPC.MessageAction messageAction8 = this.k.action;
                                                        int i20 = messageAction8.flags;
                                                        if ((i20 & 8) > 0) {
                                                            if (((TLRPC.TL_messageActionTopicEdit) messageAction8).hidden) {
                                                                this.v = D5(ob6.L0(2131743674), "%s", user);
                                                                this.w = ob6.L0(2131743675);
                                                            } else {
                                                                this.v = D5(ob6.L0(2131743660), "%s", user);
                                                                this.w = ob6.L0(2131743661);
                                                            }
                                                        } else if ((i20 & 4) > 0) {
                                                            if (((TLRPC.TL_messageActionTopicEdit) messageAction8).closed) {
                                                                this.v = D5(ob6.L0(2131743681), "%s", user);
                                                                this.w = ob6.L0(2131743682);
                                                            } else {
                                                                this.v = D5(ob6.L0(2131743662), "%s", user);
                                                                this.w = ob6.L0(2131743663);
                                                            }
                                                        } else if ((i20 & 2) != 0) {
                                                            int i21 = i20 & 1;
                                                            Drawable[] drawableArr = this.i2;
                                                            if (i21 != 0) {
                                                                TLRPC.TL_forumTopic tL_forumTopic2 = new TLRPC.TL_forumTopic();
                                                                tL_forumTopic2.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                tL_forumTopic2.title = tL_messageActionTopicEdit.title;
                                                                tL_forumTopic2.icon_color = oo4.k[0];
                                                                CharSequence k = ro4.k(tL_forumTopic2, null, drawableArr);
                                                                this.v = hl.G2(hl.G2(ob6.L0(2131743684), trim, "%1$s"), k, "%2$s");
                                                                this.w = ob6.L0(2131743666);
                                                                this.x = hl.G2(ob6.L0(2131743683), k, "%s");
                                                            } else {
                                                                TLRPC.TL_forumTopic tL_forumTopic3 = new TLRPC.TL_forumTopic();
                                                                tL_forumTopic3.icon_emoji_id = tL_messageActionTopicEdit.icon_emoji_id;
                                                                str = str3;
                                                                tL_forumTopic3.title = str;
                                                                tL_forumTopic3.icon_color = oo4.k[0];
                                                                CharSequence k2 = ro4.k(tL_forumTopic3, null, drawableArr);
                                                                this.v = hl.G2(hl.G2(ob6.L0(2131743672), trim, "%1$s"), k2, "%2$s");
                                                                this.w = ob6.L0(2131743673);
                                                                this.x = hl.G2(ob6.L0(2131743671), k2, "%s");
                                                            }
                                                        } else {
                                                            str = str3;
                                                            if ((i20 & 1) != 0) {
                                                                this.v = hl.G2(hl.G2(ob6.L0(2131743665), trim, "%1$s"), tL_messageActionTopicEdit.title, "%2$s");
                                                                this.w = ob6.L0(2131743666);
                                                                this.x = hl.G2(ob6.L0(2131743664), tL_messageActionTopicEdit.title, "%s");
                                                            }
                                                        }
                                                    } else {
                                                        str = str3;
                                                        if (messageAction6 instanceof TLRPC.TL_messageActionGameScore) {
                                                            m0(user);
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionConferenceCall) {
                                                            TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction6;
                                                            if (O3()) {
                                                                this.v = ob6.L0(2131751791);
                                                            } else if (tL_messageActionConferenceCall.missed) {
                                                                this.v = ob6.L0(2131751795);
                                                            } else {
                                                                this.v = ob6.L0(2131751796);
                                                            }
                                                            int i22 = tL_messageActionConferenceCall.duration;
                                                            if (i22 > 0) {
                                                                String o = ob6.o(i22);
                                                                String Z = ob6.Z(2131752588, this.v, o);
                                                                this.v = Z;
                                                                String str15 = Z.toString();
                                                                int indexOf4 = str15.indexOf(o);
                                                                if (indexOf4 != -1) {
                                                                    SpannableString spannableString4 = new SpannableString(this.v);
                                                                    int length = o.length() + indexOf4;
                                                                    if (indexOf4 > 0 && str15.charAt(indexOf4 - 1) == '(') {
                                                                        indexOf4--;
                                                                    }
                                                                    if (length < str15.length() && str15.charAt(length) == ')') {
                                                                        length++;
                                                                    }
                                                                    spannableString4.setSpan(new y7c(Typeface.DEFAULT), indexOf4, length, 0);
                                                                    this.v = spannableString4;
                                                                }
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPhoneCall) {
                                                            TLRPC.TL_messageActionPhoneCall tL_messageActionPhoneCall = (TLRPC.TL_messageActionPhoneCall) messageAction6;
                                                            boolean z18 = tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonMissed;
                                                            if (p3() && this.k.from_id.user_id == yac.h(i2).e()) {
                                                                boolean z19 = tL_messageActionPhoneCall.video;
                                                                if (z18) {
                                                                    if (z19) {
                                                                        this.v = ob6.L0(2131752589);
                                                                    } else {
                                                                        this.v = ob6.L0(2131752596);
                                                                    }
                                                                } else if (z19) {
                                                                    this.v = ob6.L0(2131752590);
                                                                } else {
                                                                    this.v = ob6.L0(2131752597);
                                                                }
                                                            } else if (!z18) {
                                                                boolean z20 = tL_messageActionPhoneCall.reason instanceof TLRPC.TL_phoneCallDiscardReasonBusy;
                                                                boolean z21 = tL_messageActionPhoneCall.video;
                                                                if (z20) {
                                                                    if (z21) {
                                                                        this.v = ob6.L0(2131752592);
                                                                    } else {
                                                                        this.v = ob6.L0(2131752599);
                                                                    }
                                                                } else if (z21) {
                                                                    this.v = ob6.L0(2131752594);
                                                                } else {
                                                                    this.v = ob6.L0(2131752601);
                                                                }
                                                            } else if (tL_messageActionPhoneCall.video) {
                                                                this.v = ob6.L0(2131752591);
                                                            } else {
                                                                this.v = ob6.L0(2131752598);
                                                            }
                                                            int i23 = tL_messageActionPhoneCall.duration;
                                                            if (i23 > 0) {
                                                                String o2 = ob6.o(i23);
                                                                String Z2 = ob6.Z(2131752588, this.v, o2);
                                                                this.v = Z2;
                                                                String str16 = Z2.toString();
                                                                int indexOf5 = str16.indexOf(o2);
                                                                if (indexOf5 != -1) {
                                                                    SpannableString spannableString5 = new SpannableString(this.v);
                                                                    int length2 = o2.length() + indexOf5;
                                                                    if (indexOf5 > 0 && str16.charAt(indexOf5 - 1) == '(') {
                                                                        indexOf5--;
                                                                    }
                                                                    if (length2 < str16.length() && str16.charAt(length2) == ')') {
                                                                        length2++;
                                                                    }
                                                                    spannableString5.setSpan(new y7c(Typeface.DEFAULT), indexOf5, length2, 0);
                                                                    this.v = spannableString5;
                                                                }
                                                            }
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSent) {
                                                            p0(d2(abstractMap, zh6Var, A0()), false);
                                                        } else if (messageAction6 instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                                            p0(d2(abstractMap, zh6Var, A0()), true);
                                                        } else {
                                                            boolean z22 = messageAction6 instanceof TLRPC.TL_messageActionBotAllowed;
                                                            if (z22) {
                                                                TLRPC.TL_messageActionBotAllowed tL_messageActionBotAllowed = (TLRPC.TL_messageActionBotAllowed) messageAction6;
                                                                String str17 = tL_messageActionBotAllowed.domain;
                                                                TLRPC.BotApp botApp = tL_messageActionBotAllowed.app;
                                                                if (tL_messageActionBotAllowed.from_request) {
                                                                    this.v = ob6.L0(2131754679);
                                                                } else if (botApp != null) {
                                                                    String str18 = botApp.title;
                                                                    if (str18 == null) {
                                                                        str18 = str;
                                                                    }
                                                                    String L05 = ob6.L0(2131754680);
                                                                    int indexOf6 = L05.indexOf("%1$s");
                                                                    SpannableString spannableString6 = new SpannableString(String.format(L05, str18));
                                                                    TLRPC.User d221 = d2(abstractMap, zh6Var, A0());
                                                                    if (indexOf6 >= 0 && d221 != null && (p2 = lbc.p(d221)) != null) {
                                                                        StringBuilder sb4 = new StringBuilder("https://");
                                                                        qu6.u(sb4, uc7.s1(i2).N2, "/", p2, "/");
                                                                        sb4.append(botApp.short_name);
                                                                        spannableString6.setSpan(new g8c(sb4.toString()), indexOf6, str18.length() + indexOf6, 33);
                                                                    }
                                                                    this.v = spannableString6;
                                                                } else {
                                                                    if (str17 == null) {
                                                                        str17 = str;
                                                                    }
                                                                    String L06 = ob6.L0(2131754681);
                                                                    int indexOf7 = L06.indexOf("%1$s");
                                                                    SpannableString spannableString7 = new SpannableString(String.format(L06, str17));
                                                                    if (indexOf7 >= 0 && !TextUtils.isEmpty(str17)) {
                                                                        spannableString7.setSpan(new g8c("http://".concat(str17)), indexOf7, str17.length() + indexOf7, 33);
                                                                    }
                                                                    this.v = spannableString7;
                                                                }
                                                            } else if ((messageAction6 instanceof TLRPC.TL_messageActionAttachMenuBotAllowed) || (z22 && ((TLRPC.TL_messageActionBotAllowed) messageAction6).attach_menu)) {
                                                                this.v = ob6.L0(2131754682);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionSecureValuesSent) {
                                                                TLRPC.TL_messageActionSecureValuesSent tL_messageActionSecureValuesSent = (TLRPC.TL_messageActionSecureValuesSent) messageAction6;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                int size3 = tL_messageActionSecureValuesSent.types.size();
                                                                for (int i24 = 0; i24 < size3; i24++) {
                                                                    TLRPC.SecureValueType secureValueType = tL_messageActionSecureValuesSent.types.get(i24);
                                                                    if (sb5.length() > 0) {
                                                                        sb5.append(", ");
                                                                    }
                                                                    if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                                                                        sb5.append(ob6.L0(2131754669));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                                                                        sb5.append(ob6.L0(2131754675));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeAddress) {
                                                                        sb5.append(ob6.L0(2131754678));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                                                                        sb5.append(ob6.L0(2131754674));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassport) {
                                                                        sb5.append(ob6.L0(2131754671));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                                                                        sb5.append(ob6.L0(2131754676));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                                                                        sb5.append(ob6.L0(2131754673));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                                                                        sb5.append(ob6.L0(2131754666));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeBankStatement) {
                                                                        sb5.append(ob6.L0(2131754677));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                                                                        sb5.append(ob6.L0(2131754668));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                                                                        sb5.append(ob6.L0(2131754672));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                                                                        sb5.append(ob6.L0(2131754670));
                                                                    } else if (secureValueType instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                                                                        sb5.append(ob6.L0(2131754667));
                                                                    }
                                                                }
                                                                TLRPC.Peer peer22 = this.k.peer_id;
                                                                this.v = ob6.Z(2131754665, lbc.j(peer22 != null ? d2(abstractMap, zh6Var, peer22.user_id) : null), sb5.toString());
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionWebViewDataSent) {
                                                                this.v = ob6.Z(2131754662, ((TLRPC.TL_messageActionWebViewDataSent) messageAction6).text);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                                                TLRPC.ChatTheme chatTheme = ((TLRPC.TL_messageActionSetChatTheme) messageAction6).theme;
                                                                CharSequence f2 = atb.f(chatTheme);
                                                                if (f2 != null && (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift)) {
                                                                    CharSequence spannableStringBuilder6 = new SpannableStringBuilder(f2);
                                                                    atb.e(((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift);
                                                                    f2 = spannableStringBuilder6;
                                                                }
                                                                String j17 = lbc.j(user);
                                                                boolean z23 = user == null && chat10 != null;
                                                                if (z23) {
                                                                    j17 = chat10.title;
                                                                }
                                                                boolean D = lbc.D(user);
                                                                if (TextUtils.isEmpty(f2)) {
                                                                    this.v = D ? ob6.U(2131752166, new Object[0]) : ob6.U(z23 ? 2131752252 : 2131752167, j17, f2);
                                                                } else {
                                                                    this.v = D ? ob6.U(2131752169, f2) : ob6.U(z23 ? 2131752253 : 2131752170, j17, f2);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                                                if (lbc.D(user)) {
                                                                    this.v = xc2.U(i2, this.k.peer_id.channel_id) ? ob6.L0(2131745900) : ob6.L0(2131745896);
                                                                } else {
                                                                    this.v = D5(ob6.L0(2131743426), "un1", tLObject3);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesPrice) {
                                                                TLRPC.TL_messageActionPaidMessagesPrice tL_messageActionPaidMessagesPrice = (TLRPC.TL_messageActionPaidMessagesPrice) messageAction6;
                                                                if (!xc2.T(chat10) || chat10 == null || !chat10.broadcast) {
                                                                    boolean O3 = O3();
                                                                    long j18 = tL_messageActionPaidMessagesPrice.stars;
                                                                    if (O3) {
                                                                        this.v = ob6.I((int) j18, "PaidMessagesPriceUpdatedOut");
                                                                    } else {
                                                                        this.v = D5(ob6.I((int) j18, "PaidMessagesPriceUpdated"), "un1", tLObject3);
                                                                    }
                                                                } else if ((tL_messageActionPaidMessagesPrice.flags & 1) != 0) {
                                                                    long j19 = tL_messageActionPaidMessagesPrice.stars;
                                                                    if (j19 > 0) {
                                                                        this.v = D5(ob6.I((int) j19, "PostSuggestionsPriceUpdated"), "un1", tLObject3);
                                                                    } else {
                                                                        this.v = D5(ob6.L0(2131746817), "un1", tLObject3);
                                                                    }
                                                                } else {
                                                                    this.v = D5(ob6.L0(2131746818), "un1", tLObject3);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionNoPaidMessagesTokenUsed) {
                                                                if (O3()) {
                                                                    TLRPC.Message message13 = this.k;
                                                                    TLRPC.Peer peer23 = message13.saved_peer_id;
                                                                    this.v = D5(ob6.L0(2131747913), "un1", peer23 != null ? d2(abstractMap, zh6Var, wf3.n(peer23)) : d2(abstractMap, zh6Var, wf3.n(message13.peer_id)));
                                                                } else {
                                                                    this.v = D5(ob6.L0(2131747914), "un1", tLObject3);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPaidMessagesRefunded) {
                                                                TLRPC.TL_messageActionPaidMessagesRefunded tL_messageActionPaidMessagesRefunded = (TLRPC.TL_messageActionPaidMessagesRefunded) messageAction6;
                                                                if (O3()) {
                                                                    TLRPC.Message message14 = this.k;
                                                                    TLRPC.Peer peer24 = message14.saved_peer_id;
                                                                    this.v = D5(ob6.I((int) tL_messageActionPaidMessagesRefunded.stars, "PaidMessagesRefundedOut"), "un1", peer24 != null ? d2(abstractMap, zh6Var, wf3.n(peer24)) : d2(abstractMap, zh6Var, wf3.n(message14.peer_id)));
                                                                } else {
                                                                    this.v = D5(ob6.I((int) tL_messageActionPaidMessagesRefunded.stars, "PaidMessagesRefunded"), "un1", tLObject3);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                                                TLRPC.TL_messageActionTodoCompletions tL_messageActionTodoCompletions = (TLRPC.TL_messageActionTodoCompletions) messageAction6;
                                                                boolean isEmpty2 = tL_messageActionTodoCompletions.completed.isEmpty();
                                                                int intValue = !tL_messageActionTodoCompletions.completed.isEmpty() ? tL_messageActionTodoCompletions.completed.get(0).intValue() : !tL_messageActionTodoCompletions.incompleted.isEmpty() ? tL_messageActionTodoCompletions.incompleted.get(0).intValue() : 0;
                                                                r47 r47Var = this.C;
                                                                if (r47Var != null && (n1(r47Var.k) instanceof TLRPC.TL_messageMediaToDo)) {
                                                                    TLRPC.TL_messageMediaToDo tL_messageMediaToDo2 = (TLRPC.TL_messageMediaToDo) n1(this.C.k);
                                                                    for (int i25 = 0; i25 < tL_messageMediaToDo2.todo.list.size(); i25++) {
                                                                        todoItem = tL_messageMediaToDo2.todo.list.get(i25);
                                                                        if (todoItem.id == intValue) {
                                                                            break;
                                                                        }
                                                                    }
                                                                }
                                                                todoItem = null;
                                                                if (todoItem != null) {
                                                                    aob.O();
                                                                    Spannable g0 = g0(todoItem);
                                                                    if (O3()) {
                                                                        this.v = ob6.U(!isEmpty2 ? 2131743715 : 2131743711, g0);
                                                                    } else {
                                                                        this.v = D5(ob6.U(!isEmpty2 ? 2131743716 : 2131743712, g0), "un1", tLObject3);
                                                                    }
                                                                } else if (O3()) {
                                                                    this.v = ob6.L0(!isEmpty2 ? 2131743714 : 2131743710);
                                                                } else {
                                                                    this.v = D5(ob6.L0(!isEmpty2 ? 2131743713 : 2131743709), "un1", tLObject3);
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                                                TLRPC.TL_messageActionTodoAppendTasks tL_messageActionTodoAppendTasks = (TLRPC.TL_messageActionTodoAppendTasks) messageAction6;
                                                                boolean O32 = O3();
                                                                ArrayList<TLRPC.TodoItem> arrayList7 = tL_messageActionTodoAppendTasks.list;
                                                                if (O32) {
                                                                    int size4 = arrayList7.size();
                                                                    ArrayList<TLRPC.TodoItem> arrayList8 = tL_messageActionTodoAppendTasks.list;
                                                                    if (size4 == 1) {
                                                                        this.v = ob6.U(2131743751, g0(arrayList8.get(0)));
                                                                    } else {
                                                                        int size5 = arrayList8.size();
                                                                        ArrayList<TLRPC.TodoItem> arrayList9 = tL_messageActionTodoAppendTasks.list;
                                                                        if (size5 == 2) {
                                                                            this.v = ob6.U(2131743747, g0(arrayList9.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)));
                                                                        } else {
                                                                            int size6 = arrayList9.size();
                                                                            ArrayList<TLRPC.TodoItem> arrayList10 = tL_messageActionTodoAppendTasks.list;
                                                                            if (size6 == 3) {
                                                                                this.v = ob6.U(2131743749, g0(arrayList10.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2)));
                                                                            } else if (arrayList10.size() >= 4) {
                                                                                this.v = ob6.F("TodoAddedMoreTasksOut", tL_messageActionTodoAppendTasks.list.size() - 3, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2)));
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    int size7 = arrayList7.size();
                                                                    ArrayList<TLRPC.TodoItem> arrayList11 = tL_messageActionTodoAppendTasks.list;
                                                                    if (size7 == 1) {
                                                                        this.v = D5(ob6.U(2131743752, g0(arrayList11.get(0))), "un1", tLObject3);
                                                                    } else {
                                                                        int size8 = arrayList11.size();
                                                                        ArrayList<TLRPC.TodoItem> arrayList12 = tL_messageActionTodoAppendTasks.list;
                                                                        if (size8 == 2) {
                                                                            this.v = D5(ob6.U(2131743748, g0(arrayList12.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1))), "un1", tLObject3);
                                                                        } else {
                                                                            int size9 = arrayList12.size();
                                                                            ArrayList<TLRPC.TodoItem> arrayList13 = tL_messageActionTodoAppendTasks.list;
                                                                            if (size9 == 3) {
                                                                                this.v = D5(ob6.U(2131743750, g0(arrayList13.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject3);
                                                                            } else if (arrayList13.size() >= 4) {
                                                                                this.v = D5(ob6.F("TodoAddedMoreTasks", tL_messageActionTodoAppendTasks.list.size() - 3, g0(tL_messageActionTodoAppendTasks.list.get(0)), g0(tL_messageActionTodoAppendTasks.list.get(1)), g0(tL_messageActionTodoAppendTasks.list.get(2))), "un1", tLObject3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                                                String i26 = ro4.i(i2, wf3.n(message12.peer_id));
                                                                if (i26 == null) {
                                                                    TLRPC.Chat w07 = w0(abstractMap2, zh6Var2, -wf3.n(this.k.peer_id));
                                                                    if (w07 != null) {
                                                                        long j20 = w07.linked_monoforum_id;
                                                                        if (j20 != 0 && (w02 = w0(abstractMap2, zh6Var2, j20)) != null) {
                                                                            w07 = w02;
                                                                        }
                                                                    }
                                                                    i26 = wf3.G(null, null, w07);
                                                                }
                                                                this.v = s0(i26, wf3.l(d2(abstractMap, zh6Var, wf3.n(this.k.saved_peer_id))));
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftOnchainOffer) {
                                                                TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) messageAction6;
                                                                this.v = vs7.o(message12) ? vs7.q(tL_messageActionStarGiftOnchainOffer) : vs7.t(tL_messageActionStarGiftOnchainOffer);
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOffer) {
                                                                TLRPC.TL_messageActionStarGiftPurchaseOffer tL_messageActionStarGiftPurchaseOffer = (TLRPC.TL_messageActionStarGiftPurchaseOffer) messageAction6;
                                                                oj n9 = oj.n(tL_messageActionStarGiftPurchaseOffer.price);
                                                                StringBuilder sb6 = new StringBuilder();
                                                                sb6.append(tL_messageActionStarGiftPurchaseOffer.gift.title);
                                                                sb6.append(" #");
                                                                String m = qu6.m(tL_messageActionStarGiftPurchaseOffer.gift.num, ',', sb6);
                                                                String t = wf3.t(d2(abstractMap, zh6Var, wf3.n(this.k.peer_id)));
                                                                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder();
                                                                spannableStringBuilder7.append((CharSequence) hl.S2(ob6.Z(n9.a == pj.a ? N3() ? 2131749666 : 2131749669 : N3() ? 2131749660 : 2131749663, t, n9.d(), m)));
                                                                this.v = spannableStringBuilder7;
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionChangeCommunity) {
                                                                TLRPC.TL_messageActionChangeCommunity tL_messageActionChangeCommunity = (TLRPC.TL_messageActionChangeCommunity) messageAction6;
                                                                long n10 = wf3.n(message12.peer_id);
                                                                long n11 = wf3.n(this.k.from_id);
                                                                boolean z24 = n10 < 0 && xc2.V(w0(abstractMap2, zh6Var2, -n10));
                                                                boolean z25 = n10 > 0;
                                                                String t2 = wf3.t(w0(abstractMap2, zh6Var2, tL_messageActionChangeCommunity.community_id));
                                                                String t4 = n11 > 0 ? wf3.t(d2(abstractMap, zh6Var, n11)) : wf3.t(w0(abstractMap2, zh6Var2, -n11));
                                                                SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder();
                                                                spannableStringBuilder8.append((CharSequence) gp2.a(this, t2, t4, z24, z25));
                                                                this.v = spannableStringBuilder8;
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) {
                                                                TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined tL_messageActionStarGiftPurchaseOfferDeclined = (TLRPC.TL_messageActionStarGiftPurchaseOfferDeclined) messageAction6;
                                                                oj n12 = oj.n(tL_messageActionStarGiftPurchaseOfferDeclined.price);
                                                                StringBuilder sb7 = new StringBuilder();
                                                                sb7.append(tL_messageActionStarGiftPurchaseOfferDeclined.gift.title);
                                                                sb7.append(" #");
                                                                String m2 = qu6.m(tL_messageActionStarGiftPurchaseOfferDeclined.gift.num, ',', sb7);
                                                                String t5 = wf3.t(d2(abstractMap, zh6Var, wf3.n(this.k.peer_id)));
                                                                String d = n12.d();
                                                                boolean z26 = tL_messageActionStarGiftPurchaseOfferDeclined.expired;
                                                                pj pjVar2 = n12.a;
                                                                pj pjVar3 = pj.a;
                                                                this.v = hl.S2(ob6.Z(z26 ? pjVar2 == pjVar3 ? N3() ? 2131749667 : 2131749668 : N3() ? 2131749661 : 2131749662 : pjVar2 == pjVar3 ? N3() ? 2131749664 : 2131749665 : N3() ? 2131749658 : 2131749659, t5, d, m2));
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPollAppendAnswer) {
                                                                TLRPC.TL_messageActionPollAppendAnswer tL_messageActionPollAppendAnswer = (TLRPC.TL_messageActionPollAppendAnswer) messageAction6;
                                                                if (N3()) {
                                                                    this.v = ob6.U(2131746906, h0(tL_messageActionPollAppendAnswer.answer.text, O3()));
                                                                } else {
                                                                    this.v = ob6.U(2131746907, wf3.t(d2(abstractMap, zh6Var, wf3.n(this.k.from_id))), h0(tL_messageActionPollAppendAnswer.answer.text, O3()));
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionPollDeleteAnswer) {
                                                                TLRPC.TL_messageActionPollDeleteAnswer tL_messageActionPollDeleteAnswer = (TLRPC.TL_messageActionPollDeleteAnswer) messageAction6;
                                                                if (N3()) {
                                                                    this.v = ob6.U(2131746889, h0(tL_messageActionPollDeleteAnswer.answer.text, O3()));
                                                                } else {
                                                                    this.v = ob6.U(2131746890, wf3.t(d2(abstractMap, zh6Var, wf3.n(this.k.from_id))), h0(tL_messageActionPollDeleteAnswer.answer.text, O3()));
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsToggle) {
                                                                TLRPC.TL_messageActionNoForwardsToggle tL_messageActionNoForwardsToggle = (TLRPC.TL_messageActionNoForwardsToggle) messageAction6;
                                                                boolean z27 = tL_messageActionNoForwardsToggle.new_value;
                                                                if (z27 == tL_messageActionNoForwardsToggle.prev_value) {
                                                                    this.v = ob6.L0(z27 ? 2131751391 : 2131751390);
                                                                } else if (N3()) {
                                                                    this.v = ob6.L0(tL_messageActionNoForwardsToggle.new_value ? 2131751389 : 2131751113);
                                                                } else {
                                                                    this.v = ob6.Z(tL_messageActionNoForwardsToggle.new_value ? 2131751392 : 2131751114, wf3.t(d2(abstractMap, zh6Var, wf3.n(this.k.peer_id))));
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionNoForwardsRequest) {
                                                                String t6 = wf3.t(d2(abstractMap, zh6Var, wf3.n(message12.peer_id)));
                                                                if (((TLRPC.TL_messageActionNoForwardsRequest) messageAction6).new_value) {
                                                                    this.v = N3() ? ob6.L0(2131745109) : hl.S2(ob6.Z(2131745110, t6));
                                                                } else {
                                                                    this.v = N3() ? ob6.L0(2131745098) : hl.S2(ob6.Z(2131745099, t6));
                                                                }
                                                            } else if (messageAction6 instanceof TLRPC.TL_messageActionGramTransfer) {
                                                                TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) messageAction6;
                                                                TLRPC.User d222 = d2(abstractMap, zh6Var, wf3.n(message12.peer_id));
                                                                if (N3()) {
                                                                    this.v = D5(hl.S2(ob6.Z(2131742860, c.v(tL_messageActionGramTransfer.amount))), "un1", d222);
                                                                } else if (!lbc.C(wf3.n(this.k.peer_id)) || TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
                                                                    boolean C = lbc.C(wf3.n(this.k.peer_id));
                                                                    long j21 = tL_messageActionGramTransfer.amount;
                                                                    if (C) {
                                                                        this.v = hl.S2(ob6.Z(2131742861, c.v(j21)));
                                                                    } else {
                                                                        this.v = D5(hl.S2(ob6.Z(2131742863, c.v(j21))), "un1", tLObject3);
                                                                    }
                                                                } else {
                                                                    this.v = hl.S2(ob6.Z(2131742862, c.v(tL_messageActionGramTransfer.amount), s43.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault())));
                                                                }
                                                                if (N3()) {
                                                                    this.w = hl.S2(ob6.Z(2131742859, c.v(tL_messageActionGramTransfer.amount)));
                                                                } else if (!lbc.C(wf3.n(this.k.peer_id)) || TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
                                                                    boolean C2 = lbc.C(wf3.n(this.k.peer_id));
                                                                    long j22 = tL_messageActionGramTransfer.amount;
                                                                    if (C2) {
                                                                        this.w = hl.S2(ob6.Z(2131742861, c.v(j22)));
                                                                    } else {
                                                                        this.w = hl.S2(ob6.Z(2131742863, c.v(j22)).replace("un1", str).trim());
                                                                    }
                                                                } else {
                                                                    this.w = hl.S2(ob6.Z(2131742862, c.v(tL_messageActionGramTransfer.amount), s43.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault())));
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else if (messageAction6.ttl != 0) {
                                                    if (N3()) {
                                                        this.v = ob6.Z(2131748339, ob6.c0(this.k.action.ttl));
                                                    } else {
                                                        this.v = ob6.Z(2131748340, lbc.j(user), ob6.c0(this.k.action.ttl));
                                                    }
                                                } else if (N3()) {
                                                    this.v = ob6.L0(2131748337);
                                                } else {
                                                    this.v = ob6.Z(2131748338, lbc.j(user));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str = str3;
                        }
                    }
                    str = "";
                }
                if (this.v == null) {
                    this.v = str;
                }
                this.T2 = null;
                this.k3 = null;
                this.l3 = null;
            }
            user = null;
        }
        w0 = null;
        if (user == null) {
        }
        this.s2 = false;
        this.h1 = false;
        TLRPC.Message message15 = this.k;
        z = message15 instanceof TLRPC.TL_messageService;
        int i27 = this.K1;
        if (z) {
        }
        if (this.v == null) {
        }
        this.T2 = null;
        this.k3 = null;
        this.l3 = null;
    }

    public final TLObject b1() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return null;
        }
        TLRPC.Peer peer = message.from_id;
        boolean z = peer instanceof TLRPC.TL_peerChannel_layer131;
        int i = this.K1;
        if (z || (peer instanceof TLRPC.TL_peerChannel)) {
            return uc7.s1(i).M0(Long.valueOf(this.k.from_id.channel_id));
        }
        if ((peer instanceof TLRPC.TL_peerUser_layer131) || (peer instanceof TLRPC.TL_peerUser)) {
            return uc7.s1(i).X1(Long.valueOf(this.k.from_id.user_id));
        }
        if ((peer instanceof TLRPC.TL_peerChat_layer131) || (peer instanceof TLRPC.TL_peerChat)) {
            return uc7.s1(i).M0(Long.valueOf(this.k.from_id.chat_id));
        }
        return null;
    }

    public final boolean b3() {
        return c3(this.k);
    }

    public final boolean b4() {
        if (this.D != 17) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (n1 instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) n1).poll.quiz;
        }
        return false;
    }

    public final boolean b5() {
        return c5(this.k);
    }

    public final boolean c(CharSequence charSequence, boolean z, boolean z2) {
        if (charSequence == null) {
            return false;
        }
        if (!this.G0 && !(n1(this.k) instanceof TLRPC.TL_messageMediaUnsupported)) {
            return b(charSequence, O0(), O3(), true, z, z2, 0);
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
        tL_messageEntityItalic.offset = 0;
        tL_messageEntityItalic.length = charSequence.length();
        arrayList.add(tL_messageEntityItalic);
        return b(charSequence, arrayList, O3(), true, z, z2, 0);
    }

    public final long c1() {
        long j = this.d;
        return j != 0 ? j : d1();
    }

    public final boolean c4() {
        return (Y2() || q4() || !p4() || c3(this.k) || g3() || !z()) ? false : true;
    }

    public final long d1() {
        long j = this.e;
        return j != 0 ? j : this.k.grouped_id;
    }

    public final TLRPC.User d2(AbstractMap abstractMap, zh6 zh6Var, long j) {
        TLRPC.User user = abstractMap != null ? (TLRPC.User) abstractMap.get(Long.valueOf(j)) : zh6Var != null ? (TLRPC.User) zh6Var.f(j) : null;
        return user == null ? uc7.s1(this.K1).X1(Long.valueOf(j)) : user;
    }

    public final boolean d3() {
        return e3(this.k);
    }

    public final boolean d4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        r47 r47Var = this.C;
        if ((r47Var == null || !(r47Var.k instanceof TLRPC.TL_messageEmpty)) && (messageReplyHeader = (message = this.k).reply_to) != null) {
            return ((messageReplyHeader.reply_to_msg_id == 0 && messageReplyHeader.reply_to_random_id == 0) || (message.flags & 8) == 0) ? false : true;
        }
        return false;
    }

    public final boolean d5() {
        return (n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage != null && !TextUtils.isEmpty(n1(this.k).webpage.embed_url) && "YouTube".equals(n1(this.k).webpage.site_name);
    }

    public final void d6(boolean z) {
        ArrayList arrayList = this.e3;
        if (arrayList == null) {
            this.i3 = null;
            D2(z);
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((hfc) obj).d;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                ((jfc) obj2).e(z);
            }
        }
        this.g3 = kfc.a0(this.e3);
        this.h3 = kfc.b0(this.e3);
        this.i3 = kfc.O(this.e3);
    }

    public final int e1() {
        TLRPC.Message message = this.k;
        int i = message.ephemeralAnchorMsgId;
        return i != 0 ? i : message.id;
    }

    public final boolean e4() {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        r47 r47Var = this.C;
        return ((r47Var != null && (r47Var.k instanceof TLRPC.TL_messageEmpty)) || (messageReplyHeader = (message = this.k).reply_to) == null || messageReplyHeader.story_id == 0 || (message.flags & 8) == 0) ? false : true;
    }

    public final void e5() {
        if (this.n != null || this.o == null || this.t) {
            return;
        }
        this.t = true;
        wl.g(this.K1).b(this.o.longValue(), new h47(this, (byte) 0));
    }

    public final void f(int i, long j, boolean z) {
        TLRPC.Message message = this.k;
        if (message.reactions == null) {
            message.reactions = new TLRPC.TL_messageReactions();
            TLRPC.Message message2 = this.k;
            message2.reactions.reactions_as_tags = B0(message2) == yac.h(this.K1).e();
            this.k.reactions.can_see_list = o3() || p3();
        }
        g(this.K1, this.k.reactions, i, j, z);
    }

    public final boolean f4() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        return g4() && (message = this.k) != null && (messageMedia = message.media) != null && messageMedia.ttl_seconds == Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e5, code lost:
    
        if (r4.translatedRichMessage == null) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f6(boolean z) {
        r47 r47Var = this.C;
        boolean z2 = (r47Var == null || r47Var == this || !r47Var.f6(z)) ? false : true;
        a5c a5cVar = uc7.s1(this.K1).i4;
        TLRPC.Message message = this.k;
        TLRPC.TL_textWithEntities tL_textWithEntities = message != null ? message.voiceTranscriptionOpen ? message.translatedVoiceTranscription : message.translatedText : null;
        TLRPC.TL_textWithEntities tL_textWithEntities2 = (message == null || !message.summarizedOpen) ? null : message.summaryText;
        TLRPC.TL_textWithEntities tL_textWithEntities3 = (message == null || !message.summarizedOpen) ? null : message.translatedSummaryText;
        if (tL_textWithEntities3 == null || message == null || !message.summarizedOpen || !a5c.w(this) || !a5c.x(this) || !a5cVar.A(B0(this.k)) || a5cVar.y(B0(this.k)) || !TextUtils.equals(a5cVar.l(B0(this.k)), this.k.translatedSummaryLanguage)) {
            TLRPC.Message message2 = this.k;
            if (message2 == null || !message2.summarizedOpen || !a5c.w(this) || tL_textWithEntities2 == null) {
                if (this.k != null && a5c.x(this) && a5cVar.A(B0(this.k)) && !a5cVar.y(B0(this.k))) {
                    if (tL_textWithEntities == null) {
                        TLRPC.Message message3 = this.k;
                        if (message3.translatedPoll == null) {
                        }
                    }
                    if (TextUtils.equals(a5cVar.l(B0(this.k)), this.k.translatedToLanguage)) {
                        if (!this.L2 || this.M2) {
                            this.L2 = true;
                            this.M2 = false;
                            if (this.D == 36) {
                                n0(null);
                                return true;
                            }
                            if (tL_textWithEntities != null) {
                                k(tL_textWithEntities.text);
                                k0();
                            }
                            return true;
                        }
                    }
                }
                TLRPC.Message message4 = this.k;
                if (message4 != null && (z || this.L2 || this.M2)) {
                    this.L2 = false;
                    this.M2 = false;
                    if (this.D == 36) {
                        n0(null);
                        return true;
                    }
                    k(message4.message);
                    k0();
                    return true;
                }
            } else if (!this.M2 || this.L2) {
                this.M2 = true;
                this.L2 = false;
                k(tL_textWithEntities2.text);
                k0();
                return true;
            }
        } else if (!this.M2 || !this.L2) {
            this.M2 = true;
            this.L2 = true;
            k(tL_textWithEntities3.text);
            k0();
            return true;
        }
        return z2;
    }

    public final Spannable g0(TLRPC.TodoItem todoItem) {
        CharSequence h0 = h0(todoItem.title, O3());
        if (!(h0 instanceof Spannable)) {
            h0 = new SpannableStringBuilder(h0);
        }
        Spannable spannable = (Spannable) h0;
        spannable.setSpan(new f8c("task?" + todoItem.id, 0), 0, h0.length(), 33);
        return spannable;
    }

    public final int g2() {
        String str;
        Integer num = this.k3;
        if (num != null) {
            return num.intValue();
        }
        if (!K4(this.k)) {
            this.k3 = -1;
            return -1;
        }
        TLRPC.MessageMedia m1 = m1(this);
        int i = m1.video_timestamp;
        if (i != 0) {
            return i;
        }
        TLRPC.WebPage webPage = m1.webpage;
        if (webPage != null && (str = webPage.url) != null) {
            try {
                int U = LaunchActivity.U(Uri.parse(str));
                this.k3 = Integer.valueOf(U);
                return U;
            } catch (Exception unused) {
            }
        }
        this.k3 = -1;
        return -1;
    }

    public final boolean g3() {
        int i = this.D;
        return (i == 23 || i == 24) && (this.k.media.storyItem instanceof TL_stories.TL_storyItemDeleted);
    }

    public final boolean g4() {
        byte b = this.S;
        if (b == 0) {
            b = (this.D == 5 || i4(this.k)) ? (byte) 1 : (byte) 2;
            this.S = b;
        }
        return b == 1;
    }

    public final void g5() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        if (tL_messageReactions == null || tL_messageReactions.recent_reactions == null) {
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.k.reactions.recent_reactions.size(); i++) {
            if (this.k.reactions.recent_reactions.get(i).unread) {
                this.k.reactions.recent_reactions.get(i).unread = false;
                z = true;
            }
        }
        if (z) {
            int i2 = this.K1;
            jf7 Y = jf7.Y(i2);
            TLRPC.Message message = this.k;
            Y.H(new ae7(Y, message.dialog_id, b2(i2, message, false, false), this.k.id, (byte) 7));
        }
    }

    public final TLRPC.InputStickerSet h1() {
        return j1(this.k);
    }

    public final boolean h3() {
        if (e1() < 0 || q4()) {
            return false;
        }
        int i = this.D;
        return i == 0 || i == 2 || i == 1 || i == 3 || i == 8 || i == 9;
    }

    public final void h5() {
        int i;
        TLRPC.TL_messageReactions tL_messageReactions;
        CharSequence m;
        TLRPC.SuggestedPost suggestedPost;
        TLRPC.Message message;
        if (this.G0) {
            return;
        }
        this.x0 = 0;
        this.q2 = null;
        ArrayList arrayList = new ArrayList();
        boolean R5 = R5();
        this.N2 = R5;
        if (!R5 && (message = this.k) != null) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                if (tL_replyInlineMarkup.rows != null) {
                    for (int i2 = 0; i2 < tL_replyInlineMarkup.rows.size(); i2++) {
                        ArrayList<TL_keyboard.KeyboardInlineButton> arrayList2 = tL_replyInlineMarkup.rows.get(i2).buttons;
                        hq0[] hq0VarArr = new hq0[arrayList2.size()];
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            hq0VarArr[i3] = new hq0(arrayList2.get(i3));
                        }
                        arrayList.add(hq0VarArr);
                    }
                }
            }
        }
        TLRPC.Message message2 = this.k;
        boolean z = (message2 == null || (suggestedPost = message2.suggested_post) == null || suggestedPost.rejected || suggestedPost.accepted || m4() || n4()) ? false : true;
        if (z) {
            long e = yac.h(this.K1).e();
            long n = wf3.n(this.k.saved_peer_id);
            long n2 = wf3.n(this.k.from_id);
            boolean z2 = e == n;
            boolean z3 = n == n2;
            if (!z2 ? !z3 : z3) {
                z = false;
            }
        }
        byte b = 2;
        if (z) {
            i = !arrayList.isEmpty() ? 1 << (arrayList.size() - 1) : 0;
            arrayList.add(new gq0[]{new iq0(1, 2131746815, R.drawable.filled_bot_decline_24), new iq0(2, 2131746816, R.drawable.filled_bot_approve_24)});
            arrayList.add(new gq0[]{new iq0(3, 2131746814, R.drawable.filled_bot_suggest_24)});
        } else {
            i = 0;
        }
        if (!arrayList.isEmpty()) {
            this.q2 = new ed((gq0[][]) arrayList.toArray(new gq0[arrayList.size()][]), i, b);
        }
        ed edVar = this.q2;
        if ((edVar != null && !p2()) || ((tL_messageReactions = this.k.reactions) != null && !tL_messageReactions.results.isEmpty())) {
            aob.P();
            StringBuilder sb = this.F0;
            if (sb == null) {
                this.F0 = new StringBuilder();
            } else {
                sb.setLength(0);
            }
        }
        if (edVar != null) {
            gq0[][] gq0VarArr = (gq0[][]) edVar.c;
            if (p2()) {
                return;
            }
            for (int i4 = 0; i4 < gq0VarArr.length; i4++) {
                int length = gq0VarArr[i4].length;
                int i5 = 0;
                for (int i6 = 0; i6 < length; i6++) {
                    gq0 gq0Var = gq0VarArr[i4][i6];
                    StringBuilder sb2 = this.F0;
                    sb2.append(i4);
                    sb2.append(i6);
                    if ((gq0Var instanceof hq0) && ehb.c(((hq0) gq0Var).a, TL_keyboard.TL_inlineButtonTypeBuy.class) && (n1(this.k).flags & 4) != 0) {
                        m = ob6.M0(2131747109, null);
                    } else {
                        String d = gq0Var.d();
                        if (d == null) {
                            d = "";
                        }
                        m = pv3.m(d, aob.w2.getFontMetricsInt(), false, null, 0);
                    }
                    StaticLayout staticLayout = new StaticLayout(m, aob.w2, hl.L(2000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    if (staticLayout.getLineCount() > 0) {
                        float lineWidth = staticLayout.getLineWidth(0);
                        float lineLeft = staticLayout.getLineLeft(0);
                        if (lineLeft < lineWidth) {
                            lineWidth -= lineLeft;
                        }
                        if (gq0Var.c() != 0) {
                            lineWidth += hl.L(36.0f);
                        }
                        if (gq0Var.b() != 0) {
                            lineWidth += hl.L(36.0f);
                        }
                        i5 = qu6.e(4.0f, (int) Math.ceil(lineWidth), i5);
                    }
                }
                this.x0 = Math.max(this.x0, ((length - 1) * hl.L(5.0f)) + ((hl.L(12.0f) + i5) * length));
            }
        }
    }

    public final boolean i() {
        TLRPC.Peer peer;
        if (!xea.P0) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message != null && (peer = message.peer_id) != null && (peer.channel_id != 0 || peer.chat_id != 0)) {
            uc7 s1 = uc7.s1(this.K1);
            TLRPC.Peer peer2 = this.k.peer_id;
            long j = peer2.channel_id;
            if (j == 0) {
                j = peer2.chat_id;
            }
            TLRPC.Chat M0 = s1.M0(Long.valueOf(j));
            if ((M0 == null || !M0.gigagroup) && M0 != null && ((xc2.C(M0.banned_rights, 8) || xc2.C(M0.default_banned_rights, 8)) && !xc2.N(M0))) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence i2() {
        String str;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.Message message = this.k;
        if (message == null || (str = message.voiceTranscription) == null) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = (!this.L2 || (tL_textWithEntities = this.k.translatedVoiceTranscription) == null) ? this.k.voiceTranscription : tL_textWithEntities.text;
            return !TextUtils.isEmpty(str2) ? pv3.m(str2, aob.o2.getFontMetricsInt(), false, null, 0) : str2;
        }
        SpannableString spannableString = new SpannableString(ob6.M0(2131747859, null));
        spannableString.setSpan(new p37((byte) 1), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final boolean i3() {
        return this.a != 0;
    }

    public final boolean i5() {
        jfc jfcVar;
        return (!D2(true) || (jfcVar = this.g3) == null) ? this.z0 : jfcVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r9.k.send_state == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r9.k.id >= 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z;
        boolean R5;
        o0();
        T5();
        if (!(this.k.send_state != 0 ? false : !O0().isEmpty())) {
            if (this.T == 0) {
                TLRPC.Message message = this.k;
                if (!(message instanceof TLRPC.TL_message_old)) {
                    if (!(message instanceof TLRPC.TL_message_old2)) {
                        if (!(message instanceof TLRPC.TL_message_old3)) {
                            if (!(message instanceof TLRPC.TL_message_old4)) {
                                if (!(message instanceof TLRPC.TL_messageForwarded_old)) {
                                    if (!(message instanceof TLRPC.TL_messageForwarded_old2)) {
                                        if (!(message instanceof TLRPC.TL_message_secret)) {
                                            if (!(n1(message) instanceof TLRPC.TL_messageMediaInvoice)) {
                                                if (N3()) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z = true;
            if (z) {
                e(O3(), this.v, true, true, false);
            }
            if (d5()) {
                m();
            } else {
                h(O3(), this.v, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
            }
            if (!(this.v instanceof Spannable)) {
                this.v = new SpannableStringBuilder(this.v);
            }
            c(this.v, false, z);
            R5 = R5();
            this.O2 = R5;
            if (R5) {
                return;
            }
            x5(this.v);
            return;
        }
        z = false;
        if (z) {
        }
        if (d5()) {
        }
        if (!(this.v instanceof Spannable)) {
        }
        c(this.v, false, z);
        R5 = R5();
        this.O2 = R5;
        if (R5) {
        }
    }

    public final boolean j3() {
        return l3(this.k);
    }

    public final boolean j4() {
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        if (messageFwdHeader == null || (peer = messageFwdHeader.saved_from_peer) == null || peer.channel_id == 0) {
            return false;
        }
        return xc2.n0(uc7.s1(this.K1).M0(Long.valueOf(this.k.fwd_from.saved_from_peer.channel_id)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.signature_profiles != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
        if (B0(r9.k) == 489000) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j5() {
        boolean z;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.D != 27) {
            if (!this.j2 && !this.n2 && !this.l2 && this.m2 == null && this.p2 == 0) {
                if (B0(this.k) < 0) {
                    TLRPC.Chat M0 = uc7.s1(this.K1).M0(Long.valueOf(-B0(this.k)));
                    if (!c3(this.k) || !xc2.V(M0)) {
                        if (M0 != null) {
                        }
                        z = false;
                    }
                }
                if (q4() || (!p3() && !o3() && !z && this.T == 0 && ((messageFwdHeader = this.k.fwd_from) == null || messageFwdHeader.saved_from_peer == null))) {
                }
            }
            return true;
        }
        return false;
    }

    public final void k(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TLRPC.User X1 = p3() ? uc7.s1(this.K1).X1(Long.valueOf(this.k.from_id.user_id)) : null;
        this.v = charSequence;
        ArrayList O0 = O0();
        TextPaint textPaint = n1(this.k) instanceof TLRPC.TL_messageMediaGame ? aob.x2 : aob.o2;
        int[] iArr = i() ? new int[1] : null;
        CharSequence m = pv3.m(this.v, textPaint.getFontMetricsInt(), false, iArr, 0);
        this.v = m;
        Spannable A5 = A5(m, O0, textPaint.getFontMetricsInt(), false);
        this.v = A5;
        if (iArr != null && iArr[0] > 1) {
            C5(A5, iArr);
        }
        H(iArr);
        n0(X1);
        K5();
    }

    public final void k0() {
        boolean z;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        TL_stories.StoryItem storyItem;
        boolean z2;
        if (g4()) {
            return;
        }
        boolean R5 = R5();
        if (this.z != null) {
            if (this.L2) {
                TLRPC.Message message = this.k;
                if (message.translatedText != null || (this.M2 && message.translatedSummaryText != null)) {
                    z2 = true;
                    if (z2 == this.P2 && this.M2 == this.R2 && R5 == this.Q2) {
                        return;
                    }
                }
            }
            z2 = false;
            if (z2 == this.P2) {
                return;
            }
        }
        this.Q2 = R5;
        TLRPC.Message message2 = this.k;
        String str = message2.message;
        ArrayList<TLRPC.MessageEntity> arrayList = message2.entities;
        if (this.D == 23) {
            TLRPC.MessageMedia messageMedia = message2.media;
            if (messageMedia != null && (storyItem = messageMedia.storyItem) != null) {
                str = storyItem.caption;
                arrayList = storyItem.entities;
                z = true;
                TLRPC.Message message3 = this.k;
                tL_textWithEntities = message3.translatedSummaryText;
                if (tL_textWithEntities == null && this.M2 && this.L2) {
                    this.R2 = true;
                    this.P2 = true;
                    str = tL_textWithEntities.text;
                    arrayList = tL_textWithEntities.entities;
                } else {
                    tL_textWithEntities2 = message3.summaryText;
                    if (tL_textWithEntities2 == null && this.M2) {
                        this.R2 = true;
                        this.P2 = false;
                        str = tL_textWithEntities2.text;
                        arrayList = tL_textWithEntities2.entities;
                    } else {
                        tL_textWithEntities3 = message3.translatedText;
                        if (tL_textWithEntities3 == null && this.L2) {
                            this.R2 = false;
                            this.P2 = true;
                            str = tL_textWithEntities3.text;
                            arrayList = tL_textWithEntities3.entities;
                        } else {
                            this.R2 = false;
                            this.P2 = false;
                        }
                    }
                }
                if (!F3() || (n1(this.k) instanceof TLRPC.TL_messageMediaGame) || TextUtils.isEmpty(str)) {
                    return;
                }
                CharSequence m = pv3.m(str, aob.o2.getFontMetricsInt(), false, null, 0);
                this.z = m;
                this.z = A5(m, arrayList, aob.o2.getFontMetricsInt(), false);
                boolean z3 = z || (!(this.k.send_state != 0 ? false : arrayList.isEmpty() ^ true) && (this.T != 0 || (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_old) || (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer68) || (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto_layer74) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument_old) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer68) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument_layer74) || ((N3() && this.k.send_state != 0) || this.k.id < 0)));
                if (z3) {
                    if (M(this.z)) {
                        try {
                            hl.c((Spannable) this.z, 5, false, true);
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    h(O3(), this.z, true, 0, 0, true);
                }
                c(this.z, false, z3);
                this.z = no4.a(this.z, true);
                if (K4(this.k)) {
                    h(O3(), this.z, true, 3, (int) L0(), false);
                } else if (I3() || Q4(this.k)) {
                    h(O3(), this.z, true, 4, (int) L0(), false);
                }
                n(this.z);
                if (this.Q2) {
                    x5(this.z);
                    return;
                }
                return;
            }
            arrayList = new ArrayList<>();
            str = "";
        } else if (p2()) {
            TLRPC.Message message4 = this.k;
            str = message4.media.description;
            message4.message = str;
        }
        z = false;
        TLRPC.Message message32 = this.k;
        tL_textWithEntities = message32.translatedSummaryText;
        if (tL_textWithEntities == null) {
        }
        tL_textWithEntities2 = message32.summaryText;
        if (tL_textWithEntities2 == null) {
        }
        tL_textWithEntities3 = message32.translatedText;
        if (tL_textWithEntities3 == null) {
        }
        this.R2 = false;
        this.P2 = false;
        if (F3()) {
        }
    }

    public final int k1() {
        hl9 hl9Var = this.y2;
        if (hl9Var == null) {
            return this.u2;
        }
        ArrayList arrayList = hl9Var.h;
        ArrayList arrayList2 = hl9Var.g;
        if (arrayList2.isEmpty() || hl9Var.d || hl9Var.H()) {
            return hl9Var.C;
        }
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((ak9) obj).b >= arrayList2.size() - 1) {
                    return hl9Var.C;
                }
            }
        }
        dk9 dk9Var = (dk9) c00.g(1, arrayList2);
        return dk9Var.u() ? hl9Var.C : dk9Var.I();
    }

    public final boolean k3() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Message message = this.k;
        TLRPC.Peer peer = message.from_id;
        if (!(peer instanceof TLRPC.TL_peerChannel) || (messageFwdHeader = message.fwd_from) == null || messageFwdHeader.channel_post == 0) {
            return false;
        }
        TLRPC.Peer peer2 = messageFwdHeader.saved_from_peer;
        return (peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id;
    }

    public final boolean k4() {
        int i;
        TLRPC.Message message = this.k;
        return message instanceof TLRPC.TL_message_secret ? (((n1(message) instanceof TLRPC.TL_messageMediaPhoto) || t3(this.k)) && (i = this.k.ttl) > 0 && i <= 60) || Q4(this.k) || g4() || K4(this.k) : (message instanceof TLRPC.TL_message) && n1(message) != null && n1(this.k).ttl_seconds != 0 && ((n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if (r0.signature_profiles != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r6.megagroup != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r6.megagroup != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00af, code lost:
    
        if (p3() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x005d, code lost:
    
        if (B0(r10.k) == 489000) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k5() {
        TLRPC.Message message;
        boolean z;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (!this.j2 && !this.n2 && !this.l2 && this.m2 == null && (((message = this.k) == null || message.guestchat_via_from == null) && this.p2 == 0)) {
            long B0 = B0(message);
            int i = this.K1;
            if (B0 < 0) {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-B0(this.k)));
                if (!c3(this.k) || !xc2.V(M0)) {
                    if (M0 != null) {
                    }
                    z = false;
                }
                return false;
            }
            if (!q4()) {
                if (B0(this.k) != yac.h(i).n) {
                    TLRPC.Peer peer = this.k.peer_id;
                    TLRPC.Chat chat = null;
                    if (peer != null) {
                        long j = peer.channel_id;
                        if (j != 0) {
                            chat = w0(null, null, j);
                        }
                    }
                    if (xc2.T(chat)) {
                    }
                    TLRPC.Peer peer2 = this.k.peer_id;
                    if (peer2 != null) {
                        if (peer2.chat_id == 0) {
                            if (peer2.channel_id != 0) {
                                if (chat != null) {
                                }
                            }
                        }
                    }
                    if (o3() || z || this.T != 0 || ((messageFwdHeader = this.k.fwd_from) != null && messageFwdHeader.saved_from_peer != null)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void l(int i, String str) {
        TLRPC.Message message = this.k;
        if (message == null) {
            return;
        }
        if (i != 0) {
            message.flags |= TLObject.FLAG_30;
            message.quick_reply_shortcut_id = i;
            TLRPC.TL_inputQuickReplyShortcutId tL_inputQuickReplyShortcutId = new TLRPC.TL_inputQuickReplyShortcutId();
            tL_inputQuickReplyShortcutId.shortcut_id = i;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcutId;
            return;
        }
        if (str != null) {
            TLRPC.TL_inputQuickReplyShortcut tL_inputQuickReplyShortcut = new TLRPC.TL_inputQuickReplyShortcut();
            tL_inputQuickReplyShortcut.shortcut = str;
            this.k.quick_reply_shortcut = tL_inputQuickReplyShortcut;
        } else {
            message.flags &= -1073741825;
            message.quick_reply_shortcut_id = 0;
            message.quick_reply_shortcut = null;
        }
    }

    public final void l0() {
        String str;
        ArrayList<TLRPC.MessageEntity> arrayList;
        TLRPC.PollResults pollResults;
        if (this.D != 17) {
            return;
        }
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaPoll) || (pollResults = ((TLRPC.TL_messageMediaPoll) n1).results) == null) {
            str = null;
            arrayList = null;
        } else {
            str = pollResults.solution;
            arrayList = pollResults.solution_entities;
        }
        if (str == null) {
            this.A = null;
            return;
        }
        CharSequence m = pv3.m(str, aob.b3.getFontMetricsInt(), false, null, 0);
        this.A = m;
        Spannable A5 = A5(m, arrayList, aob.b3.getFontMetricsInt(), false);
        this.A = A5;
        b(A5, arrayList, O3(), true, false, false, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l1() {
        int L;
        Uri parse;
        String lastPathSegment;
        int L2;
        int L3;
        if (!hl.O1() || this.T == 0) {
            this.T1 = A1();
        } else {
            this.T1 = hl.L(530.0f);
        }
        this.U1 = hl.p;
        TextPaint textPaint = aob.o2;
        this.W1 = textPaint != null ? textPaint.getTextSize() : 0.0f;
        boolean P2 = P2();
        this.V1 = P2;
        boolean z = P2 && !O3();
        int L4 = this.U2 ? hl.L(71.0f) : 0;
        if (this.C2 && !this.n2) {
            L = this.T1 - hl.L(60.0f);
            if (z) {
                L = qu6.x(32.0f, this.T1, L4);
            } else {
                if (this.U2) {
                    L3 = hl.L(64.0f);
                } else if (k5() && !O3() && !this.k.isThreadMessage) {
                    L3 = hl.L(52.0f);
                }
                L -= L3;
            }
        } else if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && n1(this.k).webpage != null && "telegram_background".equals(n1(this.k).webpage.type)) {
            try {
                parse = Uri.parse(n1(this.k).webpage.url);
                lastPathSegment = parse.getLastPathSegment();
            } catch (Exception unused) {
            }
            if (parse.getQueryParameter("bg_color") != null) {
                L = hl.L(220.0f);
            } else {
                if (lastPathSegment.length() == 6 || (lastPathSegment.length() == 13 && lastPathSegment.charAt(6) == '-')) {
                    L = hl.L(200.0f);
                }
                L = 0;
            }
        } else {
            if (n1(this.k) != null && n1(this.k).webpage != null && !n1(this.k).webpage.attributes.isEmpty()) {
                int size = n1(this.k).webpage.attributes.size();
                loop0: for (int i = 0; i < size; i++) {
                    TLRPC.WebPageAttribute webPageAttribute = n1(this.k).webpage.attributes.get(i);
                    if (webPageAttribute instanceof TLRPC.TL_webPageAttributeTheme) {
                        TLRPC.TL_webPageAttributeTheme tL_webPageAttributeTheme = (TLRPC.TL_webPageAttributeTheme) webPageAttribute;
                        ArrayList<TLRPC.Document> arrayList = tL_webPageAttributeTheme.documents;
                        int size2 = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 < size2) {
                                if ("application/x-tgtheme-android".equals(arrayList.get(i2).mime_type)) {
                                    break loop0;
                                }
                                i2++;
                            } else if (tL_webPageAttributeTheme.settings != null) {
                            }
                        }
                        L = hl.L(200.0f);
                        break loop0;
                    }
                }
            }
            L = 0;
        }
        if (L == 0) {
            if (z) {
                int x = qu6.x(32.0f, this.T1, L4);
                L = n1(this.k) instanceof TLRPC.TL_messageMediaGame ? x - hl.L(10.0f) : x;
            } else {
                boolean k5 = k5();
                int L5 = this.T1 - hl.L(this.D == 36 ? 40.0f : 80.0f);
                if (this.U2) {
                    L2 = hl.L(this.D == 36 ? 75.0f : 64.0f);
                } else {
                    if (k5 && !O3() && !this.k.isThreadMessage) {
                        L2 = hl.L(52.0f);
                    }
                    if (n5() && (this.n2 || !O3())) {
                        L5 -= hl.L((this.n2 || !O3()) ? 14.0f : 40.0f);
                    }
                    L = !(n1(this.k) instanceof TLRPC.TL_messageMediaGame) ? L5 - hl.L(10.0f) : L5;
                }
                L5 -= L2;
                if (n5()) {
                    L5 -= hl.L((this.n2 || !O3()) ? 14.0f : 40.0f);
                }
                if (!(n1(this.k) instanceof TLRPC.TL_messageMediaGame)) {
                }
            }
        }
        int i3 = this.P1;
        if (i3 < 1) {
            return L;
        }
        int i4 = this.R1;
        if (i4 <= 100) {
            return i3 - i4 < (xea.o() < 2 ? 50 : 100) ? (B2() || l3(this.k)) ? Math.min(L, (int) (this.T1 * 0.65f)) : L : L;
        }
        return L;
    }

    public final ArrayList l2() {
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        ArrayList arrayList = new ArrayList();
        if (n1(this.k) != null && n1(this.k).webpage != null && (page = (webPage = n1(this.k).webpage).cached_page) != null) {
            ArrayList<TL_iv.PageBlock> arrayList2 = page.blocks;
            for (int i = 0; i < arrayList2.size(); i++) {
                TL_iv.PageBlock pageBlock = arrayList2.get(i);
                if (pageBlock instanceof TL_iv.pageBlockSlideshow) {
                    TL_iv.pageBlockSlideshow pageblockslideshow = (TL_iv.pageBlockSlideshow) pageBlock;
                    for (int i2 = 0; i2 < pageblockslideshow.items.size(); i2++) {
                        arrayList.add(r1(webPage, pageblockslideshow.items.get(i2)));
                    }
                } else if (pageBlock instanceof TL_iv.pageBlockCollage) {
                    TL_iv.pageBlockCollage pageblockcollage = (TL_iv.pageBlockCollage) pageBlock;
                    for (int i3 = 0; i3 < pageblockcollage.items.size(); i3++) {
                        arrayList.add(r1(webPage, pageblockcollage.items.get(i3)));
                    }
                }
            }
        }
        return arrayList;
    }

    public final boolean l5() {
        if (this.j2) {
            return false;
        }
        if (q2()) {
            return true;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_message_secret) {
            int max = Math.max(message.ttl, n1(message).ttl_seconds);
            if (max > 0) {
                return (((n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || K4(this.k) || t3(this.k)) && max <= 60) || g4();
            }
            return false;
        }
        if (!(message instanceof TLRPC.TL_message) || n1(message) == null || n1(this.k).ttl_seconds == 0) {
            return false;
        }
        return (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) || (n1(this.k) instanceof TLRPC.TL_messageMediaDocument);
    }

    public final void m() {
        n(this.v);
    }

    public final void m0(TLRPC.User user) {
        int i = this.K1;
        if (user == null && p3()) {
            user = uc7.s1(i).X1(Long.valueOf(this.k.from_id.user_id));
        }
        r47 r47Var = this.C;
        TLRPC.TL_game tL_game = (r47Var == null || m1(r47Var) == null || m1(this.C).game == null) ? null : m1(this.C).game;
        if (tL_game == null) {
            if (user == null || user.id != yac.h(i).e()) {
                this.v = D5(ob6.a0("ActionUserScored", null, 2131754499, ob6.G(this.k.action.score, "Points", new Object[0])), "un1", user);
                return;
            } else {
                this.v = ob6.a0("ActionYouScored", null, 2131754485, ob6.G(this.k.action.score, "Points", new Object[0]));
                return;
            }
        }
        if (user == null || user.id != yac.h(i).e()) {
            this.v = D5(ob6.a0("ActionUserScoredInGame", null, 2131754498, ob6.G(this.k.action.score, "Points", new Object[0])), "un1", user);
        } else {
            this.v = ob6.a0("ActionYouScoredInGame", null, 2131754484, ob6.G(this.k.action.score, "Points", new Object[0]));
        }
        this.v = D5(this.v, "un2", tL_game);
    }

    public final boolean m4() {
        TLRPC.Message message = this.k;
        if (message.send_state == 2 && message.id < 0) {
            return true;
        }
        if (!this.r1 || message.id <= 0) {
            return false;
        }
        return message.date < ConnectionsManager.getInstance(this.K1).getCurrentTime() - (this.k.video_processing_pending ? jn7.W4 : 60);
    }

    public boolean m5() {
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.D == 23 && !g3()) {
            return true;
        }
        if (B0(this.k) == 489000) {
            return false;
        }
        boolean z = this.n2;
        TLRPC.Message message = this.k;
        int i = this.K1;
        if (z) {
            if (message == null || message.fwd_from == null) {
                return false;
            }
            long e = yac.h(i).e();
            long Q1 = Q1(e, this.k);
            long n = wf3.n(this.k.fwd_from.saved_from_peer);
            if (n >= 0) {
                n = wf3.n(this.k.fwd_from.from_id);
            }
            return n == 0 ? Q1 >= 0 && Q1 != 2666000 : (Q1 == n || n == e) ? false : true;
        }
        if (((message.flags & 4) == 0 && !(m1(this) instanceof TLRPC.TL_messageMediaPaidMedia)) || (messageFwdHeader = this.k.fwd_from) == null || messageFwdHeader.imported) {
            return false;
        }
        TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
        if (peer != null) {
            TLRPC.Peer peer2 = messageFwdHeader.from_id;
            if ((peer2 instanceof TLRPC.TL_peerChannel) && peer.channel_id == peer2.channel_id) {
                return false;
            }
        }
        return yac.h(i).e() != B0(this.k);
    }

    public final void n(CharSequence charSequence) {
        TLRPC.Message message;
        r47 r47Var = this.C;
        if (r47Var != null) {
            if (r47Var.d5()) {
                h(O3(), charSequence, false, 3, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
                return;
            }
            if (K4(r47Var.k)) {
                h(O3(), charSequence, false, 3, (int) r47Var.L0(), false);
                return;
            }
            if (r47Var.I3() || Q4(r47Var.k)) {
                h(O3(), charSequence, false, 4, (int) r47Var.L0(), false);
            }
            if (charSequence != this.v || (message = this.k) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if ((messageAction instanceof TLRPC.TL_messageActionTodoCompletions) || (messageAction instanceof TLRPC.TL_messageActionTodoAppendTasks)) {
                Z5();
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:284|(3:285|286|287)|288|(1:290)(12:321|(1:323)|292|293|294|(1:296)(1:318)|297|298|(2:300|(3:302|(5:305|306|(1:311)|308|309)|310))(1:317)|316|(1:315)(5:305|306|(0)|308|309)|310)|291|292|293|294|(0)(0)|297|298|(0)(0)|316|(0)(0)|310) */
    /* JADX WARN: Can't wrap try/catch for region: R(47:174|(1:176)|177|(1:179)(1:449)|180|(1:182)(1:448)|183|(1:185)|(1:187)|(1:447)(1:192)|193|(1:446)(1:200)|201|(4:203|(1:(2:206|207))(1:420)|419|207)(2:421|(1:(5:424|(1:426)(1:432)|427|(1:429)(1:431)|430)(7:433|(1:435)(1:445)|436|(1:438)(1:444)|439|(1:441)(1:443)|442)))|208|(3:210|(1:212)(1:(1:416)(1:417))|213)(1:418)|214|(1:216)(2:411|(1:413)(28:414|218|(6:220|(1:387)(7:226|(1:228)(1:386)|229|(1:231)(1:385)|232|(1:234)(1:384)|235)|236|237|(2:239|(1:(2:242|(1:244))(1:245))(1:246))|247)(3:388|(2:390|391)(7:392|393|394|(1:404)(1:398)|399|(1:401)(1:403)|402)|350)|248|249|250|(1:254)|255|256|257|(1:259)(18:373|(1:375)|261|262|(1:264)|265|(1:267)|268|(3:270|(4:272|273|275|276)|279)|280|(6:282|(17:284|285|286|287|288|(1:290)(12:321|(1:323)|292|293|294|(1:296)(1:318)|297|298|(2:300|(3:302|(5:305|306|(1:311)|308|309)|310))(1:317)|316|(1:315)(5:305|306|(0)|308|309)|310)|291|292|293|294|(0)(0)|297|298|(0)(0)|316|(0)(0)|310)|326|327|(1:(1:330))(2:(1:359)|360)|331)(3:361|(5:363|(1:365)|366|(1:368)(1:371)|369)(1:372)|370)|332|(1:334)(2:351|(3:353|(1:355)(1:357)|356))|335|(5:339|(1:341)(4:345|(1:347)|343|344)|342|343|344)|348|349|350)|260|261|262|(0)|265|(0)|268|(0)|280|(0)(0)|332|(0)(0)|335|(6:337|339|(0)(0)|342|343|344)|348|349|350))|217|218|(0)(0)|248|249|250|(2:252|254)|255|256|257|(0)(0)|260|261|262|(0)|265|(0)|268|(0)|280|(0)(0)|332|(0)(0)|335|(0)|348|349|350|172) */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x06a5, code lost:
    
        r6 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x060d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x060e, code lost:
    
        cc4.g(r0, true);
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x05f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x05f9, code lost:
    
        if (r5 == 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x05fb, code lost:
    
        r32.x2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x05ff, code lost:
    
        cc4.g(r0, true);
        r13 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x013a, code lost:
    
        if (r8.length <= 0) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06c3  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06f8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n0(TLRPC.User user) {
        int L;
        float f;
        CharSequence charSequence;
        float f2;
        boolean z;
        float f3;
        TextPaint textPaint;
        int i;
        int L2;
        boolean z2;
        ArrayList arrayList;
        StaticLayout staticLayout;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        TextPaint textPaint2;
        int i4;
        int c;
        char c2;
        int i5;
        boolean z6;
        ArrayList arrayList2;
        CharSequence charSequence2;
        int lineCount;
        float f4;
        int c3;
        int ceil;
        int i6;
        int ceil2;
        int i7;
        int max;
        int c4;
        float f5;
        int c5;
        float f6;
        int i8;
        float f7;
        int i9;
        int i10;
        boolean z7;
        CharSequence charSequence3;
        View view;
        int i11 = this.D;
        if (i11 == 36) {
            int l1 = l1();
            hl9 hl9Var = this.y2;
            if (hl9Var == null || (this.k != null && hl9Var.K(E0(), l1))) {
                hl9 hl9Var2 = this.y2;
                this.y2 = new hl9(this, l1, hl9Var2);
                if (hl9Var2 == null || (view = hl9Var2.Q) == null) {
                    return;
                }
                hl9Var2.f(view);
                return;
            }
            return;
        }
        if ((i11 != 0 && i11 != 19 && i11 != 24) || this.k.peer_id == null) {
            return;
        }
        if (TextUtils.isEmpty(this.v) && !this.Y1) {
            return;
        }
        j();
        TLRPC.Message message = this.k;
        boolean z8 = message != null && message.noforwards;
        if (!z8) {
            z8 = uc7.s1(this.K1).E2(B0(message));
        }
        this.B2 = new ArrayList();
        this.v2 = 0;
        CharSequence charSequence4 = this.v;
        this.C2 = (charSequence4 instanceof Spanned) && ((jk2[]) ((Spanned) charSequence4).getSpans(0, charSequence4.length(), jk2.class)).length > 0;
        CharSequence charSequence5 = this.v;
        this.G2 = (charSequence5 instanceof Spanned) && ((q19[]) ((Spanned) charSequence5).getSpans(0, charSequence5.length(), q19.class)).length > 0;
        this.H2 = false;
        this.I2 = false;
        CharSequence a = no4.a(this.v, true);
        this.v = a;
        if (a instanceof Spanned) {
            Spanned spanned = (Spanned) a;
            r19[] r19VarArr = (r19[]) spanned.getSpans(0, spanned.length(), r19.class);
            for (r19 r19Var : r19VarArr) {
                r19Var.b = false;
            }
            this.H2 = r19VarArr.length == 1 && spanned.getSpanStart(r19VarArr[0]) == 0 && spanned.getSpanEnd(r19VarArr[0]) == spanned.length();
            jk2[] jk2VarArr = (jk2[]) spanned.getSpans(0, spanned.length(), jk2.class);
            this.I2 = jk2VarArr.length == 1 && spanned.getSpanStart(jk2VarArr[0]) == 0 && spanned.getSpanEnd(jk2VarArr[0]) == spanned.length();
        }
        if (this.Y1) {
            CharSequence charSequence6 = this.v;
            if ((charSequence6 instanceof Spannable) && (r8 = (vp0[]) ((Spannable) charSequence6).getSpans(0, charSequence6.length(), vp0.class)) != null) {
                charSequence3 = charSequence6;
            }
            SpannableStringBuilder spannableStringBuilder = charSequence6 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence6 : new SpannableStringBuilder(charSequence6);
            z7c z7cVar = new z7c(true);
            z7cVar.b(-1);
            z7cVar.d();
            vp0 vp0Var = new vp0(1, z7cVar);
            vp0Var.a(aob.Vc);
            vp0Var.n = -hl.L(10.0f);
            spannableStringBuilder.append((CharSequence) " _");
            spannableStringBuilder.setSpan(vp0Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            charSequence3 = spannableStringBuilder;
            this.v = charSequence3;
        }
        int l12 = l1();
        boolean z9 = P2() && !O3();
        try {
            if (!this.H2) {
                if (this.I2) {
                    L = hl.L(15.0f);
                }
                int i12 = l12;
                TextPaint textPaint3 = !(n1(this.k) instanceof TLRPC.TL_messageMediaGame) ? aob.x2 : aob.o2;
                CharSequence charSequence7 = this.v;
                float f8 = 0.0f;
                if (this.R1 < 4) {
                    f = 0.0f;
                    f8 = -1.0f;
                } else {
                    f = 0.0f;
                }
                StaticLayout f52 = f5(1.0f, f8, i12, Layout.Alignment.ALIGN_NORMAL, textPaint3, charSequence7, this.P1 <= 0);
                charSequence = charSequence7;
                if (this.j2) {
                    f2 = 32.0f;
                } else {
                    int i13 = this.D != 0 ? z2() ? 7 : 12 : 22;
                    if (Y4()) {
                        i13 -= 8;
                    }
                    f2 = 32.0f;
                    if (f52.getLineCount() > i13) {
                        String M0 = ob6.M0(2131746098, null);
                        f3 = f;
                        boolean z10 = true;
                        z = z8;
                        int ceil3 = (int) Math.ceil(textPaint3.measureText("… ".concat(M0)) + hl.L(1.0f));
                        int i14 = 0;
                        float f9 = f3;
                        while (true) {
                            z7 = z10;
                            if (i14 >= i13) {
                                break;
                            }
                            f9 = Math.max(f9, f52.getLineRight(i14));
                            i14++;
                            z10 = z7;
                        }
                        int i15 = i13 - 1;
                        int lineStart = f52.getLineStart(i15);
                        int lineEnd = f52.getLineEnd(i15) - 1;
                        while (lineEnd >= lineStart && f52.getPrimaryHorizontal(lineEnd) >= f9 - ceil3) {
                            lineEnd--;
                        }
                        while (lineEnd >= lineStart && !Character.isWhitespace(charSequence.charAt(lineEnd))) {
                            lineEnd--;
                        }
                        SpannableStringBuilder append = new SpannableStringBuilder(charSequence.subSequence(0, lineEnd)).append((CharSequence) "… ").append((CharSequence) M0);
                        append.setSpan(new i47(), append.length() - M0.length(), append.length(), 33);
                        try {
                            textPaint = textPaint3;
                            f52 = f5(1.0f, this.R1 >= 4 ? -1.0f : f3, i12, Layout.Alignment.ALIGN_NORMAL, textPaint, append, this.P1 > 0 ? z7 : false);
                            charSequence = append;
                            if (this.H2) {
                                L2 = hl.L(f2);
                            } else {
                                if (!this.I2) {
                                    i = i12;
                                    int lineCount2 = f52.getLineCount();
                                    int i16 = this.R1;
                                    int i17 = i16 < 50 ? 5 : 10;
                                    z2 = Build.VERSION.SDK_INT < 24 && i16 < 50;
                                    int ceil4 = !z2 ? 1 : (int) Math.ceil(lineCount2 / i17);
                                    arrayList = new ArrayList();
                                    if (!(charSequence instanceof Spanned) && (this.G2 || this.C2)) {
                                        R((Spanned) charSequence, arrayList);
                                    } else {
                                        if (!z2 || ceil4 == 1) {
                                            staticLayout = f52;
                                            z3 = false;
                                            arrayList.add(new q47(0, staticLayout.getText().length()));
                                            int size = arrayList.size();
                                            this.E2 = z3;
                                            this.F2 = z3;
                                            this.J2 = z3;
                                            this.H2 = z3;
                                            this.I2 = z3;
                                            i3 = 0;
                                            while (i3 < arrayList.size()) {
                                                o47 o47Var = new o47();
                                                q47 q47Var = (q47) arrayList.get(i3);
                                                boolean z11 = q47Var.d;
                                                int i18 = q47Var.a;
                                                int i19 = q47Var.b;
                                                String str = q47Var.f;
                                                o47Var.I = z11;
                                                o47Var.J = q47Var.c;
                                                boolean z12 = q47Var.e;
                                                o47Var.K = z12;
                                                if (z12) {
                                                    o47Var.F = this;
                                                }
                                                o47Var.c = i3;
                                                o47Var.a = i3 == 0;
                                                boolean z13 = i3 == arrayList.size() - 1;
                                                o47Var.b = z13;
                                                boolean z14 = o47Var.a;
                                                if (z14) {
                                                    this.E2 = o47Var.I;
                                                }
                                                if (z13) {
                                                    this.J2 = o47Var.J;
                                                    this.F2 = o47Var.I;
                                                }
                                                this.H2 = z14 && z13 && o47Var.J;
                                                this.I2 = z14 && z13 && !o47Var.J && o47Var.I;
                                                float f10 = 8.0f;
                                                if (o47Var.J) {
                                                    if (!z14) {
                                                        f10 = 6.0f;
                                                    } else if (z13) {
                                                        int L3 = hl.L(6.0f);
                                                        o47Var.h = L3;
                                                        o47Var.f = L3;
                                                        z5 = z;
                                                    }
                                                    o47Var.f = hl.L(f10);
                                                    o47Var.h = hl.L(7.0f);
                                                    z5 = z;
                                                } else {
                                                    z5 = z;
                                                    if (o47Var.I) {
                                                        if (z9) {
                                                            o47Var.n(str, z5);
                                                            o47Var.f = o47Var.g() + (o47Var.a ? 0 : hl.L(8.0f));
                                                            o47Var.h = hl.L(12.0f) + (o47Var.b ? 0 : hl.L(8.0f));
                                                        } else {
                                                            o47Var.m(i19 - i18, str, z5);
                                                            o47Var.f = hl.L(4.0f) + o47Var.N + (o47Var.a ? 0 : hl.L(5.0f));
                                                            o47Var.h = hl.L(4.0f) + (o47Var.b ? 0 : hl.L(7.0f)) + (o47Var.O ? hl.L(38.0f) : 0);
                                                        }
                                                    }
                                                }
                                                if (o47Var.I) {
                                                    int i20 = i19 - i18;
                                                    textPaint2 = i20 > 220 ? aob.r2 : i20 > 80 ? aob.q2 : aob.p2;
                                                } else {
                                                    textPaint2 = textPaint;
                                                }
                                                CharSequence subSequence = charSequence.subSequence(i18, i19);
                                                if (o47Var.J) {
                                                    c = hl.L(24.0f);
                                                } else if (o47Var.I) {
                                                    c = o47Var.c();
                                                } else {
                                                    i4 = i;
                                                    if (size != 1) {
                                                        c2 = 2;
                                                        if (o47Var.I && !o47Var.J && (staticLayout.getText() instanceof Spannable)) {
                                                            SpannableString b = !TextUtils.isEmpty(str) ? mk2.b(subSequence.toString(), str) : new SpannableString(subSequence.toString());
                                                            o47Var.s = i4;
                                                            staticLayout = f5(1.0f, this.R1 >= 4 ? -1.0f : f3, i4, Layout.Alignment.ALIGN_NORMAL, textPaint2, b, this.P1 > 0);
                                                            i12 = i4;
                                                        } else {
                                                            o47Var.s = i12;
                                                        }
                                                        StaticLayout staticLayout2 = staticLayout;
                                                        o47Var.e = staticLayout2;
                                                        o47Var.n = 0;
                                                        o47Var.r = staticLayout2.getText().length();
                                                        o47Var.w = staticLayout2.getHeight();
                                                        o47Var.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, o47Var.w);
                                                        int i21 = this.P1;
                                                        if (i21 != 0) {
                                                            if (i21 == 1) {
                                                                o47Var.f -= hl.L(5.3f);
                                                            } else if (i21 == 2) {
                                                                o47Var.f -= hl.L(4.5f);
                                                            } else if (i21 == 3) {
                                                                o47Var.f -= hl.L(4.2f);
                                                            }
                                                        }
                                                        staticLayout = staticLayout2;
                                                        i5 = 0;
                                                    } else {
                                                        c2 = 2;
                                                        i5 = 0;
                                                        if (i19 < i18) {
                                                            z6 = z9;
                                                            arrayList2 = arrayList;
                                                            z = z5;
                                                            charSequence2 = charSequence;
                                                        } else {
                                                            o47Var.n = i18;
                                                            o47Var.r = i19;
                                                            try {
                                                                SpannableString valueOf = (!o47Var.I || o47Var.J) ? SpannableString.valueOf(subSequence) : mk2.b(subSequence.toString(), str);
                                                                o47Var.s = i4;
                                                                StaticLayout f53 = f5(1.0f, this.R1 >= 4 ? -1.0f : f3, i4, Layout.Alignment.ALIGN_NORMAL, textPaint2, valueOf, false);
                                                                o47Var.e = f53;
                                                                o47Var.w = f53.getHeight();
                                                                o47Var.G = (int) Math.min(textPaint.getTextSize() * 1.4f * 3.0f, o47Var.w);
                                                            } catch (Exception e) {
                                                                z6 = z9;
                                                                arrayList2 = arrayList;
                                                                z = z5;
                                                                charSequence2 = charSequence;
                                                                cc4.g(e, true);
                                                            }
                                                        }
                                                        i3++;
                                                        z9 = z6;
                                                        arrayList = arrayList2;
                                                        charSequence = charSequence2;
                                                    }
                                                    this.B2.add(o47Var);
                                                    lineCount = o47Var.e.getLineCount();
                                                    f4 = o47Var.e.getLineLeft(lineCount - 1);
                                                    if (i3 == 0 && f4 >= f3) {
                                                        this.x2 = f4;
                                                    }
                                                    float f11 = o47Var.e.getLineWidth(lineCount - 1);
                                                    if (o47Var.J) {
                                                        if (o47Var.I) {
                                                            c3 = o47Var.c();
                                                        }
                                                        z = z5;
                                                        ceil = (int) Math.ceil(f11);
                                                        if (ceil > i + 80) {
                                                            ceil = i;
                                                        }
                                                        i6 = size - 1;
                                                        if (i3 == i6) {
                                                            this.u2 = ceil;
                                                        }
                                                        float f12 = ceil;
                                                        z6 = z9;
                                                        arrayList2 = arrayList;
                                                        ceil2 = (int) Math.ceil(Math.max(0.0f, f4) + f12);
                                                        if (o47Var.J) {
                                                            o47Var.E = 0.0f;
                                                            for (int i22 = i5; i22 < lineCount; i22++) {
                                                                try {
                                                                    o47Var.E = Math.max(o47Var.E, o47Var.e.getLineRight(i22));
                                                                } catch (Exception unused) {
                                                                    o47Var.E = this.v2;
                                                                }
                                                            }
                                                        }
                                                        if (lineCount > 1) {
                                                            int i23 = ceil2;
                                                            int i24 = i5;
                                                            int i25 = i24;
                                                            float f13 = 0.0f;
                                                            float f14 = 0.0f;
                                                            while (i25 < lineCount) {
                                                                int i26 = lineCount;
                                                                try {
                                                                    f5 = o47Var.e.getLineWidth(i25);
                                                                } catch (Exception unused2) {
                                                                    f5 = 0.0f;
                                                                }
                                                                if (o47Var.J) {
                                                                    c5 = hl.L(f2);
                                                                } else {
                                                                    if (o47Var.I) {
                                                                        c5 = o47Var.c();
                                                                    }
                                                                    float f15 = o47Var.e.getLineLeft(i25);
                                                                    float f16 = f15;
                                                                    if (f5 <= i + 20) {
                                                                        f6 = i;
                                                                        i8 = i24;
                                                                        f7 = 0.0f;
                                                                    } else {
                                                                        f6 = f5;
                                                                        i8 = i24;
                                                                        f7 = f16;
                                                                    }
                                                                    CharSequence charSequence8 = charSequence;
                                                                    if (f7 > 0.0f) {
                                                                        i9 = i12;
                                                                        if (o47Var.e.getParagraphDirection(i25) != -1) {
                                                                            o47Var.x = (byte) (o47Var.x | 2);
                                                                            i10 = 1;
                                                                            if (i8 != 0 && f7 == 0.0f) {
                                                                                try {
                                                                                    if (o47Var.e.getParagraphDirection(i25) != i10) {
                                                                                    }
                                                                                } catch (Exception unused3) {
                                                                                }
                                                                                i8 = 1;
                                                                            }
                                                                            f13 = Math.max(f13, f6);
                                                                            float f17 = f7 + f6;
                                                                            f14 = Math.max(f14, f17);
                                                                            ceil = Math.max(ceil, (int) Math.ceil(f6));
                                                                            i23 = Math.max(i23, (int) Math.ceil(f17));
                                                                            i25++;
                                                                            lineCount = i26;
                                                                            i24 = i8;
                                                                            charSequence = charSequence8;
                                                                            i12 = i9;
                                                                        }
                                                                    } else {
                                                                        i9 = i12;
                                                                    }
                                                                    this.x2 = Math.min(this.x2, f7);
                                                                    i10 = 1;
                                                                    o47Var.x = (byte) (o47Var.x | 1);
                                                                    this.w2 = true;
                                                                    if (i8 != 0) {
                                                                        if (o47Var.e.getParagraphDirection(i25) != i10) {
                                                                        }
                                                                        i8 = 1;
                                                                    }
                                                                    f13 = Math.max(f13, f6);
                                                                    float f172 = f7 + f6;
                                                                    f14 = Math.max(f14, f172);
                                                                    ceil = Math.max(ceil, (int) Math.ceil(f6));
                                                                    i23 = Math.max(i23, (int) Math.ceil(f172));
                                                                    i25++;
                                                                    lineCount = i26;
                                                                    i24 = i8;
                                                                    charSequence = charSequence8;
                                                                    i12 = i9;
                                                                }
                                                                f5 += c5;
                                                                float f152 = o47Var.e.getLineLeft(i25);
                                                                float f162 = f152;
                                                                if (f5 <= i + 20) {
                                                                }
                                                                CharSequence charSequence82 = charSequence;
                                                                if (f7 > 0.0f) {
                                                                }
                                                                this.x2 = Math.min(this.x2, f7);
                                                                i10 = 1;
                                                                o47Var.x = (byte) (o47Var.x | 1);
                                                                this.w2 = true;
                                                                if (i8 != 0) {
                                                                }
                                                                f13 = Math.max(f13, f6);
                                                                float f1722 = f7 + f6;
                                                                f14 = Math.max(f14, f1722);
                                                                ceil = Math.max(ceil, (int) Math.ceil(f6));
                                                                i23 = Math.max(i23, (int) Math.ceil(f1722));
                                                                i25++;
                                                                lineCount = i26;
                                                                i24 = i8;
                                                                charSequence = charSequence82;
                                                                i12 = i9;
                                                            }
                                                            charSequence2 = charSequence;
                                                            i7 = i12;
                                                            if (i24 == 0) {
                                                                if (i3 == i6) {
                                                                    this.u2 = ceil;
                                                                }
                                                                f14 = f13;
                                                            } else if (i3 == i6) {
                                                                this.u2 = ceil2;
                                                            }
                                                            max = Math.max(this.v2, (int) Math.ceil(f14));
                                                            this.v2 = max;
                                                            ceil2 = i23;
                                                            f3 = 0.0f;
                                                        } else {
                                                            charSequence2 = charSequence;
                                                            i7 = i12;
                                                            f3 = 0.0f;
                                                            if (f4 > 0.0f) {
                                                                float min = Math.min(this.x2, f4);
                                                                this.x2 = min;
                                                                if (min == 0.0f) {
                                                                    ceil = (int) (f12 + f4);
                                                                }
                                                                this.w2 = size != 1 ? 1 : i5;
                                                                o47Var.x = (byte) (o47Var.x | 1);
                                                            } else {
                                                                o47Var.x = (byte) (o47Var.x | 2);
                                                            }
                                                            max = Math.max(this.v2, Math.min(i, ceil));
                                                            this.v2 = max;
                                                        }
                                                        if (o47Var.V) {
                                                            this.v2 = Math.max(max, i);
                                                        } else {
                                                            pkb pkbVar = o47Var.M;
                                                            if (pkbVar != null) {
                                                                this.v2 = (int) Math.max(max, Math.min(pkbVar.c + hl.L(15.0f), o47Var.e == null ? f3 : r8.getWidth()));
                                                            }
                                                        }
                                                        o47Var.y.clear();
                                                        if (!this.N0 && !this.K2) {
                                                            if (o47Var.J) {
                                                                if (o47Var.I) {
                                                                    c4 = o47Var.c();
                                                                }
                                                                npa.b(null, o47Var.e, -1, ceil2, null, o47Var.y);
                                                            } else {
                                                                c4 = hl.L(f2);
                                                            }
                                                            ceil2 -= c4;
                                                            npa.b(null, o47Var.e, -1, ceil2, null, o47Var.y);
                                                        }
                                                        i12 = i7;
                                                        i3++;
                                                        z9 = z6;
                                                        arrayList = arrayList2;
                                                        charSequence = charSequence2;
                                                    } else {
                                                        c3 = hl.L(f2);
                                                    }
                                                    f11 += c3;
                                                    z = z5;
                                                    ceil = (int) Math.ceil(f11);
                                                    if (ceil > i + 80) {
                                                    }
                                                    i6 = size - 1;
                                                    if (i3 == i6) {
                                                    }
                                                    float f122 = ceil;
                                                    z6 = z9;
                                                    arrayList2 = arrayList;
                                                    ceil2 = (int) Math.ceil(Math.max(0.0f, f4) + f122);
                                                    if (o47Var.J) {
                                                    }
                                                    if (lineCount > 1) {
                                                    }
                                                    if (o47Var.V) {
                                                    }
                                                    o47Var.y.clear();
                                                    if (!this.N0) {
                                                        if (o47Var.J) {
                                                        }
                                                        ceil2 -= c4;
                                                        npa.b(null, o47Var.e, -1, ceil2, null, o47Var.y);
                                                    }
                                                    i12 = i7;
                                                    i3++;
                                                    z9 = z6;
                                                    arrayList = arrayList2;
                                                    charSequence = charSequence2;
                                                }
                                                i4 = i - c;
                                                if (size != 1) {
                                                }
                                                this.B2.add(o47Var);
                                                lineCount = o47Var.e.getLineCount();
                                                f4 = o47Var.e.getLineLeft(lineCount - 1);
                                                if (i3 == 0) {
                                                    this.x2 = f4;
                                                }
                                                float f112 = o47Var.e.getLineWidth(lineCount - 1);
                                                if (o47Var.J) {
                                                }
                                                f112 += c3;
                                                z = z5;
                                                ceil = (int) Math.ceil(f112);
                                                if (ceil > i + 80) {
                                                }
                                                i6 = size - 1;
                                                if (i3 == i6) {
                                                }
                                                float f1222 = ceil;
                                                z6 = z9;
                                                arrayList2 = arrayList;
                                                ceil2 = (int) Math.ceil(Math.max(0.0f, f4) + f1222);
                                                if (o47Var.J) {
                                                }
                                                if (lineCount > 1) {
                                                }
                                                if (o47Var.V) {
                                                }
                                                o47Var.y.clear();
                                                if (!this.N0) {
                                                }
                                                i12 = i7;
                                                i3++;
                                                z9 = z6;
                                                arrayList = arrayList2;
                                                charSequence = charSequence2;
                                            }
                                            if (this.C2) {
                                                if (this.v2 > this.T1 - hl.L(80 + ((!k5() || O3() || this.k.isThreadMessage) ? 0 : 52))) {
                                                    z4 = true;
                                                    this.D2 = z4;
                                                    return;
                                                }
                                            }
                                            z4 = false;
                                            this.D2 = z4;
                                            return;
                                        }
                                        int i27 = 0;
                                        int i28 = 0;
                                        while (i27 < ceil4) {
                                            int min2 = z2 ? lineCount2 : Math.min(i17, lineCount2 - i28);
                                            int lineStart2 = f52.getLineStart(i28);
                                            int i29 = min2 + i28;
                                            int lineEnd2 = f52.getLineEnd(i29 - 1);
                                            StaticLayout staticLayout3 = f52;
                                            int i30 = lineEnd2 - 1;
                                            if (i30 >= 0) {
                                                i2 = i29;
                                                if (i30 < staticLayout3.getText().length() && staticLayout3.getText().charAt(i30) == '\n') {
                                                    lineEnd2--;
                                                }
                                            } else {
                                                i2 = i29;
                                            }
                                            if (lineEnd2 >= lineStart2) {
                                                arrayList.add(new q47(lineStart2, lineEnd2));
                                                i28 = i2;
                                            }
                                            i27++;
                                            f52 = staticLayout3;
                                        }
                                    }
                                    staticLayout = f52;
                                    z3 = false;
                                    int size2 = arrayList.size();
                                    this.E2 = z3;
                                    this.F2 = z3;
                                    this.J2 = z3;
                                    this.H2 = z3;
                                    this.I2 = z3;
                                    i3 = 0;
                                    while (i3 < arrayList.size()) {
                                    }
                                    if (this.C2) {
                                    }
                                    z4 = false;
                                    this.D2 = z4;
                                    return;
                                }
                                L2 = hl.L(15.0f);
                            }
                            i = L2 + i12;
                            int lineCount22 = f52.getLineCount();
                            int i162 = this.R1;
                            if (i162 < 50) {
                            }
                            if (Build.VERSION.SDK_INT < 24) {
                            }
                            if (!z2) {
                            }
                            arrayList = new ArrayList();
                            if (!(charSequence instanceof Spanned)) {
                            }
                            if (z2) {
                            }
                            staticLayout = f52;
                            z3 = false;
                            arrayList.add(new q47(0, staticLayout.getText().length()));
                            int size22 = arrayList.size();
                            this.E2 = z3;
                            this.F2 = z3;
                            this.J2 = z3;
                            this.H2 = z3;
                            this.I2 = z3;
                            i3 = 0;
                            while (i3 < arrayList.size()) {
                            }
                            if (this.C2) {
                            }
                            z4 = false;
                            this.D2 = z4;
                            return;
                        } catch (Exception e2) {
                            cc4.g(e2, z7);
                            return;
                        }
                    }
                }
                z = z8;
                f3 = f;
                textPaint = textPaint3;
                if (this.H2) {
                }
                i = L2 + i12;
                int lineCount222 = f52.getLineCount();
                int i1622 = this.R1;
                if (i1622 < 50) {
                }
                if (Build.VERSION.SDK_INT < 24) {
                }
                if (!z2) {
                }
                arrayList = new ArrayList();
                if (!(charSequence instanceof Spanned)) {
                }
                if (z2) {
                }
                staticLayout = f52;
                z3 = false;
                arrayList.add(new q47(0, staticLayout.getText().length()));
                int size222 = arrayList.size();
                this.E2 = z3;
                this.F2 = z3;
                this.J2 = z3;
                this.H2 = z3;
                this.I2 = z3;
                i3 = 0;
                while (i3 < arrayList.size()) {
                }
                if (this.C2) {
                }
                z4 = false;
                this.D2 = z4;
                return;
            }
            L = hl.L(32.0f);
            float f82 = 0.0f;
            if (this.R1 < 4) {
            }
            StaticLayout f522 = f5(1.0f, f82, i12, Layout.Alignment.ALIGN_NORMAL, textPaint3, charSequence7, this.P1 <= 0);
            charSequence = charSequence7;
            if (this.j2) {
            }
            z = z8;
            f3 = f;
            textPaint = textPaint3;
            if (this.H2) {
            }
            i = L2 + i12;
            int lineCount2222 = f522.getLineCount();
            int i16222 = this.R1;
            if (i16222 < 50) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
            if (!z2) {
            }
            arrayList = new ArrayList();
            if (!(charSequence instanceof Spanned)) {
            }
            if (z2) {
            }
            staticLayout = f522;
            z3 = false;
            arrayList.add(new q47(0, staticLayout.getText().length()));
            int size2222 = arrayList.size();
            this.E2 = z3;
            this.F2 = z3;
            this.J2 = z3;
            this.H2 = z3;
            this.I2 = z3;
            i3 = 0;
            while (i3 < arrayList.size()) {
            }
            if (this.C2) {
            }
            z4 = false;
            this.D2 = z4;
            return;
        } catch (Exception e3) {
            cc4.g(e3, true);
            return;
        }
        l12 -= L;
        int i122 = l12;
        TextPaint textPaint32 = !(n1(this.k) instanceof TLRPC.TL_messageMediaGame) ? aob.x2 : aob.o2;
        CharSequence charSequence72 = this.v;
    }

    public final void n2(ArrayList arrayList, String[] strArr, boolean z, boolean z2) {
        TLRPC.Message message;
        TLRPC.MessageReplyHeader messageReplyHeader;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z3 = false;
        for (int i = 0; i < arrayList.size(); i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    break;
                }
                if (((String) arrayList.get(i)).contains(strArr[i2])) {
                    z3 = true;
                    break;
                }
                i2++;
            }
            if (z3) {
                break;
            }
        }
        if (z3) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                int i4 = 0;
                while (true) {
                    if (i4 >= strArr.length) {
                        arrayList.remove(i3);
                        i3--;
                        break;
                    } else if (!((String) arrayList.get(i3)).contains(strArr[i4])) {
                        i4++;
                    }
                }
                i3++;
            }
            if (arrayList.size() > 0) {
                Collections.sort(arrayList, new vk6((byte) 11));
                String str = (String) arrayList.get(0);
                arrayList.clear();
                arrayList.add(str);
            }
        }
        this.a2 = arrayList;
        if (this.k.message != null) {
            j();
            CharSequence I2 = hl.I2(!TextUtils.isEmpty(this.z) ? this.z : this.v, " ", "\n");
            if (z && (message = this.k) != null && (messageReplyHeader = message.reply_to) != null && messageReplyHeader.quote_text != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.k.reply_to.quote_text);
                b(spannableStringBuilder, this.k.reply_to.quote_entities, O3(), false, false, false, 0);
                SpannableString spannableString = new SpannableString("q ");
                wm2 wm2Var = new wm2(R.drawable.mini_quote, 0);
                wm2Var.y = aob.w0(null, aob.q6, false);
                spannableString.setSpan(wm2Var, 0, 1, 33);
                I2 = new SpannableStringBuilder(spannableString).append((CharSequence) spannableStringBuilder).append('\n').append(I2);
            }
            String charSequence = I2.toString();
            int length = charSequence.length();
            int indexOf = charSequence.toLowerCase().indexOf((String) arrayList.get(0));
            if (indexOf < 0) {
                indexOf = 0;
            }
            if (length > 120 && z2) {
                int max = Math.max(0, indexOf - 12);
                I2 = I2.subSequence(max, Math.min(length, (indexOf - max) + indexOf + jn7.s1));
            }
            this.c2 = I2;
            this.b2 = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n3() {
        TLRPC.Chat chat;
        TLRPC.Peer peer;
        TLRPC.Peer peer2 = this.k.peer_id;
        TLRPC.Chat chat2 = null;
        if (peer2 != null) {
            long j = peer2.channel_id;
            if (j != 0) {
                chat = w0(null, null, j);
                if (!(this.k.peer_id instanceof TLRPC.TL_peerChannel) && xc2.V(chat)) {
                    return true;
                }
                peer = this.k.from_id;
                if (peer != null) {
                    long j2 = peer.channel_id;
                    if (j2 != 0) {
                        chat2 = w0(null, null, j2);
                    }
                }
                return (this.k.from_id instanceof TLRPC.TL_peerChannel) && xc2.V(chat2);
            }
        }
        chat = null;
        if (!(this.k.peer_id instanceof TLRPC.TL_peerChannel)) {
        }
        peer = this.k.from_id;
        if (peer != null) {
        }
        if (this.k.from_id instanceof TLRPC.TL_peerChannel) {
            return false;
        }
    }

    public final boolean n4() {
        TLRPC.Message message = this.k;
        return message.send_state == 1 && message.id < 0;
    }

    public boolean n5() {
        TLRPC.Message message;
        TLRPC.MessageFwdHeader messageFwdHeader;
        if (this.j2 || this.U2 || B0(this.k) == 489000) {
            return false;
        }
        boolean z = this.n2;
        int i = this.K1;
        if (z) {
            long j = yac.h(i).n;
            long Q1 = Q1(j, this.k);
            if (Q1 == j || Q1 == 2666000 || (message = this.k) == null || (messageFwdHeader = message.fwd_from) == null) {
                return false;
            }
            return (messageFwdHeader.from_id == null && messageFwdHeader.saved_from_id == null) ? false : true;
        }
        if (this.D == 27 || q4() || this.C2 || this.t1 || this.r1 || this.T != 0) {
            return false;
        }
        if (this.p2 == 2) {
            return true;
        }
        TLRPC.Message message2 = this.k;
        if (message2.noforwards) {
            return false;
        }
        if (message2.fwd_from != null && !O3()) {
            TLRPC.Message message3 = this.k;
            if (message3.fwd_from.saved_from_peer != null && B0(message3) == yac.h(i).e()) {
                return true;
            }
        }
        int i2 = this.D;
        if (i2 == 13 || i2 == 15 || i2 == 19) {
            return false;
        }
        TLRPC.MessageFwdHeader messageFwdHeader2 = this.k.fwd_from;
        if (messageFwdHeader2 != null && (messageFwdHeader2.from_id instanceof TLRPC.TL_peerChannel) && !O3()) {
            return true;
        }
        if (!p3()) {
            TLRPC.Message message4 = this.k;
            if (!(message4.from_id instanceof TLRPC.TL_peerChannel) && !message4.post) {
                return false;
            }
            if ((n1(message4) instanceof TLRPC.TL_messageMediaWebPage) && !O3()) {
                return true;
            }
            if (z4()) {
                return false;
            }
            TLRPC.Message message5 = this.k;
            if (message5.peer_id.channel_id == 0) {
                return false;
            }
            if (message5.via_bot_id == 0 && message5.reply_to == null) {
                return true;
            }
            int i3 = this.D;
            return (i3 == 13 || i3 == 15) ? false : true;
        }
        TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(this.k.from_id.user_id));
        if (X1 != null && X1.bot && ("reviews_bot".equals(lbc.p(X1)) || "ReviewInsightsBot".equals(lbc.p(X1)))) {
            return true;
        }
        if ((n1(this.k) instanceof TLRPC.TL_messageMediaEmpty) || n1(this.k) == null) {
            return false;
        }
        if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && !(n1(this.k).webpage instanceof TLRPC.TL_webPage)) {
            return false;
        }
        if (X1 != null && X1.bot && !p2()) {
            return true;
        }
        if (N3()) {
            return false;
        }
        if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
            return true;
        }
        if (((n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && !p2()) || (n1(this.k) instanceof TLRPC.TL_messageMediaWebPage)) {
            return true;
        }
        TLRPC.Peer peer = this.k.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j2 = peer.channel_id;
            if (j2 != 0) {
                chat = w0(null, null, j2);
            }
        }
        return xc2.T(chat) && chat.megagroup && xc2.t0(chat) && !(n1(this.k) instanceof TLRPC.TL_messageMediaContact) && !(n1(this.k) instanceof TLRPC.TL_messageMediaGeo);
    }

    public final boolean o() {
        TLRPC.MessageMedia n1 = n1(this.k);
        if (!(n1 instanceof TLRPC.TL_messageMediaToDo) || l3(this.k)) {
            return false;
        }
        TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) n1;
        if (tL_messageMediaToDo.todo.list.size() >= uc7.s1(this.K1).k4.F3.f()) {
            return false;
        }
        if (O3()) {
            return true;
        }
        TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
        return todoList.others_can_complete && todoList.others_can_append;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        boolean z;
        int i;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        if (this.y != null) {
            return;
        }
        TLRPC.WebPage webPage = this.b3;
        if (webPage == null) {
            webPage = n1(this.k) instanceof TLRPC.TL_messageMediaWebPage ? ((TLRPC.TL_messageMediaWebPage) n1(this.k)).webpage : null;
        }
        if (webPage != null) {
            for (int i2 = 0; i2 < webPage.attributes.size(); i2++) {
                TLRPC.WebPageAttribute webPageAttribute = webPage.attributes.get(i2);
                if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem) != null && storyItem.caption != null) {
                    this.y = new SpannableStringBuilder(tL_webPageAttributeStory.storyItem.caption);
                    this.B1 = tL_webPageAttributeStory.storyItem.entities;
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.y == null) {
            if ((n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) && (n1(this.k).webpage instanceof TLRPC.TL_webPage) && n1(this.k).webpage.description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(n1(this.k).webpage.description);
                String str = n1(this.k).webpage.site_name;
                if (str != null) {
                    str = str.toLowerCase();
                }
                i = "instagram".equals(str) ? 1 : "twitter".equals(str) ? 2 : 0;
                if (TextUtils.isEmpty(this.y)) {
                    if (M(this.y)) {
                        try {
                            hl.c((Spannable) this.y, 1, false, true);
                        } catch (Exception e) {
                            cc4.g(e, true);
                        }
                    }
                    CharSequence m = pv3.m(this.y, aob.o2.getFontMetricsInt(), false, null, 0);
                    this.y = m;
                    ArrayList arrayList = this.B1;
                    if (arrayList != null) {
                        b(m, arrayList, N3(), z, false, !z, 0);
                        A5(this.y, this.B1, aob.o2.getFontMetricsInt(), false);
                    }
                    if (i != 0) {
                        if (!(this.y instanceof Spannable)) {
                            this.y = new SpannableStringBuilder(this.y);
                        }
                        h(O3(), this.y, false, i, 0, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if ((n1(this.k) instanceof TLRPC.TL_messageMediaGame) && n1(this.k).game.description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(n1(this.k).game.description);
            } else if ((n1(this.k) instanceof TLRPC.TL_messageMediaInvoice) && n1(this.k).description != null) {
                this.y = Spannable.Factory.getInstance().newSpannable(n1(this.k).description);
            }
        }
        i = 0;
        if (TextUtils.isEmpty(this.y)) {
        }
    }

    public final int o1() {
        boolean z = this.y0;
        return this.z0 ? (z ? 1 : 0) | 2 : z ? 1 : 0;
    }

    public final boolean o2() {
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
        TLRPC.Message message = this.k;
        if (z) {
            return n1(message).photo != null && n1(this.k).photo.has_stickers;
        }
        if (n1(message) instanceof TLRPC.TL_messageMediaDocument) {
            return V2(n1(this.k).document);
        }
        return false;
    }

    public final boolean o3() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        TLRPC.Peer peer = message.peer_id;
        TLRPC.Chat chat = null;
        if (peer != null) {
            long j = peer.channel_id;
            if (j != 0) {
                chat = w0(null, null, j);
            }
        }
        return (this.k.from_id instanceof TLRPC.TL_peerChannel) && xc2.T(chat) && chat.megagroup;
    }

    public final boolean o4() {
        int i;
        TLRPC.Chat M0;
        Boolean bool = this.t2;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (this.k != null && (((i = this.D) == 1 || i == 3 || i == 9 || i == 8 || i == 5) && !this.B0 && !this.j2 && !O3())) {
            TLRPC.Message message = this.k;
            if (message.send_state == 0) {
                if (!message.restriction_reason.isEmpty()) {
                    for (int i2 = 0; i2 < this.k.restriction_reason.size(); i2++) {
                        TLRPC.RestrictionReason restrictionReason = this.k.restriction_reason.get(i2);
                        if ("sensitive".equals(restrictionReason.reason)) {
                            if (!"all".equals(restrictionReason.platform)) {
                                if ("android".equals(restrictionReason.platform) || "android-ios".equals(restrictionReason.platform) || "ios-android".equals(restrictionReason.platform)) {
                                    a.t();
                                    if (!f11.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason.platform)) {
                                }
                            }
                            this.t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                if (B0(this.k) < 0 && (M0 = uc7.s1(this.K1).M0(Long.valueOf(-B0(this.k)))) != null && M0.restriction_reason != null) {
                    for (int i3 = 0; i3 < M0.restriction_reason.size(); i3++) {
                        TLRPC.RestrictionReason restrictionReason2 = M0.restriction_reason.get(i3);
                        if ("sensitive".equals(restrictionReason2.reason)) {
                            if (!"all".equals(restrictionReason2.platform)) {
                                if ("android".equals(restrictionReason2.platform) || "android-ios".equals(restrictionReason2.platform) || "ios-android".equals(restrictionReason2.platform)) {
                                    a.t();
                                    if (!f11.a()) {
                                    }
                                }
                                if ("android-all".equals(restrictionReason2.platform)) {
                                }
                            }
                            this.t2 = Boolean.TRUE;
                            return true;
                        }
                    }
                }
                this.t2 = Boolean.FALSE;
            }
        }
        return false;
    }

    public final boolean o5() {
        long B0 = B0(this.k);
        int i = this.K1;
        return (!xc2.o0(i, B0) || Z0() == yac.h(i).e() || O3()) ? false : true;
    }

    public final void p0(TLRPC.User user, boolean z) {
        String str;
        String a0;
        if (user == null) {
            user = uc7.s1(this.K1).X1(Long.valueOf(B0(this.k)));
        }
        String k = user != null ? lbc.k(user, true) : "";
        try {
            if ("XTR".equals(this.k.action.currency)) {
                str = "XTR " + this.k.action.total_amount;
            } else {
                ob6 D0 = ob6.D0();
                TLRPC.MessageAction messageAction = this.k.action;
                str = D0.p(messageAction.total_amount, messageAction.currency);
            }
        } catch (Exception e) {
            cc4.g(e, true);
            str = "<error>";
        }
        r47 r47Var = this.C;
        if (r47Var == null || !(m1(r47Var) instanceof TLRPC.TL_messageMediaInvoice)) {
            TLRPC.MessageAction messageAction2 = this.k.action;
            int i = messageAction2.subscription_until_date;
            if (i != 0) {
                long j = i;
                if (z) {
                    a0 = ob6.a0(null, null, 2131747092, k, str, ob6.x(j, false));
                    this.v = a0;
                } else {
                    a0 = ob6.a0(null, null, 2131747086, str, k, ob6.x(j, false));
                    this.v = a0;
                }
            } else if (!messageAction2.recurring_init || z) {
                a0 = ob6.a0(null, null, 2131747090, str, k);
                this.v = a0;
            } else {
                a0 = ob6.a0(null, null, 2131747089, str, k);
                this.v = a0;
            }
        } else {
            TLRPC.MessageAction messageAction3 = this.k.action;
            if (messageAction3.subscription_until_date != 0) {
                r47 r47Var2 = this.C;
                if (z) {
                    a0 = ob6.a0(null, null, 2131747091, k, str, m1(r47Var2).title, ob6.x(this.k.action.subscription_until_date, false));
                    this.v = a0;
                } else {
                    a0 = ob6.a0(null, null, 2131747087, str, k, m1(r47Var2).title, ob6.x(this.k.action.subscription_until_date, false));
                    this.v = a0;
                }
            } else if (!messageAction3.recurring_init || z) {
                a0 = ob6.a0(null, null, 2131747093, str, k, m1(this.C).title);
                this.v = a0;
            } else {
                a0 = ob6.a0(null, null, 2131747088, str, k, m1(this.C).title);
                this.v = a0;
            }
        }
        this.v = nza.T0(a0);
    }

    public final boolean p2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty()) ? false : true;
    }

    public final boolean p3() {
        TLRPC.Message message = this.k;
        return (message.from_id instanceof TLRPC.TL_peerUser) && !message.post;
    }

    public final boolean p4() {
        TLRPC.Message message = this.k;
        return message.send_state == 0 || message.id > 0;
    }

    public final boolean q() {
        TLRPC.MessageMedia n1 = n1(this.k);
        if ((n1 instanceof TLRPC.TL_messageMediaToDo) && !l3(this.k)) {
            return O3() || ((TLRPC.TL_messageMediaToDo) n1).todo.others_can_complete;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r10v1, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final void q0(TLRPC.Chat chat, TLRPC.User user) {
        boolean z;
        if (user == 0 && chat == null) {
            boolean p32 = p3();
            int i = this.K1;
            user = user;
            if (p32) {
                user = uc7.s1(i).X1(Long.valueOf(this.k.from_id.user_id));
            }
            if (user == 0) {
                TLRPC.Peer peer = this.k.peer_id;
                if (peer instanceof TLRPC.TL_peerChannel) {
                    chat = uc7.s1(i).M0(Long.valueOf(this.k.peer_id.channel_id));
                } else if (peer instanceof TLRPC.TL_peerChat) {
                    chat = uc7.s1(i).M0(Long.valueOf(this.k.peer_id.chat_id));
                }
            }
        }
        r47 r47Var = this.C;
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            if (!(message instanceof TLRPC.TL_messageEmpty) && !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) {
                if (r47Var.I3()) {
                    String M0 = ob6.M0(2131754587, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M0, "un1", chat);
                    return;
                }
                if (K4(this.C.k)) {
                    String M02 = ob6.M0(2131754579, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M02, "un1", chat);
                    return;
                }
                if (t3(this.C.k)) {
                    String M03 = ob6.M0(2131754588, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M03, "un1", chat);
                    return;
                }
                if (Q4(this.C.k)) {
                    String M04 = ob6.M0(2131754578, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M04, "un1", chat);
                    return;
                }
                if (this.C.g4()) {
                    String M05 = ob6.M0(2131754582, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M05, "un1", chat);
                    return;
                }
                if ((this.C.s4() || this.C.J2()) && !this.C.G2()) {
                    String M06 = ob6.M0(2131754581, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M06, "un1", chat);
                    return;
                }
                if (m1(this.C) instanceof TLRPC.TL_messageMediaDocument) {
                    String M07 = ob6.M0(2131754592, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M07, "un1", chat);
                    return;
                }
                if (m1(this.C) instanceof TLRPC.TL_messageMediaGeo) {
                    String M08 = ob6.M0(2131754590, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M08, "un1", chat);
                    return;
                }
                if (m1(this.C) instanceof TLRPC.TL_messageMediaGeoLive) {
                    String M09 = ob6.M0(2131754589, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M09, "un1", chat);
                    return;
                }
                if (m1(this.C) instanceof TLRPC.TL_messageMediaContact) {
                    String M010 = ob6.M0(2131754593, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M010, "un1", chat);
                    return;
                }
                boolean z2 = m1(this.C) instanceof TLRPC.TL_messageMediaPoll;
                r47 r47Var2 = this.C;
                if (z2) {
                    if (((TLRPC.TL_messageMediaPoll) m1(r47Var2)).poll.quiz) {
                        String M011 = ob6.M0(2131754583, null);
                        if (user != 0) {
                            chat = user;
                        }
                        this.v = D5(M011, "un1", chat);
                        return;
                    }
                    String M012 = ob6.M0(2131754584, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M012, "un1", chat);
                    return;
                }
                if (m1(r47Var2) instanceof TLRPC.TL_messageMediaPhoto) {
                    String M013 = ob6.M0(2131754585, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M013, "un1", chat);
                    return;
                }
                boolean z3 = m1(this.C) instanceof TLRPC.TL_messageMediaPaidMedia;
                r47 r47Var3 = this.C;
                if (z3) {
                    this.v = ob6.G((int) ((TLRPC.TL_messageMediaPaidMedia) m1(r47Var3)).stars_amount, "NotificationPinnedPaidMedia", chat != null ? chat.title : lbc.r(user));
                    return;
                }
                boolean z4 = m1(r47Var3) instanceof TLRPC.TL_messageMediaGame;
                r47 r47Var4 = this.C;
                if (z4) {
                    String a0 = ob6.a0("ActionPinnedGame", null, 2131754591, "🎮 " + m1(r47Var4).game.title);
                    if (user != 0) {
                        chat = user;
                    }
                    CharSequence D5 = D5(a0, "un1", chat);
                    this.v = D5;
                    this.v = pv3.m(D5, aob.o2.getFontMetricsInt(), false, null, 0);
                    return;
                }
                CharSequence charSequence = r47Var4.v;
                if (charSequence == null || charSequence.length() <= 0) {
                    String M014 = ob6.M0(2131754586, null);
                    if (user != 0) {
                        chat = user;
                    }
                    this.v = D5(M014, "un1", chat);
                    return;
                }
                CharSequence cloneSpans = hm.cloneSpans(this.C.v);
                if (cloneSpans.length() > 20) {
                    cloneSpans = cloneSpans.subSequence(0, 20);
                    z = true;
                } else {
                    z = false;
                }
                CharSequence m = pv3.m(cloneSpans, aob.o2.getFontMetricsInt(), true, null, 0);
                r47 r47Var5 = this.C;
                if (r47Var5 != null && r47Var5.k != null) {
                    m = r47Var5.z5(m, aob.o2.getFontMetricsInt());
                }
                ls6.g(this.C, (Spannable) m);
                if (z) {
                    if (m instanceof SpannableStringBuilder) {
                        ((SpannableStringBuilder) m).append((CharSequence) "...");
                    } else if (m != null) {
                        m = new SpannableStringBuilder(m).append((CharSequence) "...");
                    }
                }
                SpannableStringBuilder m0 = hl.m0(ob6.M0(2131754580, null), m);
                if (user != 0) {
                    chat = user;
                }
                this.v = D5(m0, "un1", chat);
                return;
            }
        }
        String M015 = ob6.M0(2131754586, null);
        if (user != 0) {
            chat = user;
        }
        this.v = D5(M015, "un1", chat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ab, code lost:
    
        if (r0 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01af, code lost:
    
        if (r10.ttl_seconds == 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011e, code lost:
    
        if (J4(r6.document) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012d, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012b, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r7).flags & 4) != 0) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence q1(TLRPC.MessageMedia messageMedia) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        String p;
        String str = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveaway) {
            return ob6.M0(2131753485, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
            return ob6.M0(2131753385, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaStory) {
            if (!messageMedia.via_mention) {
                return ob6.M0(2131750503, null);
            }
            int i = this.K1;
            TLRPC.User X1 = uc7.s1(i).X1(Long.valueOf(messageMedia.user_id));
            if (X1 != null && (p = lbc.p(X1)) != null) {
                StringBuilder sb = new StringBuilder();
                qu6.u(sb, uc7.s1(i).N2, "/", p, "/s/");
                sb.append(messageMedia.id);
                str = sb.toString();
            }
            if (str == null) {
                return "";
            }
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new h8c("https://".concat(str), new rmb()), 0, spannableString.length(), 33);
            return spannableString;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaDice) {
            TLRPC.TL_messageMediaDice tL_messageMediaDice = (TLRPC.TL_messageMediaDice) messageMedia;
            return TextUtils.isEmpty(tL_messageMediaDice.emoticon) ? "🎲" : tL_messageMediaDice.emoticon.replace("️", "");
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
            return ((TLRPC.TL_messageMediaPoll) messageMedia).poll.quiz ? ob6.M0(2131746172, null) : ob6.M0(2131746912, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaToDo) {
            TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
            TLRPC.TodoList todoList = tL_messageMediaToDo.todo;
            return (todoList == null || (tL_textWithEntities = todoList.title) == null || tL_textWithEntities.text.isEmpty()) ? ob6.M0(2131748223, null) : ob6.V(null, null, 2131748221, h0(tL_messageMediaToDo.todo.title, O3()));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            int size = tL_messageMediaPaidMedia.extended_media.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i2);
                if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.MessageMedia messageMedia2 = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                    if (messageMedia2 instanceof TLRPC.TL_messageMediaDocument) {
                    }
                    z = false;
                } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                }
                if (z) {
                    break;
                }
            }
            return nza.T0(ob6.a0(null, null, 2131753942, size == 1 ? ob6.M0(z ? 2131753926 : 2131753941, null) : ob6.G(size, z ? "Media" : "Photos", new Object[0])));
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            return (messageMedia.ttl_seconds == 0 || (this.k instanceof TLRPC.TL_message_secret)) ? c1() != 0 ? ob6.M0(2131754298, null) : D3() ? ob6.M0(2131753955, null) : ob6.M0(2131753941, null) : ob6.M0(2131753970, null);
        }
        if (messageMedia != null) {
            if (!J4(messageMedia.document)) {
                if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.Document document = messageMedia.document;
                    if (!(document instanceof TLRPC.TL_documentEmpty)) {
                    }
                }
            }
            return (messageMedia.ttl_seconds == 0 || (this.k instanceof TLRPC.TL_message_secret)) ? ob6.M0(2131753926, null) : messageMedia.voice ? ob6.M0(2131753922, null) : messageMedia.round ? ob6.M0(2131753933, null) : ob6.M0(2131753969, null);
        }
        if (messageMedia != null) {
            if (P4(messageMedia.document)) {
                return ob6.M0(2131753975, null);
            }
            if (h4(messageMedia.document)) {
                return ob6.M0(2131753934, null);
            }
        }
        if ((messageMedia instanceof TLRPC.TL_messageMediaGeo) || (messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
            return ob6.M0(2131753954, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
            return ob6.M0(2131753959, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaContact) {
            return ob6.M0(2131753972, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
            return this.k.message;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
            return messageMedia.description;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            return ob6.M0(2131743484, null);
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaWidget) {
            return TextUtils.isEmpty(this.k.message) ? ob6.M0(2131753919, null) : this.k.message;
        }
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return null;
        }
        if (t4(messageMedia.document) || K2(messageMedia.document, true)) {
            String U1 = U1();
            return (U1 == null || U1.length() <= 0) ? ob6.M0(2131753929, null) : qd4.y(U1, " ", ob6.M0(2131753929, null));
        }
        if (I3()) {
            return ob6.M0(2131753945, null);
        }
        if (t3(this.k)) {
            return ob6.M0(2131753964, null);
        }
        String B = xb4.B(messageMedia.document);
        return !TextUtils.isEmpty(B) ? B : ob6.M0(2131753968, null);
    }

    public final boolean q2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) ? false : true;
    }

    public final boolean q3() {
        return t3(this.k);
    }

    public final boolean q4() {
        return this.R0 != null;
    }

    public final b77 q5() {
        TLRPC.Message message;
        r47 r47Var = this.C;
        if (r47Var != null && (message = r47Var.k) != null) {
            TLRPC.SuggestedPost suggestedPost = message.suggested_post;
            if (suggestedPost != null) {
                return b77.b(suggestedPost);
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                return new b77(oj.m(((TLRPC.TL_messageActionSuggestedPostApproval) messageAction).price), r3.schedule_date);
            }
        }
        return null;
    }

    public final void r0(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        TL_iv.RichMessage richMessage;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        boolean q2 = q2();
        TLRPC.Message message = this.k;
        if (q2) {
            TLRPC.TL_messageExtendedMediaPreview tL_messageExtendedMediaPreview = (TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0);
            if (z) {
                b6(this.p0, Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            } else {
                this.p0 = new ArrayList(Collections.singletonList(tL_messageExtendedMediaPreview.thumb));
            }
            this.n0 = this.k;
            if (this.I1 == null) {
                Q();
                return;
            }
            return;
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionChatEditPhoto) {
                TLRPC.Photo photo = messageAction.photo;
                if (z) {
                    ArrayList arrayList12 = this.p0;
                    if (arrayList12 != null && !arrayList12.isEmpty()) {
                        for (int i = 0; i < this.p0.size(); i++) {
                            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) this.p0.get(i);
                            int i2 = 0;
                            while (true) {
                                if (i2 < photo.sizes.size()) {
                                    TLRPC.PhotoSize photoSize2 = photo.sizes.get(i2);
                                    if (!(photoSize2 instanceof TLRPC.TL_photoSizeEmpty) && photoSize2.type.equals(photoSize.type)) {
                                        photoSize.location = photoSize2.location;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                    }
                } else {
                    this.p0 = new ArrayList(photo.sizes);
                }
                if (photo.dc_id != 0 && (arrayList11 = this.p0) != null) {
                    int size = arrayList11.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        TLRPC.FileLocation fileLocation = ((TLRPC.PhotoSize) this.p0.get(i3)).location;
                        if (fileLocation != null) {
                            fileLocation.dc_id = photo.dc_id;
                            fileLocation.file_reference = photo.file_reference;
                        }
                    }
                }
                this.n0 = this.k.action.photo;
                return;
            }
            return;
        }
        if (this.n != null || this.o != null) {
            if (TextUtils.isEmpty(this.u) && W2(this.n)) {
                if (!z || (arrayList = this.p0) == null) {
                    ArrayList arrayList13 = new ArrayList();
                    this.p0 = arrayList13;
                    arrayList13.addAll(this.n.thumbs);
                } else if (!arrayList.isEmpty()) {
                    b6(this.p0, this.n.thumbs);
                }
                this.n0 = this.n;
                return;
            }
            return;
        }
        if (n1(message) == null || (n1(this.k) instanceof TLRPC.TL_messageMediaEmpty)) {
            TLRPC.Message message2 = this.k;
            if (message2 != null && (richMessage = message2.rich_message) != null) {
                TLRPC.Document a0 = a0(richMessage.blocks, richMessage);
                TL_iv.RichMessage richMessage2 = this.k.rich_message;
                TLRPC.Photo W = richMessage2 != null ? W(richMessage2.blocks, richMessage2) : null;
                if (a0 != null) {
                    if (W2(a0)) {
                        if (z) {
                            ArrayList arrayList14 = this.p0;
                            if (arrayList14 != null && !arrayList14.isEmpty()) {
                                b6(this.p0, a0.thumbs);
                            }
                        } else {
                            ArrayList arrayList15 = new ArrayList();
                            this.p0 = arrayList15;
                            arrayList15.addAll(a0.thumbs);
                        }
                        this.n0 = a0;
                        return;
                    }
                    return;
                }
                if (W != null) {
                    if (!z || (arrayList4 = this.p0) == null) {
                        this.p0 = new ArrayList(W.sizes);
                    } else if (!arrayList4.isEmpty()) {
                        b6(this.p0, W.sizes);
                    }
                    this.n0 = W;
                    if (this.I1 == null) {
                        Q();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.MessageMedia messageMedia = this.a1;
            if (messageMedia == null) {
                if (this.V0 != null) {
                    if (!z || (arrayList2 = this.p0) == null) {
                        this.p0 = new ArrayList(this.V0.sizes);
                    } else if (!arrayList2.isEmpty()) {
                        b6(this.p0, this.V0.sizes);
                    }
                    this.n0 = this.V0;
                    if (this.I1 == null) {
                        Q();
                        return;
                    }
                    return;
                }
                return;
            }
            TLRPC.Photo photo2 = messageMedia.photo;
            TLRPC.Document document = messageMedia.document;
            if (photo2 != null) {
                if (!z || (arrayList3 = this.p0) == null) {
                    this.p0 = new ArrayList(photo2.sizes);
                } else if (!arrayList3.isEmpty()) {
                    b6(this.p0, photo2.sizes);
                }
                this.n0 = photo2;
                return;
            }
            if (document == null || !W2(document)) {
                return;
            }
            if (z) {
                ArrayList arrayList16 = this.p0;
                if (arrayList16 != null && !arrayList16.isEmpty()) {
                    b6(this.p0, document.thumbs);
                }
            } else {
                ArrayList arrayList17 = new ArrayList();
                this.p0 = arrayList17;
                arrayList17.addAll(document.thumbs);
            }
            this.n0 = document;
            return;
        }
        boolean z2 = n1(this.k) instanceof TLRPC.TL_messageMediaPhoto;
        TLRPC.Message message3 = this.k;
        if (z2) {
            TLRPC.Photo photo3 = n1(message3).photo;
            if (z && ((arrayList10 = this.p0) == null || arrayList10.size() == photo3.sizes.size())) {
                ArrayList arrayList18 = this.p0;
                if (arrayList18 != null && !arrayList18.isEmpty()) {
                    for (int i4 = 0; i4 < this.p0.size(); i4++) {
                        TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) this.p0.get(i4);
                        if (photoSize3 != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= photo3.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize4 = photo3.sizes.get(i5);
                                if (photoSize4 != null && !(photoSize4 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize4.type.equals(photoSize3.type)) {
                                        photoSize3.location = photoSize4.location;
                                        break;
                                    } else if ("s".equals(photoSize3.type) && (photoSize4 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.p0.set(i4, photoSize4);
                                        break;
                                    }
                                }
                                i5++;
                            }
                        }
                    }
                }
            } else {
                this.p0 = new ArrayList(photo3.sizes);
            }
            this.n0 = n1(this.k).photo;
            return;
        }
        boolean z3 = n1(message3) instanceof TLRPC.TL_messageMediaDocument;
        TLRPC.Message message4 = this.k;
        if (z3) {
            TLRPC.Photo photo4 = ((TLRPC.TL_messageMediaDocument) n1(message4)).video_cover;
            if (photo4 == null) {
                TLRPC.Document F0 = F0();
                if (W2(F0)) {
                    if (!z || (arrayList8 = this.p0) == null) {
                        ArrayList arrayList19 = new ArrayList();
                        this.p0 = arrayList19;
                        arrayList19.addAll(F0.thumbs);
                    } else if (!arrayList8.isEmpty()) {
                        b6(this.p0, F0.thumbs);
                    }
                    this.n0 = F0;
                    return;
                }
                return;
            }
            if (z && ((arrayList9 = this.p0) == null || arrayList9.size() == photo4.sizes.size())) {
                ArrayList arrayList20 = this.p0;
                if (arrayList20 != null && !arrayList20.isEmpty()) {
                    for (int i6 = 0; i6 < this.p0.size(); i6++) {
                        TLRPC.PhotoSize photoSize5 = (TLRPC.PhotoSize) this.p0.get(i6);
                        if (photoSize5 != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= photo4.sizes.size()) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize6 = photo4.sizes.get(i7);
                                if (photoSize6 != null && !(photoSize6 instanceof TLRPC.TL_photoSizeEmpty)) {
                                    if (photoSize6.type.equals(photoSize5.type)) {
                                        photoSize5.location = photoSize6.location;
                                        break;
                                    } else if ("s".equals(photoSize5.type) && (photoSize6 instanceof TLRPC.TL_photoStrippedSize)) {
                                        this.p0.set(i6, photoSize6);
                                        break;
                                    }
                                }
                                i7++;
                            }
                        }
                    }
                }
            } else {
                this.p0 = new ArrayList(photo4.sizes);
            }
            this.n0 = photo4;
            return;
        }
        boolean z4 = n1(message4) instanceof TLRPC.TL_messageMediaGame;
        TLRPC.Message message5 = this.k;
        if (!z4) {
            if (n1(message5) instanceof TLRPC.TL_messageMediaWebPage) {
                TLRPC.Photo photo5 = n1(this.k).webpage.photo;
                TLRPC.Document document2 = n1(this.k).webpage.document;
                if (photo5 != null) {
                    if (!z || (arrayList5 = this.p0) == null) {
                        this.p0 = new ArrayList(photo5.sizes);
                    } else if (!arrayList5.isEmpty()) {
                        b6(this.p0, photo5.sizes);
                    }
                    this.n0 = photo5;
                    return;
                }
                if (document2 == null || !W2(document2)) {
                    return;
                }
                if (z) {
                    ArrayList arrayList21 = this.p0;
                    if (arrayList21 != null && !arrayList21.isEmpty()) {
                        b6(this.p0, document2.thumbs);
                    }
                } else {
                    ArrayList arrayList22 = new ArrayList();
                    this.p0 = arrayList22;
                    arrayList22.addAll(document2.thumbs);
                }
                this.n0 = document2;
                return;
            }
            return;
        }
        TLRPC.Document document3 = n1(message5).game.document;
        if (document3 != null && W2(document3)) {
            if (z) {
                ArrayList arrayList23 = this.p0;
                if (arrayList23 != null && !arrayList23.isEmpty()) {
                    b6(this.p0, document3.thumbs);
                }
            } else {
                ArrayList arrayList24 = new ArrayList();
                this.p0 = arrayList24;
                arrayList24.addAll(document3.thumbs);
            }
            this.n0 = document3;
        }
        TLRPC.Photo photo6 = n1(this.k).game.photo;
        if (photo6 != null) {
            if (!z || (arrayList7 = this.q0) == null) {
                this.q0 = new ArrayList(photo6.sizes);
            } else if (!arrayList7.isEmpty()) {
                b6(this.q0, photo6.sizes);
            }
            this.o0 = photo6;
        }
        if (this.p0 != null || (arrayList6 = this.q0) == null) {
            return;
        }
        this.p0 = arrayList6;
        this.q0 = null;
        this.n0 = this.o0;
        this.o0 = null;
    }

    public final r47 r1(TLRPC.WebPage webPage, TL_iv.PageBlock pageBlock) {
        TLRPC.TL_message tL_message = null;
        r2 = null;
        TLRPC.Photo photo = null;
        if (!(pageBlock instanceof TL_iv.pageBlockPhoto)) {
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
                if (K0(webPage, pageblockvideo.video_id) != webPage.document) {
                    tL_message = new TLRPC.TL_message();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                    tL_message.media = tL_messageMediaDocument;
                    tL_messageMediaDocument.document = K0(webPage, pageblockvideo.video_id);
                }
                return this;
            }
            tL_message.message = "";
            tL_message.realId = e1();
            tL_message.id = Utilities.b.nextInt();
            TLRPC.Message message = this.k;
            tL_message.date = message.date;
            tL_message.peer_id = message.peer_id;
            tL_message.out = message.out;
            tL_message.from_id = message.from_id;
            return new r47(this.K1, tL_message, false, true);
        }
        long j = ((TL_iv.pageBlockPhoto) pageBlock).photo_id;
        if (webPage.cached_page != null) {
            TLRPC.Photo photo2 = webPage.photo;
            if (photo2 == null || photo2.id != j) {
                int i = 0;
                while (true) {
                    if (i >= webPage.cached_page.photos.size()) {
                        break;
                    }
                    TLRPC.Photo photo3 = webPage.cached_page.photos.get(i);
                    if (photo3.id == j) {
                        photo = photo3;
                        break;
                    }
                    i++;
                }
            } else {
                photo = photo2;
            }
        }
        if (photo != webPage.photo) {
            TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_message2.media = tL_messageMediaPhoto;
            tL_messageMediaPhoto.photo = photo;
            tL_message = tL_message2;
            tL_message.message = "";
            tL_message.realId = e1();
            tL_message.id = Utilities.b.nextInt();
            TLRPC.Message message2 = this.k;
            tL_message.date = message2.date;
            tL_message.peer_id = message2.peer_id;
            tL_message.out = message2.out;
            tL_message.from_id = message2.from_id;
            return new r47(this.K1, tL_message, false, true);
        }
        return this;
    }

    public final boolean r2() {
        ArrayList arrayList = this.a2;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final boolean r4() {
        TLRPC.Message message = this.k;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        return (messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique);
    }

    public boolean s(TLRPC.Chat chat, boolean z) {
        TLRPC.Message message;
        boolean w4 = w4();
        int i = this.K1;
        if (w4 && (message = this.k) != null && message.dialog_id == yac.h(i).e()) {
            return true;
        }
        return (this.T == 0 && this.R0 == null && r(i, z, this.k, chat)) || c3(this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SpannableStringBuilder s0(String str, String str2) {
        TLRPC.TL_messageActionSuggestedPostApproval tL_messageActionSuggestedPostApproval;
        boolean z;
        boolean z2;
        TLRPC.Message message;
        TLRPC.Message message2 = this.k;
        if (message2 != null) {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                tL_messageActionSuggestedPostApproval = (TLRPC.TL_messageActionSuggestedPostApproval) messageAction;
                if (tL_messageActionSuggestedPostApproval != null) {
                    return null;
                }
                oj m = oj.m(tL_messageActionSuggestedPostApproval.price);
                long n = wf3.n(this.k.peer_id);
                int i = this.K1;
                boolean z3 = xc2.z(i, 24, n);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean z4 = false;
                if (tL_messageActionSuggestedPostApproval.balance_too_low) {
                    qu6.s(null, null, 2131744020, new Object[]{str2}, spannableStringBuilder);
                    return spannableStringBuilder;
                }
                byte b = 2;
                if (tL_messageActionSuggestedPostApproval.rejected) {
                    r47 r47Var = this.C;
                    if (r47Var == null || (message = r47Var.k) == null) {
                        z = false;
                        z2 = true;
                    } else {
                        long n2 = wf3.n(message.from_id);
                        z2 = n2 == wf3.n(this.C.k.saved_peer_id);
                        z = n2 == yac.h(i).e();
                    }
                    qu6.s(null, null, TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment) ? z ? 2131744022 : 2131744024 : z ? 2131744021 : 2131744023, new Object[]{z2 ? str : str2}, spannableStringBuilder);
                    if (!TextUtils.isEmpty(tL_messageActionSuggestedPostApproval.reject_comment)) {
                        spannableStringBuilder.append((CharSequence) "\n\n");
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        int length = spannableStringBuilder.length();
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.append((CharSequence) tL_messageActionSuggestedPostApproval.reject_comment);
                        spannableStringBuilder.append('\"');
                        spannableStringBuilder.setSpan(new sk(b, jn7.t3, z4), length, spannableStringBuilder.length(), 33);
                        return spannableStringBuilder;
                    }
                } else {
                    int g = (int) uc7.s1(i).k4.h.g(TimeUnit.HOURS);
                    int i2 = tL_messageActionSuggestedPostApproval.schedule_date;
                    if (i2 > 0) {
                        qu6.s(null, null, tL_messageActionSuggestedPostApproval.schedule_date > ConnectionsManager.getInstance(i).getCurrentTime() ? z3 ? 2131744018 : 2131744010 : z3 ? 2131744017 : 2131744009, new Object[]{str, ob6.x(i2, true)}, spannableStringBuilder);
                    } else {
                        qu6.s(null, null, z3 ? 2131744016 : 2131744008, new Object[]{str}, spannableStringBuilder);
                    }
                    if (m != null) {
                        pj pjVar = m.a;
                        if (!m.l()) {
                            pj pjVar2 = pj.b;
                            boolean z5 = pjVar == pjVar2;
                            String a0 = z3 ? ob6.a0(null, null, 2131744015, str2, m.b()) : ob6.a0(null, null, 2131744007, m.b());
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            spannableStringBuilder.append((CharSequence) nza.V0(hl.S2(a0), pjVar == pjVar2));
                            int i3 = z5 ? z3 ? 2131744013 : 2131744005 : z3 ? 2131744014 : 2131744006;
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            qu6.s(null, null, i3, new Object[]{str, Integer.valueOf(g)}, spannableStringBuilder);
                            int i4 = z5 ? z3 ? 2131744011 : 2131744003 : z3 ? 2131744012 : 2131744004;
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6f), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            qu6.s(null, null, i4, new Object[]{str, Integer.valueOf(g)}, spannableStringBuilder);
                        }
                    }
                }
                return spannableStringBuilder;
            }
        }
        tL_messageActionSuggestedPostApproval = null;
        if (tL_messageActionSuggestedPostApproval != null) {
        }
    }

    public final CharSequence s1(m47 m47Var, int[] iArr) {
        if (this.L2 || this.G0) {
            return null;
        }
        if (this.M2) {
            return this.v;
        }
        int i = this.D;
        if (i == 19 || i == 15 || i == 13) {
            return null;
        }
        CharSequence W6 = zu1.W6(this, m47Var, iArr);
        if (W6 == null && S3()) {
            try {
                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) this.k.media).poll;
                StringBuilder sb = new StringBuilder(poll.question.text);
                sb.append("\n");
                ArrayList<TLRPC.PollAnswer> arrayList = poll.answers;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    TLRPC.PollAnswer pollAnswer = arrayList.get(i2);
                    i2++;
                    sb.append("\n🔘 ");
                    TLRPC.TL_textWithEntities tL_textWithEntities = pollAnswer.text;
                    sb.append(tL_textWithEntities == null ? "" : tL_textWithEntities.text);
                }
                W6 = sb.toString();
            } catch (Exception unused) {
            }
        }
        if (W6 == null && G3(this.k, true)) {
            W6 = zu1.Y6(0L, this, false);
        }
        if (W6 == null || !pv3.d(W6)) {
            return W6;
        }
        return null;
    }

    public final boolean s2() {
        TLRPC.Message message;
        if (this.G0 || this.j2 || (message = this.k) == null) {
            return false;
        }
        if (!this.N2) {
            TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
            if ((replyMarkup instanceof TLRPC.TL_replyInlineMarkup) && !((TLRPC.TL_replyInlineMarkup) replyMarkup).rows.isEmpty()) {
                return true;
            }
        }
        return this.q2 != null;
    }

    public final boolean s4() {
        int i = this.D;
        return i != 1000 ? i == 13 : t4(F0()) || M4(F0());
    }

    public final boolean t() {
        if (!k4() && !e3(this.k)) {
            if (n1(this.k) instanceof TLRPC.TL_messageMediaPhoto) {
                return true;
            }
            if (n1(this.k) instanceof TLRPC.TL_messageMediaDocument) {
                return (Q4(this.k) || s4() || J2() || g4()) ? false : true;
            }
            if (F3()) {
                return true;
            }
        }
        return false;
    }

    public final String t1() {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            return F0.mime_type;
        }
        boolean z = n1(this.k) instanceof TLRPC.TL_messageMediaInvoice;
        TLRPC.Message message = this.k;
        if (!z) {
            return n1(message) instanceof TLRPC.TL_messageMediaPhoto ? "image/jpeg" : (!(n1(this.k) instanceof TLRPC.TL_messageMediaWebPage) || n1(this.k).webpage.photo == null) ? "" : "image/jpeg";
        }
        TLRPC.WebDocument webDocument = ((TLRPC.TL_messageMediaInvoice) n1(message)).webPhoto;
        return webDocument != null ? webDocument.mime_type : "";
    }

    public final boolean t2() {
        TLRPC.MessageMedia messageMedia;
        return (!this.j2 && (((messageMedia = this.k.media) != null && messageMedia.spoiler) || l5())) || x3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b9, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L175;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean u(TLRPC.Chat chat) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        if (e3(this.k)) {
            return false;
        }
        TLRPC.Message message = this.k;
        boolean z = this.r1;
        int i = this.K1;
        if (z && message.date < ConnectionsManager.getInstance(i).getCurrentTime() - 60) {
            return false;
        }
        if ((chat != null && ((chat.left || chat.kicked) && (!chat.megagroup || !chat.has_link))) || message == null || message.peer_id == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if ((messageAction != null && !(messageAction instanceof TLRPC.TL_messageActionEmpty)) || l3(message) || message.via_bot_id != 0 || message.id < 0) {
            return false;
        }
        TLRPC.MessageMedia n1 = n1(message);
        if ((n1 != null && message.rich_message == null && (h4(n1.document) || t4(n1.document) || K2(n1.document, true) || (n1(message) instanceof TLRPC.TL_messageMediaGeo) || (n1(message) instanceof TLRPC.TL_messageMediaGeoLive) || (n1(message) instanceof TLRPC.TL_messageMediaVenue))) || message.paid_suggested_post_stars || message.paid_suggested_post_ton) {
            return false;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            long j = peer.user_id;
            if (j == message.peer_id.user_id) {
                if (j == yac.h(i).e()) {
                    if (!(n1(message) instanceof TLRPC.TL_messageMediaGeoLive)) {
                    }
                }
            }
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = uc7.s1(i).M0(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (n1 != null && message.rich_message == null && !(n1 instanceof TLRPC.TL_messageMediaEmpty) && !(n1 instanceof TLRPC.TL_messageMediaPhoto) && !(n1 instanceof TLRPC.TL_messageMediaDocument) && !(n1 instanceof TLRPC.TL_messageMediaWebPage) && !(n1 instanceof TLRPC.TL_messageMediaPaidMedia) && !(n1 instanceof TLRPC.TL_messageMediaToDo)) {
            return false;
        }
        if ((!xc2.T(chat) || chat.megagroup || (!chat.creator && ((tL_chatAdminRights2 = chat.admin_rights) == null || !tL_chatAdminRights2.edit_messages))) && (!message.out || chat == null || !chat.megagroup || (!chat.creator && (((tL_chatAdminRights = chat.admin_rights) == null || !tL_chatAdminRights.pin_messages) && ((tL_chatBannedRights = chat.default_banned_rights) == null || tL_chatBannedRights.pin_messages))))) {
            if (!z && Math.abs(message.date - ConnectionsManager.getInstance(i).getCurrentTime()) > uc7.s1(i).R2) {
                return false;
            }
            if (message.peer_id.channel_id == 0) {
                if (!message.out) {
                    TLRPC.Peer peer2 = message.from_id;
                    if (!(peer2 instanceof TLRPC.TL_peerUser) || peer2.user_id != yac.h(i).e()) {
                        return false;
                    }
                }
                if (message.rich_message == null && !(n1 instanceof TLRPC.TL_messageMediaPhoto) && ((!(n1 instanceof TLRPC.TL_messageMediaDocument) || v4(message) || L2(message)) && !(n1 instanceof TLRPC.TL_messageMediaEmpty) && !(n1 instanceof TLRPC.TL_messageMediaWebPage) && !(n1 instanceof TLRPC.TL_messageMediaPaidMedia) && !(n1 instanceof TLRPC.TL_messageMediaToDo) && n1 != null)) {
                    return false;
                }
            } else {
                if (chat == null || !chat.megagroup || !message.out) {
                    if (chat == null || chat.megagroup) {
                        return false;
                    }
                    if (!chat.creator) {
                        TLRPC.TL_chatAdminRights tL_chatAdminRights3 = chat.admin_rights;
                        if (tL_chatAdminRights3 == null) {
                            return false;
                        }
                        if (!tL_chatAdminRights3.edit_messages && (!message.out || !tL_chatAdminRights3.post_messages)) {
                            return false;
                        }
                    }
                    if (!message.post) {
                        return false;
                    }
                }
                if (message.rich_message == null && !(n1 instanceof TLRPC.TL_messageMediaPhoto) && ((!(n1 instanceof TLRPC.TL_messageMediaDocument) || v4(message) || L2(message)) && !(n1 instanceof TLRPC.TL_messageMediaEmpty) && !(n1 instanceof TLRPC.TL_messageMediaWebPage) && !(n1 instanceof TLRPC.TL_messageMediaPaidMedia) && !(n1 instanceof TLRPC.TL_messageMediaToDo) && n1 != null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final String u0(boolean z) {
        return t0(F0(), z);
    }

    public final boolean u2() {
        TLRPC.Message message = this.k;
        if (message != null && message.entities != null) {
            for (int i = 0; i < this.k.entities.size(); i++) {
                if (!(this.k.entities.get(i) instanceof TLRPC.TL_messageEntityCustomEmoji)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u3() {
        return this.D == 26;
    }

    public final boolean v(TLRPC.Chat chat) {
        TLRPC.Message message = this.k;
        if (message.video_processing_pending) {
            return false;
        }
        if (chat == null && message.peer_id.channel_id != 0 && (chat = uc7.s1(this.K1).M0(Long.valueOf(message.peer_id.channel_id))) == null) {
            return false;
        }
        if (!xc2.T(chat) || chat.megagroup || chat.creator) {
            return true;
        }
        TLRPC.TL_chatAdminRights tL_chatAdminRights = chat.admin_rights;
        if (tL_chatAdminRights != null) {
            return tL_chatAdminRights.edit_messages || message.out;
        }
        return false;
    }

    public final boolean v2(w49 w49Var) {
        if (w2() && w49Var != null) {
            for (int i = 0; i < this.k.reactions.results.size(); i++) {
                if (w49Var.f(this.k.reactions.results.get(i).reaction)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v3() {
        return u3() || w3();
    }

    public final boolean v5() {
        if (!R4() && F0() != null && wm9.i.contains(F0().mime_type) && F0().size < (uc7.s1(this.K1).k4.Z0.f() << 1)) {
            for (int i = 0; i < F0().attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0().attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && documentAttribute.duration < 5.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean w() {
        int i;
        return (a4(this.k) || (i = this.D) == 30 || i == 31 || i == 32 || i == 33 || i == 35 || i == 37 || (this.k instanceof TLRPC.TL_message_secret) || l5() || C3() || this.D == 16 || q4() || this.k.noforwards) ? false : true;
    }

    public final TLRPC.Chat w0(AbstractMap abstractMap, zh6 zh6Var, long j) {
        TLRPC.Chat chat = abstractMap != null ? (TLRPC.Chat) abstractMap.get(Long.valueOf(j)) : zh6Var != null ? (TLRPC.Chat) zh6Var.f(j) : null;
        return chat == null ? uc7.s1(this.K1).M0(Long.valueOf(j)) : chat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x003a, code lost:
    
        if (r5.round_message != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w1(boolean z) {
        TLRPC.User X1;
        TLRPC.Chat M0;
        TLRPC.Chat chat;
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            boolean z2 = false;
            for (int i = 0; i < F0.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                if (!(documentAttribute instanceof TLRPC.TL_documentAttributeAudio)) {
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    }
                    if (z2) {
                        if (!z) {
                            return null;
                        }
                        if (!O3()) {
                            TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
                            int i2 = this.K1;
                            if (messageFwdHeader != null) {
                                TLRPC.Peer peer = messageFwdHeader.from_id;
                                if ((peer instanceof TLRPC.TL_peerUser) && peer.user_id == yac.h(i2).e()) {
                                }
                            }
                            TLRPC.Message message = this.k;
                            TLRPC.MessageFwdHeader messageFwdHeader2 = message.fwd_from;
                            if (messageFwdHeader2 != null) {
                                TLRPC.Peer peer2 = messageFwdHeader2.from_id;
                                if (peer2 instanceof TLRPC.TL_peerChannel) {
                                    M0 = uc7.s1(i2).M0(Long.valueOf(this.k.fwd_from.from_id.channel_id));
                                } else if (peer2 instanceof TLRPC.TL_peerChat) {
                                    M0 = uc7.s1(i2).M0(Long.valueOf(this.k.fwd_from.from_id.chat_id));
                                } else if (peer2 instanceof TLRPC.TL_peerUser) {
                                    X1 = uc7.s1(i2).X1(Long.valueOf(this.k.fwd_from.from_id.user_id));
                                    chat = null;
                                    if (X1 == null) {
                                        return lbc.r(X1);
                                    }
                                    if (chat != null) {
                                        return chat.title;
                                    }
                                } else {
                                    String str = messageFwdHeader2.from_name;
                                    if (str != null) {
                                        return str;
                                    }
                                }
                                chat = M0;
                                X1 = null;
                                if (X1 == null) {
                                }
                            }
                            TLRPC.Peer peer3 = message.from_id;
                            if (peer3 instanceof TLRPC.TL_peerChat) {
                                M0 = uc7.s1(i2).M0(Long.valueOf(this.k.from_id.chat_id));
                            } else if (peer3 instanceof TLRPC.TL_peerChannel) {
                                M0 = uc7.s1(i2).M0(Long.valueOf(this.k.from_id.channel_id));
                            } else if (peer3 != null || message.peer_id.channel_id == 0) {
                                X1 = uc7.s1(i2).X1(Long.valueOf(this.k.from_id.user_id));
                                chat = null;
                                if (X1 == null) {
                                }
                            } else {
                                M0 = uc7.s1(i2).M0(Long.valueOf(this.k.peer_id.channel_id));
                            }
                            chat = M0;
                            X1 = null;
                            if (X1 == null) {
                            }
                        }
                        return ob6.M0(2131750464, null);
                    }
                } else if (!documentAttribute.voice) {
                    String str2 = documentAttribute.performer;
                    return (TextUtils.isEmpty(str2) && z) ? ob6.M0(2131753893, null) : str2;
                }
                z2 = true;
                if (z2) {
                }
            }
        }
        return ob6.M0(2131753893, null);
    }

    public final boolean w2() {
        TLRPC.TL_messageReactions tL_messageReactions = this.k.reactions;
        return (tL_messageReactions == null || tL_messageReactions.results.isEmpty()) ? false : true;
    }

    public final boolean w3() {
        return this.D == 28;
    }

    public final boolean w4() {
        return this.l != null;
    }

    public final boolean x() {
        return y(F0());
    }

    public final long x0() {
        TLRPC.Peer peer = this.k.peer_id;
        if (peer instanceof TLRPC.TL_peerChat) {
            return peer.chat_id;
        }
        if (peer instanceof TLRPC.TL_peerChannel) {
            return peer.channel_id;
        }
        return 0L;
    }

    public final boolean x2() {
        TLRPC.MessageReplies messageReplies = this.k.replies;
        return messageReplies != null && messageReplies.replies > 0;
    }

    public final boolean x3() {
        return o4() && !uc7.s1(this.K1).g5();
    }

    public final boolean x4() {
        TLRPC.Message message = this.k;
        return message != null && (message.media instanceof TLRPC.TL_messageMediaStory);
    }

    public final ArrayList y0() {
        ArrayList arrayList = new ArrayList();
        if (this.k.reactions != null) {
            for (int i = 0; i < this.k.reactions.results.size(); i++) {
                if (this.k.reactions.results.get(i).chosen) {
                    arrayList.add(w49.d(this.k.reactions.results.get(i).reaction));
                }
            }
        }
        return arrayList;
    }

    public final String y1(boolean z) {
        TLRPC.Document F0 = F0();
        if (F0 != null) {
            for (int i = 0; i < F0.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = F0.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                    if (documentAttribute.voice) {
                        if (z) {
                            return ob6.s(this.k.date, true);
                        }
                        return null;
                    }
                    String str = documentAttribute.title;
                    if (str != null && str.length() != 0) {
                        return str;
                    }
                    String B = xb4.B(F0);
                    return (TextUtils.isEmpty(B) && z) ? ob6.M0(2131753892, null) : B;
                }
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.round_message) {
                    boolean a4 = a4(this.k);
                    TLRPC.Message message = this.k;
                    if (!a4) {
                        return ob6.s(message.date, true);
                    }
                    StringBuilder sb = new StringBuilder("/");
                    String J1 = J1(message);
                    if (J1 == null) {
                        a19 c = b19.f(this.K1).c(I1(this.k));
                        J1 = c != null ? c.b : "";
                    }
                    sb.append(J1);
                    return ob6.a0(null, null, 2131752707, sb.toString());
                }
            }
            String B2 = xb4.B(F0);
            if (!TextUtils.isEmpty(B2)) {
                return B2;
            }
        }
        return ob6.M0(2131753892, null);
    }

    public final boolean y2() {
        TLRPC.MessageMedia messageMedia = this.k.media;
        return (messageMedia == null || (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) || messageMedia.extended_media.isEmpty() || !(this.k.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMedia)) ? false : true;
    }

    public final boolean y3() {
        TLRPC.MessageFwdHeader messageFwdHeader = this.k.fwd_from;
        return messageFwdHeader != null && messageFwdHeader.imported;
    }

    public final boolean y4() {
        return this.D == 24 && !g3();
    }

    public final boolean z() {
        if (c3(this.k)) {
            return false;
        }
        TLRPC.Message message = this.k;
        if (message instanceof TLRPC.TL_messageService) {
            return message.reactions_are_possible;
        }
        return true;
    }

    public final Long z1() {
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.MessageReactor> arrayList;
        TLRPC.Message message = this.k;
        if (message == null || (tL_messageReactions = message.reactions) == null || (arrayList = tL_messageReactions.top_reactors) == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.MessageReactor messageReactor = arrayList.get(i);
            i++;
            TLRPC.MessageReactor messageReactor2 = messageReactor;
            if (messageReactor2 != null && messageReactor2.my) {
                if (messageReactor2.anonymous) {
                    return 2666000L;
                }
                TLRPC.Peer peer = messageReactor2.peer_id;
                if (peer != null) {
                    return Long.valueOf(wf3.n(peer));
                }
            }
        }
        return null;
    }

    public final boolean z2() {
        int i;
        if (c1() == 0) {
            return false;
        }
        ArrayList arrayList = this.p0;
        return !(arrayList == null || arrayList.isEmpty()) || (i = this.D) == 3 || i == 1 || I3() || U2();
    }

    public final boolean z3() {
        return n1(this.k) instanceof TLRPC.TL_messageMediaInvoice;
    }

    public final boolean z4() {
        if (this.g) {
            return true;
        }
        Boolean bool = this.h;
        if (bool != null) {
            return bool.booleanValue();
        }
        TLRPC.Peer peer = this.k.peer_id;
        if (peer != null) {
            long j = peer.channel_id;
            if (j != 0) {
                TLRPC.Chat w0 = w0(null, null, j);
                if (w0 == null) {
                    return false;
                }
                boolean z = w0.megagroup;
                this.h = Boolean.valueOf(z);
                return z;
            }
        }
        this.h = Boolean.FALSE;
        return false;
    }

    public final Spannable z5(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt) {
        return A5(charSequence, O0(), fontMetricsInt, false);
    }

    public r47(int i, TLRPC.Message message, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.a = z ? (byte) 2 : (byte) 1;
        this.K1 = i;
        this.b = str2;
        this.c = str3;
        this.v = str;
        this.k = message;
        this.f = z2;
        this.g = z3;
        this.i = z4;
    }

    public r47(int i, TLRPC.Message message, boolean z, boolean z2) {
        this(i, message, null, null, null, null, null, z, z2, 0L);
    }

    public r47(int i, TLRPC.Message message, r47 r47Var, boolean z, boolean z2) {
        this(i, message, r47Var, null, null, null, null, z, z2, 0L);
    }

    public r47(int i, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z, boolean z2) {
        this(i, message, abstractMap, abstractMap2, z, z2, 0L);
    }

    public r47(int i, TLRPC.Message message, AbstractMap abstractMap, AbstractMap abstractMap2, boolean z, boolean z2, long j) {
        this(i, message, null, abstractMap, abstractMap2, null, null, z, z2, j);
    }

    public r47(int i, TLRPC.Message message, zh6 zh6Var, zh6 zh6Var2, boolean z, boolean z2) {
        this(i, message, null, null, null, zh6Var, zh6Var2, z, z2, 0L, false, false, false, 0);
    }

    public r47(int i, TLRPC.Message message, r47 r47Var, AbstractMap abstractMap, AbstractMap abstractMap2, zh6 zh6Var, zh6 zh6Var2, boolean z, boolean z2, long j) {
        this(i, message, r47Var, abstractMap, abstractMap2, zh6Var, zh6Var2, z, z2, j, false, false, false, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public r47(int i, TLRPC.Message message, r47 r47Var, AbstractMap abstractMap, AbstractMap abstractMap2, zh6 zh6Var, zh6 zh6Var2, boolean z, boolean z2, long j, boolean z3, boolean z4, boolean z5, int i2) {
        AbstractMap abstractMap3;
        zh6 zh6Var3;
        ?? r15;
        TextPaint textPaint;
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        aob.P();
        this.j2 = z3;
        this.k2 = z4;
        this.n2 = z5 || B0(message) == yac.h(i).e();
        this.p2 = i2;
        this.K1 = i;
        this.k = message;
        this.C = r47Var;
        this.T = j;
        this.n1 = !message.out && message.unread;
        TLRPC.Message message2 = message.replyMessage;
        if (message2 != null) {
            zh6Var3 = zh6Var;
            r15 = 0;
            abstractMap3 = abstractMap;
            this.C = new r47(i, message2, null, abstractMap3, abstractMap2, zh6Var3, zh6Var2, false, z2, j);
        } else {
            abstractMap3 = abstractMap;
            zh6Var3 = zh6Var;
            r15 = 0;
        }
        TLRPC.Peer peer = message.from_id;
        if (peer instanceof TLRPC.TL_peerUser) {
            d2(abstractMap3, zh6Var3, peer.user_id);
        }
        a6(abstractMap3, abstractMap2, zh6Var3, zh6Var2);
        K5();
        if (z) {
            f6(r15);
        }
        h5();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(this.k.date * 1000);
        int i3 = gregorianCalendar.get(6);
        int i4 = gregorianCalendar.get(1);
        int i5 = gregorianCalendar.get(2);
        Integer valueOf = Integer.valueOf(i4);
        Integer valueOf2 = Integer.valueOf(i5);
        Integer valueOf3 = Integer.valueOf(i3);
        Object[] objArr = new Object[3];
        objArr[r15] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        this.W = String.format("%d_%02d_%02d", objArr);
        this.X = (i3 * 1000000) + (i5 * 10000) + i4;
        Integer valueOf4 = Integer.valueOf(i4);
        Integer valueOf5 = Integer.valueOf(i5);
        Object[] objArr2 = new Object[2];
        objArr2[r15] = valueOf4;
        objArr2[1] = valueOf5;
        this.Y = String.format("%d_%02d", objArr2);
        P(r15);
        k0();
        if (z) {
            if (n1(this.k) instanceof TLRPC.TL_messageMediaGame) {
                textPaint = aob.x2;
            } else {
                textPaint = aob.o2;
            }
            int[] iArr = i() ? new int[1] : null;
            CharSequence m = pv3.m(this.v, textPaint.getFontMetricsInt(), r15, iArr, r15);
            this.v = m;
            Spannable z52 = z5(m, textPaint.getFontMetricsInt());
            this.v = z52;
            if (iArr != null && iArr[r15] > 1) {
                C5(z52, iArr);
            }
            H(iArr);
            G();
            K5();
            TLRPC.Document F0 = F0();
            if (F0 != null) {
                this.H1 = lp3.f(F0, aob.cd, 1.0f, null);
            }
        }
        this.S1 = z;
        r0(r15);
        if (z2) {
            K(true);
        }
    }

    public r47(int i, TL_stories.StoryItem storyItem) {
        this.D = 1000;
        this.c0 = -1.0f;
        this.J0 = -1L;
        this.e1 = -1;
        this.f1 = -1L;
        this.b2 = true;
        this.i2 = new Drawable[1];
        this.K2 = false;
        this.L2 = false;
        this.M2 = false;
        this.K1 = i;
        this.l = storyItem;
        if (storyItem != null) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            this.k = tL_message;
            tL_message.id = storyItem.messageId;
            tL_message.realId = storyItem.id;
            tL_message.date = storyItem.date;
            tL_message.dialog_id = storyItem.dialogId;
            tL_message.message = storyItem.caption;
            tL_message.entities = storyItem.entities;
            tL_message.media = storyItem.media;
            tL_message.attachPath = storyItem.attachPath;
        }
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
    }
}
