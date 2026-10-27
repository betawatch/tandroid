package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v21 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v21(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                t21 t21Var = (t21) ((bi.j5) this.b).e;
                if (t21Var != null) {
                    t21Var.run();
                    break;
                }
                break;
            case 1:
                ((c31) this.b).dismiss();
                break;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
            case 3:
                ((o31) this.b).dismiss();
                break;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
                MessageObject messageObject = secretMediaViewer.h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        fi.v3 v3Var = secretMediaViewer.r;
                        if (v3Var.V) {
                            v3Var.e(true);
                            break;
                        } else {
                            secretMediaViewer.l();
                            break;
                        }
                    }
                }
                break;
            case 5:
                p61 p61Var = (p61) this.b;
                if (p61Var.a0 instanceof TLRPC.User) {
                    fi.d dVar = p61Var.h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        p61Var.T((TLRPC.User) p61Var.a0, null, null);
                        break;
                    }
                }
                break;
            case 6:
                SessionsActivity sessionsActivity = ((q71) this.b).f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        break;
                    } else {
                        y9.f0(sessionsActivity.getParentActivity(), 2, new o71(sessionsActivity));
                        break;
                    }
                }
                break;
            case 7:
                ((kd1) this.b).c(true);
                break;
            case 8:
                ((kd1) ((bi.e5) this.b).c).c(true);
                break;
            case 9:
                rd1 rd1Var = (rd1) this.b;
                ArrayList arrayList = rd1Var.f;
                HashSet hashSet = rd1Var.w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = rd1Var.getMessagesController().getUser(Long.valueOf(rd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        rd1Var.getMessagesController().putChat(chat, false);
                        rd1Var.getMessagesController().deleteParticipantFromChat(chat.id, user);
                    }
                    rd1Var.finishFragment();
                    break;
                }
                break;
            default:
                mi1 mi1Var = (mi1) this.b;
                mi1Var.a.c(!r0.b(), true);
                mi1Var.c.setEnabled(mi1Var.a.b());
                mi1Var.c.animate().alpha(mi1Var.a.b() ? 1.0f : 0.5f).start();
                break;
        }
    }
}
