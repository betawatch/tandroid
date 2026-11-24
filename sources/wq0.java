// default package

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_forum;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class wq0 extends pg0 {
    public static volatile wq0[] f = new wq0[4];
    public final nl9 a;
    public final nl9 b;
    public final Set c;
    public final LongSparseArray d;
    public final SharedPreferences e;

    public wq0(int i) {
        super(i);
        this.a = new nl9((byte) 10);
        this.b = new nl9((byte) 10);
        this.c = DesugarCollections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.d = new LongSparseArray();
        this.e = a.b.getSharedPreferences("bot_drafts" + i, 0);
    }

    public static wq0 b(int i) {
        wq0 wq0Var;
        wq0 wq0Var2 = f[i];
        if (wq0Var2 != null) {
            return wq0Var2;
        }
        synchronized (wq0.class) {
            wq0Var = f[i];
            if (wq0Var == null) {
                wq0[] wq0VarArr = f;
                wq0 wq0Var3 = new wq0(i);
                wq0VarArr[i] = wq0Var3;
                wq0Var = wq0Var3;
            }
        }
        return wq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(final TLObject tLObject, List list, final Runnable runnable) {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        TLRPC.InputPeer inputPeer3;
        long j;
        long j2;
        String str;
        long D;
        if (list == null || list.isEmpty() || this.c.remove(tLObject)) {
            return true;
        }
        boolean z = tLObject instanceof TLRPC.TL_messages_sendMessage;
        if (z) {
            inputPeer2 = ((TLRPC.TL_messages_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMedia) tLObject).peer;
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            inputPeer2 = ((TL_ephemeral.TL_sendMessage) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendInlineBotResult) {
            inputPeer2 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).peer;
        } else if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
            inputPeer2 = ((TLRPC.TL_messages_forwardMessages) tLObject).to_peer;
        } else if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
            inputPeer2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).peer;
        } else {
            inputPeer = null;
            final long m = pg3.m(inputPeer);
            if (inputPeer != null || m <= 0 || !m9c.x(getMessagesController().W1(Long.valueOf(m)))) {
                return true;
            }
            final long[] jArr = new long[list.size()];
            byte b = 0;
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = ((k47) list.get(i)).e1();
            }
            if (z) {
                j2 = ((TLRPC.TL_messages_sendMessage) tLObject).random_id;
            } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                j2 = ((TLRPC.TL_messages_sendMedia) tLObject).random_id;
            } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                j2 = ((TL_ephemeral.TL_sendMessage) tLObject).random_id;
            } else {
                if (!(tLObject instanceof TLRPC.TL_messages_sendInlineBotResult)) {
                    if (tLObject instanceof TLRPC.TL_messages_forwardMessages) {
                        ArrayList<Long> arrayList = ((TLRPC.TL_messages_forwardMessages) tLObject).random_id;
                        int size = arrayList.size();
                        long j3 = 0;
                        j = 0;
                        int i2 = 0;
                        while (i2 < size) {
                            Long l = arrayList.get(i2);
                            i2++;
                            j3 = hs6.r(j3, l.longValue());
                            inputPeer = inputPeer;
                        }
                        inputPeer3 = inputPeer;
                        j2 = j3;
                    } else {
                        inputPeer3 = inputPeer;
                        j = 0;
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList2 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size2 = arrayList2.size();
                            int i3 = 0;
                            j2 = 0;
                            while (i3 < size2) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia = arrayList2.get(i3);
                                i3++;
                                j2 = hs6.r(j2, tL_inputSingleMedia.random_id);
                            }
                        } else {
                            j2 = 0;
                        }
                    }
                    if (!((!z ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
                        return true;
                    }
                    if ((tLObject instanceof TLRPC.TL_messages_forwardMessages) && ((TLRPC.TL_messages_forwardMessages) tLObject).top_msg_id != 0) {
                        return true;
                    }
                    if (z) {
                        str = ((TLRPC.TL_messages_sendMessage) tLObject).message;
                    } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
                        str = ((TLRPC.TL_messages_sendMedia) tLObject).message;
                    } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
                        str = ((TL_ephemeral.TL_sendMessage) tLObject).message;
                    } else {
                        if (tLObject instanceof TLRPC.TL_messages_sendMultiMedia) {
                            ArrayList<TLRPC.TL_inputSingleMedia> arrayList3 = ((TLRPC.TL_messages_sendMultiMedia) tLObject).multi_media;
                            int size3 = arrayList3.size();
                            int i4 = 0;
                            while (i4 < size3) {
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia2 = arrayList3.get(i4);
                                i4++;
                                TLRPC.TL_inputSingleMedia tL_inputSingleMedia3 = tL_inputSingleMedia2;
                                if (!TextUtils.isEmpty(tL_inputSingleMedia3.message)) {
                                    str = tL_inputSingleMedia3.message;
                                    break;
                                }
                            }
                        }
                        str = null;
                    }
                    if (j2 != j) {
                        D = ~j2;
                    } else {
                        getSendMessagesHelper().getClass();
                        D = a6a.D();
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = jb6.M0(2131743667, null);
                    } else if (str.length() > 16) {
                        str = str.substring(0, 16).concat("...");
                    }
                    final String str2 = str;
                    we7 we7Var = new we7() { // from class: oq0
                        @Override // we7
                        public final void a(int i5) {
                            wq0 wq0Var = wq0.this;
                            TLObject tLObject2 = tLObject;
                            Runnable runnable2 = runnable;
                            if (i5 <= 0) {
                                wq0Var.c.add(tLObject2);
                                gm.c3(runnable2);
                                return;
                            }
                            boolean z2 = tLObject2 instanceof TLRPC.TL_messages_forwardMessages;
                            if (z2) {
                                TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                tL_messages_forwardMessages.top_msg_id = i5;
                                tL_messages_forwardMessages.flags |= 512;
                            } else {
                                TLRPC.TL_inputReplyToMessage tL_inputReplyToMessage = new TLRPC.TL_inputReplyToMessage();
                                tL_inputReplyToMessage.reply_to_msg_id = i5;
                                if (tLObject2 instanceof TLRPC.TL_messages_sendMessage) {
                                    TLRPC.TL_messages_sendMessage tL_messages_sendMessage = (TLRPC.TL_messages_sendMessage) tLObject2;
                                    tL_messages_sendMessage.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMessage.flags |= 1;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                    TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject2;
                                    tL_messages_sendMedia.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMedia.flags |= 1;
                                } else if (tLObject2 instanceof TL_ephemeral.TL_sendMessage) {
                                    TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject2;
                                    tL_sendMessage.reply_to = tL_inputReplyToMessage;
                                    tL_sendMessage.flags |= 32;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendInlineBotResult) {
                                    TLRPC.TL_messages_sendInlineBotResult tL_messages_sendInlineBotResult = (TLRPC.TL_messages_sendInlineBotResult) tLObject2;
                                    tL_messages_sendInlineBotResult.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendInlineBotResult.flags |= 1;
                                } else if (z2) {
                                    TLRPC.TL_messages_forwardMessages tL_messages_forwardMessages2 = (TLRPC.TL_messages_forwardMessages) tLObject2;
                                    tL_messages_forwardMessages2.reply_to = tL_inputReplyToMessage;
                                    tL_messages_forwardMessages2.flags |= 1;
                                } else if (tLObject2 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject2;
                                    tL_messages_sendMultiMedia.reply_to = tL_inputReplyToMessage;
                                    tL_messages_sendMultiMedia.flags |= 1;
                                }
                            }
                            wq0Var.getMessagesStorage().a.c(new wz(wq0Var, jArr, m, i5, runnable2));
                        }
                    };
                    final long m2 = pg3.m(inputPeer3);
                    LongSparseArray longSparseArray = this.d;
                    List list2 = (List) longSparseArray.get(m2);
                    if (list2 != null) {
                        list2.add(we7Var);
                        return false;
                    }
                    ArrayList arrayList4 = new ArrayList(1);
                    arrayList4.add(we7Var);
                    longSparseArray.put(m2, arrayList4);
                    TL_forum.TL_messages_createForumTopic tL_messages_createForumTopic = new TL_forum.TL_messages_createForumTopic();
                    tL_messages_createForumTopic.title = TextUtils.isEmpty(str2) ? "#New Chat" : str2;
                    tL_messages_createForumTopic.title_missing = true;
                    tL_messages_createForumTopic.peer = inputPeer3;
                    tL_messages_createForumTopic.random_id = D;
                    final long j4 = D;
                    getConnectionsManager().sendRequestTyped(tL_messages_createForumTopic, new kc(b), new jac() { // from class: qq0
                        @Override // jac
                        public final void a(Object obj, Object obj2) {
                            ArrayList<TLRPC.Update> arrayList5;
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            wq0 wq0Var = wq0.this;
                            long j5 = m2;
                            if (updates == null) {
                                wq0Var.f(-1, j5);
                                return;
                            }
                            ArrayList<TLRPC.Update> arrayList6 = updates.updates;
                            int size4 = arrayList6.size();
                            int i5 = 0;
                            int i6 = 0;
                            int i7 = 0;
                            while (i7 < size4) {
                                TLRPC.Update update = arrayList6.get(i7);
                                i7++;
                                TLRPC.Update update2 = update;
                                if (update2 instanceof TL_update.TL_updateMessageID) {
                                    TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update2;
                                    arrayList5 = arrayList6;
                                    if (tL_updateMessageID.random_id == j4) {
                                        i5 = tL_updateMessageID.id;
                                    }
                                } else {
                                    arrayList5 = arrayList6;
                                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                                        TLRPC.Message message = ((TL_update.TL_updateNewMessage) update2).message;
                                        if (i6 == 0 && message != null && (message.action instanceof TLRPC.TL_messageActionTopicCreate) && k47.B0(message) == j5) {
                                            i6 = message.id;
                                        }
                                    }
                                }
                                arrayList6 = arrayList5;
                            }
                            if (i5 == 0) {
                                i5 = i6;
                            }
                            wq0Var.getMessagesController().T3(updates, false);
                            if (i5 == 0) {
                                wq0Var.f(-1, j5);
                                return;
                            }
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            String str3 = str2;
                            tL_messageActionTopicCreate.title = str3;
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = wq0Var.getMessagesController().x1(j5);
                            tL_messageService.dialog_id = j5;
                            tL_messageService.id = i5;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            tL_forumTopic.id = i5;
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str3;
                            tL_forumTopic.top_message = i5;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = wq0Var.getMessagesController().x1(wq0Var.getUserConfig().n);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = 0;
                            tL_forumTopic.title_missing = true;
                            wq0Var.getMessagesController().g4.q(j5, tL_forumTopic, true);
                            wq0Var.f(i5, j5);
                            wq0Var.getNotificationCenter().k(nm7.N5, new uq0(j5, i5));
                        }
                    });
                    return false;
                }
                j2 = ((TLRPC.TL_messages_sendInlineBotResult) tLObject).random_id;
            }
            inputPeer3 = inputPeer;
            j = 0;
            if (!((!z ? ((TLRPC.TL_messages_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMedia ? ((TLRPC.TL_messages_sendMedia) tLObject).reply_to : tLObject instanceof TL_ephemeral.TL_sendMessage ? ((TL_ephemeral.TL_sendMessage) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendInlineBotResult ? ((TLRPC.TL_messages_sendInlineBotResult) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_forwardMessages ? ((TLRPC.TL_messages_forwardMessages) tLObject).reply_to : tLObject instanceof TLRPC.TL_messages_sendMultiMedia ? ((TLRPC.TL_messages_sendMultiMedia) tLObject).reply_to : null) instanceof TLRPC.TL_inputReplyToMessage)) {
            }
        }
        inputPeer = inputPeer2;
        final long m3 = pg3.m(inputPeer);
        return inputPeer != null ? true : true;
    }

    public final boolean c(int i, long j) {
        LongSparseArray z0 = this.a.z0(j, i);
        if (z0 != null && z0.size() > 0) {
            int size = z0.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (!((rq0) z0.valueAt(i2)).e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(long j, long j2) {
        return this.e.getBoolean(j + "_" + j2, false);
    }

    public final void e(long j, int i, long j2) {
        long j3 = i;
        rq0 rq0Var = (rq0) this.a.J0(j, j3, j2);
        if (rq0Var == null) {
            return;
        }
        getNotificationCenter().k(nm7.P5, new sq0(j, rq0Var.b, j3));
    }

    public final void f(int i, long j) {
        LongSparseArray longSparseArray = this.d;
        List list = (List) longSparseArray.get(j);
        if (list != null) {
            longSparseArray.remove(j);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((we7) it.next()).a(i);
            }
        }
    }

    public final void g(int i, long j) {
        long j2;
        nl9 nl9Var;
        long j3 = i;
        nl9 nl9Var2 = this.a;
        long j4 = j;
        LongSparseArray z0 = nl9Var2.z0(j4, j3);
        if (z0 != null) {
            int size = z0.size();
            int i2 = 0;
            while (i2 < size) {
                rq0 rq0Var = (rq0) z0.valueAt(i2);
                if (rq0Var.e) {
                    long j5 = j3;
                    getNotificationCenter().k(nm7.P5, new sq0(j4, rq0Var.b, j5));
                    nl9Var = nl9Var2;
                    nl9Var.J0(j, j5, rq0Var.a);
                    j2 = j5;
                    i2--;
                    size--;
                } else {
                    j2 = j3;
                    nl9Var = nl9Var2;
                }
                i2++;
                j4 = j;
                nl9Var2 = nl9Var;
                j3 = j2;
            }
        }
    }

    public final void h(long j, long j2, boolean z) {
        this.e.edit().putBoolean(j + "_" + j2, z).apply();
    }
}
