package th;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.b8;
import org.telegram.messenger.h20;
import org.telegram.messenger.jj;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.m31;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class y2 {
    public TL_stories.StoryItem a = null;
    public d5 b = null;
    public TL_stories.StoryItem c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public CharSequence h;
    public e6 i;
    public e6 j;
    public final /* synthetic */ z2 k;

    public y2(z2 z2Var) {
        this.k = z2Var;
    }

    public static String c(y2 y2Var) {
        TLRPC.MessageMedia messageMedia;
        TL_stories.StoryItem storyItem = y2Var.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null) {
            if (y2Var.b == null) {
                return "unknown";
            }
            return "uploading from " + y2Var.b.e;
        }
        if (messageMedia.photo != null) {
            StringBuilder sb2 = new StringBuilder("photo#");
            sb2.append(y2Var.a.media.photo.id);
            sb2.append("at");
            return a1.g.p(sb2, y2Var.a.media.photo.dc_id, "dc");
        }
        if (messageMedia.document == null) {
            return "unknown";
        }
        StringBuilder sb3 = new StringBuilder("doc#");
        sb3.append(y2Var.a.media.document.id);
        sb3.append("at");
        return a1.g.p(sb3, y2Var.a.media.document.dc_id, "dc");
    }

    public final boolean d() {
        d5 d5Var = this.b;
        if (d5Var != null) {
            return d5Var.c.H0;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return true;
        }
        if (storyItem.noforwards) {
            return false;
        }
        if (!storyItem.pinned) {
            return true;
        }
        TLRPC.Chat L0 = vp.r1(this.k.l2).L0(Long.valueOf(-storyItem.dialogId));
        return L0 == null || !L0.noforwards;
    }

    public final String e() {
        z2 z2Var = this.k;
        if (z2Var.x1.a == null) {
            return null;
        }
        if (z2Var.k1 > 0) {
            TLRPC.User Z1 = vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1));
            if (h20.n(Z1) == null) {
                return null;
            }
            return z2Var.x1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", h20.n(Z1)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", h20.n(Z1), Integer.valueOf(z2Var.x1.a.id));
        }
        TLRPC.Chat L0 = vp.r1(z2Var.l2).L0(Long.valueOf(-z2Var.k1));
        if (org.telegram.messenger.w3.K(L0, false) == null) {
            return null;
        }
        return z2Var.x1.f ? String.format(Locale.US, "https://t.me/%1$s/s/live", org.telegram.messenger.w3.K(L0, false)) : String.format(Locale.US, "https://t.me/%1$s/s/%2$s", org.telegram.messenger.w3.K(L0, false), Integer.valueOf(z2Var.x1.a.id));
    }

    public final String f() {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            return storyItem.attachPath;
        }
        return null;
    }

    public final e6 g() {
        TL_stories.StoryItem storyItem;
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio;
        if (this.i == null && (storyItem = this.a) != null) {
            TLRPC.Document document = storyItem.music;
            e6 e6Var = null;
            if (document != null && (tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) org.telegram.messenger.i0.V(TLRPC.TL_documentAttributeAudio.class, document.attributes)) != null) {
                String str = tL_documentAttributeAudio.title;
                String str2 = tL_documentAttributeAudio.performer;
                if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                    e6Var = new e6();
                    e6Var.f = true;
                    e6Var.g = document;
                    if (TextUtils.isEmpty(str)) {
                        e6Var.k = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str2);
                    } else if (TextUtils.isEmpty(str2)) {
                        e6Var.k = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str);
                    } else {
                        SpannableStringBuilder append = new SpannableStringBuilder(e6.d()).append((CharSequence) " ").append((CharSequence) str2);
                        e6Var.k = append;
                        int length = append.length();
                        e6Var.k.append((CharSequence) " ・ ");
                        e6Var.k.setSpan(new d6(), length, e6Var.k.length(), 33);
                        e6Var.k.append((CharSequence) str);
                    }
                }
            }
            this.i = e6Var;
        }
        return this.i;
    }

    public final File h() {
        TLRPC.Photo photo;
        if (f() != null) {
            return new File(f());
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null) {
            TLRPC.MessageMedia messageMedia = storyItem.media;
            z2 z2Var = this.k;
            if (messageMedia != null && messageMedia.getDocument() != null) {
                b8.G(z2Var.l2);
                return b8.I(this.a.media.getDocument());
            }
            TLRPC.MessageMedia messageMedia2 = this.a.media;
            if (messageMedia2 != null && (photo = messageMedia2.photo) != null) {
                TLRPC.PhotoSize w9 = b8.w(photo.sizes, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
                b8.G(z2Var.l2);
                File K = b8.K(w9, null, true, true);
                if (K.exists()) {
                    return K;
                }
                b8.G(z2Var.l2);
                return b8.K(w9, null, false, true);
            }
        }
        return null;
    }

    public final e6 i() {
        ArrayList arrayList;
        TLRPC.Chat L0;
        TLRPC.Chat L02;
        if (this.j == null) {
            TL_stories.StoryItem storyItem = this.a;
            e6 e6Var = null;
            if (storyItem != null) {
                int i10 = this.k.l2;
                if (storyItem.fwd_from != null) {
                    e6Var = new e6();
                    e6Var.a = i10;
                    TL_stories.StoryFwdHeader storyFwdHeader = storyItem.fwd_from;
                    TLRPC.Peer peer = storyFwdHeader.from;
                    if (peer != null) {
                        long o10 = org.telegram.messenger.o5.o(peer);
                        e6Var.b = Long.valueOf(o10);
                        if (o10 >= 0) {
                            e6Var.k = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append((CharSequence) h20.p(vp.r1(i10).Z1(Long.valueOf(o10))));
                        } else {
                            TLRPC.Chat L03 = vp.r1(i10).L0(Long.valueOf(-o10));
                            e6Var.k = new SpannableStringBuilder(org.telegram.messenger.w3.V(L03) ? jj.F() : jj.n2()).append((CharSequence) " ").append((CharSequence) (L03 != null ? L03.title : ""));
                        }
                    } else if (storyFwdHeader.from_name != null) {
                        e6Var.k = new SpannableStringBuilder(jj.f6()).append((CharSequence) " ").append((CharSequence) storyItem.fwd_from.from_name);
                    }
                    e6Var.f = true;
                    TL_stories.StoryFwdHeader storyFwdHeader2 = storyItem.fwd_from;
                    if ((storyFwdHeader2.flags & 4) != 0) {
                        e6Var.c = Integer.valueOf(storyFwdHeader2.story_id);
                    }
                    e6Var.c();
                } else if (storyItem.media_areas != null) {
                    TL_stories.TL_mediaAreaChannelPost tL_mediaAreaChannelPost = null;
                    while (r1 < storyItem.media_areas.size()) {
                        if (storyItem.media_areas.get(r1) instanceof TL_stories.TL_mediaAreaChannelPost) {
                            tL_mediaAreaChannelPost = (TL_stories.TL_mediaAreaChannelPost) storyItem.media_areas.get(r1);
                        }
                        r1++;
                    }
                    if (tL_mediaAreaChannelPost != null && (L02 = vp.r1(i10).L0(Long.valueOf(tL_mediaAreaChannelPost.channel_id))) != null) {
                        e6Var = new e6();
                        e6Var.b = Long.valueOf(-L02.id);
                        e6Var.e = true;
                        e6Var.a = i10;
                        e6Var.f = true;
                        e6Var.d = Integer.valueOf(tL_mediaAreaChannelPost.msg_id);
                        e6Var.k = new SpannableStringBuilder(org.telegram.messenger.w3.V(L02) ? jj.F() : jj.n2()).append((CharSequence) " ").append((CharSequence) L02.title);
                    }
                }
                this.j = e6Var;
            } else {
                d5 d5Var = this.b;
                if (d5Var != null) {
                    vh.n5 n5Var = d5Var.c;
                    if (n5Var != null) {
                        if (n5Var.n) {
                            e6Var = new e6();
                            e6Var.k = n5Var.p;
                            String str = n5Var.s;
                            e6Var.l = str;
                            e6Var.f = TextUtils.isEmpty(str);
                        } else if (n5Var.u && (arrayList = n5Var.v) != null && arrayList.size() > 0) {
                            jj jjVar = (jj) n5Var.v.get(0);
                            long p5 = vh.n5.p(jjVar);
                            if (p5 < 0 && (L0 = vp.r1(jjVar.I1).L0(Long.valueOf(-p5))) != null) {
                                e6Var = new e6();
                                e6Var.b = Long.valueOf(p5);
                                e6Var.e = true;
                                e6Var.a = jjVar.I1;
                                e6Var.f = true;
                                Boolean D = vh.n5.D(jjVar);
                                e6Var.d = Integer.valueOf(D != null ? D.booleanValue() ? jjVar.k.fwd_from.channel_post : jjVar.f1() : 0);
                                e6Var.k = new SpannableStringBuilder(org.telegram.messenger.w3.V(L0) ? jj.F() : jj.n2()).append((CharSequence) " ").append((CharSequence) L0.title);
                            }
                        }
                    }
                    this.j = e6Var;
                }
            }
        }
        return this.j;
    }

    public final boolean j() {
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        if (!this.e) {
            return false;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null || (messageMedia = storyItem.media) == null || (document = messageMedia.getDocument()) == null) {
            if (this.b != null) {
                return !r0.c.Y;
            }
            return true;
        }
        for (int i10 = 0; i10 < document.attributes.size(); i10++) {
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if ((documentAttribute instanceof TLRPC.TL_documentAttributeVideo) && documentAttribute.nosound) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(long j10) {
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem == null) {
            return false;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        return (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) && j10 == ((TLRPC.TL_messageMediaVideoStream) messageMedia).call.id;
    }

    public final boolean l() {
        return this.e;
    }

    public final boolean m() {
        String str;
        TLRPC.MessageMedia messageMedia;
        d5 d5Var = this.b;
        if (d5Var != null) {
            return d5Var.s;
        }
        TL_stories.StoryItem storyItem = this.a;
        if (storyItem != null && (messageMedia = storyItem.media) != null && messageMedia.getDocument() != null) {
            TLRPC.Document document = this.a.media.getDocument();
            return jj.K4(document) || "video/mp4".equals(document.mime_type);
        }
        TL_stories.StoryItem storyItem2 = this.a;
        if (storyItem2 == null || storyItem2.media != null || (str = storyItem2.attachPath) == null) {
            return false;
        }
        return str.toLowerCase().endsWith(".mp4");
    }

    public final void n(TL_stories.StoryItem storyItem) {
        TLRPC.MessageMedia messageMedia;
        this.a = storyItem;
        this.j = null;
        this.i = null;
        this.b = null;
        this.d = storyItem instanceof TL_stories.TL_storyItemSkipped;
        this.e = m();
        TL_stories.StoryItem storyItem2 = this.a;
        this.f = (storyItem2 == null || (messageMedia = storyItem2.media) == null || !(messageMedia instanceof TLRPC.TL_messageMediaVideoStream)) ? false : true;
    }

    public final void o() {
        int i10;
        this.g = false;
        z2 z2Var = this.k;
        k2 k2Var = z2Var.t0;
        y2 y2Var = z2Var.x1;
        d5 d5Var = y2Var.b;
        if (d5Var != null) {
            CharSequence charSequence = d5Var.c.C0;
            this.h = charSequence;
            CharSequence m10 = org.telegram.messenger.k6.m(charSequence, k2Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m10;
            SpannableStringBuilder spannableStringBuilder = m10 == null ? new SpannableStringBuilder() : SpannableStringBuilder.valueOf(m10);
            TLRPC.User Z1 = vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1));
            if (z2Var.k1 < 0 || vp.r1(z2Var.l2).V4(Z1)) {
                jj.d(spannableStringBuilder, true);
                return;
            }
            return;
        }
        TL_stories.StoryItem storyItem = y2Var.a;
        if (storyItem != null) {
            if (!storyItem.translated || storyItem.translatedText == null || !TextUtils.equals(storyItem.translatedLng, m31.M0())) {
                String str = y2Var.a.caption;
                this.h = str;
                CharSequence m11 = org.telegram.messenger.k6.m(str, k2Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
                this.h = m11;
                if (m11 == null || y2Var.a.entities == null) {
                    return;
                }
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(jj.A5(new SpannableStringBuilder(y2Var.a.caption), y2Var.a.entities, k2Var.b0.getPaint().getFontMetricsInt(), false));
                SpannableStringBuilder.valueOf(org.telegram.messenger.k6.m(valueOf, k2Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
                i10 = (z2Var.k1 < 0 || vp.r1(z2Var.l2).V4(vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1)))) ? 1 : 0;
                if (i10 != 0) {
                    jj.d(valueOf, true);
                }
                jj.b(valueOf, y2Var.a.entities, false, true, true, false, i10 ^ 1);
                this.h = valueOf;
                return;
            }
            this.g = true;
            TLRPC.TL_textWithEntities tL_textWithEntities = y2Var.a.translatedText;
            String str2 = tL_textWithEntities.text;
            this.h = str2;
            CharSequence m12 = org.telegram.messenger.k6.m(str2, k2Var.b0.getPaint().getFontMetricsInt(), false, null, 0);
            this.h = m12;
            if (m12 == null || tL_textWithEntities.entities == null) {
                return;
            }
            SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(jj.A5(new SpannableStringBuilder(tL_textWithEntities.text), tL_textWithEntities.entities, k2Var.b0.getPaint().getFontMetricsInt(), false));
            SpannableStringBuilder.valueOf(org.telegram.messenger.k6.m(valueOf2, k2Var.b0.getPaint().getFontMetricsInt(), false, null, 0));
            i10 = (z2Var.k1 < 0 || vp.r1(z2Var.l2).V4(vp.r1(z2Var.l2).Z1(Long.valueOf(z2Var.k1)))) ? 1 : 0;
            if (i10 != 0) {
                jj.d(valueOf2, true);
            }
            jj.b(valueOf2, tL_textWithEntities.entities, false, true, true, false, i10 ^ 1);
            this.h = valueOf2;
        }
    }
}
